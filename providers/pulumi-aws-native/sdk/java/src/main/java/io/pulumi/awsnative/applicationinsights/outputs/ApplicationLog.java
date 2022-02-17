// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationLogEncoding;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationLog {
    /**
     * The type of encoding of the logs to be monitored.
     * 
     */
    private final @Nullable ApplicationLogEncoding encoding;
    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    private final @Nullable String logGroupName;
    /**
     * The path of the logs to be monitored.
     * 
     */
    private final @Nullable String logPath;
    /**
     * The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    private final String logType;
    /**
     * The name of the log pattern set.
     * 
     */
    private final @Nullable String patternSet;

    @OutputCustomType.Constructor({"encoding","logGroupName","logPath","logType","patternSet"})
    private ApplicationLog(
        @Nullable ApplicationLogEncoding encoding,
        @Nullable String logGroupName,
        @Nullable String logPath,
        String logType,
        @Nullable String patternSet) {
        this.encoding = encoding;
        this.logGroupName = logGroupName;
        this.logPath = logPath;
        this.logType = Objects.requireNonNull(logType);
        this.patternSet = patternSet;
    }

    /**
     * The type of encoding of the logs to be monitored.
     * 
     */
    public Optional<ApplicationLogEncoding> getEncoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    public Optional<String> getLogGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    /**
     * The path of the logs to be monitored.
     * 
     */
    public Optional<String> getLogPath() {
        return Optional.ofNullable(this.logPath);
    }
    /**
     * The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    public String getLogType() {
        return this.logType;
    }
    /**
     * The name of the log pattern set.
     * 
     */
    public Optional<String> getPatternSet() {
        return Optional.ofNullable(this.patternSet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationLogEncoding encoding;
        private @Nullable String logGroupName;
        private @Nullable String logPath;
        private String logType;
        private @Nullable String patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logPath = defaults.logPath;
    	      this.logType = defaults.logType;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder setEncoding(@Nullable ApplicationLogEncoding encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogPath(@Nullable String logPath) {
            this.logPath = logPath;
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setPatternSet(@Nullable String patternSet) {
            this.patternSet = patternSet;
            return this;
        }

        public ApplicationLog build() {
            return new ApplicationLog(encoding, logGroupName, logPath, logType, patternSet);
        }
    }
}