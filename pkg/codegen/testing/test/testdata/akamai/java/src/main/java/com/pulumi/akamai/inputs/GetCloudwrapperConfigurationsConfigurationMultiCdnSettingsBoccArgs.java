// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs Empty = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs();

    @Import(name="conditionalSamplingFrequency", required=true)
    private Output<String> conditionalSamplingFrequency;

    public Output<String> conditionalSamplingFrequency() {
        return this.conditionalSamplingFrequency;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="forwardType", required=true)
    private Output<String> forwardType;

    public Output<String> forwardType() {
        return this.forwardType;
    }

    @Import(name="requestType", required=true)
    private Output<String> requestType;

    public Output<String> requestType() {
        return this.requestType;
    }

    @Import(name="samplingFrequency", required=true)
    private Output<String> samplingFrequency;

    public Output<String> samplingFrequency() {
        return this.samplingFrequency;
    }

    private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs() {}

    private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs $) {
        this.conditionalSamplingFrequency = $.conditionalSamplingFrequency;
        this.enabled = $.enabled;
        this.forwardType = $.forwardType;
        this.requestType = $.requestType;
        this.samplingFrequency = $.samplingFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs();
        }

        public Builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs defaults) {
            $ = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionalSamplingFrequency(Output<String> conditionalSamplingFrequency) {
            $.conditionalSamplingFrequency = conditionalSamplingFrequency;
            return this;
        }

        public Builder conditionalSamplingFrequency(String conditionalSamplingFrequency) {
            return conditionalSamplingFrequency(Output.of(conditionalSamplingFrequency));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder forwardType(Output<String> forwardType) {
            $.forwardType = forwardType;
            return this;
        }

        public Builder forwardType(String forwardType) {
            return forwardType(Output.of(forwardType));
        }

        public Builder requestType(Output<String> requestType) {
            $.requestType = requestType;
            return this;
        }

        public Builder requestType(String requestType) {
            return requestType(Output.of(requestType));
        }

        public Builder samplingFrequency(Output<String> samplingFrequency) {
            $.samplingFrequency = samplingFrequency;
            return this;
        }

        public Builder samplingFrequency(String samplingFrequency) {
            return samplingFrequency(Output.of(samplingFrequency));
        }

        public GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs build() {
            if ($.conditionalSamplingFrequency == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs", "conditionalSamplingFrequency");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs", "enabled");
            }
            if ($.forwardType == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs", "forwardType");
            }
            if ($.requestType == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs", "requestType");
            }
            if ($.samplingFrequency == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccArgs", "samplingFrequency");
            }
            return $;
        }
    }

}
