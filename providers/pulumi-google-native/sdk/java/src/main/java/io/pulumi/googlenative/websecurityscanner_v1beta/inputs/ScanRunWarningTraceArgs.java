// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanRunWarningTraceCode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Output only. Defines a warning trace message for ScanRun. Warning traces provide customers with useful information that helps make the scanning process more effective.
 * 
 */
public final class ScanRunWarningTraceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScanRunWarningTraceArgs Empty = new ScanRunWarningTraceArgs();

    /**
     * Indicates the warning code.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<ScanRunWarningTraceCode> code;

    public Output<ScanRunWarningTraceCode> code() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    public ScanRunWarningTraceArgs(@Nullable Output<ScanRunWarningTraceCode> code) {
        this.code = code;
    }

    private ScanRunWarningTraceArgs() {
        this.code = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunWarningTraceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ScanRunWarningTraceCode> code;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunWarningTraceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder code(@Nullable Output<ScanRunWarningTraceCode> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable ScanRunWarningTraceCode code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }        public ScanRunWarningTraceArgs build() {
            return new ScanRunWarningTraceArgs(code);
        }
    }
}
