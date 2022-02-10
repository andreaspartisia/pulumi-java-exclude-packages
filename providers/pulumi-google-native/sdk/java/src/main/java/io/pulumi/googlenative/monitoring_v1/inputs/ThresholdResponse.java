// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class ThresholdResponse extends io.pulumi.resources.InvokeArgs {

    public static final ThresholdResponse Empty = new ThresholdResponse();

    @InputImport(name="color", required=true)
    private final String color;

    public String getColor() {
        return this.color;
    }

    @InputImport(name="direction", required=true)
    private final String direction;

    public String getDirection() {
        return this.direction;
    }

    @InputImport(name="label", required=true)
    private final String label;

    public String getLabel() {
        return this.label;
    }

    @InputImport(name="targetAxis", required=true)
    private final String targetAxis;

    public String getTargetAxis() {
        return this.targetAxis;
    }

    @InputImport(name="value", required=true)
    private final Double value;

    public Double getValue() {
        return this.value;
    }

    public ThresholdResponse(
        String color,
        String direction,
        String label,
        String targetAxis,
        Double value) {
        this.color = Objects.requireNonNull(color, "expected parameter 'color' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.targetAxis = Objects.requireNonNull(targetAxis, "expected parameter 'targetAxis' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ThresholdResponse() {
        this.color = null;
        this.direction = null;
        this.label = null;
        this.targetAxis = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String color;
        private String direction;
        private String label;
        private String targetAxis;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.direction = defaults.direction;
    	      this.label = defaults.label;
    	      this.targetAxis = defaults.targetAxis;
    	      this.value = defaults.value;
        }

        public Builder setColor(String color) {
            this.color = Objects.requireNonNull(color);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setTargetAxis(String targetAxis) {
            this.targetAxis = Objects.requireNonNull(targetAxis);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ThresholdResponse build() {
            return new ThresholdResponse(color, direction, label, targetAxis, value);
        }
    }
}