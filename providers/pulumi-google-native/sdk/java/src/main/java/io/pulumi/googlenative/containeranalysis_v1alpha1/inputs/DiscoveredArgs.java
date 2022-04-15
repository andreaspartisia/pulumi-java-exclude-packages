// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveredAnalysisStatus;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveredContinuousAnalysis;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.StatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information about the scan status of a discovered resource.
 * 
 */
public final class DiscoveredArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiscoveredArgs Empty = new DiscoveredArgs();

    /**
     * The status of discovery for the resource.
     * 
     */
    @Import(name="analysisStatus")
      private final @Nullable Output<DiscoveredAnalysisStatus> analysisStatus;

    public Output<DiscoveredAnalysisStatus> analysisStatus() {
        return this.analysisStatus == null ? Codegen.empty() : this.analysisStatus;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    @Import(name="analysisStatusError")
      private final @Nullable Output<StatusArgs> analysisStatusError;

    public Output<StatusArgs> analysisStatusError() {
        return this.analysisStatusError == null ? Codegen.empty() : this.analysisStatusError;
    }

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @Import(name="continuousAnalysis")
      private final @Nullable Output<DiscoveredContinuousAnalysis> continuousAnalysis;

    public Output<DiscoveredContinuousAnalysis> continuousAnalysis() {
        return this.continuousAnalysis == null ? Codegen.empty() : this.continuousAnalysis;
    }

    /**
     * The CPE of the resource being scanned.
     * 
     */
    @Import(name="cpe")
      private final @Nullable Output<String> cpe;

    public Output<String> cpe() {
        return this.cpe == null ? Codegen.empty() : this.cpe;
    }

    public DiscoveredArgs(
        @Nullable Output<DiscoveredAnalysisStatus> analysisStatus,
        @Nullable Output<StatusArgs> analysisStatusError,
        @Nullable Output<DiscoveredContinuousAnalysis> continuousAnalysis,
        @Nullable Output<String> cpe) {
        this.analysisStatus = analysisStatus;
        this.analysisStatusError = analysisStatusError;
        this.continuousAnalysis = continuousAnalysis;
        this.cpe = cpe;
    }

    private DiscoveredArgs() {
        this.analysisStatus = Codegen.empty();
        this.analysisStatusError = Codegen.empty();
        this.continuousAnalysis = Codegen.empty();
        this.cpe = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveredArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DiscoveredAnalysisStatus> analysisStatus;
        private @Nullable Output<StatusArgs> analysisStatusError;
        private @Nullable Output<DiscoveredContinuousAnalysis> continuousAnalysis;
        private @Nullable Output<String> cpe;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveredArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
        }

        public Builder analysisStatus(@Nullable Output<DiscoveredAnalysisStatus> analysisStatus) {
            this.analysisStatus = analysisStatus;
            return this;
        }
        public Builder analysisStatus(@Nullable DiscoveredAnalysisStatus analysisStatus) {
            this.analysisStatus = Codegen.ofNullable(analysisStatus);
            return this;
        }
        public Builder analysisStatusError(@Nullable Output<StatusArgs> analysisStatusError) {
            this.analysisStatusError = analysisStatusError;
            return this;
        }
        public Builder analysisStatusError(@Nullable StatusArgs analysisStatusError) {
            this.analysisStatusError = Codegen.ofNullable(analysisStatusError);
            return this;
        }
        public Builder continuousAnalysis(@Nullable Output<DiscoveredContinuousAnalysis> continuousAnalysis) {
            this.continuousAnalysis = continuousAnalysis;
            return this;
        }
        public Builder continuousAnalysis(@Nullable DiscoveredContinuousAnalysis continuousAnalysis) {
            this.continuousAnalysis = Codegen.ofNullable(continuousAnalysis);
            return this;
        }
        public Builder cpe(@Nullable Output<String> cpe) {
            this.cpe = cpe;
            return this;
        }
        public Builder cpe(@Nullable String cpe) {
            this.cpe = Codegen.ofNullable(cpe);
            return this;
        }        public DiscoveredArgs build() {
            return new DiscoveredArgs(analysisStatus, analysisStatusError, continuousAnalysis, cpe);
        }
    }
}
