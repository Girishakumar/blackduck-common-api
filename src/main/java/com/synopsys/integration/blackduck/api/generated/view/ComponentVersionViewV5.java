/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionTypeType;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseView;
import java.util.List;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionApprovalStatusType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentSourceType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.view.ComponentView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String ORIGINS_LINK = "origins";
        public static final String VULNERABILITIES_LINK = "vulnerabilities";
        public static final String COMPONENT_LINK = "component";

	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
	public static final LinkSingleResponse<ComponentView> COMPONENT_LINK_RESPONSE = new LinkSingleResponse<ComponentView>(COMPONENT_LINK, ComponentView.class);

    static {
	links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
	links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
	links.put(COMPONENT_LINK, COMPONENT_LINK_RESPONSE);
    }

    private java.util.List<String> additionalHomepages;
    private ComponentVersionApprovalStatusType approvalStatus;
    private java.util.Date releasedOn;
    private String notes;
    private ComponentVersionTypeType type;
    private ComponentSourceType source;
    private ProjectVersionLicenseView license;
    private String versionName;

    public java.util.List<String> getAdditionalHomepages() {
	return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
	this.additionalHomepages = additionalHomepages;
    }

    public ComponentVersionApprovalStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(ComponentVersionApprovalStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public ComponentVersionTypeType getType() {
	return type;
    }

    public void setType(ComponentVersionTypeType type) {
	this.type = type;
    }

    public ComponentSourceType getSource() {
	return source;
    }

    public void setSource(ComponentSourceType source) {
	this.source = source;
    }

    public ProjectVersionLicenseView getLicense() {
	return license;
    }

    public void setLicense(ProjectVersionLicenseView license) {
	this.license = license;
    }

    public String getVersionName() {
	return versionName;
    }

    public void setVersionName(String versionName) {
	this.versionName = versionName;
    }


    public String getMediaType() {
	return mediaType;
    }

}
