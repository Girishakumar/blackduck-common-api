package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.component.LicenseCreatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseStatusUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseStatusType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseView extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	    links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private String notes;
    private LicenseUpdatedByView updatedBy;
    private java.util.Date createdAt;
    private LicenseCreatedByView createdBy;
    private String name;
    private String spdxId;
    private java.util.Date updatedAt;
    private LicenseOwnershipType ownership;
    private java.util.Date statusUpdatedAt;
    private java.util.Date expirationDate;
    private LicenseStatusType licenseStatus;
    private LicenseSourceType licenseSource;
    private LicenseLicenseFamilyView licenseFamily;
    private LicenseStatusUpdatedByView statusUpdatedBy;

    public String getNotes() {
	    return notes;
    }

    public void setNotes(String notes) {
	    this.notes = notes;
    }

    public LicenseUpdatedByView getUpdatedBy() {
	    return updatedBy;
    }

    public void setUpdatedBy(LicenseUpdatedByView updatedBy) {
	    this.updatedBy = updatedBy;
    }

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public LicenseCreatedByView getCreatedBy() {
	    return createdBy;
    }

    public void setCreatedBy(LicenseCreatedByView createdBy) {
	    this.createdBy = createdBy;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public String getSpdxId() {
	    return spdxId;
    }

    public void setSpdxId(String spdxId) {
	    this.spdxId = spdxId;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public LicenseOwnershipType getOwnership() {
	    return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	    this.ownership = ownership;
    }

    public java.util.Date getStatusUpdatedAt() {
	    return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(java.util.Date statusUpdatedAt) {
	    this.statusUpdatedAt = statusUpdatedAt;
    }

    public java.util.Date getExpirationDate() {
	    return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
	    this.expirationDate = expirationDate;
    }

    public LicenseStatusType getLicenseStatus() {
	    return licenseStatus;
    }

    public void setLicenseStatus(LicenseStatusType licenseStatus) {
	    this.licenseStatus = licenseStatus;
    }

    public LicenseSourceType getLicenseSource() {
	    return licenseSource;
    }

    public void setLicenseSource(LicenseSourceType licenseSource) {
	    this.licenseSource = licenseSource;
    }

    public LicenseLicenseFamilyView getLicenseFamily() {
	    return licenseFamily;
    }

    public void setLicenseFamily(LicenseLicenseFamilyView licenseFamily) {
	    this.licenseFamily = licenseFamily;
    }

    public LicenseStatusUpdatedByView getStatusUpdatedBy() {
	    return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(LicenseStatusUpdatedByView statusUpdatedBy) {
	    this.statusUpdatedBy = statusUpdatedBy;
    }

}
