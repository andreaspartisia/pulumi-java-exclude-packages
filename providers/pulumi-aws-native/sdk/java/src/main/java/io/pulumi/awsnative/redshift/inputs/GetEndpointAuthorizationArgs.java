// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointAuthorizationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEndpointAuthorizationArgs Empty = new GetEndpointAuthorizationArgs();

    /**
     * The target AWS account ID to grant or revoke access for.
     * 
     */
    @InputImport(name="account", required=true)
    private final String account;

    public String getAccount() {
        return this.account;
    }

    /**
     * The cluster identifier.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
    private final String clusterIdentifier;

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public GetEndpointAuthorizationArgs(
        String account,
        String clusterIdentifier) {
        this.account = Objects.requireNonNull(account, "expected parameter 'account' to be non-null");
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
    }

    private GetEndpointAuthorizationArgs() {
        this.account = null;
        this.clusterIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String account;
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder setAccount(String account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public GetEndpointAuthorizationArgs build() {
            return new GetEndpointAuthorizationArgs(account, clusterIdentifier);
        }
    }
}