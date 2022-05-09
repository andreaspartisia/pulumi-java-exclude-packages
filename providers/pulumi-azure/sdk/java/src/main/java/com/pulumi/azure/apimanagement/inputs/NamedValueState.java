// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.NamedValueValueFromKeyVaultArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamedValueState extends com.pulumi.resources.ResourceArgs {

    public static final NamedValueState Empty = new NamedValueState();

    /**
     * The name of the API Management Service in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName")
    private @Nullable Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementName() {
        return Optional.ofNullable(this.apiManagementName);
    }

    /**
     * The display name of this API Management Named Value.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of this API Management Named Value.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the API Management Named Value. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the API Management Named Value. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Specifies whether the API Management Named Value is secret. Valid values are `true` or `false`. The default value is `false`.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<Boolean> secret;

    /**
     * @return Specifies whether the API Management Named Value is secret. Valid values are `true` or `false`. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * A list of tags to be applied to the API Management Named Value.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to be applied to the API Management Named Value.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The value of this API Management Named Value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of this API Management Named Value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * A `value_from_key_vault` block as defined below.
     * 
     */
    @Import(name="valueFromKeyVault")
    private @Nullable Output<NamedValueValueFromKeyVaultArgs> valueFromKeyVault;

    /**
     * @return A `value_from_key_vault` block as defined below.
     * 
     */
    public Optional<Output<NamedValueValueFromKeyVaultArgs>> valueFromKeyVault() {
        return Optional.ofNullable(this.valueFromKeyVault);
    }

    private NamedValueState() {}

    private NamedValueState(NamedValueState $) {
        this.apiManagementName = $.apiManagementName;
        this.displayName = $.displayName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.secret = $.secret;
        this.tags = $.tags;
        this.value = $.value;
        this.valueFromKeyVault = $.valueFromKeyVault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedValueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedValueState $;

        public Builder() {
            $ = new NamedValueState();
        }

        public Builder(NamedValueState defaults) {
            $ = new NamedValueState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the API Management Named Value should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(@Nullable Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the API Management Named Value should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param displayName The display name of this API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of this API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The name of the API Management Named Value. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the API Management Named Value. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Named Value should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Named Value should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secret Specifies whether the API Management Named Value is secret. Valid values are `true` or `false`. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<Boolean> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Specifies whether the API Management Named Value is secret. Valid values are `true` or `false`. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder secret(Boolean secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param tags A list of tags to be applied to the API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to be applied to the API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to be applied to the API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param value The value of this API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of this API Management Named Value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueFromKeyVault A `value_from_key_vault` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder valueFromKeyVault(@Nullable Output<NamedValueValueFromKeyVaultArgs> valueFromKeyVault) {
            $.valueFromKeyVault = valueFromKeyVault;
            return this;
        }

        /**
         * @param valueFromKeyVault A `value_from_key_vault` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder valueFromKeyVault(NamedValueValueFromKeyVaultArgs valueFromKeyVault) {
            return valueFromKeyVault(Output.of(valueFromKeyVault));
        }

        public NamedValueState build() {
            return $;
        }
    }

}
