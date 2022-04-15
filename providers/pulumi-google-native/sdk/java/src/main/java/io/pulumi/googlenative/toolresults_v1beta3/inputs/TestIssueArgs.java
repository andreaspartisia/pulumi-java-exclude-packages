// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.toolresults_v1beta3.enums.TestIssueCategory;
import io.pulumi.googlenative.toolresults_v1beta3.enums.TestIssueSeverity;
import io.pulumi.googlenative.toolresults_v1beta3.enums.TestIssueType;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AnyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An issue detected occurring during a test execution.
 * 
 */
public final class TestIssueArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestIssueArgs Empty = new TestIssueArgs();

    /**
     * Category of issue. Required.
     * 
     */
    @Import(name="category")
      private final @Nullable Output<TestIssueCategory> category;

    public Output<TestIssueCategory> category() {
        return this.category == null ? Codegen.empty() : this.category;
    }

    /**
     * A brief human-readable message describing the issue. Required.
     * 
     */
    @Import(name="errorMessage")
      private final @Nullable Output<String> errorMessage;

    public Output<String> errorMessage() {
        return this.errorMessage == null ? Codegen.empty() : this.errorMessage;
    }

    /**
     * Severity of issue. Required.
     * 
     */
    @Import(name="severity")
      private final @Nullable Output<TestIssueSeverity> severity;

    public Output<TestIssueSeverity> severity() {
        return this.severity == null ? Codegen.empty() : this.severity;
    }

    /**
     * Type of issue. Required.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<TestIssueType> type;

    public Output<TestIssueType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
     */
    @Import(name="warning")
      private final @Nullable Output<AnyArgs> warning;

    public Output<AnyArgs> warning() {
        return this.warning == null ? Codegen.empty() : this.warning;
    }

    public TestIssueArgs(
        @Nullable Output<TestIssueCategory> category,
        @Nullable Output<String> errorMessage,
        @Nullable Output<TestIssueSeverity> severity,
        @Nullable Output<TestIssueType> type,
        @Nullable Output<AnyArgs> warning) {
        this.category = category;
        this.errorMessage = errorMessage;
        this.severity = severity;
        this.type = type;
        this.warning = warning;
    }

    private TestIssueArgs() {
        this.category = Codegen.empty();
        this.errorMessage = Codegen.empty();
        this.severity = Codegen.empty();
        this.type = Codegen.empty();
        this.warning = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TestIssueCategory> category;
        private @Nullable Output<String> errorMessage;
        private @Nullable Output<TestIssueSeverity> severity;
        private @Nullable Output<TestIssueType> type;
        private @Nullable Output<AnyArgs> warning;

        public Builder() {
    	      // Empty
        }

        public Builder(TestIssueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.errorMessage = defaults.errorMessage;
    	      this.severity = defaults.severity;
    	      this.type = defaults.type;
    	      this.warning = defaults.warning;
        }

        public Builder category(@Nullable Output<TestIssueCategory> category) {
            this.category = category;
            return this;
        }
        public Builder category(@Nullable TestIssueCategory category) {
            this.category = Codegen.ofNullable(category);
            return this;
        }
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = Codegen.ofNullable(errorMessage);
            return this;
        }
        public Builder severity(@Nullable Output<TestIssueSeverity> severity) {
            this.severity = severity;
            return this;
        }
        public Builder severity(@Nullable TestIssueSeverity severity) {
            this.severity = Codegen.ofNullable(severity);
            return this;
        }
        public Builder type(@Nullable Output<TestIssueType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable TestIssueType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder warning(@Nullable Output<AnyArgs> warning) {
            this.warning = warning;
            return this;
        }
        public Builder warning(@Nullable AnyArgs warning) {
            this.warning = Codegen.ofNullable(warning);
            return this;
        }        public TestIssueArgs build() {
            return new TestIssueArgs(category, errorMessage, severity, type, warning);
        }
    }
}
