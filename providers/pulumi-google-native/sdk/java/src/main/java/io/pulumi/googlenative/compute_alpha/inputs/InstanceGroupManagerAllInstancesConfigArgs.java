// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.inputs.InstancePropertiesPatchArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAllInstancesConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAllInstancesConfigArgs Empty = new InstanceGroupManagerAllInstancesConfigArgs();

    /**
     * Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<InstancePropertiesPatchArgs> properties;

    public Output<InstancePropertiesPatchArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public InstanceGroupManagerAllInstancesConfigArgs(@Nullable Output<InstancePropertiesPatchArgs> properties) {
        this.properties = properties;
    }

    private InstanceGroupManagerAllInstancesConfigArgs() {
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAllInstancesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstancePropertiesPatchArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAllInstancesConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(@Nullable Output<InstancePropertiesPatchArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable InstancePropertiesPatchArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public InstanceGroupManagerAllInstancesConfigArgs build() {
            return new InstanceGroupManagerAllInstancesConfigArgs(properties);
        }
    }
}
