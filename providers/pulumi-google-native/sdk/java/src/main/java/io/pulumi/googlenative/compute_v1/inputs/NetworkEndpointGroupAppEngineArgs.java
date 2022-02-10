// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkEndpointGroupAppEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupAppEngineArgs Empty = new NetworkEndpointGroupAppEngineArgs();

    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    @InputImport(name="urlMask")
    private final @Nullable Input<String> urlMask;

    public Input<String> getUrlMask() {
        return this.urlMask == null ? Input.empty() : this.urlMask;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NetworkEndpointGroupAppEngineArgs(
        @Nullable Input<String> service,
        @Nullable Input<String> urlMask,
        @Nullable Input<String> version) {
        this.service = service;
        this.urlMask = urlMask;
        this.version = version;
    }

    private NetworkEndpointGroupAppEngineArgs() {
        this.service = Input.empty();
        this.urlMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupAppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> service;
        private @Nullable Input<String> urlMask;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupAppEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrlMask(@Nullable Input<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }

        public Builder setUrlMask(@Nullable String urlMask) {
            this.urlMask = Input.ofNullable(urlMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public NetworkEndpointGroupAppEngineArgs build() {
            return new NetworkEndpointGroupAppEngineArgs(service, urlMask, version);
        }
    }
}