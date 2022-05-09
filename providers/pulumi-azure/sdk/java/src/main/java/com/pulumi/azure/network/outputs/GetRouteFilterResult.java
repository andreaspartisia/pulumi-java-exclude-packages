// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetRouteFilterRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRouteFilterResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure Region where the Route Filter exists.
     * 
     */
    private final String location;
    /**
     * @return The Name of Route Filter Rule
     * 
     */
    private final String name;
    private final String resourceGroupName;
    /**
     * @return A `rule` block as defined below.
     * 
     */
    private final List<GetRouteFilterRule> rules;
    /**
     * @return A mapping of tags assigned to the Route Filter.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetRouteFilterResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("rules") List<GetRouteFilterRule> rules,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.rules = rules;
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
     * @return The Azure Region where the Route Filter exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The Name of Route Filter Rule
     * 
     */
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `rule` block as defined below.
     * 
     */
    public List<GetRouteFilterRule> rules() {
        return this.rules;
    }
    /**
     * @return A mapping of tags assigned to the Route Filter.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFilterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private List<GetRouteFilterRule> rules;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteFilterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rules = defaults.rules;
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
        public Builder rules(List<GetRouteFilterRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetRouteFilterRule... rules) {
            return rules(List.of(rules));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetRouteFilterResult build() {
            return new GetRouteFilterResult(id, location, name, resourceGroupName, rules, tags);
        }
    }
}
