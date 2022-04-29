// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomProtectionRuleState extends com.pulumi.resources.ResourceArgs {

    public static final CustomProtectionRuleState Empty = new CustomProtectionRuleState();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the custom protection rule.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the custom protection rule.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A description for the Custom Protection rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A description for the Custom Protection rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) A user-friendly name for the custom protection rule.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name for the custom protection rule.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The auto-generated ID for the custom protection rule. These IDs are referenced in logs.
     * 
     */
    @Import(name="modSecurityRuleIds")
    private @Nullable Output<List<String>> modSecurityRuleIds;

    /**
     * @return The auto-generated ID for the custom protection rule. These IDs are referenced in logs.
     * 
     */
    public Optional<Output<List<String>>> modSecurityRuleIds() {
        return Optional.ofNullable(this.modSecurityRuleIds);
    }

    /**
     * The current lifecycle state of the custom protection rule.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current lifecycle state of the custom protection rule.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * (Updatable) The template text of the custom protection rule. All custom protection rules are expressed in ModSecurity Rule Language.
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return (Updatable) The template text of the custom protection rule. All custom protection rules are expressed in ModSecurity Rule Language.
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The date and time the protection rule was created, expressed in RFC 3339 timestamp format.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the protection rule was created, expressed in RFC 3339 timestamp format.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private CustomProtectionRuleState() {}

    private CustomProtectionRuleState(CustomProtectionRuleState $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.description = $.description;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.modSecurityRuleIds = $.modSecurityRuleIds;
        this.state = $.state;
        this.template = $.template;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomProtectionRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomProtectionRuleState $;

        public Builder() {
            $ = new CustomProtectionRuleState();
        }

        public Builder(CustomProtectionRuleState defaults) {
            $ = new CustomProtectionRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the custom protection rule.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to create the custom protection rule.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param description (Updatable) A description for the Custom Protection rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A description for the Custom Protection rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) A user-friendly name for the custom protection rule.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly name for the custom protection rule.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param modSecurityRuleIds The auto-generated ID for the custom protection rule. These IDs are referenced in logs.
         * 
         * @return builder
         * 
         */
        public Builder modSecurityRuleIds(@Nullable Output<List<String>> modSecurityRuleIds) {
            $.modSecurityRuleIds = modSecurityRuleIds;
            return this;
        }

        /**
         * @param modSecurityRuleIds The auto-generated ID for the custom protection rule. These IDs are referenced in logs.
         * 
         * @return builder
         * 
         */
        public Builder modSecurityRuleIds(List<String> modSecurityRuleIds) {
            return modSecurityRuleIds(Output.of(modSecurityRuleIds));
        }

        /**
         * @param modSecurityRuleIds The auto-generated ID for the custom protection rule. These IDs are referenced in logs.
         * 
         * @return builder
         * 
         */
        public Builder modSecurityRuleIds(String... modSecurityRuleIds) {
            return modSecurityRuleIds(List.of(modSecurityRuleIds));
        }

        /**
         * @param state The current lifecycle state of the custom protection rule.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current lifecycle state of the custom protection rule.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param template (Updatable) The template text of the custom protection rule. All custom protection rules are expressed in ModSecurity Rule Language.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template (Updatable) The template text of the custom protection rule. All custom protection rules are expressed in ModSecurity Rule Language.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param timeCreated The date and time the protection rule was created, expressed in RFC 3339 timestamp format.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the protection rule was created, expressed in RFC 3339 timestamp format.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public CustomProtectionRuleState build() {
            return $;
        }
    }

}
