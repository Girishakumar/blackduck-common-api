package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportFormatType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseReportsReportViewV4 extends BlackDuckView {
    private String locale;
    private LicenseReportsReportReportFormatType reportFormat;
    private String createdByUser;
    private String fileNamePrefix;
    private java.util.Date createdAt;
    private String createdBy;
    private BigDecimal fileSize;
    private String fileName;
    private LicenseReportsReportReportType reportType;
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

    public LicenseReportsReportReportType getReportType() {
	    return reportType;
    }

    public void setReportType(LicenseReportsReportReportType reportType) {
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

}
