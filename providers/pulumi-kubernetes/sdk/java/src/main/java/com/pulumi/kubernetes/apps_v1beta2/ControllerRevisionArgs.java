// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta2;

import com.google.gson.JsonElement;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControllerRevisionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControllerRevisionArgs Empty = new ControllerRevisionArgs();

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
     * Data is the serialized representation of the state.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<JsonElement> data;

    public Output<JsonElement> data() {
        return this.data == null ? Codegen.empty() : this.data;
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
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Revision indicates the revision of the state represented by Data.
     * 
     */
    @Import(name="revision", required=true)
      private final Output<Integer> revision;

    public Output<Integer> revision() {
        return this.revision;
    }

    public ControllerRevisionArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<JsonElement> data,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<Integer> revision) {
        this.apiVersion = Codegen.stringProp("apiVersion").output().arg(apiVersion).getNullable();
        this.data = data;
        this.kind = Codegen.stringProp("kind").output().arg(kind).getNullable();
        this.metadata = metadata;
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
    }

    private ControllerRevisionArgs() {
        this.apiVersion = Codegen.empty();
        this.data = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.revision = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControllerRevisionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<JsonElement> data;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<Integer> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(ControllerRevisionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.data = defaults.data;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.revision = defaults.revision;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder data(@Nullable Output<JsonElement> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable JsonElement data) {
            this.data = Codegen.ofNullable(data);
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
        public Builder revision(Output<Integer> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Output.of(Objects.requireNonNull(revision));
            return this;
        }        public ControllerRevisionArgs build() {
            return new ControllerRevisionArgs(apiVersion, data, kind, metadata, revision);
        }
    }
}
