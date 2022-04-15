// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Compute Engine PD CSI driver.
 * 
 */
public final class GcePersistentDiskCsiDriverConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcePersistentDiskCsiDriverConfigArgs Empty = new GcePersistentDiskCsiDriverConfigArgs();

    /**
     * Whether the Compute Engine PD CSI driver is enabled for this cluster.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public GcePersistentDiskCsiDriverConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private GcePersistentDiskCsiDriverConfigArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcePersistentDiskCsiDriverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GcePersistentDiskCsiDriverConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public GcePersistentDiskCsiDriverConfigArgs build() {
            return new GcePersistentDiskCsiDriverConfigArgs(enabled);
        }
    }
}
