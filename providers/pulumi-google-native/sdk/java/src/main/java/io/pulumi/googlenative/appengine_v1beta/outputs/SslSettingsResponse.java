// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SslSettingsResponse {
    private final String certificateId;
    private final String pendingManagedCertificateId;
    private final String sslManagementType;

    @OutputCustomType.Constructor({"certificateId","pendingManagedCertificateId","sslManagementType"})
    private SslSettingsResponse(
        String certificateId,
        String pendingManagedCertificateId,
        String sslManagementType) {
        this.certificateId = Objects.requireNonNull(certificateId);
        this.pendingManagedCertificateId = Objects.requireNonNull(pendingManagedCertificateId);
        this.sslManagementType = Objects.requireNonNull(sslManagementType);
    }

    public String getCertificateId() {
        return this.certificateId;
    }
    public String getPendingManagedCertificateId() {
        return this.pendingManagedCertificateId;
    }
    public String getSslManagementType() {
        return this.sslManagementType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateId;
        private String pendingManagedCertificateId;
        private String sslManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(SslSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.pendingManagedCertificateId = defaults.pendingManagedCertificateId;
    	      this.sslManagementType = defaults.sslManagementType;
        }

        public Builder setCertificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }

        public Builder setPendingManagedCertificateId(String pendingManagedCertificateId) {
            this.pendingManagedCertificateId = Objects.requireNonNull(pendingManagedCertificateId);
            return this;
        }

        public Builder setSslManagementType(String sslManagementType) {
            this.sslManagementType = Objects.requireNonNull(sslManagementType);
            return this;
        }

        public SslSettingsResponse build() {
            return new SslSettingsResponse(certificateId, pendingManagedCertificateId, sslManagementType);
        }
    }
}