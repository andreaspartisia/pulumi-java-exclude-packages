// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.organizations.outputs.GetFoldersFolder;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetFoldersResult {
    /**
     * A list of projects matching the provided filter. Structure is defined below.
     * 
     */
    private final List<GetFoldersFolder> folders;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String parentId;

    @OutputCustomType.Constructor({"folders","id","parentId"})
    private GetFoldersResult(
        List<GetFoldersFolder> folders,
        String id,
        String parentId) {
        this.folders = Objects.requireNonNull(folders);
        this.id = Objects.requireNonNull(id);
        this.parentId = Objects.requireNonNull(parentId);
    }

    /**
     * A list of projects matching the provided filter. Structure is defined below.
     * 
     */
    public List<GetFoldersFolder> getFolders() {
        return this.folders;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getParentId() {
        return this.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetFoldersFolder> folders;
        private String id;
        private String parentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFoldersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folders = defaults.folders;
    	      this.id = defaults.id;
    	      this.parentId = defaults.parentId;
        }

        public Builder setFolders(List<GetFoldersFolder> folders) {
            this.folders = Objects.requireNonNull(folders);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }

        public GetFoldersResult build() {
            return new GetFoldersResult(folders, id, parentId);
        }
    }
}