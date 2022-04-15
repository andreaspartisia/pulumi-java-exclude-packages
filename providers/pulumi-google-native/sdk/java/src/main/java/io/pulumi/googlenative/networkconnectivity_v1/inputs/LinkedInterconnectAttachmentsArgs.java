// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
 * 
 */
public final class LinkedInterconnectAttachmentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedInterconnectAttachmentsArgs Empty = new LinkedInterconnectAttachmentsArgs();

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    @Import(name="siteToSiteDataTransfer")
      private final @Nullable Output<Boolean> siteToSiteDataTransfer;

    public Output<Boolean> siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer == null ? Codegen.empty() : this.siteToSiteDataTransfer;
    }

    /**
     * The URIs of linked interconnect attachment resources
     * 
     */
    @Import(name="uris")
      private final @Nullable Output<List<String>> uris;

    public Output<List<String>> uris() {
        return this.uris == null ? Codegen.empty() : this.uris;
    }

    public LinkedInterconnectAttachmentsArgs(
        @Nullable Output<Boolean> siteToSiteDataTransfer,
        @Nullable Output<List<String>> uris) {
        this.siteToSiteDataTransfer = siteToSiteDataTransfer;
        this.uris = uris;
    }

    private LinkedInterconnectAttachmentsArgs() {
        this.siteToSiteDataTransfer = Codegen.empty();
        this.uris = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedInterconnectAttachmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> siteToSiteDataTransfer;
        private @Nullable Output<List<String>> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedInterconnectAttachmentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
    	      this.uris = defaults.uris;
        }

        public Builder siteToSiteDataTransfer(@Nullable Output<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = siteToSiteDataTransfer;
            return this;
        }
        public Builder siteToSiteDataTransfer(@Nullable Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Codegen.ofNullable(siteToSiteDataTransfer);
            return this;
        }
        public Builder uris(@Nullable Output<List<String>> uris) {
            this.uris = uris;
            return this;
        }
        public Builder uris(@Nullable List<String> uris) {
            this.uris = Codegen.ofNullable(uris);
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public LinkedInterconnectAttachmentsArgs build() {
            return new LinkedInterconnectAttachmentsArgs(siteToSiteDataTransfer, uris);
        }
    }
}
