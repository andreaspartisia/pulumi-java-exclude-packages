// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleMsSecurityIncidentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleMsSecurityIncidentArgs Empty = new AlertRuleMsSecurityIncidentArgs();

    /**
     * The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
     * 
     */
    @Import(name="alertRuleTemplateGuid")
    private @Nullable Output<String> alertRuleTemplateGuid;

    /**
     * @return The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> alertRuleTemplateGuid() {
        return Optional.ofNullable(this.alertRuleTemplateGuid);
    }

    /**
     * The description of this Sentinel MS Security Incident Alert Rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this Sentinel MS Security Incident Alert Rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The friendly name of this Sentinel MS Security Incident Alert Rule.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The friendly name of this Sentinel MS Security Incident Alert Rule.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Only create incidents when the alert display name doesn&#39;t contain text from this list.
     * 
     */
    @Import(name="displayNameExcludeFilters")
    private @Nullable Output<List<String>> displayNameExcludeFilters;

    /**
     * @return Only create incidents when the alert display name doesn&#39;t contain text from this list.
     * 
     */
    public Optional<Output<List<String>>> displayNameExcludeFilters() {
        return Optional.ofNullable(this.displayNameExcludeFilters);
    }

    /**
     * Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
     * 
     */
    @Import(name="displayNameFilters")
    private @Nullable Output<List<String>> displayNameFilters;

    /**
     * @return Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
     * 
     */
    public Optional<Output<List<String>>> displayNameFilters() {
        return Optional.ofNullable(this.displayNameFilters);
    }

    /**
     * Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
     * 
     */
    @Import(name="productFilter", required=true)
    private Output<String> productFilter;

    /**
     * @return The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
     * 
     */
    public Output<String> productFilter() {
        return this.productFilter;
    }

    /**
     * Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
     * 
     */
    @Import(name="severityFilters", required=true)
    private Output<List<String>> severityFilters;

    /**
     * @return Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
     * 
     */
    public Output<List<String>> severityFilters() {
        return this.severityFilters;
    }

    private AlertRuleMsSecurityIncidentArgs() {}

    private AlertRuleMsSecurityIncidentArgs(AlertRuleMsSecurityIncidentArgs $) {
        this.alertRuleTemplateGuid = $.alertRuleTemplateGuid;
        this.description = $.description;
        this.displayName = $.displayName;
        this.displayNameExcludeFilters = $.displayNameExcludeFilters;
        this.displayNameFilters = $.displayNameFilters;
        this.enabled = $.enabled;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
        this.productFilter = $.productFilter;
        this.severityFilters = $.severityFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleMsSecurityIncidentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleMsSecurityIncidentArgs $;

        public Builder() {
            $ = new AlertRuleMsSecurityIncidentArgs();
        }

        public Builder(AlertRuleMsSecurityIncidentArgs defaults) {
            $ = new AlertRuleMsSecurityIncidentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertRuleTemplateGuid The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleTemplateGuid(@Nullable Output<String> alertRuleTemplateGuid) {
            $.alertRuleTemplateGuid = alertRuleTemplateGuid;
            return this;
        }

        /**
         * @param alertRuleTemplateGuid The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleTemplateGuid(String alertRuleTemplateGuid) {
            return alertRuleTemplateGuid(Output.of(alertRuleTemplateGuid));
        }

        /**
         * @param description The description of this Sentinel MS Security Incident Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this Sentinel MS Security Incident Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The friendly name of this Sentinel MS Security Incident Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The friendly name of this Sentinel MS Security Incident Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param displayNameExcludeFilters Only create incidents when the alert display name doesn&#39;t contain text from this list.
         * 
         * @return builder
         * 
         */
        public Builder displayNameExcludeFilters(@Nullable Output<List<String>> displayNameExcludeFilters) {
            $.displayNameExcludeFilters = displayNameExcludeFilters;
            return this;
        }

        /**
         * @param displayNameExcludeFilters Only create incidents when the alert display name doesn&#39;t contain text from this list.
         * 
         * @return builder
         * 
         */
        public Builder displayNameExcludeFilters(List<String> displayNameExcludeFilters) {
            return displayNameExcludeFilters(Output.of(displayNameExcludeFilters));
        }

        /**
         * @param displayNameExcludeFilters Only create incidents when the alert display name doesn&#39;t contain text from this list.
         * 
         * @return builder
         * 
         */
        public Builder displayNameExcludeFilters(String... displayNameExcludeFilters) {
            return displayNameExcludeFilters(List.of(displayNameExcludeFilters));
        }

        /**
         * @param displayNameFilters Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
         * 
         * @return builder
         * 
         */
        public Builder displayNameFilters(@Nullable Output<List<String>> displayNameFilters) {
            $.displayNameFilters = displayNameFilters;
            return this;
        }

        /**
         * @param displayNameFilters Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
         * 
         * @return builder
         * 
         */
        public Builder displayNameFilters(List<String> displayNameFilters) {
            return displayNameFilters(Output.of(displayNameFilters));
        }

        /**
         * @param displayNameFilters Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
         * 
         * @return builder
         * 
         */
        public Builder displayNameFilters(String... displayNameFilters) {
            return displayNameFilters(List.of(displayNameFilters));
        }

        /**
         * @param enabled Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productFilter The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
         * 
         * @return builder
         * 
         */
        public Builder productFilter(Output<String> productFilter) {
            $.productFilter = productFilter;
            return this;
        }

        /**
         * @param productFilter The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
         * 
         * @return builder
         * 
         */
        public Builder productFilter(String productFilter) {
            return productFilter(Output.of(productFilter));
        }

        /**
         * @param severityFilters Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
         * 
         * @return builder
         * 
         */
        public Builder severityFilters(Output<List<String>> severityFilters) {
            $.severityFilters = severityFilters;
            return this;
        }

        /**
         * @param severityFilters Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
         * 
         * @return builder
         * 
         */
        public Builder severityFilters(List<String> severityFilters) {
            return severityFilters(Output.of(severityFilters));
        }

        /**
         * @param severityFilters Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
         * 
         * @return builder
         * 
         */
        public Builder severityFilters(String... severityFilters) {
            return severityFilters(List.of(severityFilters));
        }

        public AlertRuleMsSecurityIncidentArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.logAnalyticsWorkspaceId = Objects.requireNonNull($.logAnalyticsWorkspaceId, "expected parameter 'logAnalyticsWorkspaceId' to be non-null");
            $.productFilter = Objects.requireNonNull($.productFilter, "expected parameter 'productFilter' to be non-null");
            $.severityFilters = Objects.requireNonNull($.severityFilters, "expected parameter 'severityFilters' to be non-null");
            return $;
        }
    }

}
