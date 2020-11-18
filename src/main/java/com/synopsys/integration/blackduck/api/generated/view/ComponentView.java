package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.ComponentLogoView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldView;
import com.synopsys.integration.blackduck.api.generated.view.TagView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentView extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CUSTOM_FIELDS_LINK = "custom-fields";
    public static final String TAGS_LINK = "tags";
    public static final String VERSIONS_LINK = "versions";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

	public static final LinkMultipleResponses<CustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<CustomFieldView>(CUSTOM_FIELDS_LINK, CustomFieldView.class);
	public static final LinkMultipleResponses<TagView> TAGS_LINK_RESPONSE = new LinkMultipleResponses<TagView>(TAGS_LINK, TagView.class);
	public static final LinkMultipleResponses<ComponentVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionView>(VERSIONS_LINK, ComponentVersionView.class);
	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
	    links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
	    links.put(TAGS_LINK, TAGS_LINK_RESPONSE);
	    links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
	    links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    private String notes;
    private String name;
    private Boolean migrated;
    private String url;
    private OriginSourceType source;
    private ComponentLogoView logo;
    private java.util.List<String> additionalHomepages;
    private String description;
    private String primaryLanguage;
    private ComponentApprovalStatusType approvalStatus;

    public String getNotes() {
	    return notes;
    }

    public void setNotes(String notes) {
	    this.notes = notes;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public Boolean getMigrated() {
	    return migrated;
    }

    public void setMigrated(Boolean migrated) {
	    this.migrated = migrated;
    }

    public String getUrl() {
	    return url;
    }

    public void setUrl(String url) {
	    this.url = url;
    }

    public OriginSourceType getSource() {
	    return source;
    }

    public void setSource(OriginSourceType source) {
	    this.source = source;
    }

    public ComponentLogoView getLogo() {
	    return logo;
    }

    public void setLogo(ComponentLogoView logo) {
	    this.logo = logo;
    }

    public java.util.List<String> getAdditionalHomepages() {
	    return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
	    this.additionalHomepages = additionalHomepages;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

    public String getPrimaryLanguage() {
	    return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
	    this.primaryLanguage = primaryLanguage;
    }

    public ComponentApprovalStatusType getApprovalStatus() {
	    return approvalStatus;
    }

    public void setApprovalStatus(ComponentApprovalStatusType approvalStatus) {
	    this.approvalStatus = approvalStatus;
    }

}
