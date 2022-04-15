// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.run_v1.inputs.ObjectMetaArgs;
import io.pulumi.googlenative.run_v1.inputs.RevisionSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RevisionTemplateSpec describes the data a revision should have when created from a template. Based on: https://github.com/kubernetes/api/blob/e771f807/core/v1/types.go#L3179-L3190
 * 
 */
public final class RevisionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final RevisionTemplateArgs Empty = new RevisionTemplateArgs();

    /**
     * Optional metadata for this Revision, including labels and annotations. Name will be generated by the Configuration. The following annotation keys set properties of the created revision: * `autoscaling.knative.dev/minScale` sets the minimum number of instances. * `autoscaling.knative.dev/maxScale` sets the maximum number of instances. * `run.googleapis.com/cloudsql-instances` sets Cloud SQL connections. Multiple values should be comma separated. * `run.googleapis.com/vpc-access-connector` sets a Serverless VPC Access connector. * `run.googleapis.com/vpc-access-egress` sets VPC egress. Supported values are `all-traffic`, `all` (deprecated), and `private-ranges-only`. `all-traffic` and `all` provide the same functionality. `all` is deprecated but will continue to be supported. Prefer `all-traffic`.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * RevisionSpec holds the desired state of the Revision (from the client).
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<RevisionSpecArgs> spec;

    public Output<RevisionSpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    public RevisionTemplateArgs(
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<RevisionSpecArgs> spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    private RevisionTemplateArgs() {
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RevisionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<RevisionSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(RevisionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<RevisionSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable RevisionSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }        public RevisionTemplateArgs build() {
            return new RevisionTemplateArgs(metadata, spec);
        }
    }
}
