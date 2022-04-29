// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection {
    /**
     * @return Array of collected audit volume summary.
     * 
     */
    private final List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem> items;

    @CustomType.Constructor
    private GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection(@CustomType.Parameter("items") List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return Array of collected audit volume summary.
     * 
     */
    public List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollectionItem... items) {
            return items(List.of(items));
        }        public GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection build() {
            return new GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection(items);
        }
    }
}
