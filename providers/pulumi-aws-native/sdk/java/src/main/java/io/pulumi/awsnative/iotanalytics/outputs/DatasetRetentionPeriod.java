// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class DatasetRetentionPeriod {
    private final Integer numberOfDays;
    private final Boolean unlimited;

    @OutputCustomType.Constructor({"numberOfDays","unlimited"})
    private DatasetRetentionPeriod(
        Integer numberOfDays,
        Boolean unlimited) {
        this.numberOfDays = Objects.requireNonNull(numberOfDays);
        this.unlimited = Objects.requireNonNull(unlimited);
    }

    public Integer getNumberOfDays() {
        return this.numberOfDays;
    }
    public Boolean getUnlimited() {
        return this.unlimited;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetRetentionPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numberOfDays;
        private Boolean unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetRetentionPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numberOfDays = defaults.numberOfDays;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder setNumberOfDays(Integer numberOfDays) {
            this.numberOfDays = Objects.requireNonNull(numberOfDays);
            return this;
        }

        public Builder setUnlimited(Boolean unlimited) {
            this.unlimited = Objects.requireNonNull(unlimited);
            return this;
        }

        public DatasetRetentionPeriod build() {
            return new DatasetRetentionPeriod(numberOfDays, unlimited);
        }
    }
}