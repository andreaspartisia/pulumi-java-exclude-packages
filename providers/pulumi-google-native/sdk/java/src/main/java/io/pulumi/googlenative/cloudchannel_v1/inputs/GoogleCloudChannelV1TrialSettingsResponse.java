// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudChannelV1TrialSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1TrialSettingsResponse Empty = new GoogleCloudChannelV1TrialSettingsResponse();

    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    @InputImport(name="trial", required=true)
    private final Boolean trial;

    public Boolean getTrial() {
        return this.trial;
    }

    public GoogleCloudChannelV1TrialSettingsResponse(
        String endTime,
        Boolean trial) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.trial = Objects.requireNonNull(trial, "expected parameter 'trial' to be non-null");
    }

    private GoogleCloudChannelV1TrialSettingsResponse() {
        this.endTime = null;
        this.trial = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1TrialSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private Boolean trial;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1TrialSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.trial = defaults.trial;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setTrial(Boolean trial) {
            this.trial = Objects.requireNonNull(trial);
            return this;
        }

        public GoogleCloudChannelV1TrialSettingsResponse build() {
            return new GoogleCloudChannelV1TrialSettingsResponse(endTime, trial);
        }
    }
}