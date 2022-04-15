// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyNetworkArgs Empty = new PolicyNetworkArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl")
      private final @Nullable Output<String> networkUrl;

    public Output<String> networkUrl() {
        return this.networkUrl == null ? Codegen.empty() : this.networkUrl;
    }

    public PolicyNetworkArgs(
        @Nullable Output<String> kind,
        @Nullable Output<String> networkUrl) {
        this.kind = kind;
        this.networkUrl = networkUrl;
    }

    private PolicyNetworkArgs() {
        this.kind = Codegen.empty();
        this.networkUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder networkUrl(@Nullable Output<String> networkUrl) {
            this.networkUrl = networkUrl;
            return this;
        }
        public Builder networkUrl(@Nullable String networkUrl) {
            this.networkUrl = Codegen.ofNullable(networkUrl);
            return this;
        }        public PolicyNetworkArgs build() {
            return new PolicyNetworkArgs(kind, networkUrl);
        }
    }
}
