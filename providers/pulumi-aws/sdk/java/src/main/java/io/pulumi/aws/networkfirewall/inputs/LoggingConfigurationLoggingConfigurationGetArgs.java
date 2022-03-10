// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class LoggingConfigurationLoggingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationLoggingConfigurationGetArgs Empty = new LoggingConfigurationLoggingConfigurationGetArgs();

    /**
     * Set of configuration blocks describing the logging details for a firewall. See Log Destination Config below for details. At most, only two blocks can be specified; one for `FLOW` logs and one for `ALERT` logs.
     * 
     */
    @InputImport(name="logDestinationConfigs", required=true)
      private final Input<List<LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs>> logDestinationConfigs;

    public Input<List<LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs>> getLogDestinationConfigs() {
        return this.logDestinationConfigs;
    }

    public LoggingConfigurationLoggingConfigurationGetArgs(Input<List<LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs>> logDestinationConfigs) {
        this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs, "expected parameter 'logDestinationConfigs' to be non-null");
    }

    private LoggingConfigurationLoggingConfigurationGetArgs() {
        this.logDestinationConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLoggingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs>> logDestinationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLoggingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
        }

        public Builder setLogDestinationConfigs(Input<List<LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs>> logDestinationConfigs) {
            this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs);
            return this;
        }

        public Builder setLogDestinationConfigs(List<LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs> logDestinationConfigs) {
            this.logDestinationConfigs = Input.of(Objects.requireNonNull(logDestinationConfigs));
            return this;
        }
        public LoggingConfigurationLoggingConfigurationGetArgs build() {
            return new LoggingConfigurationLoggingConfigurationGetArgs(logDestinationConfigs);
        }
    }
}