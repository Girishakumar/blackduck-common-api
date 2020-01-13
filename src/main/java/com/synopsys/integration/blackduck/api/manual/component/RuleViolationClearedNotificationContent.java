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
package com.synopsys.integration.blackduck.api.manual.component;

import java.util.List;

public class RuleViolationClearedNotificationContent extends NotificationContentComponent {
    private String projectName;
    private String projectVersionName;
    private String projectVersion;
    private int componentVersionsCleared;
    private List<ComponentVersionStatus> componentVersionStatuses;
    private List<PolicyInfo> policyInfos;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersionName() {
        return projectVersionName;
    }

    public void setProjectVersionName(String projectVersionName) {
        this.projectVersionName = projectVersionName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public int getComponentVersionsCleared() {
        return componentVersionsCleared;
    }

    public void setComponentVersionsCleared(int componentVersionsCleared) {
        this.componentVersionsCleared = componentVersionsCleared;
    }

    public List<ComponentVersionStatus> getComponentVersionStatuses() {
        return componentVersionStatuses;
    }

    public void setComponentVersionStatuses(List<ComponentVersionStatus> componentVersionStatuses) {
        this.componentVersionStatuses = componentVersionStatuses;
    }

    public List<PolicyInfo> getPolicyInfos() {
        return policyInfos;
    }

    public void setPolicyInfos(List<PolicyInfo> policyInfos) {
        this.policyInfos = policyInfos;
    }

}
