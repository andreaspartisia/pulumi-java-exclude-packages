// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs();

    /**
     * The SANs for a TLS validation context.
     * 
     */
    @InputImport(name="subjectAlternativeNames")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs> subjectAlternativeNames;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Input.empty() : this.subjectAlternativeNames;
    }

    /**
     * The TLS validation context trust.
     * 
     */
    @InputImport(name="trust", required=true)
      private final Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs> trust;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs> getTrust() {
        return this.trust;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs(
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs> subjectAlternativeNames,
        Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs> trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = Objects.requireNonNull(trust, "expected parameter 'trust' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs() {
        this.subjectAlternativeNames = Input.empty();
        this.trust = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs> subjectAlternativeNames;
        private Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs> trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder setSubjectAlternativeNames(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs subjectAlternativeNames) {
            this.subjectAlternativeNames = Input.ofNullable(subjectAlternativeNames);
            return this;
        }

        public Builder setTrust(Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs> trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }

        public Builder setTrust(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs trust) {
            this.trust = Input.of(Objects.requireNonNull(trust));
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs(subjectAlternativeNames, trust);
        }
    }
}