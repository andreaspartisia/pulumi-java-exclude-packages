// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.AutoscaleSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CreateUpdateOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateUpdateOptionsArgs Empty = new CreateUpdateOptionsArgs();

    @InputImport(name="autoscaleSettings")
    private final @Nullable Input<AutoscaleSettingsArgs> autoscaleSettings;

    public Input<AutoscaleSettingsArgs> getAutoscaleSettings() {
        return this.autoscaleSettings == null ? Input.empty() : this.autoscaleSettings;
    }

    @InputImport(name="throughput")
    private final @Nullable Input<Integer> throughput;

    public Input<Integer> getThroughput() {
        return this.throughput == null ? Input.empty() : this.throughput;
    }

    public CreateUpdateOptionsArgs(
        @Nullable Input<AutoscaleSettingsArgs> autoscaleSettings,
        @Nullable Input<Integer> throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    private CreateUpdateOptionsArgs() {
        this.autoscaleSettings = Input.empty();
        this.throughput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateUpdateOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscaleSettingsArgs> autoscaleSettings;
        private @Nullable Input<Integer> throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateUpdateOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder setAutoscaleSettings(@Nullable Input<AutoscaleSettingsArgs> autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }

        public Builder setAutoscaleSettings(@Nullable AutoscaleSettingsArgs autoscaleSettings) {
            this.autoscaleSettings = Input.ofNullable(autoscaleSettings);
            return this;
        }

        public Builder setThroughput(@Nullable Input<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = Input.ofNullable(throughput);
            return this;
        }

        public CreateUpdateOptionsArgs build() {
            return new CreateUpdateOptionsArgs(autoscaleSettings, throughput);
        }
    }
}