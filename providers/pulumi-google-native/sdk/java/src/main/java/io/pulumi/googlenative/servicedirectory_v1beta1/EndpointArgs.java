// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses like: * `8.8.8` * `8.8.8.8:53` * `test:bad:address` * `[::1]` * `[::1]:8080` Limited to 45 characters.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    @Import(name="endpointId", required=true)
      private final Output<String> endpointId;

    public Output<String> endpointId() {
        return this.endpointId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. Metadata for the endpoint. This data can be consumed by service clients. Restrictions: * The entire metadata dictionary may contain up to 512 characters, spread accoss all key-value pairs. Metadata that goes beyond this limit are rejected * Valid metadata keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Metadata that fails to meet these requirements are rejected Note: This field is equivalent to the `annotations` field in the v1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Immutable. The resource name for the endpoint in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="namespaceId", required=true)
      private final Output<String> namespaceId;

    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    /**
     * Immutable. The Google Compute Engine network (VPC) of the endpoint in the format `projects//locations/global/networks/*`. The project must be specified by project number (project id is rejected). Incorrectly formatted networks are rejected, but no other validation is performed on this field (ex. network or project existence, reachability, or permissions).
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Optional. Service Directory rejects values outside of `[0, 65535]`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="serviceId", required=true)
      private final Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    public EndpointArgs(
        @Nullable Output<String> address,
        Output<String> endpointId,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        Output<String> namespaceId,
        @Nullable Output<String> network,
        @Nullable Output<Integer> port,
        @Nullable Output<String> project,
        Output<String> serviceId) {
        this.address = address;
        this.endpointId = Objects.requireNonNull(endpointId, "expected parameter 'endpointId' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.network = network;
        this.port = port;
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private EndpointArgs() {
        this.address = Codegen.empty();
        this.endpointId = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.namespaceId = Codegen.empty();
        this.network = Codegen.empty();
        this.port = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private Output<String> endpointId;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private Output<String> namespaceId;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> project;
        private Output<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.endpointId = defaults.endpointId;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder endpointId(Output<String> endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        public Builder endpointId(String endpointId) {
            this.endpointId = Output.of(Objects.requireNonNull(endpointId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namespaceId(Output<String> namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Output.of(Objects.requireNonNull(namespaceId));
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder serviceId(Output<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Output.of(Objects.requireNonNull(serviceId));
            return this;
        }        public EndpointArgs build() {
            return new EndpointArgs(address, endpointId, location, metadata, name, namespaceId, network, port, project, serviceId);
        }
    }
}
