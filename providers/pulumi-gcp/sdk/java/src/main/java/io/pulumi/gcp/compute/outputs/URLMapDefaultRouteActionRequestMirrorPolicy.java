// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class URLMapDefaultRouteActionRequestMirrorPolicy {
    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final String backendService;

    @OutputCustomType.Constructor
    private URLMapDefaultRouteActionRequestMirrorPolicy(@OutputCustomType.Parameter("backendService") String backendService) {
        this.backendService = backendService;
    }

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
    */
    public String getBackendService() {
        return this.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionRequestMirrorPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionRequestMirrorPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public URLMapDefaultRouteActionRequestMirrorPolicy build() {
            return new URLMapDefaultRouteActionRequestMirrorPolicy(backendService);
        }
    }
}
