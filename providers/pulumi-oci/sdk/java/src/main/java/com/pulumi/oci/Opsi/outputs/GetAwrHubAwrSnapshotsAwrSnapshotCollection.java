// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Opsi.outputs.GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAwrHubAwrSnapshotsAwrSnapshotCollection {
    /**
     * @return A list of AWR snapshot summary data.
     * 
     */
    private final List<GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem> items;

    @CustomType.Constructor
    private GetAwrHubAwrSnapshotsAwrSnapshotCollection(@CustomType.Parameter("items") List<GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return A list of AWR snapshot summary data.
     * 
     */
    public List<GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwrHubAwrSnapshotsAwrSnapshotCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAwrHubAwrSnapshotsAwrSnapshotCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAwrHubAwrSnapshotsAwrSnapshotCollectionItem... items) {
            return items(List.of(items));
        }        public GetAwrHubAwrSnapshotsAwrSnapshotCollection build() {
            return new GetAwrHubAwrSnapshotsAwrSnapshotCollection(items);
        }
    }
}
