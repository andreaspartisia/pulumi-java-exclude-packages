// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouterAdvertisedIpRangeResponse {
    private final String description;
    private final String range;

    @OutputCustomType.Constructor({"description","range"})
    private RouterAdvertisedIpRangeResponse(
        String description,
        String range) {
        this.description = Objects.requireNonNull(description);
        this.range = Objects.requireNonNull(range);
    }

    public String getDescription() {
        return this.description;
    }
    public String getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterAdvertisedIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterAdvertisedIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setRange(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public RouterAdvertisedIpRangeResponse build() {
            return new RouterAdvertisedIpRangeResponse(description, range);
        }
    }
}