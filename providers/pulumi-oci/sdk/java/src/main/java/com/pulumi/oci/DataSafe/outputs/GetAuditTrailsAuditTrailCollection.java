// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAuditTrailsAuditTrailCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuditTrailsAuditTrailCollection {
    private final List<GetAuditTrailsAuditTrailCollectionItem> items;

    @CustomType.Constructor
    private GetAuditTrailsAuditTrailCollection(@CustomType.Parameter("items") List<GetAuditTrailsAuditTrailCollectionItem> items) {
        this.items = items;
    }

    public List<GetAuditTrailsAuditTrailCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditTrailsAuditTrailCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAuditTrailsAuditTrailCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditTrailsAuditTrailCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAuditTrailsAuditTrailCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAuditTrailsAuditTrailCollectionItem... items) {
            return items(List.of(items));
        }        public GetAuditTrailsAuditTrailCollection build() {
            return new GetAuditTrailsAuditTrailCollection(items);
        }
    }
}
