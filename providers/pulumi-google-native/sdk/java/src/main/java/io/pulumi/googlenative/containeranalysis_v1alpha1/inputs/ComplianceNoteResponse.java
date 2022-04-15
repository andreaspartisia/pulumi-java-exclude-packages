// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.CisBenchmarkResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ComplianceVersionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * ComplianceNote encapsulates all information about a specific compliance check.
 * 
 */
public final class ComplianceNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComplianceNoteResponse Empty = new ComplianceNoteResponse();

    /**
     * Right now we only have one compliance type, but we may add additional types in the future.
     * 
     */
    @Import(name="cisBenchmark", required=true)
      private final CisBenchmarkResponse cisBenchmark;

    public CisBenchmarkResponse cisBenchmark() {
        return this.cisBenchmark;
    }

    /**
     * A description about this compliance check.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * A rationale for the existence of this compliance check.
     * 
     */
    @Import(name="rationale", required=true)
      private final String rationale;

    public String rationale() {
        return this.rationale;
    }

    /**
     * A description of remediation steps if the compliance check fails.
     * 
     */
    @Import(name="remediation", required=true)
      private final String remediation;

    public String remediation() {
        return this.remediation;
    }

    /**
     * Serialized scan instructions with a predefined format.
     * 
     */
    @Import(name="scanInstructions", required=true)
      private final String scanInstructions;

    public String scanInstructions() {
        return this.scanInstructions;
    }

    /**
     * The title that identifies this compliance check.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    /**
     * The OS and config versions the benchmark applies to.
     * 
     */
    @Import(name="version", required=true)
      private final List<ComplianceVersionResponse> version;

    public List<ComplianceVersionResponse> version() {
        return this.version;
    }

    public ComplianceNoteResponse(
        CisBenchmarkResponse cisBenchmark,
        String description,
        String rationale,
        String remediation,
        String scanInstructions,
        String title,
        List<ComplianceVersionResponse> version) {
        this.cisBenchmark = Objects.requireNonNull(cisBenchmark, "expected parameter 'cisBenchmark' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.rationale = Objects.requireNonNull(rationale, "expected parameter 'rationale' to be non-null");
        this.remediation = Objects.requireNonNull(remediation, "expected parameter 'remediation' to be non-null");
        this.scanInstructions = Objects.requireNonNull(scanInstructions, "expected parameter 'scanInstructions' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ComplianceNoteResponse() {
        this.cisBenchmark = null;
        this.description = null;
        this.rationale = null;
        this.remediation = null;
        this.scanInstructions = null;
        this.title = null;
        this.version = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CisBenchmarkResponse cisBenchmark;
        private String description;
        private String rationale;
        private String remediation;
        private String scanInstructions;
        private String title;
        private List<ComplianceVersionResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisBenchmark = defaults.cisBenchmark;
    	      this.description = defaults.description;
    	      this.rationale = defaults.rationale;
    	      this.remediation = defaults.remediation;
    	      this.scanInstructions = defaults.scanInstructions;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        public Builder cisBenchmark(CisBenchmarkResponse cisBenchmark) {
            this.cisBenchmark = Objects.requireNonNull(cisBenchmark);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder rationale(String rationale) {
            this.rationale = Objects.requireNonNull(rationale);
            return this;
        }
        public Builder remediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }
        public Builder scanInstructions(String scanInstructions) {
            this.scanInstructions = Objects.requireNonNull(scanInstructions);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder version(List<ComplianceVersionResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(ComplianceVersionResponse... version) {
            return version(List.of(version));
        }        public ComplianceNoteResponse build() {
            return new ComplianceNoteResponse(cisBenchmark, description, rationale, remediation, scanInstructions, title, version);
        }
    }
}
