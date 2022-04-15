// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeSignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MUST match https://github.com/secure-systems-lab/dsse/blob/master/envelope.proto. An authenticated message of arbitrary type.
 * 
 */
public final class EnvelopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvelopeArgs Empty = new EnvelopeArgs();

    /**
     * The bytes being signed
     * 
     */
    @Import(name="payload")
      private final @Nullable Output<String> payload;

    public Output<String> payload() {
        return this.payload == null ? Codegen.empty() : this.payload;
    }

    /**
     * The type of payload being signed
     * 
     */
    @Import(name="payloadType")
      private final @Nullable Output<String> payloadType;

    public Output<String> payloadType() {
        return this.payloadType == null ? Codegen.empty() : this.payloadType;
    }

    /**
     * The signatures over the payload
     * 
     */
    @Import(name="signatures")
      private final @Nullable Output<List<EnvelopeSignatureArgs>> signatures;

    public Output<List<EnvelopeSignatureArgs>> signatures() {
        return this.signatures == null ? Codegen.empty() : this.signatures;
    }

    public EnvelopeArgs(
        @Nullable Output<String> payload,
        @Nullable Output<String> payloadType,
        @Nullable Output<List<EnvelopeSignatureArgs>> signatures) {
        this.payload = payload;
        this.payloadType = payloadType;
        this.signatures = signatures;
    }

    private EnvelopeArgs() {
        this.payload = Codegen.empty();
        this.payloadType = Codegen.empty();
        this.signatures = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payload;
        private @Nullable Output<String> payloadType;
        private @Nullable Output<List<EnvelopeSignatureArgs>> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.payloadType = defaults.payloadType;
    	      this.signatures = defaults.signatures;
        }

        public Builder payload(@Nullable Output<String> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable String payload) {
            this.payload = Codegen.ofNullable(payload);
            return this;
        }
        public Builder payloadType(@Nullable Output<String> payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        public Builder payloadType(@Nullable String payloadType) {
            this.payloadType = Codegen.ofNullable(payloadType);
            return this;
        }
        public Builder signatures(@Nullable Output<List<EnvelopeSignatureArgs>> signatures) {
            this.signatures = signatures;
            return this;
        }
        public Builder signatures(@Nullable List<EnvelopeSignatureArgs> signatures) {
            this.signatures = Codegen.ofNullable(signatures);
            return this;
        }
        public Builder signatures(EnvelopeSignatureArgs... signatures) {
            return signatures(List.of(signatures));
        }        public EnvelopeArgs build() {
            return new EnvelopeArgs(payload, payloadType, signatures);
        }
    }
}
