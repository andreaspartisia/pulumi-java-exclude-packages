// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringNetworkInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringNetworkInfoArgs Empty = new PacketMirroringNetworkInfoArgs();

    /**
     * URL of the network resource.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public PacketMirroringNetworkInfoArgs(@Nullable Output<String> url) {
        this.url = url;
    }

    private PacketMirroringNetworkInfoArgs() {
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringNetworkInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringNetworkInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public PacketMirroringNetworkInfoArgs build() {
            return new PacketMirroringNetworkInfoArgs(url);
        }
    }
}
