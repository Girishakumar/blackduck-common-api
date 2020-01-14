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
import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportTypeType;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportFormatType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ReportViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.report-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String CONTENT_LINK = "content";

	public static final LinkStringResponse CONTENT_LINK_RESPONSE = new LinkStringResponse(CONTENT_LINK, String.class);

    static {
	links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

    private String locale;
    private LicenseReportsReportReportFormatType reportFormat;
    private String createdByUser;
    private String fileNamePrefix;
    private java.util.Date createdAt;
    private String createdBy;
    private BigDecimal fileSize;
    private String fileName;
    private LicenseReportsReportReportTypeType reportType;
    private java.util.Date updatedAt;
    private java.util.Date finishedAt;

    public String getLocale() {
	return locale;
    }

    public void setLocale(String locale) {
	this.locale = locale;
    }

    public LicenseReportsReportReportFormatType getReportFormat() {
	return reportFormat;
    }

    public void setReportFormat(LicenseReportsReportReportFormatType reportFormat) {
	this.reportFormat = reportFormat;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public String getFileNamePrefix() {
	return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
	this.fileNamePrefix = fileNamePrefix;
    }

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public BigDecimal getFileSize() {
	return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
	this.fileSize = fileSize;
    }

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    public LicenseReportsReportReportTypeType getReportType() {
	return reportType;
    }

    public void setReportType(LicenseReportsReportReportTypeType reportType) {
	this.reportType = reportType;
    }

    public java.util.Date getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	this.updatedAt = updatedAt;
    }

    public java.util.Date getFinishedAt() {
	return finishedAt;
    }

    public void setFinishedAt(java.util.Date finishedAt) {
	this.finishedAt = finishedAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
