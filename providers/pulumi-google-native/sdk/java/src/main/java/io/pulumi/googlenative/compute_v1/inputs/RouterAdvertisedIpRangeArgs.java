// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description-tagged IP ranges for the router to advertise.
 * 
 */
public final class RouterAdvertisedIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterAdvertisedIpRangeArgs Empty = new RouterAdvertisedIpRangeArgs();

    /**
     * User-specified description for the IP range.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<String> range;

    public Output<String> range() {
        return this.range == null ? Codegen.empty() : this.range;
    }

    public RouterAdvertisedIpRangeArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> range) {
        this.description = description;
        this.range = range;
    }

    private RouterAdvertisedIpRangeArgs() {
        this.description = Codegen.empty();
        this.range = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterAdvertisedIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterAdvertisedIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder range(@Nullable Output<String> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable String range) {
            this.range = Codegen.ofNullable(range);
            return this;
        }        public RouterAdvertisedIpRangeArgs build() {
            return new RouterAdvertisedIpRangeArgs(description, range);
        }
    }
}
