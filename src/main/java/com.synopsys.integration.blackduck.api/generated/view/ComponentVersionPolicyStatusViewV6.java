package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionPolicyStatusViewV6 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private PolicyStatusType approvalStatus;

    public PolicyStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }


    public String getMediaType() {
	return mediaType;
    }

}