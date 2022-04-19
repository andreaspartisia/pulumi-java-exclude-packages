// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.ScaleDirection;
import com.pulumi.azurenative.insights.enums.ScaleType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters for the scaling action.
 * 
 */
public final class ScaleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleActionArgs Empty = new ScaleActionArgs();

    /**
     * the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and 1 minute in ISO 8601 format.
     * 
     */
    @Import(name="cooldown", required=true)
      private final Output<String> cooldown;

    public Output<String> cooldown() {
        return this.cooldown;
    }

    /**
     * the scale direction. Whether the scaling action increases or decreases the number of instances.
     * 
     */
    @Import(name="direction", required=true)
      private final Output<ScaleDirection> direction;

    public Output<ScaleDirection> direction() {
        return this.direction;
    }

    /**
     * the type of action that should occur when the scale rule fires.
     * 
     */
    @Import(name="type", required=true)
      private final Output<ScaleType> type;

    public Output<ScaleType> type() {
        return this.type;
    }

    /**
     * the number of instances that are involved in the scaling action. This value must be 1 or greater. The default value is 1.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ScaleActionArgs(
        Output<String> cooldown,
        Output<ScaleDirection> direction,
        Output<ScaleType> type,
        @Nullable Output<String> value) {
        this.cooldown = Objects.requireNonNull(cooldown, "expected parameter 'cooldown' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Codegen.stringProp("value").output().arg(value).def("1").getNullable();
    }

    private ScaleActionArgs() {
        this.cooldown = Codegen.empty();
        this.direction = Codegen.empty();
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cooldown;
        private Output<ScaleDirection> direction;
        private Output<ScaleType> type;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldown = defaults.cooldown;
    	      this.direction = defaults.direction;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder cooldown(Output<String> cooldown) {
            this.cooldown = Objects.requireNonNull(cooldown);
            return this;
        }
        public Builder cooldown(String cooldown) {
            this.cooldown = Output.of(Objects.requireNonNull(cooldown));
            return this;
        }
        public Builder direction(Output<ScaleDirection> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder direction(ScaleDirection direction) {
            this.direction = Output.of(Objects.requireNonNull(direction));
            return this;
        }
        public Builder type(Output<ScaleType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(ScaleType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ScaleActionArgs build() {
            return new ScaleActionArgs(cooldown, direction, type, value);
        }
    }
}
