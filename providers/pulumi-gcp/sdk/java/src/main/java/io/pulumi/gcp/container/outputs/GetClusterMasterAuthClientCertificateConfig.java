// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetClusterMasterAuthClientCertificateConfig {
    private final Boolean issueClientCertificate;

    @OutputCustomType.Constructor
    private GetClusterMasterAuthClientCertificateConfig(@OutputCustomType.Parameter("issueClientCertificate") Boolean issueClientCertificate) {
        this.issueClientCertificate = issueClientCertificate;
    }

    public Boolean getIssueClientCertificate() {
        return this.issueClientCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMasterAuthClientCertificateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean issueClientCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMasterAuthClientCertificateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueClientCertificate = defaults.issueClientCertificate;
        }

        public Builder setIssueClientCertificate(Boolean issueClientCertificate) {
            this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate);
            return this;
        }
        public GetClusterMasterAuthClientCertificateConfig build() {
            return new GetClusterMasterAuthClientCertificateConfig(issueClientCertificate);
        }
    }
}
