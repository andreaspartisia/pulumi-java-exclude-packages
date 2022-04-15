// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkEndpointGroupAppEngineResponse {
    /**
     * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
     * 
     */
    private final String service;
    /**
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * 
     */
    private final String urlMask;
    /**
     * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
     * 
     */
    private final String version;

    @CustomType.Constructor
    private NetworkEndpointGroupAppEngineResponse(
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("urlMask") String urlMask,
        @CustomType.Parameter("version") String version) {
        this.service = service;
        this.urlMask = urlMask;
        this.version = version;
    }

    /**
     * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
     * 
    */
    public String service() {
        return this.service;
    }
    /**
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * 
    */
    public String urlMask() {
        return this.urlMask;
    }
    /**
     * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupAppEngineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String service;
        private String urlMask;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupAppEngineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder urlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public NetworkEndpointGroupAppEngineResponse build() {
            return new NetworkEndpointGroupAppEngineResponse(service, urlMask, version);
        }
    }
}
