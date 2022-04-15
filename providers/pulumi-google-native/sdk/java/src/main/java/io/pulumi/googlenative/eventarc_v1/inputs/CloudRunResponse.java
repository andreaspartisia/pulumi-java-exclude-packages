// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Cloud Run destination.
 * 
 */
public final class CloudRunResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudRunResponse Empty = new CloudRunResponse();

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * The region the Cloud Run service is deployed in.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    /**
     * The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project as the trigger object can be addressed.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String service() {
        return this.service;
    }

    public CloudRunResponse(
        String path,
        String region,
        String service) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private CloudRunResponse() {
        this.path = null;
        this.region = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String region;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.service = defaults.service;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public CloudRunResponse build() {
            return new CloudRunResponse(path, region, service);
        }
    }
}
