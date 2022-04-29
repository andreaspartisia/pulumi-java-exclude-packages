// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Vault.inputs.SecretSecretContentArgs;
import com.pulumi.oci.Vault.inputs.SecretSecretRuleArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretState extends com.pulumi.resources.ResourceArgs {

    public static final SecretState Empty = new SecretState();

    /**
     * (Updatable) The OCID of the compartment where you want to create the secret.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment where you want to create the secret.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The version number of the secret version that&#39;s currently in use.
     * 
     */
    @Import(name="currentVersionNumber")
    private @Nullable Output<String> currentVersionNumber;

    /**
     * @return The version number of the secret version that&#39;s currently in use.
     * 
     */
    public Optional<Output<String>> currentVersionNumber() {
        return Optional.ofNullable(this.currentVersionNumber);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A brief description of the secret. Avoid entering confidential information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A brief description of the secret. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The OCID of the master encryption key that is used to encrypt the secret.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The OCID of the master encryption key that is used to encrypt the secret.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * Additional information about the current lifecycle state of the secret.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state of the secret.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * (Updatable) Additional metadata that you can use to provide context about how to use the secret during rotation or other administrative tasks. For example, for a secret that you use to connect to a database, the additional metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,Object>> metadata;

    /**
     * @return (Updatable) Additional metadata that you can use to provide context about how to use the secret during rotation or other administrative tasks. For example, for a secret that you use to connect to a database, the additional metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
     * 
     */
    public Optional<Output<Map<String,Object>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * (Updatable) The content of the secret and metadata to help identify it.
     * 
     */
    @Import(name="secretContent")
    private @Nullable Output<SecretSecretContentArgs> secretContent;

    /**
     * @return (Updatable) The content of the secret and metadata to help identify it.
     * 
     */
    public Optional<Output<SecretSecretContentArgs>> secretContent() {
        return Optional.ofNullable(this.secretContent);
    }

    /**
     * A user-friendly name for the secret. Secret names should be unique within a vault. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * 
     */
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return A user-friendly name for the secret. Secret names should be unique within a vault. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    /**
     * (Updatable) A list of rules to control how the secret is used and managed.
     * 
     */
    @Import(name="secretRules")
    private @Nullable Output<List<SecretSecretRuleArgs>> secretRules;

    /**
     * @return (Updatable) A list of rules to control how the secret is used and managed.
     * 
     */
    public Optional<Output<List<SecretSecretRuleArgs>>> secretRules() {
        return Optional.ofNullable(this.secretRules);
    }

    /**
     * The current lifecycle state of the secret.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current lifecycle state of the secret.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A property indicating when the secret was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return A property indicating when the secret was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * An optional property indicating when the current secret version will expire, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Import(name="timeOfCurrentVersionExpiry")
    private @Nullable Output<String> timeOfCurrentVersionExpiry;

    /**
     * @return An optional property indicating when the current secret version will expire, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeOfCurrentVersionExpiry() {
        return Optional.ofNullable(this.timeOfCurrentVersionExpiry);
    }

    /**
     * An optional property indicating when to delete the secret, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Import(name="timeOfDeletion")
    private @Nullable Output<String> timeOfDeletion;

    /**
     * @return An optional property indicating when to delete the secret, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeOfDeletion() {
        return Optional.ofNullable(this.timeOfDeletion);
    }

    /**
     * The OCID of the vault where you want to create the secret.
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return The OCID of the vault where you want to create the secret.
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private SecretState() {}

    private SecretState(SecretState $) {
        this.compartmentId = $.compartmentId;
        this.currentVersionNumber = $.currentVersionNumber;
        this.definedTags = $.definedTags;
        this.description = $.description;
        this.freeformTags = $.freeformTags;
        this.keyId = $.keyId;
        this.lifecycleDetails = $.lifecycleDetails;
        this.metadata = $.metadata;
        this.secretContent = $.secretContent;
        this.secretName = $.secretName;
        this.secretRules = $.secretRules;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
        this.timeOfCurrentVersionExpiry = $.timeOfCurrentVersionExpiry;
        this.timeOfDeletion = $.timeOfDeletion;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretState $;

        public Builder() {
            $ = new SecretState();
        }

        public Builder(SecretState defaults) {
            $ = new SecretState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment where you want to create the secret.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment where you want to create the secret.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param currentVersionNumber The version number of the secret version that&#39;s currently in use.
         * 
         * @return builder
         * 
         */
        public Builder currentVersionNumber(@Nullable Output<String> currentVersionNumber) {
            $.currentVersionNumber = currentVersionNumber;
            return this;
        }

        /**
         * @param currentVersionNumber The version number of the secret version that&#39;s currently in use.
         * 
         * @return builder
         * 
         */
        public Builder currentVersionNumber(String currentVersionNumber) {
            return currentVersionNumber(Output.of(currentVersionNumber));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param description (Updatable) A brief description of the secret. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A brief description of the secret. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param keyId The OCID of the master encryption key that is used to encrypt the secret.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The OCID of the master encryption key that is used to encrypt the secret.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param lifecycleDetails Additional information about the current lifecycle state of the secret.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Additional information about the current lifecycle state of the secret.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param metadata (Updatable) Additional metadata that you can use to provide context about how to use the secret during rotation or other administrative tasks. For example, for a secret that you use to connect to a database, the additional metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,Object>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata (Updatable) Additional metadata that you can use to provide context about how to use the secret during rotation or other administrative tasks. For example, for a secret that you use to connect to a database, the additional metadata might specify the connection endpoint and the connection string. Provide additional metadata as key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,Object> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param secretContent (Updatable) The content of the secret and metadata to help identify it.
         * 
         * @return builder
         * 
         */
        public Builder secretContent(@Nullable Output<SecretSecretContentArgs> secretContent) {
            $.secretContent = secretContent;
            return this;
        }

        /**
         * @param secretContent (Updatable) The content of the secret and metadata to help identify it.
         * 
         * @return builder
         * 
         */
        public Builder secretContent(SecretSecretContentArgs secretContent) {
            return secretContent(Output.of(secretContent));
        }

        /**
         * @param secretName A user-friendly name for the secret. Secret names should be unique within a vault. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         * 
         * @return builder
         * 
         */
        public Builder secretName(@Nullable Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName A user-friendly name for the secret. Secret names should be unique within a vault. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param secretRules (Updatable) A list of rules to control how the secret is used and managed.
         * 
         * @return builder
         * 
         */
        public Builder secretRules(@Nullable Output<List<SecretSecretRuleArgs>> secretRules) {
            $.secretRules = secretRules;
            return this;
        }

        /**
         * @param secretRules (Updatable) A list of rules to control how the secret is used and managed.
         * 
         * @return builder
         * 
         */
        public Builder secretRules(List<SecretSecretRuleArgs> secretRules) {
            return secretRules(Output.of(secretRules));
        }

        /**
         * @param secretRules (Updatable) A list of rules to control how the secret is used and managed.
         * 
         * @return builder
         * 
         */
        public Builder secretRules(SecretSecretRuleArgs... secretRules) {
            return secretRules(List.of(secretRules));
        }

        /**
         * @param state The current lifecycle state of the secret.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current lifecycle state of the secret.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated A property indicating when the secret was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated A property indicating when the secret was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeOfCurrentVersionExpiry An optional property indicating when the current secret version will expire, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeOfCurrentVersionExpiry(@Nullable Output<String> timeOfCurrentVersionExpiry) {
            $.timeOfCurrentVersionExpiry = timeOfCurrentVersionExpiry;
            return this;
        }

        /**
         * @param timeOfCurrentVersionExpiry An optional property indicating when the current secret version will expire, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeOfCurrentVersionExpiry(String timeOfCurrentVersionExpiry) {
            return timeOfCurrentVersionExpiry(Output.of(timeOfCurrentVersionExpiry));
        }

        /**
         * @param timeOfDeletion An optional property indicating when to delete the secret, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeOfDeletion(@Nullable Output<String> timeOfDeletion) {
            $.timeOfDeletion = timeOfDeletion;
            return this;
        }

        /**
         * @param timeOfDeletion An optional property indicating when to delete the secret, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeOfDeletion(String timeOfDeletion) {
            return timeOfDeletion(Output.of(timeOfDeletion));
        }

        /**
         * @param vaultId The OCID of the vault where you want to create the secret.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The OCID of the vault where you want to create the secret.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public SecretState build() {
            return $;
        }
    }

}
