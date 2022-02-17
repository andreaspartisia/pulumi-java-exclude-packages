// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.AttachedVolume;
import io.pulumi.kubernetes.core_v1.outputs.ContainerImage;
import io.pulumi.kubernetes.core_v1.outputs.NodeAddress;
import io.pulumi.kubernetes.core_v1.outputs.NodeCondition;
import io.pulumi.kubernetes.core_v1.outputs.NodeConfigStatus;
import io.pulumi.kubernetes.core_v1.outputs.NodeDaemonEndpoints;
import io.pulumi.kubernetes.core_v1.outputs.NodeSystemInfo;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeStatus {
    /**
     * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
     * 
     */
    private final @Nullable List<NodeAddress> addresses;
    /**
     * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    private final @Nullable Map<String,String> allocatable;
    /**
     * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    private final @Nullable Map<String,String> capacity;
    /**
     * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    private final @Nullable List<NodeCondition> conditions;
    /**
     * Status of the config assigned to the node via the dynamic Kubelet config feature.
     * 
     */
    private final @Nullable NodeConfigStatus config;
    /**
     * Endpoints of daemons running on the Node.
     * 
     */
    private final @Nullable NodeDaemonEndpoints daemonEndpoints;
    /**
     * List of container images on this node
     * 
     */
    private final @Nullable List<ContainerImage> images;
    /**
     * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
     * 
     */
    private final @Nullable NodeSystemInfo nodeInfo;
    /**
     * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     * Possible enum values:
     *  - `"Pending"` means the node has been created/added by the system, but not configured.
     *  - `"Running"` means the node has been configured and has Kubernetes components running.
     *  - `"Terminated"` means the node has been removed from the cluster.
     * 
     */
    private final @Nullable String phase;
    /**
     * List of volumes that are attached to the node.
     * 
     */
    private final @Nullable List<AttachedVolume> volumesAttached;
    /**
     * List of attachable volumes in use (mounted) by the node.
     * 
     */
    private final @Nullable List<String> volumesInUse;

    @OutputCustomType.Constructor({"addresses","allocatable","capacity","conditions","config","daemonEndpoints","images","nodeInfo","phase","volumesAttached","volumesInUse"})
    private NodeStatus(
        @Nullable List<NodeAddress> addresses,
        @Nullable Map<String,String> allocatable,
        @Nullable Map<String,String> capacity,
        @Nullable List<NodeCondition> conditions,
        @Nullable NodeConfigStatus config,
        @Nullable NodeDaemonEndpoints daemonEndpoints,
        @Nullable List<ContainerImage> images,
        @Nullable NodeSystemInfo nodeInfo,
        @Nullable String phase,
        @Nullable List<AttachedVolume> volumesAttached,
        @Nullable List<String> volumesInUse) {
        this.addresses = addresses;
        this.allocatable = allocatable;
        this.capacity = capacity;
        this.conditions = conditions;
        this.config = config;
        this.daemonEndpoints = daemonEndpoints;
        this.images = images;
        this.nodeInfo = nodeInfo;
        this.phase = phase;
        this.volumesAttached = volumesAttached;
        this.volumesInUse = volumesInUse;
    }

    /**
     * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
     * 
     */
    public List<NodeAddress> getAddresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    /**
     * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
     * 
     */
    public Map<String,String> getAllocatable() {
        return this.allocatable == null ? Map.of() : this.allocatable;
    }
    /**
     * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    public Map<String,String> getCapacity() {
        return this.capacity == null ? Map.of() : this.capacity;
    }
    /**
     * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
     * 
     */
    public List<NodeCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * Status of the config assigned to the node via the dynamic Kubelet config feature.
     * 
     */
    public Optional<NodeConfigStatus> getConfig() {
        return Optional.ofNullable(this.config);
    }
    /**
     * Endpoints of daemons running on the Node.
     * 
     */
    public Optional<NodeDaemonEndpoints> getDaemonEndpoints() {
        return Optional.ofNullable(this.daemonEndpoints);
    }
    /**
     * List of container images on this node
     * 
     */
    public List<ContainerImage> getImages() {
        return this.images == null ? List.of() : this.images;
    }
    /**
     * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
     * 
     */
    public Optional<NodeSystemInfo> getNodeInfo() {
        return Optional.ofNullable(this.nodeInfo);
    }
    /**
     * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
     * 
     * Possible enum values:
     *  - `"Pending"` means the node has been created/added by the system, but not configured.
     *  - `"Running"` means the node has been configured and has Kubernetes components running.
     *  - `"Terminated"` means the node has been removed from the cluster.
     * 
     */
    public Optional<String> getPhase() {
        return Optional.ofNullable(this.phase);
    }
    /**
     * List of volumes that are attached to the node.
     * 
     */
    public List<AttachedVolume> getVolumesAttached() {
        return this.volumesAttached == null ? List.of() : this.volumesAttached;
    }
    /**
     * List of attachable volumes in use (mounted) by the node.
     * 
     */
    public List<String> getVolumesInUse() {
        return this.volumesInUse == null ? List.of() : this.volumesInUse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NodeAddress> addresses;
        private @Nullable Map<String,String> allocatable;
        private @Nullable Map<String,String> capacity;
        private @Nullable List<NodeCondition> conditions;
        private @Nullable NodeConfigStatus config;
        private @Nullable NodeDaemonEndpoints daemonEndpoints;
        private @Nullable List<ContainerImage> images;
        private @Nullable NodeSystemInfo nodeInfo;
        private @Nullable String phase;
        private @Nullable List<AttachedVolume> volumesAttached;
        private @Nullable List<String> volumesInUse;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.allocatable = defaults.allocatable;
    	      this.capacity = defaults.capacity;
    	      this.conditions = defaults.conditions;
    	      this.config = defaults.config;
    	      this.daemonEndpoints = defaults.daemonEndpoints;
    	      this.images = defaults.images;
    	      this.nodeInfo = defaults.nodeInfo;
    	      this.phase = defaults.phase;
    	      this.volumesAttached = defaults.volumesAttached;
    	      this.volumesInUse = defaults.volumesInUse;
        }

        public Builder setAddresses(@Nullable List<NodeAddress> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setAllocatable(@Nullable Map<String,String> allocatable) {
            this.allocatable = allocatable;
            return this;
        }

        public Builder setCapacity(@Nullable Map<String,String> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setConditions(@Nullable List<NodeCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConfig(@Nullable NodeConfigStatus config) {
            this.config = config;
            return this;
        }

        public Builder setDaemonEndpoints(@Nullable NodeDaemonEndpoints daemonEndpoints) {
            this.daemonEndpoints = daemonEndpoints;
            return this;
        }

        public Builder setImages(@Nullable List<ContainerImage> images) {
            this.images = images;
            return this;
        }

        public Builder setNodeInfo(@Nullable NodeSystemInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = phase;
            return this;
        }

        public Builder setVolumesAttached(@Nullable List<AttachedVolume> volumesAttached) {
            this.volumesAttached = volumesAttached;
            return this;
        }

        public Builder setVolumesInUse(@Nullable List<String> volumesInUse) {
            this.volumesInUse = volumesInUse;
            return this;
        }

        public NodeStatus build() {
            return new NodeStatus(addresses, allocatable, capacity, conditions, config, daemonEndpoints, images, nodeInfo, phase, volumesAttached, volumesInUse);
        }
    }
}