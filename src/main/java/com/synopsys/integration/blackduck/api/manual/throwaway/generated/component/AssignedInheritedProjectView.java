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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.AssignedUserGroup;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class AssignedInheritedProjectView extends BlackDuckComponent {
    private java.util.List<AssignedUserGroup> assignedGroups;
    private String assignment;
    private String name;
    private String project;

    public java.util.List<AssignedUserGroup> getAssignedGroups() {
        return assignedGroups;
    }

    public void setAssignedGroups(java.util.List<AssignedUserGroup> assignedGroups) {
        this.assignedGroups = assignedGroups;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

}
