// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Vault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    /**
     * The OCID of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private String secretId;

    /**
     * @return The OCID of the secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }

    private GetSecretArgs() {}

    private GetSecretArgs(GetSecretArgs $) {
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretArgs $;

        public Builder() {
            $ = new GetSecretArgs();
        }

        public Builder(GetSecretArgs defaults) {
            $ = new GetSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretId The OCID of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        public GetSecretArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
