package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ScanBomEntriesItemsLicenseLicensesView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ScanBomEntriesItemsLicenseView extends BlackDuckComponent {
    private LicenseType type;
    private java.util.List<ScanBomEntriesItemsLicenseLicensesView> licenses;
    private String licenseDisplay;

    public LicenseType getType() {
	    return type;
    }

    public void setType(LicenseType type) {
	    this.type = type;
    }

    public java.util.List<ScanBomEntriesItemsLicenseLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ScanBomEntriesItemsLicenseLicensesView> licenses) {
	    this.licenses = licenses;
    }

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

}
