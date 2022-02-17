// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationAlarmMetric {
    /**
     * The name of the metric to be monitored for the component.
     * 
     */
    private final String alarmMetricName;

    @OutputCustomType.Constructor({"alarmMetricName"})
    private ApplicationAlarmMetric(String alarmMetricName) {
        this.alarmMetricName = Objects.requireNonNull(alarmMetricName);
    }

    /**
     * The name of the metric to be monitored for the component.
     * 
     */
    public String getAlarmMetricName() {
        return this.alarmMetricName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAlarmMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmMetricName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAlarmMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmMetricName = defaults.alarmMetricName;
        }

        public Builder setAlarmMetricName(String alarmMetricName) {
            this.alarmMetricName = Objects.requireNonNull(alarmMetricName);
            return this;
        }

        public ApplicationAlarmMetric build() {
            return new ApplicationAlarmMetric(alarmMetricName);
        }
    }
}