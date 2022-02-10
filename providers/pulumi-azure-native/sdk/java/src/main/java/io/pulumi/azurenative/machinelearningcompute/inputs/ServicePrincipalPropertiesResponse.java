// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServicePrincipalPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalPropertiesResponse Empty = new ServicePrincipalPropertiesResponse();

    @InputImport(name="clientId", required=true)
    private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    @InputImport(name="secret", required=true)
    private final String secret;

    public String getSecret() {
        return this.secret;
    }

    public ServicePrincipalPropertiesResponse(
        String clientId,
        String secret) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServicePrincipalPropertiesResponse() {
        this.clientId = null;
        this.secret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public ServicePrincipalPropertiesResponse build() {
            return new ServicePrincipalPropertiesResponse(clientId, secret);
        }
    }
}