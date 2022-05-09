// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEventHubResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String namespaceName;
    /**
     * @return The number of partitions in the EventHub.
     * 
     */
    private final Integer partitionCount;
    /**
     * @return The identifiers for the partitions of this EventHub.
     * 
     */
    private final List<String> partitionIds;
    private final String resourceGroupName;

    @CustomType.Constructor
    private GetEventHubResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceName") String namespaceName,
        @CustomType.Parameter("partitionCount") Integer partitionCount,
        @CustomType.Parameter("partitionIds") List<String> partitionIds,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName) {
        this.id = id;
        this.name = name;
        this.namespaceName = namespaceName;
        this.partitionCount = partitionCount;
        this.partitionIds = partitionIds;
        this.resourceGroupName = resourceGroupName;
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
    public String namespaceName() {
        return this.namespaceName;
    }
    /**
     * @return The number of partitions in the EventHub.
     * 
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }
    /**
     * @return The identifiers for the partitions of this EventHub.
     * 
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String namespaceName;
        private Integer partitionCount;
        private List<String> partitionIds;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.partitionCount = defaults.partitionCount;
    	      this.partitionIds = defaults.partitionIds;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder partitionCount(Integer partitionCount) {
            this.partitionCount = Objects.requireNonNull(partitionCount);
            return this;
        }
        public Builder partitionIds(List<String> partitionIds) {
            this.partitionIds = Objects.requireNonNull(partitionIds);
            return this;
        }
        public Builder partitionIds(String... partitionIds) {
            return partitionIds(List.of(partitionIds));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetEventHubResult build() {
            return new GetEventHubResult(id, name, namespaceName, partitionCount, partitionIds, resourceGroupName);
        }
    }
}
