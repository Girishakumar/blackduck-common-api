package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class FieldsCustomFieldView extends BlackDuckView {
    private java.util.Date createdAt;
    private Object updatedBy;
    private Object createdBy;
    private Boolean active;
    private BigDecimal position;
    private String label;
    private java.util.Date updatedAt;
    private CustomFieldType type;
    private String description;

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public Object getUpdatedBy() {
	    return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
	    this.updatedBy = updatedBy;
    }

    public Object getCreatedBy() {
	    return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
	    this.createdBy = createdBy;
    }

    public Boolean getActive() {
	    return active;
    }

    public void setActive(Boolean active) {
	    this.active = active;
    }

    public BigDecimal getPosition() {
	    return position;
    }

    public void setPosition(BigDecimal position) {
	    this.position = position;
    }

    public String getLabel() {
	    return label;
    }

    public void setLabel(String label) {
	    this.label = label;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public CustomFieldType getType() {
	    return type;
    }

    public void setType(CustomFieldType type) {
	    this.type = type;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

}
