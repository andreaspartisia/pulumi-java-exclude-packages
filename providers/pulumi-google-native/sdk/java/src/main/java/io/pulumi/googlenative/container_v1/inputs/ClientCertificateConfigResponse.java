// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for client certificates on the cluster.
 * 
 */
public final class ClientCertificateConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientCertificateConfigResponse Empty = new ClientCertificateConfigResponse();

    /**
     * Issue a client certificate.
     * 
     */
    @Import(name="issueClientCertificate", required=true)
      private final Boolean issueClientCertificate;

    public Boolean issueClientCertificate() {
        return this.issueClientCertificate;
    }

    public ClientCertificateConfigResponse(Boolean issueClientCertificate) {
        this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate, "expected parameter 'issueClientCertificate' to be non-null");
    }

    private ClientCertificateConfigResponse() {
        this.issueClientCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean issueClientCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueClientCertificate = defaults.issueClientCertificate;
        }

        public Builder issueClientCertificate(Boolean issueClientCertificate) {
            this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate);
            return this;
        }        public ClientCertificateConfigResponse build() {
            return new ClientCertificateConfigResponse(issueClientCertificate);
        }
    }
}
