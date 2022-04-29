// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetRepositoryAuthorsRepositoryAuthorCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRepositoryAuthorsRepositoryAuthorCollection {
    /**
     * @return List of author objects.
     * 
     */
    private final List<GetRepositoryAuthorsRepositoryAuthorCollectionItem> items;

    @CustomType.Constructor
    private GetRepositoryAuthorsRepositoryAuthorCollection(@CustomType.Parameter("items") List<GetRepositoryAuthorsRepositoryAuthorCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return List of author objects.
     * 
     */
    public List<GetRepositoryAuthorsRepositoryAuthorCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryAuthorsRepositoryAuthorCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRepositoryAuthorsRepositoryAuthorCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryAuthorsRepositoryAuthorCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetRepositoryAuthorsRepositoryAuthorCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetRepositoryAuthorsRepositoryAuthorCollectionItem... items) {
            return items(List.of(items));
        }        public GetRepositoryAuthorsRepositoryAuthorCollection build() {
            return new GetRepositoryAuthorsRepositoryAuthorCollection(items);
        }
    }
}
