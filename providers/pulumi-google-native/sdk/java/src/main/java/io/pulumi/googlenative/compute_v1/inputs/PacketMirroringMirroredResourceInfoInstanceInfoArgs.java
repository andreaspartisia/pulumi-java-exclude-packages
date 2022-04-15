// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourceInfoInstanceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourceInfoInstanceInfoArgs Empty = new PacketMirroringMirroredResourceInfoInstanceInfoArgs();

    /**
     * Resource URL to the virtual machine instance which is being mirrored.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public PacketMirroringMirroredResourceInfoInstanceInfoArgs(@Nullable Output<String> url) {
        this.url = url;
    }

    private PacketMirroringMirroredResourceInfoInstanceInfoArgs() {
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoInstanceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoInstanceInfoArgs defaults) {
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
        }        public PacketMirroringMirroredResourceInfoInstanceInfoArgs build() {
            return new PacketMirroringMirroredResourceInfoInstanceInfoArgs(url);
        }
    }
}
