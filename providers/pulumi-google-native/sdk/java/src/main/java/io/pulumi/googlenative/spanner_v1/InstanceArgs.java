// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
     * 
     */
    @Import(name="config", required=true)
      private final Output<String> config;

    public Output<String> config() {
        return this.config;
    }

    /**
     * The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The ID of the instance to create. Valid identifiers are of the form `a-z*[a-z0-9]` and must be between 2 and 64 characters in length.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the name must be between 2 and 64 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The number of nodes allocated to this instance. At most one of either node_count or processing_units should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    @Import(name="nodeCount")
      private final @Nullable Output<Integer> nodeCount;

    public Output<Integer> nodeCount() {
        return this.nodeCount == null ? Codegen.empty() : this.nodeCount;
    }

    /**
     * The number of processing units allocated to this instance. At most one of processing_units or node_count should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    @Import(name="processingUnits")
      private final @Nullable Output<Integer> processingUnits;

    public Output<Integer> processingUnits() {
        return this.processingUnits == null ? Codegen.empty() : this.processingUnits;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public InstanceArgs(
        Output<String> config,
        Output<String> displayName,
        Output<String> instanceId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Integer> nodeCount,
        @Nullable Output<Integer> processingUnits,
        @Nullable Output<String> project) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.labels = labels;
        this.name = name;
        this.nodeCount = nodeCount;
        this.processingUnits = processingUnits;
        this.project = project;
    }

    private InstanceArgs() {
        this.config = Codegen.empty();
        this.displayName = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.nodeCount = Codegen.empty();
        this.processingUnits = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> config;
        private Output<String> displayName;
        private Output<String> instanceId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> nodeCount;
        private @Nullable Output<Integer> processingUnits;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.processingUnits = defaults.processingUnits;
    	      this.project = defaults.project;
        }

        public Builder config(Output<String> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(String config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Codegen.ofNullable(nodeCount);
            return this;
        }
        public Builder processingUnits(@Nullable Output<Integer> processingUnits) {
            this.processingUnits = processingUnits;
            return this;
        }
        public Builder processingUnits(@Nullable Integer processingUnits) {
            this.processingUnits = Codegen.ofNullable(processingUnits);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(config, displayName, instanceId, labels, name, nodeCount, processingUnits, project);
        }
    }
}
