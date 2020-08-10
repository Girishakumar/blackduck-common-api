package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentMatchedFilesItemsFilePathView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentMatchedFilesViewV4 extends BlackDuckView {
    private ComponentMatchedFilesItemsFilePathView filePath;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages;

    public ComponentMatchedFilesItemsFilePathView getFilePath() {
	    return filePath;
    }

    public void setFilePath(ComponentMatchedFilesItemsFilePathView filePath) {
	    this.filePath = filePath;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getUsages() {
	    return usages;
    }

    public void setUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages) {
	    this.usages = usages;
    }

}
