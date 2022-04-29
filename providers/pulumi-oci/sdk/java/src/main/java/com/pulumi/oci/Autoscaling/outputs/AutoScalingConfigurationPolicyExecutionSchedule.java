// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AutoScalingConfigurationPolicyExecutionSchedule {
    /**
     * @return A cron expression that represents the time at which to execute the autoscaling policy.
     * 
     */
    private final String expression;
    /**
     * @return The time zone for the execution schedule.
     * 
     */
    private final String timezone;
    /**
     * @return The type of action to take.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AutoScalingConfigurationPolicyExecutionSchedule(
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("timezone") String timezone,
        @CustomType.Parameter("type") String type) {
        this.expression = expression;
        this.timezone = timezone;
        this.type = type;
    }

    /**
     * @return A cron expression that represents the time at which to execute the autoscaling policy.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return The time zone for the execution schedule.
     * 
     */
    public String timezone() {
        return this.timezone;
    }
    /**
     * @return The type of action to take.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalingConfigurationPolicyExecutionSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private String timezone;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalingConfigurationPolicyExecutionSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.timezone = defaults.timezone;
    	      this.type = defaults.type;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder timezone(String timezone) {
            this.timezone = Objects.requireNonNull(timezone);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AutoScalingConfigurationPolicyExecutionSchedule build() {
            return new AutoScalingConfigurationPolicyExecutionSchedule(expression, timezone, type);
        }
    }
}
