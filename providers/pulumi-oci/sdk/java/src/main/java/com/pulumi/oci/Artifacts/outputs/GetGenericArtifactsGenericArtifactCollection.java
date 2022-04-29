// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Artifacts.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Artifacts.outputs.GetGenericArtifactsGenericArtifactCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGenericArtifactsGenericArtifactCollection {
    private final List<GetGenericArtifactsGenericArtifactCollectionItem> items;

    @CustomType.Constructor
    private GetGenericArtifactsGenericArtifactCollection(@CustomType.Parameter("items") List<GetGenericArtifactsGenericArtifactCollectionItem> items) {
        this.items = items;
    }

    public List<GetGenericArtifactsGenericArtifactCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGenericArtifactsGenericArtifactCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGenericArtifactsGenericArtifactCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGenericArtifactsGenericArtifactCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetGenericArtifactsGenericArtifactCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetGenericArtifactsGenericArtifactCollectionItem... items) {
            return items(List.of(items));
        }        public GetGenericArtifactsGenericArtifactCollection build() {
            return new GetGenericArtifactsGenericArtifactCollection(items);
        }
    }
}
