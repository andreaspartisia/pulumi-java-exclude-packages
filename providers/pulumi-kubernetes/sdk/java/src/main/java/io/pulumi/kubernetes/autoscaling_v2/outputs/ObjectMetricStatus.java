// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.CrossVersionObjectReference;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricIdentifier;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricValueStatus;
import java.util.Objects;

@OutputCustomType
public final class ObjectMetricStatus {
    /**
     * current contains the current value for the given metric
     * 
     */
    private final MetricValueStatus current;
    /**
     * DescribedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    private final CrossVersionObjectReference describedObject;
    /**
     * metric identifies the target metric by name and selector
     * 
     */
    private final MetricIdentifier metric;

    @OutputCustomType.Constructor({"current","describedObject","metric"})
    private ObjectMetricStatus(
        MetricValueStatus current,
        CrossVersionObjectReference describedObject,
        MetricIdentifier metric) {
        this.current = Objects.requireNonNull(current);
        this.describedObject = Objects.requireNonNull(describedObject);
        this.metric = Objects.requireNonNull(metric);
    }

    /**
     * current contains the current value for the given metric
     * 
     */
    public MetricValueStatus getCurrent() {
        return this.current;
    }
    /**
     * DescribedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    public CrossVersionObjectReference getDescribedObject() {
        return this.describedObject;
    }
    /**
     * metric identifies the target metric by name and selector
     * 
     */
    public MetricIdentifier getMetric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricValueStatus current;
        private CrossVersionObjectReference describedObject;
        private MetricIdentifier metric;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.describedObject = defaults.describedObject;
    	      this.metric = defaults.metric;
        }

        public Builder setCurrent(MetricValueStatus current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder setDescribedObject(CrossVersionObjectReference describedObject) {
            this.describedObject = Objects.requireNonNull(describedObject);
            return this;
        }

        public Builder setMetric(MetricIdentifier metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public ObjectMetricStatus build() {
            return new ObjectMetricStatus(current, describedObject, metric);
        }
    }
}