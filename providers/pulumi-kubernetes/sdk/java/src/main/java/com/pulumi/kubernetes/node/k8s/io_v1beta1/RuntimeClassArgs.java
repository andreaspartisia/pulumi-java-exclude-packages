// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.k8s.io_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.node.k8s.io_v1beta1.inputs.OverheadArgs;
import com.pulumi.kubernetes.node.k8s.io_v1beta1.inputs.SchedulingArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeClassArgs Empty = new RuntimeClassArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    @Import(name="handler", required=true)
      private final Output<String> handler;

    public Output<String> handler() {
        return this.handler;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes v1.18, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    @Import(name="overhead")
      private final @Nullable Output<OverheadArgs> overhead;

    public Output<OverheadArgs> overhead() {
        return this.overhead == null ? Codegen.empty() : this.overhead;
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<SchedulingArgs> scheduling;

    public Output<SchedulingArgs> scheduling() {
        return this.scheduling == null ? Codegen.empty() : this.scheduling;
    }

    public RuntimeClassArgs(
        @Nullable Output<String> apiVersion,
        Output<String> handler,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<OverheadArgs> overhead,
        @Nullable Output<SchedulingArgs> scheduling) {
        this.apiVersion = Codegen.stringProp("apiVersion").output().arg(apiVersion).getNullable();
        this.handler = Objects.requireNonNull(handler, "expected parameter 'handler' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).getNullable();
        this.metadata = metadata;
        this.overhead = overhead;
        this.scheduling = scheduling;
    }

    private RuntimeClassArgs() {
        this.apiVersion = Codegen.empty();
        this.handler = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.overhead = Codegen.empty();
        this.scheduling = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private Output<String> handler;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<OverheadArgs> overhead;
        private @Nullable Output<SchedulingArgs> scheduling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.handler = defaults.handler;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.overhead = defaults.overhead;
    	      this.scheduling = defaults.scheduling;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder handler(Output<String> handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }
        public Builder handler(String handler) {
            this.handler = Output.of(Objects.requireNonNull(handler));
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder overhead(@Nullable Output<OverheadArgs> overhead) {
            this.overhead = overhead;
            return this;
        }
        public Builder overhead(@Nullable OverheadArgs overhead) {
            this.overhead = Codegen.ofNullable(overhead);
            return this;
        }
        public Builder scheduling(@Nullable Output<SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable SchedulingArgs scheduling) {
            this.scheduling = Codegen.ofNullable(scheduling);
            return this;
        }        public RuntimeClassArgs build() {
            return new RuntimeClassArgs(apiVersion, handler, kind, metadata, overhead, scheduling);
        }
    }
}
