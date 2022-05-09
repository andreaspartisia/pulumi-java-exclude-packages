// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LinkedServiceSynapseKeyVaultPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceSynapseKeyVaultPasswordArgs Empty = new LinkedServiceSynapseKeyVaultPasswordArgs();

    /**
     * Specifies the name of an existing Key Vault Data Factory Linked Service.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<String> linkedServiceName;

    /**
     * @return Specifies the name of an existing Key Vault Data Factory Linked Service.
     * 
     */
    public Output<String> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Specifies the secret name in Azure Key Vault that stores Synapse password.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return Specifies the secret name in Azure Key Vault that stores Synapse password.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    private LinkedServiceSynapseKeyVaultPasswordArgs() {}

    private LinkedServiceSynapseKeyVaultPasswordArgs(LinkedServiceSynapseKeyVaultPasswordArgs $) {
        this.linkedServiceName = $.linkedServiceName;
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceSynapseKeyVaultPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceSynapseKeyVaultPasswordArgs $;

        public Builder() {
            $ = new LinkedServiceSynapseKeyVaultPasswordArgs();
        }

        public Builder(LinkedServiceSynapseKeyVaultPasswordArgs defaults) {
            $ = new LinkedServiceSynapseKeyVaultPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedServiceName Specifies the name of an existing Key Vault Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(Output<String> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Specifies the name of an existing Key Vault Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(String linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param secretName Specifies the secret name in Azure Key Vault that stores Synapse password.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName Specifies the secret name in Azure Key Vault that stores Synapse password.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public LinkedServiceSynapseKeyVaultPasswordArgs build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
