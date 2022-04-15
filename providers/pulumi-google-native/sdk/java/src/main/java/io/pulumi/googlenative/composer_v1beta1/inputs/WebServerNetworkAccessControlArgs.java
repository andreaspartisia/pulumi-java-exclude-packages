// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.composer_v1beta1.inputs.AllowedIpRangeArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network-level access control policy for the Airflow web server.
 * 
 */
public final class WebServerNetworkAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServerNetworkAccessControlArgs Empty = new WebServerNetworkAccessControlArgs();

    /**
     * A collection of allowed IP ranges with descriptions.
     * 
     */
    @Import(name="allowedIpRanges")
      private final @Nullable Output<List<AllowedIpRangeArgs>> allowedIpRanges;

    public Output<List<AllowedIpRangeArgs>> allowedIpRanges() {
        return this.allowedIpRanges == null ? Codegen.empty() : this.allowedIpRanges;
    }

    public WebServerNetworkAccessControlArgs(@Nullable Output<List<AllowedIpRangeArgs>> allowedIpRanges) {
        this.allowedIpRanges = allowedIpRanges;
    }

    private WebServerNetworkAccessControlArgs() {
        this.allowedIpRanges = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerNetworkAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AllowedIpRangeArgs>> allowedIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerNetworkAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRanges = defaults.allowedIpRanges;
        }

        public Builder allowedIpRanges(@Nullable Output<List<AllowedIpRangeArgs>> allowedIpRanges) {
            this.allowedIpRanges = allowedIpRanges;
            return this;
        }
        public Builder allowedIpRanges(@Nullable List<AllowedIpRangeArgs> allowedIpRanges) {
            this.allowedIpRanges = Codegen.ofNullable(allowedIpRanges);
            return this;
        }
        public Builder allowedIpRanges(AllowedIpRangeArgs... allowedIpRanges) {
            return allowedIpRanges(List.of(allowedIpRanges));
        }        public WebServerNetworkAccessControlArgs build() {
            return new WebServerNetworkAccessControlArgs(allowedIpRanges);
        }
    }
}
