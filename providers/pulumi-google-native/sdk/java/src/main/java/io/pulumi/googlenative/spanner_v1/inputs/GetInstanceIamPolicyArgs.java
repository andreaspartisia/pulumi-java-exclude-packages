// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceIamPolicyArgs Empty = new GetInstanceIamPolicyArgs();

    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetInstanceIamPolicyArgs(
        String instanceId,
        @Nullable String project) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.project = project;
    }

    private GetInstanceIamPolicyArgs() {
        this.instanceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetInstanceIamPolicyArgs build() {
            return new GetInstanceIamPolicyArgs(instanceId, project);
        }
    }
}
