// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
 * 
 */
public final class LinkedInterconnectAttachmentsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedInterconnectAttachmentsResponse Empty = new LinkedInterconnectAttachmentsResponse();

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    @Import(name="siteToSiteDataTransfer", required=true)
      private final Boolean siteToSiteDataTransfer;

    public Boolean siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    /**
     * The URIs of linked interconnect attachment resources
     * 
     */
    @Import(name="uris", required=true)
      private final List<String> uris;

    public List<String> uris() {
        return this.uris;
    }

    public LinkedInterconnectAttachmentsResponse(
        Boolean siteToSiteDataTransfer,
        List<String> uris) {
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer, "expected parameter 'siteToSiteDataTransfer' to be non-null");
        this.uris = Objects.requireNonNull(uris, "expected parameter 'uris' to be non-null");
    }

    private LinkedInterconnectAttachmentsResponse() {
        this.siteToSiteDataTransfer = null;
        this.uris = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedInterconnectAttachmentsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean siteToSiteDataTransfer;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedInterconnectAttachmentsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
    	      this.uris = defaults.uris;
        }

        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }
        public Builder uris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public LinkedInterconnectAttachmentsResponse build() {
            return new LinkedInterconnectAttachmentsResponse(siteToSiteDataTransfer, uris);
        }
    }
}
