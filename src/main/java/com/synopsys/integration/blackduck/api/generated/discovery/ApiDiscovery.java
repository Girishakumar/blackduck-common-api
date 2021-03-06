/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.discovery;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckPath;
import com.synopsys.integration.blackduck.api.core.response.BlackDuckPathMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.BlackDuckPathResponse;
import com.synopsys.integration.blackduck.api.core.response.BlackDuckPathSingleResponse;
import com.synopsys.integration.blackduck.api.generated.response.ComponentsView;
import com.synopsys.integration.blackduck.api.generated.response.CurrentVersionView;
import com.synopsys.integration.blackduck.api.generated.response.CweView;
import com.synopsys.integration.blackduck.api.generated.response.HealthChecksLivenessView;
import com.synopsys.integration.blackduck.api.generated.view.AnnouncementBannerView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldObjectView;
import com.synopsys.integration.blackduck.api.generated.view.GraphComponentImportEventsView;
import com.synopsys.integration.blackduck.api.generated.view.JobView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseReportsReportView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseTermCategoryView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseTermView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ManageAnnouncementBannerView;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.generated.view.RegistrationView;
import com.synopsys.integration.blackduck.api.generated.view.ReportContentsView;
import com.synopsys.integration.blackduck.api.generated.view.RoleView;
import com.synopsys.integration.blackduck.api.generated.view.ScanBomEntriesView;
import com.synopsys.integration.blackduck.api.generated.view.ScanView;
import com.synopsys.integration.blackduck.api.generated.view.UserGroupView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityReportsReportView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.manual.view.NotificationView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<BlackDuckPath, BlackDuckPathResponse> links = new HashMap<>();

    public static final BlackDuckPath ANNOUNCEMENT_LINK = new BlackDuckPath("/api/announcement");
    public static final BlackDuckPath BOM_IMPORT_LINK = new BlackDuckPath("/api/bom-import");
    public static final BlackDuckPath CODELOCATIONS_LINK = new BlackDuckPath("/api/codelocations");
    public static final BlackDuckPath COMPONENTS_LINK = new BlackDuckPath("/api/components");
    public static final BlackDuckPath CURRENT_USER_LINK = new BlackDuckPath("/api/current-user");
    public static final BlackDuckPath CURRENT_VERSION_LINK = new BlackDuckPath("/api/current-version");
    public static final BlackDuckPath CUSTOM_FIELDS_LINK = new BlackDuckPath("/api/custom-fields");
    public static final BlackDuckPath CWES_LINK = new BlackDuckPath("/api/cwes");
    public static final BlackDuckPath HEALTH_CHECKS_LINK = new BlackDuckPath("/api/health-checks");
    public static final BlackDuckPath JOBS_LINK = new BlackDuckPath("/api/jobs");
    public static final BlackDuckPath JOURNAL_LINK = new BlackDuckPath("/api/journal");
    public static final BlackDuckPath LICENSE_FAMILIES_LINK = new BlackDuckPath("/api/license-families");
    public static final BlackDuckPath LICENSE_TERM_CATEGORIES_LINK = new BlackDuckPath("/api/license-term-categories");
    public static final BlackDuckPath LICENSE_TERMS_LINK = new BlackDuckPath("/api/license-terms");
    public static final BlackDuckPath LICENSES_LINK = new BlackDuckPath("/api/licenses");
    public static final BlackDuckPath MANAGE_ANNOUNCEMENT_LINK = new BlackDuckPath("/api/manage-announcement");
    public static final BlackDuckPath NOTIFICATIONS_LINK = new BlackDuckPath("/api/notifications");
    public static final BlackDuckPath POLICY_RULES_LINK = new BlackDuckPath("/api/policy-rules");
    public static final BlackDuckPath PROJECTS_LINK = new BlackDuckPath("/api/projects");
    public static final BlackDuckPath REGISTRATION_LINK = new BlackDuckPath("/api/registration");
    public static final BlackDuckPath REPORTS_LINK = new BlackDuckPath("/api/reports");
    public static final BlackDuckPath ROLES_LINK = new BlackDuckPath("/api/roles");
    public static final BlackDuckPath SCAN_LINK = new BlackDuckPath("/api/scan");
    public static final BlackDuckPath SCAN_SUMMARIES_LINK = new BlackDuckPath("/api/scan-summaries");
    public static final BlackDuckPath USERGROUPS_LINK = new BlackDuckPath("/api/usergroups");
    public static final BlackDuckPath USERS_LINK = new BlackDuckPath("/api/users");
    public static final BlackDuckPath VERSIONS_LINK = new BlackDuckPath("/api/versions");
    public static final BlackDuckPath VULNERABILITIES_LINK = new BlackDuckPath("/api/vulnerabilities");
    public static final BlackDuckPath VULNERABILITY_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-reports");

    public static final BlackDuckPathSingleResponse<AnnouncementBannerView> ANNOUNCEMENT_LINK_RESPONSE = new BlackDuckPathSingleResponse<AnnouncementBannerView>(ANNOUNCEMENT_LINK, AnnouncementBannerView.class);
    public static final BlackDuckPathSingleResponse<GraphComponentImportEventsView> BOM_IMPORT_LINK_RESPONSE = new BlackDuckPathSingleResponse<GraphComponentImportEventsView>(BOM_IMPORT_LINK, GraphComponentImportEventsView.class);
    public static final BlackDuckPathMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final BlackDuckPathMultipleResponses<ComponentsView> COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ComponentsView>(COMPONENTS_LINK, ComponentsView.class);
    public static final BlackDuckPathSingleResponse<UserView> CURRENT_USER_LINK_RESPONSE = new BlackDuckPathSingleResponse<UserView>(CURRENT_USER_LINK, UserView.class);
    public static final BlackDuckPathSingleResponse<CurrentVersionView> CURRENT_VERSION_LINK_RESPONSE = new BlackDuckPathSingleResponse<CurrentVersionView>(CURRENT_VERSION_LINK, CurrentVersionView.class);
    public static final BlackDuckPathMultipleResponses<CustomFieldObjectView> CUSTOM_FIELDS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CustomFieldObjectView>(CUSTOM_FIELDS_LINK, CustomFieldObjectView.class);
    public static final BlackDuckPathSingleResponse<CweView> CWES_LINK_RESPONSE = new BlackDuckPathSingleResponse<CweView>(CWES_LINK, CweView.class);
    public static final BlackDuckPathSingleResponse<HealthChecksLivenessView> HEALTH_CHECKS_LINK_RESPONSE = new BlackDuckPathSingleResponse<HealthChecksLivenessView>(HEALTH_CHECKS_LINK, HealthChecksLivenessView.class);
    public static final BlackDuckPathMultipleResponses<JobView> JOBS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<JobView>(JOBS_LINK, JobView.class);
    public static final BlackDuckPathSingleResponse<ProjectView> JOURNAL_LINK_RESPONSE = new BlackDuckPathSingleResponse<ProjectView>(JOURNAL_LINK, ProjectView.class);
    public static final BlackDuckPathMultipleResponses<LicenseFamilyView> LICENSE_FAMILIES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseFamilyView>(LICENSE_FAMILIES_LINK, LicenseFamilyView.class);
    public static final BlackDuckPathMultipleResponses<LicenseTermCategoryView> LICENSE_TERM_CATEGORIES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseTermCategoryView>(LICENSE_TERM_CATEGORIES_LINK, LicenseTermCategoryView.class);
    public static final BlackDuckPathMultipleResponses<LicenseTermView> LICENSE_TERMS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseTermView>(LICENSE_TERMS_LINK, LicenseTermView.class);
    public static final BlackDuckPathMultipleResponses<LicenseView> LICENSES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseView>(LICENSES_LINK, LicenseView.class);
    public static final BlackDuckPathSingleResponse<ManageAnnouncementBannerView> MANAGE_ANNOUNCEMENT_LINK_RESPONSE = new BlackDuckPathSingleResponse<ManageAnnouncementBannerView>(MANAGE_ANNOUNCEMENT_LINK, ManageAnnouncementBannerView.class);
    public static final BlackDuckPathMultipleResponses<NotificationView> NOTIFICATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<NotificationView>(NOTIFICATIONS_LINK, NotificationView.class);
    public static final BlackDuckPathMultipleResponses<PolicyRuleView> POLICY_RULES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<PolicyRuleView>(POLICY_RULES_LINK, PolicyRuleView.class);
    public static final BlackDuckPathMultipleResponses<ProjectView> PROJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ProjectView>(PROJECTS_LINK, ProjectView.class);
    public static final BlackDuckPathSingleResponse<RegistrationView> REGISTRATION_LINK_RESPONSE = new BlackDuckPathSingleResponse<RegistrationView>(REGISTRATION_LINK, RegistrationView.class);
    public static final BlackDuckPathSingleResponse<ReportContentsView> REPORTS_LINK_RESPONSE = new BlackDuckPathSingleResponse<ReportContentsView>(REPORTS_LINK, ReportContentsView.class);
    public static final BlackDuckPathMultipleResponses<RoleView> ROLES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<RoleView>(ROLES_LINK, RoleView.class);
    public static final BlackDuckPathSingleResponse<ScanBomEntriesView> SCAN_LINK_RESPONSE = new BlackDuckPathSingleResponse<ScanBomEntriesView>(SCAN_LINK, ScanBomEntriesView.class);
    public static final BlackDuckPathSingleResponse<ScanView> SCAN_SUMMARIES_LINK_RESPONSE = new BlackDuckPathSingleResponse<ScanView>(SCAN_SUMMARIES_LINK, ScanView.class);
    public static final BlackDuckPathMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserGroupView>(USERGROUPS_LINK, UserGroupView.class);
    public static final BlackDuckPathMultipleResponses<UserView> USERS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserView>(USERS_LINK, UserView.class);
    public static final BlackDuckPathMultipleResponses<LicenseReportsReportView> VERSIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseReportsReportView>(VERSIONS_LINK, LicenseReportsReportView.class);
    public static final BlackDuckPathSingleResponse<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new BlackDuckPathSingleResponse<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
    public static final BlackDuckPathMultipleResponses<VulnerabilityReportsReportView> VULNERABILITY_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<VulnerabilityReportsReportView>(VULNERABILITY_REPORTS_LINK, VulnerabilityReportsReportView.class);

    static {
        links.put(ANNOUNCEMENT_LINK, ANNOUNCEMENT_LINK_RESPONSE);
        links.put(BOM_IMPORT_LINK, BOM_IMPORT_LINK_RESPONSE);
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(CURRENT_USER_LINK, CURRENT_USER_LINK_RESPONSE);
        links.put(CURRENT_VERSION_LINK, CURRENT_VERSION_LINK_RESPONSE);
        links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
        links.put(CWES_LINK, CWES_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_LINK, HEALTH_CHECKS_LINK_RESPONSE);
        links.put(JOBS_LINK, JOBS_LINK_RESPONSE);
        links.put(JOURNAL_LINK, JOURNAL_LINK_RESPONSE);
        links.put(LICENSE_FAMILIES_LINK, LICENSE_FAMILIES_LINK_RESPONSE);
        links.put(LICENSE_TERM_CATEGORIES_LINK, LICENSE_TERM_CATEGORIES_LINK_RESPONSE);
        links.put(LICENSE_TERMS_LINK, LICENSE_TERMS_LINK_RESPONSE);
        links.put(LICENSES_LINK, LICENSES_LINK_RESPONSE);
        links.put(MANAGE_ANNOUNCEMENT_LINK, MANAGE_ANNOUNCEMENT_LINK_RESPONSE);
        links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
        links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
        links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
        links.put(REGISTRATION_LINK, REGISTRATION_LINK_RESPONSE);
        links.put(REPORTS_LINK, REPORTS_LINK_RESPONSE);
        links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
        links.put(SCAN_LINK, SCAN_LINK_RESPONSE);
        links.put(SCAN_SUMMARIES_LINK, SCAN_SUMMARIES_LINK_RESPONSE);
        links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
        links.put(USERS_LINK, USERS_LINK_RESPONSE);
        links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
        links.put(VULNERABILITY_REPORTS_LINK, VULNERABILITY_REPORTS_LINK_RESPONSE);
    }

}
