// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistryFoldersFolderSummaryCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegistryFoldersFolderSummaryCollection {
    private final List<GetRegistryFoldersFolderSummaryCollectionItem> items;

    @CustomType.Constructor
    private GetRegistryFoldersFolderSummaryCollection(@CustomType.Parameter("items") List<GetRegistryFoldersFolderSummaryCollectionItem> items) {
        this.items = items;
    }

    public List<GetRegistryFoldersFolderSummaryCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryFoldersFolderSummaryCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRegistryFoldersFolderSummaryCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryFoldersFolderSummaryCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetRegistryFoldersFolderSummaryCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetRegistryFoldersFolderSummaryCollectionItem... items) {
            return items(List.of(items));
        }        public GetRegistryFoldersFolderSummaryCollection build() {
            return new GetRegistryFoldersFolderSummaryCollection(items);
        }
    }
}
