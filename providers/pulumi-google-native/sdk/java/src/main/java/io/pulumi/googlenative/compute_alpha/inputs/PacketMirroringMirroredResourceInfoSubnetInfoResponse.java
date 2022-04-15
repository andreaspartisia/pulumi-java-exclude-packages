// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringMirroredResourceInfoSubnetInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final PacketMirroringMirroredResourceInfoSubnetInfoResponse Empty = new PacketMirroringMirroredResourceInfoSubnetInfoResponse();

    /**
     * Unique identifier for the subnetwork; defined by the server.
     * 
     */
    @Import(name="canonicalUrl", required=true)
      private final String canonicalUrl;

    public String canonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public PacketMirroringMirroredResourceInfoSubnetInfoResponse(
        String canonicalUrl,
        String url) {
        this.canonicalUrl = Objects.requireNonNull(canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PacketMirroringMirroredResourceInfoSubnetInfoResponse() {
        this.canonicalUrl = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoSubnetInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoSubnetInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.url = defaults.url;
        }

        public Builder canonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public PacketMirroringMirroredResourceInfoSubnetInfoResponse build() {
            return new PacketMirroringMirroredResourceInfoSubnetInfoResponse(canonicalUrl, url);
        }
    }
}
