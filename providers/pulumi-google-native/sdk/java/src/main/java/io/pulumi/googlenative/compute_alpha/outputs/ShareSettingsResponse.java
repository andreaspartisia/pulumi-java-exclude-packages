// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ShareSettingsResponse {
    /**
     * A map of folder id and folder config to specify consumer projects for this shared-reservation. This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id should be a string of number, and without "folders/" prefix.
     * 
     */
    private final Map<String,String> folderMap;
    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    private final Map<String,String> projectMap;
    /**
     * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    private final List<String> projects;
    /**
     * Type of sharing for this shared-reservation
     * 
     */
    private final String shareType;

    @CustomType.Constructor
    private ShareSettingsResponse(
        @CustomType.Parameter("folderMap") Map<String,String> folderMap,
        @CustomType.Parameter("projectMap") Map<String,String> projectMap,
        @CustomType.Parameter("projects") List<String> projects,
        @CustomType.Parameter("shareType") String shareType) {
        this.folderMap = folderMap;
        this.projectMap = projectMap;
        this.projects = projects;
        this.shareType = shareType;
    }

    /**
     * A map of folder id and folder config to specify consumer projects for this shared-reservation. This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id should be a string of number, and without "folders/" prefix.
     * 
    */
    public Map<String,String> folderMap() {
        return this.folderMap;
    }
    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
    */
    public Map<String,String> projectMap() {
        return this.projectMap;
    }
    /**
     * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
    */
    public List<String> projects() {
        return this.projects;
    }
    /**
     * Type of sharing for this shared-reservation
     * 
    */
    public String shareType() {
        return this.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> folderMap;
        private Map<String,String> projectMap;
        private List<String> projects;
        private String shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderMap = defaults.folderMap;
    	      this.projectMap = defaults.projectMap;
    	      this.projects = defaults.projects;
    	      this.shareType = defaults.shareType;
        }

        public Builder folderMap(Map<String,String> folderMap) {
            this.folderMap = Objects.requireNonNull(folderMap);
            return this;
        }
        public Builder projectMap(Map<String,String> projectMap) {
            this.projectMap = Objects.requireNonNull(projectMap);
            return this;
        }
        public Builder projects(List<String> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }
        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }
        public Builder shareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }        public ShareSettingsResponse build() {
            return new ShareSettingsResponse(folderMap, projectMap, projects, shareType);
        }
    }
}
