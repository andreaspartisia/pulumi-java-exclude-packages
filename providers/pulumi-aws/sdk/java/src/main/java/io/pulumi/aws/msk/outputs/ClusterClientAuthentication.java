// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.aws.msk.outputs.ClusterClientAuthenticationSasl;
import io.pulumi.aws.msk.outputs.ClusterClientAuthenticationTls;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClientAuthentication {
    /**
     * Configuration block for specifying SASL client authentication. See below.
     * 
     */
    private final @Nullable ClusterClientAuthenticationSasl sasl;
    /**
     * Configuration block for specifying TLS client authentication. See below.
     * 
     */
    private final @Nullable ClusterClientAuthenticationTls tls;

    @OutputCustomType.Constructor
    private ClusterClientAuthentication(
        @OutputCustomType.Parameter("sasl") @Nullable ClusterClientAuthenticationSasl sasl,
        @OutputCustomType.Parameter("tls") @Nullable ClusterClientAuthenticationTls tls) {
        this.sasl = sasl;
        this.tls = tls;
    }

    /**
     * Configuration block for specifying SASL client authentication. See below.
     * 
    */
    public Optional<ClusterClientAuthenticationSasl> getSasl() {
        return Optional.ofNullable(this.sasl);
    }
    /**
     * Configuration block for specifying TLS client authentication. See below.
     * 
    */
    public Optional<ClusterClientAuthenticationTls> getTls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterClientAuthenticationSasl sasl;
        private @Nullable ClusterClientAuthenticationTls tls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasl = defaults.sasl;
    	      this.tls = defaults.tls;
        }

        public Builder setSasl(@Nullable ClusterClientAuthenticationSasl sasl) {
            this.sasl = sasl;
            return this;
        }

        public Builder setTls(@Nullable ClusterClientAuthenticationTls tls) {
            this.tls = tls;
            return this;
        }
        public ClusterClientAuthentication build() {
            return new ClusterClientAuthentication(sasl, tls);
        }
    }
}