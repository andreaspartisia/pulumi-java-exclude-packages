// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudidentity.outputs.GetGroupsGroupGroupKey;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetGroupsGroup {
    private final String createTime;
    private final String description;
    private final String displayName;
    private final List<GetGroupsGroupGroupKey> groupKeys;
    private final String initialGroupConfig;
    private final Map<String,String> labels;
    private final String name;
    /**
     * The parent resource under which to list all Groups. Must be of the form identitysources/{identity_source_id} for external- identity-mapped groups or customers/{customer_id} for Google Groups.
     * 
     */
    private final String parent;
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetGroupsGroup(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("groupKeys") List<GetGroupsGroupGroupKey> groupKeys,
        @OutputCustomType.Parameter("initialGroupConfig") String initialGroupConfig,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parent") String parent,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.groupKeys = groupKeys;
        this.initialGroupConfig = initialGroupConfig;
        this.labels = labels;
        this.name = name;
        this.parent = parent;
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public List<GetGroupsGroupGroupKey> getGroupKeys() {
        return this.groupKeys;
    }
    public String getInitialGroupConfig() {
        return this.initialGroupConfig;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The parent resource under which to list all Groups. Must be of the form identitysources/{identity_source_id} for external- identity-mapped groups or customers/{customer_id} for Google Groups.
     * 
    */
    public String getParent() {
        return this.parent;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private List<GetGroupsGroupGroupKey> groupKeys;
        private String initialGroupConfig;
        private Map<String,String> labels;
        private String name;
        private String parent;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupKeys = defaults.groupKeys;
    	      this.initialGroupConfig = defaults.initialGroupConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGroupKeys(List<GetGroupsGroupGroupKey> groupKeys) {
            this.groupKeys = Objects.requireNonNull(groupKeys);
            return this;
        }

        public Builder setInitialGroupConfig(String initialGroupConfig) {
            this.initialGroupConfig = Objects.requireNonNull(initialGroupConfig);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetGroupsGroup build() {
            return new GetGroupsGroup(createTime, description, displayName, groupKeys, initialGroupConfig, labels, name, parent, updateTime);
        }
    }
}
