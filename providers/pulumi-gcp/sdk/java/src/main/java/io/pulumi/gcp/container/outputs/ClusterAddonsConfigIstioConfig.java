// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterAddonsConfigIstioConfig {
    /**
     * The authentication type between services in Istio. Available options include `AUTH_MUTUAL_TLS`.
     * 
     */
    private final @Nullable String auth;
    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    private final Boolean disabled;

    @OutputCustomType.Constructor
    private ClusterAddonsConfigIstioConfig(
        @OutputCustomType.Parameter("auth") @Nullable String auth,
        @OutputCustomType.Parameter("disabled") Boolean disabled) {
        this.auth = auth;
        this.disabled = disabled;
    }

    /**
     * The authentication type between services in Istio. Available options include `AUTH_MUTUAL_TLS`.
     * 
    */
    public Optional<String> getAuth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigIstioConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String auth;
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigIstioConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.disabled = defaults.disabled;
        }

        public Builder setAuth(@Nullable String auth) {
            this.auth = auth;
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public ClusterAddonsConfigIstioConfig build() {
            return new ClusterAddonsConfigIstioConfig(auth, disabled);
        }
    }
}
