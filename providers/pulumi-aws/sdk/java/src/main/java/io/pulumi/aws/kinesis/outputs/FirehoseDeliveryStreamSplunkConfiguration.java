// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamSplunkConfiguration {
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * The amount of time, in seconds between 180 and 600, that Kinesis Firehose waits to receive an acknowledgment from Splunk after it sends it data.
     * 
     */
    private final @Nullable Integer hecAcknowledgmentTimeout;
    /**
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Firehose sends your data.
     * 
     */
    private final String hecEndpoint;
    /**
     * The HEC endpoint type. Valid values are `Raw` or `Event`. The default value is `Raw`.
     * 
     */
    private final @Nullable String hecEndpointType;
    /**
     * The GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * 
     */
    private final String hecToken;
    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration;
    /**
     * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    private final @Nullable Integer retryDuration;
    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
     * 
     */
    private final @Nullable String s3BackupMode;

    @OutputCustomType.Constructor
    private FirehoseDeliveryStreamSplunkConfiguration(
        @OutputCustomType.Parameter("cloudwatchLoggingOptions") @Nullable FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @OutputCustomType.Parameter("hecAcknowledgmentTimeout") @Nullable Integer hecAcknowledgmentTimeout,
        @OutputCustomType.Parameter("hecEndpoint") String hecEndpoint,
        @OutputCustomType.Parameter("hecEndpointType") @Nullable String hecEndpointType,
        @OutputCustomType.Parameter("hecToken") String hecToken,
        @OutputCustomType.Parameter("processingConfiguration") @Nullable FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration,
        @OutputCustomType.Parameter("retryDuration") @Nullable Integer retryDuration,
        @OutputCustomType.Parameter("s3BackupMode") @Nullable String s3BackupMode) {
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
        this.hecEndpoint = hecEndpoint;
        this.hecEndpointType = hecEndpointType;
        this.hecToken = hecToken;
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * The amount of time, in seconds between 180 and 600, that Kinesis Firehose waits to receive an acknowledgment from Splunk after it sends it data.
     * 
    */
    public Optional<Integer> getHecAcknowledgmentTimeout() {
        return Optional.ofNullable(this.hecAcknowledgmentTimeout);
    }
    /**
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Firehose sends your data.
     * 
    */
    public String getHecEndpoint() {
        return this.hecEndpoint;
    }
    /**
     * The HEC endpoint type. Valid values are `Raw` or `Event`. The default value is `Raw`.
     * 
    */
    public Optional<String> getHecEndpointType() {
        return Optional.ofNullable(this.hecEndpointType);
    }
    /**
     * The GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * 
    */
    public String getHecToken() {
        return this.hecToken;
    }
    /**
     * The data processing configuration.  More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
    */
    public Optional<Integer> getRetryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }
    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
     * 
    */
    public Optional<String> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamSplunkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable Integer hecAcknowledgmentTimeout;
        private String hecEndpoint;
        private @Nullable String hecEndpointType;
        private String hecToken;
        private @Nullable FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration;
        private @Nullable Integer retryDuration;
        private @Nullable String s3BackupMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamSplunkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.hecAcknowledgmentTimeout = defaults.hecAcknowledgmentTimeout;
    	      this.hecEndpoint = defaults.hecEndpoint;
    	      this.hecEndpointType = defaults.hecEndpointType;
    	      this.hecToken = defaults.hecToken;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.s3BackupMode = defaults.s3BackupMode;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setHecAcknowledgmentTimeout(@Nullable Integer hecAcknowledgmentTimeout) {
            this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
            return this;
        }

        public Builder setHecEndpoint(String hecEndpoint) {
            this.hecEndpoint = Objects.requireNonNull(hecEndpoint);
            return this;
        }

        public Builder setHecEndpointType(@Nullable String hecEndpointType) {
            this.hecEndpointType = hecEndpointType;
            return this;
        }

        public Builder setHecToken(String hecToken) {
            this.hecToken = Objects.requireNonNull(hecToken);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public FirehoseDeliveryStreamSplunkConfiguration build() {
            return new FirehoseDeliveryStreamSplunkConfiguration(cloudwatchLoggingOptions, hecAcknowledgmentTimeout, hecEndpoint, hecEndpointType, hecToken, processingConfiguration, retryDuration, s3BackupMode);
        }
    }
}