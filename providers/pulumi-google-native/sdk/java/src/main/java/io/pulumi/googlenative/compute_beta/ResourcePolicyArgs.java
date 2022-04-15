// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyGroupPlacementPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyInstanceSchedulePolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    @Import(name="groupPlacementPolicy")
      private final @Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;

    public Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy() {
        return this.groupPlacementPolicy == null ? Codegen.empty() : this.groupPlacementPolicy;
    }

    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    @Import(name="instanceSchedulePolicy")
      private final @Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;

    public Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy() {
        return this.instanceSchedulePolicy == null ? Codegen.empty() : this.instanceSchedulePolicy;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    @Import(name="snapshotSchedulePolicy")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

    public Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy == null ? Codegen.empty() : this.snapshotSchedulePolicy;
    }

    public ResourcePolicyArgs(
        @Nullable Output<String> description,
        @Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy,
        @Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
        this.description = description;
        this.groupPlacementPolicy = groupPlacementPolicy;
        this.instanceSchedulePolicy = instanceSchedulePolicy;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.snapshotSchedulePolicy = snapshotSchedulePolicy;
    }

    private ResourcePolicyArgs() {
        this.description = Codegen.empty();
        this.groupPlacementPolicy = Codegen.empty();
        this.instanceSchedulePolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.snapshotSchedulePolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;
        private @Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupPlacementPolicy = defaults.groupPlacementPolicy;
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.snapshotSchedulePolicy = defaults.snapshotSchedulePolicy;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder groupPlacementPolicy(@Nullable Output<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy) {
            this.groupPlacementPolicy = groupPlacementPolicy;
            return this;
        }
        public Builder groupPlacementPolicy(@Nullable ResourcePolicyGroupPlacementPolicyArgs groupPlacementPolicy) {
            this.groupPlacementPolicy = Codegen.ofNullable(groupPlacementPolicy);
            return this;
        }
        public Builder instanceSchedulePolicy(@Nullable Output<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy) {
            this.instanceSchedulePolicy = instanceSchedulePolicy;
            return this;
        }
        public Builder instanceSchedulePolicy(@Nullable ResourcePolicyInstanceSchedulePolicyArgs instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Codegen.ofNullable(instanceSchedulePolicy);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder snapshotSchedulePolicy(@Nullable Output<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = snapshotSchedulePolicy;
            return this;
        }
        public Builder snapshotSchedulePolicy(@Nullable ResourcePolicySnapshotSchedulePolicyArgs snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = Codegen.ofNullable(snapshotSchedulePolicy);
            return this;
        }        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(description, groupPlacementPolicy, instanceSchedulePolicy, name, project, region, requestId, snapshotSchedulePolicy);
        }
    }
}
