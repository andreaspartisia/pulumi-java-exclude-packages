// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The ID of any Parent Management Group.
     * 
     */
    private final String parentManagementGroupId;
    /**
     * @return A list of Subscription IDs which are assigned to the Management Group.
     * 
     */
    private final List<String> subscriptionIds;

    @CustomType.Constructor
    private GetGroupResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parentManagementGroupId") String parentManagementGroupId,
        @CustomType.Parameter("subscriptionIds") List<String> subscriptionIds) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.parentManagementGroupId = parentManagementGroupId;
        this.subscriptionIds = subscriptionIds;
    }

    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of any Parent Management Group.
     * 
     */
    public String parentManagementGroupId() {
        return this.parentManagementGroupId;
    }
    /**
     * @return A list of Subscription IDs which are assigned to the Management Group.
     * 
     */
    public List<String> subscriptionIds() {
        return this.subscriptionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String name;
        private String parentManagementGroupId;
        private List<String> subscriptionIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parentManagementGroupId = defaults.parentManagementGroupId;
    	      this.subscriptionIds = defaults.subscriptionIds;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parentManagementGroupId(String parentManagementGroupId) {
            this.parentManagementGroupId = Objects.requireNonNull(parentManagementGroupId);
            return this;
        }
        public Builder subscriptionIds(List<String> subscriptionIds) {
            this.subscriptionIds = Objects.requireNonNull(subscriptionIds);
            return this;
        }
        public Builder subscriptionIds(String... subscriptionIds) {
            return subscriptionIds(List.of(subscriptionIds));
        }        public GetGroupResult build() {
            return new GetGroupResult(displayName, id, name, parentManagementGroupId, subscriptionIds);
        }
    }
}
