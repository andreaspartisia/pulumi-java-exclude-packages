// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InTotoProvenanceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SlsaProvenanceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement The serialized InTotoStatement will be stored as Envelope.payload. Envelope.payloadType is always "application/vnd.in-toto+json".
 * 
 */
public final class InTotoStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final InTotoStatementArgs Empty = new InTotoStatementArgs();

    /**
     * "https://slsa.dev/provenance/v0.1" for SlsaProvenance.
     * 
     */
    @Import(name="predicateType")
      private final @Nullable Output<String> predicateType;

    public Output<String> predicateType() {
        return this.predicateType == null ? Codegen.empty() : this.predicateType;
    }

    /**
     * provenance is a predicate of type intotoprovenance
     * 
     */
    @Import(name="provenance")
      private final @Nullable Output<InTotoProvenanceArgs> provenance;

    public Output<InTotoProvenanceArgs> provenance() {
        return this.provenance == null ? Codegen.empty() : this.provenance;
    }

    /**
     * slsa_provenance is a predicate of type slsaProvenance
     * 
     */
    @Import(name="slsaProvenance")
      private final @Nullable Output<SlsaProvenanceArgs> slsaProvenance;

    public Output<SlsaProvenanceArgs> slsaProvenance() {
        return this.slsaProvenance == null ? Codegen.empty() : this.slsaProvenance;
    }

    /**
     * subject is the subjects of the intoto statement
     * 
     */
    @Import(name="subject")
      private final @Nullable Output<List<SubjectArgs>> subject;

    public Output<List<SubjectArgs>> subject() {
        return this.subject == null ? Codegen.empty() : this.subject;
    }

    /**
     * Always "https://in-toto.io/Statement/v0.1".
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public InTotoStatementArgs(
        @Nullable Output<String> predicateType,
        @Nullable Output<InTotoProvenanceArgs> provenance,
        @Nullable Output<SlsaProvenanceArgs> slsaProvenance,
        @Nullable Output<List<SubjectArgs>> subject,
        @Nullable Output<String> type) {
        this.predicateType = predicateType;
        this.provenance = provenance;
        this.slsaProvenance = slsaProvenance;
        this.subject = subject;
        this.type = type;
    }

    private InTotoStatementArgs() {
        this.predicateType = Codegen.empty();
        this.provenance = Codegen.empty();
        this.slsaProvenance = Codegen.empty();
        this.subject = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> predicateType;
        private @Nullable Output<InTotoProvenanceArgs> provenance;
        private @Nullable Output<SlsaProvenanceArgs> slsaProvenance;
        private @Nullable Output<List<SubjectArgs>> subject;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predicateType = defaults.predicateType;
    	      this.provenance = defaults.provenance;
    	      this.slsaProvenance = defaults.slsaProvenance;
    	      this.subject = defaults.subject;
    	      this.type = defaults.type;
        }

        public Builder predicateType(@Nullable Output<String> predicateType) {
            this.predicateType = predicateType;
            return this;
        }
        public Builder predicateType(@Nullable String predicateType) {
            this.predicateType = Codegen.ofNullable(predicateType);
            return this;
        }
        public Builder provenance(@Nullable Output<InTotoProvenanceArgs> provenance) {
            this.provenance = provenance;
            return this;
        }
        public Builder provenance(@Nullable InTotoProvenanceArgs provenance) {
            this.provenance = Codegen.ofNullable(provenance);
            return this;
        }
        public Builder slsaProvenance(@Nullable Output<SlsaProvenanceArgs> slsaProvenance) {
            this.slsaProvenance = slsaProvenance;
            return this;
        }
        public Builder slsaProvenance(@Nullable SlsaProvenanceArgs slsaProvenance) {
            this.slsaProvenance = Codegen.ofNullable(slsaProvenance);
            return this;
        }
        public Builder subject(@Nullable Output<List<SubjectArgs>> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable List<SubjectArgs> subject) {
            this.subject = Codegen.ofNullable(subject);
            return this;
        }
        public Builder subject(SubjectArgs... subject) {
            return subject(List.of(subject));
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public InTotoStatementArgs build() {
            return new InTotoStatementArgs(predicateType, provenance, slsaProvenance, subject, type);
        }
    }
}
