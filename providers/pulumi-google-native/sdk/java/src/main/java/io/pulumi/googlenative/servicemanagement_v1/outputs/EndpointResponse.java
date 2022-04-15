// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EndpointResponse {
    /**
     * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
     * 
     */
    private final Boolean allowCors;
    /**
     * The canonical name of this endpoint.
     * 
     */
    private final String name;
    /**
     * The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or "myservice.appspot.com".
     * 
     */
    private final String target;

    @CustomType.Constructor
    private EndpointResponse(
        @CustomType.Parameter("allowCors") Boolean allowCors,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("target") String target) {
        this.allowCors = allowCors;
        this.name = name;
        this.target = target;
    }

    /**
     * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
     * 
    */
    public Boolean allowCors() {
        return this.allowCors;
    }
    /**
     * The canonical name of this endpoint.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or "myservice.appspot.com".
     * 
    */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCors;
        private String name;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCors = defaults.allowCors;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder allowCors(Boolean allowCors) {
            this.allowCors = Objects.requireNonNull(allowCors);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public EndpointResponse build() {
            return new EndpointResponse(allowCors, name, target);
        }
    }
}
