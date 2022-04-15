// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanRunErrorTraceCode;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanConfigErrorArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Output only. Defines an error trace message for a ScanRun.
 * 
 */
public final class ScanRunErrorTraceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScanRunErrorTraceArgs Empty = new ScanRunErrorTraceArgs();

    /**
     * Indicates the error reason code.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<ScanRunErrorTraceCode> code;

    public Output<ScanRunErrorTraceCode> code() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
     * 
     */
    @Import(name="mostCommonHttpErrorCode")
      private final @Nullable Output<Integer> mostCommonHttpErrorCode;

    public Output<Integer> mostCommonHttpErrorCode() {
        return this.mostCommonHttpErrorCode == null ? Codegen.empty() : this.mostCommonHttpErrorCode;
    }

    /**
     * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
     * 
     */
    @Import(name="scanConfigError")
      private final @Nullable Output<ScanConfigErrorArgs> scanConfigError;

    public Output<ScanConfigErrorArgs> scanConfigError() {
        return this.scanConfigError == null ? Codegen.empty() : this.scanConfigError;
    }

    public ScanRunErrorTraceArgs(
        @Nullable Output<ScanRunErrorTraceCode> code,
        @Nullable Output<Integer> mostCommonHttpErrorCode,
        @Nullable Output<ScanConfigErrorArgs> scanConfigError) {
        this.code = code;
        this.mostCommonHttpErrorCode = mostCommonHttpErrorCode;
        this.scanConfigError = scanConfigError;
    }

    private ScanRunErrorTraceArgs() {
        this.code = Codegen.empty();
        this.mostCommonHttpErrorCode = Codegen.empty();
        this.scanConfigError = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunErrorTraceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ScanRunErrorTraceCode> code;
        private @Nullable Output<Integer> mostCommonHttpErrorCode;
        private @Nullable Output<ScanConfigErrorArgs> scanConfigError;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunErrorTraceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.mostCommonHttpErrorCode = defaults.mostCommonHttpErrorCode;
    	      this.scanConfigError = defaults.scanConfigError;
        }

        public Builder code(@Nullable Output<ScanRunErrorTraceCode> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable ScanRunErrorTraceCode code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }
        public Builder mostCommonHttpErrorCode(@Nullable Output<Integer> mostCommonHttpErrorCode) {
            this.mostCommonHttpErrorCode = mostCommonHttpErrorCode;
            return this;
        }
        public Builder mostCommonHttpErrorCode(@Nullable Integer mostCommonHttpErrorCode) {
            this.mostCommonHttpErrorCode = Codegen.ofNullable(mostCommonHttpErrorCode);
            return this;
        }
        public Builder scanConfigError(@Nullable Output<ScanConfigErrorArgs> scanConfigError) {
            this.scanConfigError = scanConfigError;
            return this;
        }
        public Builder scanConfigError(@Nullable ScanConfigErrorArgs scanConfigError) {
            this.scanConfigError = Codegen.ofNullable(scanConfigError);
            return this;
        }        public ScanRunErrorTraceArgs build() {
            return new ScanRunErrorTraceArgs(code, mostCommonHttpErrorCode, scanConfigError);
        }
    }
}
