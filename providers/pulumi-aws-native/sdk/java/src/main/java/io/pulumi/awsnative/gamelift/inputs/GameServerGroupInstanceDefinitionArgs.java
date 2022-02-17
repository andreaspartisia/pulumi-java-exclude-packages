// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An allowed instance type for your game server group.
 * 
 */
public final class GameServerGroupInstanceDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerGroupInstanceDefinitionArgs Empty = new GameServerGroupInstanceDefinitionArgs();

    @InputImport(name="instanceType", required=true)
    private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    @InputImport(name="weightedCapacity")
    private final @Nullable Input<String> weightedCapacity;

    public Input<String> getWeightedCapacity() {
        return this.weightedCapacity == null ? Input.empty() : this.weightedCapacity;
    }

    public GameServerGroupInstanceDefinitionArgs(
        Input<String> instanceType,
        @Nullable Input<String> weightedCapacity) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.weightedCapacity = weightedCapacity;
    }

    private GameServerGroupInstanceDefinitionArgs() {
        this.instanceType = Input.empty();
        this.weightedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupInstanceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceType;
        private @Nullable Input<String> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupInstanceDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Input<String> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = Input.ofNullable(weightedCapacity);
            return this;
        }

        public GameServerGroupInstanceDefinitionArgs build() {
            return new GameServerGroupInstanceDefinitionArgs(instanceType, weightedCapacity);
        }
    }
}