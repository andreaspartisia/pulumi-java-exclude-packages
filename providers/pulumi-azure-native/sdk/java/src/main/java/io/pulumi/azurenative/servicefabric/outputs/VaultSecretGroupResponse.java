// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.SubResourceResponse;
import io.pulumi.azurenative.servicefabric.outputs.VaultCertificateResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class VaultSecretGroupResponse {
    private final SubResourceResponse sourceVault;
    private final List<VaultCertificateResponse> vaultCertificates;

    @OutputCustomType.Constructor({"sourceVault","vaultCertificates"})
    private VaultSecretGroupResponse(
        SubResourceResponse sourceVault,
        List<VaultCertificateResponse> vaultCertificates) {
        this.sourceVault = Objects.requireNonNull(sourceVault);
        this.vaultCertificates = Objects.requireNonNull(vaultCertificates);
    }

    public SubResourceResponse getSourceVault() {
        return this.sourceVault;
    }
    public List<VaultCertificateResponse> getVaultCertificates() {
        return this.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultSecretGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubResourceResponse sourceVault;
        private List<VaultCertificateResponse> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultSecretGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder setSourceVault(SubResourceResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public Builder setVaultCertificates(List<VaultCertificateResponse> vaultCertificates) {
            this.vaultCertificates = Objects.requireNonNull(vaultCertificates);
            return this;
        }

        public VaultSecretGroupResponse build() {
            return new VaultSecretGroupResponse(sourceVault, vaultCertificates);
        }
    }
}