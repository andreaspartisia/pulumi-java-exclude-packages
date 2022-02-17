// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs();

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    @InputImport(name="headerName", required=true)
    private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs(Input<String> headerName) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs() {
        this.headerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs(headerName);
        }
    }
}