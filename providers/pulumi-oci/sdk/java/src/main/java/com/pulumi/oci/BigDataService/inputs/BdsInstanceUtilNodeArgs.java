// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BdsInstanceUtilNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final BdsInstanceUtilNodeArgs Empty = new BdsInstanceUtilNodeArgs();

    /**
     * The size of block volume in GB to be attached to a given node. All the details needed for attaching the block volume are managed by service itself.
     * 
     */
    @Import(name="blockVolumeSizeInGbs", required=true)
    private Output<String> blockVolumeSizeInGbs;

    /**
     * @return The size of block volume in GB to be attached to a given node. All the details needed for attaching the block volume are managed by service itself.
     * 
     */
    public Output<String> blockVolumeSizeInGbs() {
        return this.blockVolumeSizeInGbs;
    }

    /**
     * The number of nodes that form the cluster.
     * 
     */
    @Import(name="numberOfNodes", required=true)
    private Output<Integer> numberOfNodes;

    /**
     * @return The number of nodes that form the cluster.
     * 
     */
    public Output<Integer> numberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * (Updatable) Shape of the node.
     * 
     */
    @Import(name="shape", required=true)
    private Output<String> shape;

    /**
     * @return (Updatable) Shape of the node.
     * 
     */
    public Output<String> shape() {
        return this.shape;
    }

    /**
     * The OCID of the subnet in which the node will be created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The OCID of the subnet in which the node will be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private BdsInstanceUtilNodeArgs() {}

    private BdsInstanceUtilNodeArgs(BdsInstanceUtilNodeArgs $) {
        this.blockVolumeSizeInGbs = $.blockVolumeSizeInGbs;
        this.numberOfNodes = $.numberOfNodes;
        this.shape = $.shape;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BdsInstanceUtilNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BdsInstanceUtilNodeArgs $;

        public Builder() {
            $ = new BdsInstanceUtilNodeArgs();
        }

        public Builder(BdsInstanceUtilNodeArgs defaults) {
            $ = new BdsInstanceUtilNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockVolumeSizeInGbs The size of block volume in GB to be attached to a given node. All the details needed for attaching the block volume are managed by service itself.
         * 
         * @return builder
         * 
         */
        public Builder blockVolumeSizeInGbs(Output<String> blockVolumeSizeInGbs) {
            $.blockVolumeSizeInGbs = blockVolumeSizeInGbs;
            return this;
        }

        /**
         * @param blockVolumeSizeInGbs The size of block volume in GB to be attached to a given node. All the details needed for attaching the block volume are managed by service itself.
         * 
         * @return builder
         * 
         */
        public Builder blockVolumeSizeInGbs(String blockVolumeSizeInGbs) {
            return blockVolumeSizeInGbs(Output.of(blockVolumeSizeInGbs));
        }

        /**
         * @param numberOfNodes The number of nodes that form the cluster.
         * 
         * @return builder
         * 
         */
        public Builder numberOfNodes(Output<Integer> numberOfNodes) {
            $.numberOfNodes = numberOfNodes;
            return this;
        }

        /**
         * @param numberOfNodes The number of nodes that form the cluster.
         * 
         * @return builder
         * 
         */
        public Builder numberOfNodes(Integer numberOfNodes) {
            return numberOfNodes(Output.of(numberOfNodes));
        }

        /**
         * @param shape (Updatable) Shape of the node.
         * 
         * @return builder
         * 
         */
        public Builder shape(Output<String> shape) {
            $.shape = shape;
            return this;
        }

        /**
         * @param shape (Updatable) Shape of the node.
         * 
         * @return builder
         * 
         */
        public Builder shape(String shape) {
            return shape(Output.of(shape));
        }

        /**
         * @param subnetId The OCID of the subnet in which the node will be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The OCID of the subnet in which the node will be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public BdsInstanceUtilNodeArgs build() {
            $.blockVolumeSizeInGbs = Objects.requireNonNull($.blockVolumeSizeInGbs, "expected parameter 'blockVolumeSizeInGbs' to be non-null");
            $.numberOfNodes = Objects.requireNonNull($.numberOfNodes, "expected parameter 'numberOfNodes' to be non-null");
            $.shape = Objects.requireNonNull($.shape, "expected parameter 'shape' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
