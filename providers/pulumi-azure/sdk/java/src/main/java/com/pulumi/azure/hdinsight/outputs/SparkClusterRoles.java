// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.SparkClusterRolesHeadNode;
import com.pulumi.azure.hdinsight.outputs.SparkClusterRolesWorkerNode;
import com.pulumi.azure.hdinsight.outputs.SparkClusterRolesZookeeperNode;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class SparkClusterRoles {
    /**
     * @return A `head_node` block as defined above.
     * 
     */
    private final SparkClusterRolesHeadNode headNode;
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    private final SparkClusterRolesWorkerNode workerNode;
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    private final SparkClusterRolesZookeeperNode zookeeperNode;

    @CustomType.Constructor
    private SparkClusterRoles(
        @CustomType.Parameter("headNode") SparkClusterRolesHeadNode headNode,
        @CustomType.Parameter("workerNode") SparkClusterRolesWorkerNode workerNode,
        @CustomType.Parameter("zookeeperNode") SparkClusterRolesZookeeperNode zookeeperNode) {
        this.headNode = headNode;
        this.workerNode = workerNode;
        this.zookeeperNode = zookeeperNode;
    }

    /**
     * @return A `head_node` block as defined above.
     * 
     */
    public SparkClusterRolesHeadNode headNode() {
        return this.headNode;
    }
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    public SparkClusterRolesWorkerNode workerNode() {
        return this.workerNode;
    }
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    public SparkClusterRolesZookeeperNode zookeeperNode() {
        return this.zookeeperNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterRoles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkClusterRolesHeadNode headNode;
        private SparkClusterRolesWorkerNode workerNode;
        private SparkClusterRolesZookeeperNode zookeeperNode;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkClusterRoles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headNode = defaults.headNode;
    	      this.workerNode = defaults.workerNode;
    	      this.zookeeperNode = defaults.zookeeperNode;
        }

        public Builder headNode(SparkClusterRolesHeadNode headNode) {
            this.headNode = Objects.requireNonNull(headNode);
            return this;
        }
        public Builder workerNode(SparkClusterRolesWorkerNode workerNode) {
            this.workerNode = Objects.requireNonNull(workerNode);
            return this;
        }
        public Builder zookeeperNode(SparkClusterRolesZookeeperNode zookeeperNode) {
            this.zookeeperNode = Objects.requireNonNull(zookeeperNode);
            return this;
        }        public SparkClusterRoles build() {
            return new SparkClusterRoles(headNode, workerNode, zookeeperNode);
        }
    }
}
