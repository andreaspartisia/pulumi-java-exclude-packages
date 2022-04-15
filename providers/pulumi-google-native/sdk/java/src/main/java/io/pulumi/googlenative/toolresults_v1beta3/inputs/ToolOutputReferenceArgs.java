// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.FileReferenceArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TestCaseReferenceArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TimestampArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A reference to a ToolExecution output file.
 * 
 */
public final class ToolOutputReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToolOutputReferenceArgs Empty = new ToolOutputReferenceArgs();

    /**
     * The creation time of the file. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="creationTime")
      private final @Nullable Output<TimestampArgs> creationTime;

    public Output<TimestampArgs> creationTime() {
        return this.creationTime == null ? Codegen.empty() : this.creationTime;
    }

    /**
     * A FileReference to an output file. - In response: always set - In create/update request: always set
     * 
     */
    @Import(name="output")
      private final @Nullable Output<FileReferenceArgs> output;

    public Output<FileReferenceArgs> output() {
        return this.output == null ? Codegen.empty() : this.output;
    }

    /**
     * The test case to which this output file belongs. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="testCase")
      private final @Nullable Output<TestCaseReferenceArgs> testCase;

    public Output<TestCaseReferenceArgs> testCase() {
        return this.testCase == null ? Codegen.empty() : this.testCase;
    }

    public ToolOutputReferenceArgs(
        @Nullable Output<TimestampArgs> creationTime,
        @Nullable Output<FileReferenceArgs> output,
        @Nullable Output<TestCaseReferenceArgs> testCase) {
        this.creationTime = creationTime;
        this.output = output;
        this.testCase = testCase;
    }

    private ToolOutputReferenceArgs() {
        this.creationTime = Codegen.empty();
        this.output = Codegen.empty();
        this.testCase = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolOutputReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TimestampArgs> creationTime;
        private @Nullable Output<FileReferenceArgs> output;
        private @Nullable Output<TestCaseReferenceArgs> testCase;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolOutputReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.output = defaults.output;
    	      this.testCase = defaults.testCase;
        }

        public Builder creationTime(@Nullable Output<TimestampArgs> creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder creationTime(@Nullable TimestampArgs creationTime) {
            this.creationTime = Codegen.ofNullable(creationTime);
            return this;
        }
        public Builder output(@Nullable Output<FileReferenceArgs> output) {
            this.output = output;
            return this;
        }
        public Builder output(@Nullable FileReferenceArgs output) {
            this.output = Codegen.ofNullable(output);
            return this;
        }
        public Builder testCase(@Nullable Output<TestCaseReferenceArgs> testCase) {
            this.testCase = testCase;
            return this;
        }
        public Builder testCase(@Nullable TestCaseReferenceArgs testCase) {
            this.testCase = Codegen.ofNullable(testCase);
            return this;
        }        public ToolOutputReferenceArgs build() {
            return new ToolOutputReferenceArgs(creationTime, output, testCase);
        }
    }
}
