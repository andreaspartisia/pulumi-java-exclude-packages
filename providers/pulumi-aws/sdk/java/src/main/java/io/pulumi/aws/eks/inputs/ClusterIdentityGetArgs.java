// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.ClusterIdentityOidcGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIdentityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIdentityGetArgs Empty = new ClusterIdentityGetArgs();

    /**
     * Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    @InputImport(name="oidcs")
      private final @Nullable Input<List<ClusterIdentityOidcGetArgs>> oidcs;

    public Input<List<ClusterIdentityOidcGetArgs>> getOidcs() {
        return this.oidcs == null ? Input.empty() : this.oidcs;
    }

    public ClusterIdentityGetArgs(@Nullable Input<List<ClusterIdentityOidcGetArgs>> oidcs) {
        this.oidcs = oidcs;
    }

    private ClusterIdentityGetArgs() {
        this.oidcs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClusterIdentityOidcGetArgs>> oidcs;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oidcs = defaults.oidcs;
        }

        public Builder setOidcs(@Nullable Input<List<ClusterIdentityOidcGetArgs>> oidcs) {
            this.oidcs = oidcs;
            return this;
        }

        public Builder setOidcs(@Nullable List<ClusterIdentityOidcGetArgs> oidcs) {
            this.oidcs = Input.ofNullable(oidcs);
            return this;
        }
        public ClusterIdentityGetArgs build() {
            return new ClusterIdentityGetArgs(oidcs);
        }
    }
}