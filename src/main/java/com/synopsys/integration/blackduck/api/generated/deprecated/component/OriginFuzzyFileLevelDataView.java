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
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.OriginFileLicensesFuzzyItemsOffsetsView;

@Deprecated
/**
* OriginFuzzyFileLevelDataView from the previous API is now called OriginFileLicensesFuzzyView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginFuzzyFileLevelDataView extends BlackDuckComponent {
    private String path;
    private java.util.List<OriginFileLicensesFuzzyItemsOffsetsView> offsets;
    private String licenseGroupName;
    private String downloadSha1;
    private String archivePath;

    public String getPath() {
	    return path;
    }

    public void setPath(String path) {
	    this.path = path;
    }

    public java.util.List<OriginFileLicensesFuzzyItemsOffsetsView> getOffsets() {
	    return offsets;
    }

    public void setOffsets(java.util.List<OriginFileLicensesFuzzyItemsOffsetsView> offsets) {
	    this.offsets = offsets;
    }

    public String getLicenseGroupName() {
	    return licenseGroupName;
    }

    public void setLicenseGroupName(String licenseGroupName) {
	    this.licenseGroupName = licenseGroupName;
    }

    public String getDownloadSha1() {
	    return downloadSha1;
    }

    public void setDownloadSha1(String downloadSha1) {
	    this.downloadSha1 = downloadSha1;
    }

    public String getArchivePath() {
	    return archivePath;
    }

    public void setArchivePath(String archivePath) {
	    this.archivePath = archivePath;
    }

}