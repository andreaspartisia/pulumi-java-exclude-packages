// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.inputs.RouterApplianceInstanceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpokeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeArgs Empty = new SpokeArgs();

    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="hub")
    private final @Nullable Input<String> hub;

    public Input<String> getHub() {
        return this.hub == null ? Input.empty() : this.hub;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="linkedInterconnectAttachments")
    private final @Nullable Input<List<String>> linkedInterconnectAttachments;

    public Input<List<String>> getLinkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments == null ? Input.empty() : this.linkedInterconnectAttachments;
    }

    @InputImport(name="linkedRouterApplianceInstances")
    private final @Nullable Input<List<RouterApplianceInstanceArgs>> linkedRouterApplianceInstances;

    public Input<List<RouterApplianceInstanceArgs>> getLinkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances == null ? Input.empty() : this.linkedRouterApplianceInstances;
    }

    @InputImport(name="linkedVpnTunnels")
    private final @Nullable Input<List<String>> linkedVpnTunnels;

    public Input<List<String>> getLinkedVpnTunnels() {
        return this.linkedVpnTunnels == null ? Input.empty() : this.linkedVpnTunnels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="spokeId")
    private final @Nullable Input<String> spokeId;

    public Input<String> getSpokeId() {
        return this.spokeId == null ? Input.empty() : this.spokeId;
    }

    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public SpokeArgs(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> hub,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> linkedInterconnectAttachments,
        @Nullable Input<List<RouterApplianceInstanceArgs>> linkedRouterApplianceInstances,
        @Nullable Input<List<String>> linkedVpnTunnels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> spokeId,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.hub = hub;
        this.labels = labels;
        this.linkedInterconnectAttachments = linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
        this.linkedVpnTunnels = linkedVpnTunnels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.spokeId = spokeId;
        this.updateTime = updateTime;
    }

    private SpokeArgs() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.hub = Input.empty();
        this.labels = Input.empty();
        this.linkedInterconnectAttachments = Input.empty();
        this.linkedRouterApplianceInstances = Input.empty();
        this.linkedVpnTunnels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.spokeId = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> hub;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> linkedInterconnectAttachments;
        private @Nullable Input<List<RouterApplianceInstanceArgs>> linkedRouterApplianceInstances;
        private @Nullable Input<List<String>> linkedVpnTunnels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> spokeId;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.hub = defaults.hub;
    	      this.labels = defaults.labels;
    	      this.linkedInterconnectAttachments = defaults.linkedInterconnectAttachments;
    	      this.linkedRouterApplianceInstances = defaults.linkedRouterApplianceInstances;
    	      this.linkedVpnTunnels = defaults.linkedVpnTunnels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.spokeId = defaults.spokeId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHub(@Nullable Input<String> hub) {
            this.hub = hub;
            return this;
        }

        public Builder setHub(@Nullable String hub) {
            this.hub = Input.ofNullable(hub);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLinkedInterconnectAttachments(@Nullable Input<List<String>> linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = linkedInterconnectAttachments;
            return this;
        }

        public Builder setLinkedInterconnectAttachments(@Nullable List<String> linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = Input.ofNullable(linkedInterconnectAttachments);
            return this;
        }

        public Builder setLinkedRouterApplianceInstances(@Nullable Input<List<RouterApplianceInstanceArgs>> linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
            return this;
        }

        public Builder setLinkedRouterApplianceInstances(@Nullable List<RouterApplianceInstanceArgs> linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = Input.ofNullable(linkedRouterApplianceInstances);
            return this;
        }

        public Builder setLinkedVpnTunnels(@Nullable Input<List<String>> linkedVpnTunnels) {
            this.linkedVpnTunnels = linkedVpnTunnels;
            return this;
        }

        public Builder setLinkedVpnTunnels(@Nullable List<String> linkedVpnTunnels) {
            this.linkedVpnTunnels = Input.ofNullable(linkedVpnTunnels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSpokeId(@Nullable Input<String> spokeId) {
            this.spokeId = spokeId;
            return this;
        }

        public Builder setSpokeId(@Nullable String spokeId) {
            this.spokeId = Input.ofNullable(spokeId);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public SpokeArgs build() {
            return new SpokeArgs(createTime, description, hub, labels, linkedInterconnectAttachments, linkedRouterApplianceInstances, linkedVpnTunnels, location, name, project, requestId, spokeId, updateTime);
        }
    }
}