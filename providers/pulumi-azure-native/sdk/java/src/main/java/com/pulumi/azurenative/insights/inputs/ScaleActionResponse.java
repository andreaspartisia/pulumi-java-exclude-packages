// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters for the scaling action.
 * 
 */
public final class ScaleActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScaleActionResponse Empty = new ScaleActionResponse();

    /**
     * the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and 1 minute in ISO 8601 format.
     * 
     */
    @Import(name="cooldown", required=true)
      private final String cooldown;

    public String cooldown() {
        return this.cooldown;
    }

    /**
     * the scale direction. Whether the scaling action increases or decreases the number of instances.
     * 
     */
    @Import(name="direction", required=true)
      private final String direction;

    public String direction() {
        return this.direction;
    }

    /**
     * the type of action that should occur when the scale rule fires.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * the number of instances that are involved in the scaling action. This value must be 1 or greater. The default value is 1.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ScaleActionResponse(
        String cooldown,
        String direction,
        String type,
        @Nullable String value) {
        this.cooldown = Objects.requireNonNull(cooldown, "expected parameter 'cooldown' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Codegen.stringProp("value").arg(value).def("1").getNullable();
    }

    private ScaleActionResponse() {
        this.cooldown = null;
        this.direction = null;
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cooldown;
        private String direction;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldown = defaults.cooldown;
    	      this.direction = defaults.direction;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder cooldown(String cooldown) {
            this.cooldown = Objects.requireNonNull(cooldown);
            return this;
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ScaleActionResponse build() {
            return new ScaleActionResponse(cooldown, direction, type, value);
        }
    }
}
