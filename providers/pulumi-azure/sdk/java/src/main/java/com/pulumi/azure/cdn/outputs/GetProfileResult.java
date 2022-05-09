// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProfileResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure Region where the resource exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The pricing related information of current CDN profile.
     * 
     */
    private final String sku;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetProfileResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("sku") String sku,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.sku = sku;
        this.tags = tags;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the resource exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The pricing related information of current CDN profile.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private String sku;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetProfileResult build() {
            return new GetProfileResult(id, location, name, resourceGroupName, sku, tags);
        }
    }
}
