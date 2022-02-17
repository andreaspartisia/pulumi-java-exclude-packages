// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelRetentionPeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelRetentionPeriodArgs Empty = new ChannelRetentionPeriodArgs();

    @InputImport(name="numberOfDays")
    private final @Nullable Input<Integer> numberOfDays;

    public Input<Integer> getNumberOfDays() {
        return this.numberOfDays == null ? Input.empty() : this.numberOfDays;
    }

    @InputImport(name="unlimited")
    private final @Nullable Input<Boolean> unlimited;

    public Input<Boolean> getUnlimited() {
        return this.unlimited == null ? Input.empty() : this.unlimited;
    }

    public ChannelRetentionPeriodArgs(
        @Nullable Input<Integer> numberOfDays,
        @Nullable Input<Boolean> unlimited) {
        this.numberOfDays = numberOfDays;
        this.unlimited = unlimited;
    }

    private ChannelRetentionPeriodArgs() {
        this.numberOfDays = Input.empty();
        this.unlimited = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelRetentionPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numberOfDays;
        private @Nullable Input<Boolean> unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelRetentionPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numberOfDays = defaults.numberOfDays;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder setNumberOfDays(@Nullable Input<Integer> numberOfDays) {
            this.numberOfDays = numberOfDays;
            return this;
        }

        public Builder setNumberOfDays(@Nullable Integer numberOfDays) {
            this.numberOfDays = Input.ofNullable(numberOfDays);
            return this;
        }

        public Builder setUnlimited(@Nullable Input<Boolean> unlimited) {
            this.unlimited = unlimited;
            return this;
        }

        public Builder setUnlimited(@Nullable Boolean unlimited) {
            this.unlimited = Input.ofNullable(unlimited);
            return this;
        }

        public ChannelRetentionPeriodArgs build() {
            return new ChannelRetentionPeriodArgs(numberOfDays, unlimited);
        }
    }
}