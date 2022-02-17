// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallLogConfig {
    /**
     * This field denotes whether to include or exclude metadata for firewall logs.
     * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
     * 
     */
    private final String metadata;

    @OutputCustomType.Constructor({"metadata"})
    private FirewallLogConfig(String metadata) {
        this.metadata = Objects.requireNonNull(metadata);
    }

    /**
     * This field denotes whether to include or exclude metadata for firewall logs.
     * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
     * 
     */
    public String getMetadata() {
        return this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public FirewallLogConfig build() {
            return new FirewallLogConfig(metadata);
        }
    }
}