// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.enums.AlertSeverity;
import com.pulumi.azurenative.securityinsights.enums.MicrosoftSecurityProductName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MicrosoftSecurityIncidentCreationAlertRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MicrosoftSecurityIncidentCreationAlertRuleArgs Empty = new MicrosoftSecurityIncidentCreationAlertRuleArgs();

    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @Import(name="alertRuleTemplateName")
      private final @Nullable Output<String> alertRuleTemplateName;

    public Output<String> alertRuleTemplateName() {
        return this.alertRuleTemplateName == null ? Codegen.empty() : this.alertRuleTemplateName;
    }

    /**
     * The description of the alert rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * the alerts' displayNames on which the cases will not be generated
     * 
     */
    @Import(name="displayNamesExcludeFilter")
      private final @Nullable Output<List<String>> displayNamesExcludeFilter;

    public Output<List<String>> displayNamesExcludeFilter() {
        return this.displayNamesExcludeFilter == null ? Codegen.empty() : this.displayNamesExcludeFilter;
    }

    /**
     * the alerts' displayNames on which the cases will be generated
     * 
     */
    @Import(name="displayNamesFilter")
      private final @Nullable Output<List<String>> displayNamesFilter;

    public Output<List<String>> displayNamesFilter() {
        return this.displayNamesFilter == null ? Codegen.empty() : this.displayNamesFilter;
    }

    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The kind of the alert rule
     * Expected value is 'MicrosoftSecurityIncidentCreation'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The alerts' productName on which the cases will be generated
     * 
     */
    @Import(name="productFilter", required=true)
      private final Output<Either<String,MicrosoftSecurityProductName>> productFilter;

    public Output<Either<String,MicrosoftSecurityProductName>> productFilter() {
        return this.productFilter;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId")
      private final @Nullable Output<String> ruleId;

    public Output<String> ruleId() {
        return this.ruleId == null ? Codegen.empty() : this.ruleId;
    }

    /**
     * the alerts' severities on which the cases will be generated
     * 
     */
    @Import(name="severitiesFilter")
      private final @Nullable Output<List<Either<String,AlertSeverity>>> severitiesFilter;

    public Output<List<Either<String,AlertSeverity>>> severitiesFilter() {
        return this.severitiesFilter == null ? Codegen.empty() : this.severitiesFilter;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public MicrosoftSecurityIncidentCreationAlertRuleArgs(
        @Nullable Output<String> alertRuleTemplateName,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<List<String>> displayNamesExcludeFilter,
        @Nullable Output<List<String>> displayNamesFilter,
        Output<Boolean> enabled,
        Output<String> kind,
        Output<Either<String,MicrosoftSecurityProductName>> productFilter,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleId,
        @Nullable Output<List<Either<String,AlertSeverity>>> severitiesFilter,
        Output<String> workspaceName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.displayNamesExcludeFilter = displayNamesExcludeFilter;
        this.displayNamesFilter = displayNamesFilter;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.productFilter = Objects.requireNonNull(productFilter, "expected parameter 'productFilter' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = ruleId;
        this.severitiesFilter = severitiesFilter;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MicrosoftSecurityIncidentCreationAlertRuleArgs() {
        this.alertRuleTemplateName = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.displayNamesExcludeFilter = Codegen.empty();
        this.displayNamesFilter = Codegen.empty();
        this.enabled = Codegen.empty();
        this.kind = Codegen.empty();
        this.productFilter = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleId = Codegen.empty();
        this.severitiesFilter = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MicrosoftSecurityIncidentCreationAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alertRuleTemplateName;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<List<String>> displayNamesExcludeFilter;
        private @Nullable Output<List<String>> displayNamesFilter;
        private Output<Boolean> enabled;
        private Output<String> kind;
        private Output<Either<String,MicrosoftSecurityProductName>> productFilter;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleId;
        private @Nullable Output<List<Either<String,AlertSeverity>>> severitiesFilter;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MicrosoftSecurityIncidentCreationAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertRuleTemplateName = defaults.alertRuleTemplateName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.displayNamesExcludeFilter = defaults.displayNamesExcludeFilter;
    	      this.displayNamesFilter = defaults.displayNamesFilter;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.productFilter = defaults.productFilter;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.severitiesFilter = defaults.severitiesFilter;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder alertRuleTemplateName(@Nullable Output<String> alertRuleTemplateName) {
            this.alertRuleTemplateName = alertRuleTemplateName;
            return this;
        }
        public Builder alertRuleTemplateName(@Nullable String alertRuleTemplateName) {
            this.alertRuleTemplateName = Codegen.ofNullable(alertRuleTemplateName);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder displayNamesExcludeFilter(@Nullable Output<List<String>> displayNamesExcludeFilter) {
            this.displayNamesExcludeFilter = displayNamesExcludeFilter;
            return this;
        }
        public Builder displayNamesExcludeFilter(@Nullable List<String> displayNamesExcludeFilter) {
            this.displayNamesExcludeFilter = Codegen.ofNullable(displayNamesExcludeFilter);
            return this;
        }
        public Builder displayNamesExcludeFilter(String... displayNamesExcludeFilter) {
            return displayNamesExcludeFilter(List.of(displayNamesExcludeFilter));
        }
        public Builder displayNamesFilter(@Nullable Output<List<String>> displayNamesFilter) {
            this.displayNamesFilter = displayNamesFilter;
            return this;
        }
        public Builder displayNamesFilter(@Nullable List<String> displayNamesFilter) {
            this.displayNamesFilter = Codegen.ofNullable(displayNamesFilter);
            return this;
        }
        public Builder displayNamesFilter(String... displayNamesFilter) {
            return displayNamesFilter(List.of(displayNamesFilter));
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder productFilter(Output<Either<String,MicrosoftSecurityProductName>> productFilter) {
            this.productFilter = Objects.requireNonNull(productFilter);
            return this;
        }
        public Builder productFilter(Either<String,MicrosoftSecurityProductName> productFilter) {
            this.productFilter = Output.of(Objects.requireNonNull(productFilter));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleId(@Nullable Output<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = Codegen.ofNullable(ruleId);
            return this;
        }
        public Builder severitiesFilter(@Nullable Output<List<Either<String,AlertSeverity>>> severitiesFilter) {
            this.severitiesFilter = severitiesFilter;
            return this;
        }
        public Builder severitiesFilter(@Nullable List<Either<String,AlertSeverity>> severitiesFilter) {
            this.severitiesFilter = Codegen.ofNullable(severitiesFilter);
            return this;
        }
        public Builder severitiesFilter(Either<String,AlertSeverity>... severitiesFilter) {
            return severitiesFilter(List.of(severitiesFilter));
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public MicrosoftSecurityIncidentCreationAlertRuleArgs build() {
            return new MicrosoftSecurityIncidentCreationAlertRuleArgs(alertRuleTemplateName, description, displayName, displayNamesExcludeFilter, displayNamesFilter, enabled, kind, productFilter, resourceGroupName, ruleId, severitiesFilter, workspaceName);
        }
    }
}
