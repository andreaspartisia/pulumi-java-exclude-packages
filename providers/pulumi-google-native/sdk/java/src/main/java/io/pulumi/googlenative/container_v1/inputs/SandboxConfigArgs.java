// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1.enums.SandboxConfigType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SandboxConfig contains configurations of the sandbox to use for the node.
 * 
 */
public final class SandboxConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SandboxConfigArgs Empty = new SandboxConfigArgs();

    /**
     * Type of the sandbox to use for the node.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<SandboxConfigType> type;

    public Output<SandboxConfigType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public SandboxConfigArgs(@Nullable Output<SandboxConfigType> type) {
        this.type = type;
    }

    private SandboxConfigArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SandboxConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SandboxConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SandboxConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<SandboxConfigType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable SandboxConfigType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public SandboxConfigArgs build() {
            return new SandboxConfigArgs(type);
        }
    }
}
