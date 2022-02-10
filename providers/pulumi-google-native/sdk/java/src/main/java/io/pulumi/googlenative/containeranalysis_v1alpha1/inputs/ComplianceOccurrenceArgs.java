// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.NonCompliantFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComplianceOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComplianceOccurrenceArgs Empty = new ComplianceOccurrenceArgs();

    @InputImport(name="nonComplianceReason")
    private final @Nullable Input<String> nonComplianceReason;

    public Input<String> getNonComplianceReason() {
        return this.nonComplianceReason == null ? Input.empty() : this.nonComplianceReason;
    }

    @InputImport(name="nonCompliantFiles")
    private final @Nullable Input<List<NonCompliantFileArgs>> nonCompliantFiles;

    public Input<List<NonCompliantFileArgs>> getNonCompliantFiles() {
        return this.nonCompliantFiles == null ? Input.empty() : this.nonCompliantFiles;
    }

    public ComplianceOccurrenceArgs(
        @Nullable Input<String> nonComplianceReason,
        @Nullable Input<List<NonCompliantFileArgs>> nonCompliantFiles) {
        this.nonComplianceReason = nonComplianceReason;
        this.nonCompliantFiles = nonCompliantFiles;
    }

    private ComplianceOccurrenceArgs() {
        this.nonComplianceReason = Input.empty();
        this.nonCompliantFiles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> nonComplianceReason;
        private @Nullable Input<List<NonCompliantFileArgs>> nonCompliantFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonComplianceReason = defaults.nonComplianceReason;
    	      this.nonCompliantFiles = defaults.nonCompliantFiles;
        }

        public Builder setNonComplianceReason(@Nullable Input<String> nonComplianceReason) {
            this.nonComplianceReason = nonComplianceReason;
            return this;
        }

        public Builder setNonComplianceReason(@Nullable String nonComplianceReason) {
            this.nonComplianceReason = Input.ofNullable(nonComplianceReason);
            return this;
        }

        public Builder setNonCompliantFiles(@Nullable Input<List<NonCompliantFileArgs>> nonCompliantFiles) {
            this.nonCompliantFiles = nonCompliantFiles;
            return this;
        }

        public Builder setNonCompliantFiles(@Nullable List<NonCompliantFileArgs> nonCompliantFiles) {
            this.nonCompliantFiles = Input.ofNullable(nonCompliantFiles);
            return this;
        }

        public ComplianceOccurrenceArgs build() {
            return new ComplianceOccurrenceArgs(nonComplianceReason, nonCompliantFiles);
        }
    }
}