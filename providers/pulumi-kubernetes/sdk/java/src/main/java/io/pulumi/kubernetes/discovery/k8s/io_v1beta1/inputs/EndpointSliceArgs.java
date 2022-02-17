// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs.EndpointArgs;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs.EndpointPortArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 * 
 */
public final class EndpointSliceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointSliceArgs Empty = new EndpointSliceArgs();

    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     */
    @InputImport(name="addressType", required=true)
    private final Input<String> addressType;

    public Input<String> getAddressType() {
        return this.addressType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    @InputImport(name="endpoints", required=true)
    private final Input<List<EndpointArgs>> endpoints;

    public Input<List<EndpointArgs>> getEndpoints() {
        return this.endpoints;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard object's metadata.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
     * 
     */
    @InputImport(name="ports")
    private final @Nullable Input<List<EndpointPortArgs>> ports;

    public Input<List<EndpointPortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    public EndpointSliceArgs(
        Input<String> addressType,
        @Nullable Input<String> apiVersion,
        Input<List<EndpointArgs>> endpoints,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<List<EndpointPortArgs>> ports) {
        this.addressType = Objects.requireNonNull(addressType, "expected parameter 'addressType' to be non-null");
        this.apiVersion = apiVersion;
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
        this.ports = ports;
    }

    private EndpointSliceArgs() {
        this.addressType = Input.empty();
        this.apiVersion = Input.empty();
        this.endpoints = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.ports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSliceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> addressType;
        private @Nullable Input<String> apiVersion;
        private Input<List<EndpointArgs>> endpoints;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<List<EndpointPortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSliceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.endpoints = defaults.endpoints;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.ports = defaults.ports;
        }

        public Builder setAddressType(Input<String> addressType) {
            this.addressType = Objects.requireNonNull(addressType);
            return this;
        }

        public Builder setAddressType(String addressType) {
            this.addressType = Input.of(Objects.requireNonNull(addressType));
            return this;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setEndpoints(Input<List<EndpointArgs>> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setEndpoints(List<EndpointArgs> endpoints) {
            this.endpoints = Input.of(Objects.requireNonNull(endpoints));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<EndpointPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<EndpointPortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public EndpointSliceArgs build() {
            return new EndpointSliceArgs(addressType, apiVersion, endpoints, kind, metadata, ports);
        }
    }
}