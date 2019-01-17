/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;

import com.synopsys.integration.blackduck.api.generated.component.ProjectRequest;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionRequest;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectCloneCategoriesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.rest.RestConstants;
import com.synopsys.integration.util.BuilderStatus;
import com.synopsys.integration.util.IntegrationBuilder;

public class ProjectRequestBuilder extends IntegrationBuilder<ProjectRequest> {
    private String projectName;
    private String description;
    private Boolean projectLevelAdjustments;
    private String projectOwner;
    private Integer projectTier;
    private String distribution = ProjectVersionDistributionType.EXTERNAL.name();
    private String phase = ProjectVersionPhaseType.DEVELOPMENT.name();
    private String versionName;
    private String versionNickname;
    private String releaseComments;
    private String releasedOn;
    private List<ProjectCloneCategoriesType> cloneCategories;
    private String cloneFromReleaseUrl;

    public ProjectRequestBuilder() {
    }

    public ProjectRequestBuilder(final String projectName, final String versionName) {
        this.projectName = projectName;
        this.versionName = versionName;
    }

    @Override
    protected ProjectRequest buildWithoutValidation() {
        final ProjectVersionDistributionType distributionValue = ProjectVersionDistributionType.valueOf(distribution);
        final ProjectVersionPhaseType phaseValue = ProjectVersionPhaseType.valueOf(phase);
        final ProjectVersionRequest projectVersionRequest = new ProjectVersionRequest();
        projectVersionRequest.setDistribution(distributionValue);
        projectVersionRequest.setPhase(phaseValue);
        projectVersionRequest.setVersionName(versionName);
        projectVersionRequest.setReleaseComments(releaseComments);
        projectVersionRequest.setCloneFromReleaseUrl(cloneFromReleaseUrl);
        if (StringUtils.isNotBlank(releasedOn)) {
            try {
                projectVersionRequest.setReleasedOn(RestConstants.parseDateString(releasedOn));
            } catch (final ParseException e) {
                // ignored
            }
        }
        projectVersionRequest.setNickname(versionNickname);

        final ProjectRequest projectRequest = new ProjectRequest();
        projectRequest.setName(projectName);
        projectRequest.setDescription(description);
        projectRequest.setProjectLevelAdjustments(projectLevelAdjustments);
        projectRequest.setProjectOwner(projectOwner);
        projectRequest.setProjectTier(projectTier);
        projectRequest.setVersionRequest(projectVersionRequest);
        projectRequest.setCloneCategories(cloneCategories);
        return projectRequest;
    }

    public void setFromProject(final ProjectView projectView) {
        cloneCategories = projectView.getCloneCategories();
        description = projectView.getDescription();
        projectName = projectView.getName();
        projectLevelAdjustments = projectView.getProjectLevelAdjustments();
        projectOwner = projectView.getProjectOwner();
        projectTier = projectView.getProjectTier();
    }

    public void setFromProjectAndVersion(final ProjectView projectView, final ProjectVersionView projectVersionView) {
        setFromProject(projectView);

        distribution = projectVersionView.getDistribution().name();
        versionNickname = projectVersionView.getNickname();
        phase = projectVersionView.getPhase().name();
        releaseComments = projectVersionView.getReleaseComments();
        if (projectVersionView.getReleasedOn() != null) {
            releasedOn = RestConstants.formatDate(projectVersionView.getReleasedOn());
        }
        versionName = projectVersionView.getVersionName();
    }

    @Override
    protected void validate(final BuilderStatus builderStatus) {
        if (StringUtils.isBlank(projectName)) {
            builderStatus.addErrorMessage("A project name is required.");
        }

        if (StringUtils.isBlank(versionName)) {
            builderStatus.addErrorMessage("A version name is required.");
        }

        if (!EnumUtils.isValidEnum(ProjectVersionDistributionType.class, distribution)) {
            builderStatus.addErrorMessage(String.format("A valid version distribution is required and '%s' is not valid.", distribution));
        }
        if (!EnumUtils.isValidEnum(ProjectVersionPhaseType.class, phase)) {
            builderStatus.addErrorMessage(String.format("A valid version phase is required and '%s' is not valid.", phase));
        }

        if (StringUtils.isNotBlank(releasedOn)) {
            try {
                final SimpleDateFormat sdf = new SimpleDateFormat(RestConstants.JSON_DATE_FORMAT);
                sdf.parse(releasedOn);
            } catch (final ParseException e) {
                builderStatus.addErrorMessage(String.format("The provided releasedOn value, '%s', could not be correctly parsed with the required format, '%s': %s.", releasedOn, RestConstants.JSON_DATE_FORMAT, e.getMessage()));
            }
        }
    }

    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setProjectLevelAdjustments(final Boolean projectLevelAdjustments) {
        this.projectLevelAdjustments = projectLevelAdjustments;
    }

    public void setProjectOwner(final String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public void setProjectTier(final Integer projectTier) {
        this.projectTier = projectTier;
    }

    public void setDistribution(final String distribution) {
        this.distribution = StringUtils.trimToEmpty(distribution).toUpperCase();
    }

    public void setDistribution(final ProjectVersionDistributionType distribution) {
        this.distribution = distribution.name();
    }

    public void setPhase(final String phase) {
        this.phase = StringUtils.trimToEmpty(phase).toUpperCase();
    }

    public void setPhase(final ProjectVersionPhaseType phase) {
        this.phase = phase.name();
    }

    public void setVersionName(final String versionName) {
        this.versionName = versionName;
    }

    public void setVersionNickname(final String versionNickname) {
        this.versionNickname = versionNickname;
    }

    public void setReleaseComments(final String releaseComments) {
        this.releaseComments = releaseComments;
    }

    public void setReleasedOn(final String releasedOn) {
        this.releasedOn = releasedOn;
    }

    public void setCloneCategories(final List<ProjectCloneCategoriesType> cloneCategories) {
        this.cloneCategories = cloneCategories;
    }

    public void setCloneFromReleaseUrl(final String cloneFromReleaseUrl) {
        this.cloneFromReleaseUrl = cloneFromReleaseUrl;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getProjectLevelAdjustments() {
        return projectLevelAdjustments;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public Integer getProjectTier() {
        return projectTier;
    }

    public String getDistribution() {
        return distribution;
    }

    public String getPhase() {
        return phase;
    }

    public String getVersionName() {
        return versionName;
    }

    public String getVersionNickname() {
        return versionNickname;
    }

    public String getReleaseComments() {
        return releaseComments;
    }

    public String getReleasedOn() {
        return releasedOn;
    }

    public List<ProjectCloneCategoriesType> getCloneCategories() {
        return cloneCategories;
    }

    public String getCloneFromReleaseUrl() {
        return cloneFromReleaseUrl;
    }

}
