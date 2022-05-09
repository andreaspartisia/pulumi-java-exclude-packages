// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteFilterRule {
    /**
     * @return The access type of the rule
     * 
     */
    private final String access;
    /**
     * @return The collection for bgp community values.
     * 
     */
    private final List<String> communities;
    /**
     * @return The Name of this Route Filter.
     * 
     */
    private final String name;
    /**
     * @return The Route Filter Rule Type.
     * 
     */
    private final String ruleType;

    @CustomType.Constructor
    private GetRouteFilterRule(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("communities") List<String> communities,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ruleType") String ruleType) {
        this.access = access;
        this.communities = communities;
        this.name = name;
        this.ruleType = ruleType;
    }

    /**
     * @return The access type of the rule
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return The collection for bgp community values.
     * 
     */
    public List<String> communities() {
        return this.communities;
    }
    /**
     * @return The Name of this Route Filter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Route Filter Rule Type.
     * 
     */
    public String ruleType() {
        return this.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFilterRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private List<String> communities;
        private String name;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteFilterRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.communities = defaults.communities;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder communities(List<String> communities) {
            this.communities = Objects.requireNonNull(communities);
            return this;
        }
        public Builder communities(String... communities) {
            return communities(List.of(communities));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }        public GetRouteFilterRule build() {
            return new GetRouteFilterRule(access, communities, name, ruleType);
        }
    }
}
