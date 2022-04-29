// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CertificatesManagement.outputs.GetCertificatesCertificateCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCertificatesCertificateCollection {
    private final List<GetCertificatesCertificateCollectionItem> items;

    @CustomType.Constructor
    private GetCertificatesCertificateCollection(@CustomType.Parameter("items") List<GetCertificatesCertificateCollectionItem> items) {
        this.items = items;
    }

    public List<GetCertificatesCertificateCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificatesCertificateCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetCertificatesCertificateCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificatesCertificateCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetCertificatesCertificateCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetCertificatesCertificateCollectionItem... items) {
            return items(List.of(items));
        }        public GetCertificatesCertificateCollection build() {
            return new GetCertificatesCertificateCollection(items);
        }
    }
}
