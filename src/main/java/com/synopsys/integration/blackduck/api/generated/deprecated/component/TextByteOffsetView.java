package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* TextByteOffsetView from the previous API is now called FileLicensesLicenseItemsOffsetsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class TextByteOffsetView extends BlackDuckComponent {
    private BigDecimal startByte;
    private BigDecimal endByte;

    public BigDecimal getStartByte() {
	    return startByte;
    }

    public void setStartByte(BigDecimal startByte) {
	    this.startByte = startByte;
    }

    public BigDecimal getEndByte() {
	    return endByte;
    }

    public void setEndByte(BigDecimal endByte) {
	    this.endByte = endByte;
    }

}
