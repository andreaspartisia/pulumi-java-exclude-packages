// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProjectResult {
    /**
     * Creation time.
     * 
     */
    private final String createTime;
    /**
     * The time at which this resource was requested for deletion.
     * 
     */
    private final String deleteTime;
    /**
     * Optional. A user-assigned display name of the project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project`
     * 
     */
    private final String displayName;
    /**
     * A checksum computed by the server based on the current value of the Project resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * Optional. The labels associated with this project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?. Label values must be between 0 and 63 characters long and must conform to the regular expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: `"myBusinessDimension" : "businessValue"`
     * 
     */
    private final Map<String,String> labels;
    /**
     * The unique resource name of the project. It is an int64 generated number prefixed by "projects/". Example: `projects/415104041262`
     * 
     */
    private final String name;
    /**
     * Optional. A reference to a parent Resource. eg., `organizations/123` or `folders/876`.
     * 
     */
    private final String parent;
    /**
     * Immutable. The unique, user-assigned id of the project. It must be 6 to 30 lowercase ASCII letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123`
     * 
     */
    private final String projectId;
    /**
     * The project lifecycle state.
     * 
     */
    private final String state;
    /**
     * The most recent time this resource was modified.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.displayName = displayName;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.parent = parent;
        this.projectId = projectId;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * Creation time.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The time at which this resource was requested for deletion.
     * 
    */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * Optional. A user-assigned display name of the project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project`
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * A checksum computed by the server based on the current value of the Project resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Optional. The labels associated with this project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?. Label values must be between 0 and 63 characters long and must conform to the regular expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: `"myBusinessDimension" : "businessValue"`
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The unique resource name of the project. It is an int64 generated number prefixed by "projects/". Example: `projects/415104041262`
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. A reference to a parent Resource. eg., `organizations/123` or `folders/876`.
     * 
    */
    public String parent() {
        return this.parent;
    }
    /**
     * Immutable. The unique, user-assigned id of the project. It must be 6 to 30 lowercase ASCII letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123`
     * 
    */
    public String projectId() {
        return this.projectId;
    }
    /**
     * The project lifecycle state.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The most recent time this resource was modified.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private String parent;
        private String projectId;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetProjectResult build() {
            return new GetProjectResult(createTime, deleteTime, displayName, etag, labels, name, parent, projectId, state, updateTime);
        }
    }
}
