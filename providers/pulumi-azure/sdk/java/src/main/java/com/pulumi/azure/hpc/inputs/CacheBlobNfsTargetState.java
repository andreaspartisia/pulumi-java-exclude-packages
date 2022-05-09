// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheBlobNfsTargetState extends com.pulumi.resources.ResourceArgs {

    public static final CacheBlobNfsTargetState Empty = new CacheBlobNfsTargetState();

    /**
     * The name of the access policy applied to this target. Defaults to `default`.
     * 
     */
    @Import(name="accessPolicyName")
    private @Nullable Output<String> accessPolicyName;

    /**
     * @return The name of the access policy applied to this target. Defaults to `default`.
     * 
     */
    public Optional<Output<String>> accessPolicyName() {
        return Optional.ofNullable(this.accessPolicyName);
    }

    /**
     * The name of the HPC Cache, which the HPC Cache Blob NFS Target will be added to. Changing this forces a new HPC Cache Blob NFS Target to be created.
     * 
     */
    @Import(name="cacheName")
    private @Nullable Output<String> cacheName;

    /**
     * @return The name of the HPC Cache, which the HPC Cache Blob NFS Target will be added to. Changing this forces a new HPC Cache Blob NFS Target to be created.
     * 
     */
    public Optional<Output<String>> cacheName() {
        return Optional.ofNullable(this.cacheName);
    }

    /**
     * The name which should be used for this HPC Cache Blob NFS Target. Changing this forces a new HPC Cache Blob NFS Target to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this HPC Cache Blob NFS Target. Changing this forces a new HPC Cache Blob NFS Target to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The client-facing file path of the HPC Cache Blob NFS Target.
     * 
     */
    @Import(name="namespacePath")
    private @Nullable Output<String> namespacePath;

    /**
     * @return The client-facing file path of the HPC Cache Blob NFS Target.
     * 
     */
    public Optional<Output<String>> namespacePath() {
        return Optional.ofNullable(this.namespacePath);
    }

    /**
     * The name of the Resource Group where the HPC Cache Blob NFS Target should exist. Changing this forces a new HPC Cache Blob NFS Target to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the HPC Cache Blob NFS Target should exist. Changing this forces a new HPC Cache Blob NFS Target to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Resource Manager ID of the Storage Container used as the HPC Cache Blob NFS Target. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageContainerId")
    private @Nullable Output<String> storageContainerId;

    /**
     * @return The Resource Manager ID of the Storage Container used as the HPC Cache Blob NFS Target. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageContainerId() {
        return Optional.ofNullable(this.storageContainerId);
    }

    /**
     * The type of usage of the HPC Cache Blob NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
     * 
     */
    @Import(name="usageModel")
    private @Nullable Output<String> usageModel;

    /**
     * @return The type of usage of the HPC Cache Blob NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
     * 
     */
    public Optional<Output<String>> usageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    private CacheBlobNfsTargetState() {}

    private CacheBlobNfsTargetState(CacheBlobNfsTargetState $) {
        this.accessPolicyName = $.accessPolicyName;
        this.cacheName = $.cacheName;
        this.name = $.name;
        this.namespacePath = $.namespacePath;
        this.resourceGroupName = $.resourceGroupName;
        this.storageContainerId = $.storageContainerId;
        this.usageModel = $.usageModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheBlobNfsTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheBlobNfsTargetState $;

        public Builder() {
            $ = new CacheBlobNfsTargetState();
        }

        public Builder(CacheBlobNfsTargetState defaults) {
            $ = new CacheBlobNfsTargetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyName The name of the access policy applied to this target. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(@Nullable Output<String> accessPolicyName) {
            $.accessPolicyName = accessPolicyName;
            return this;
        }

        /**
         * @param accessPolicyName The name of the access policy applied to this target. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(String accessPolicyName) {
            return accessPolicyName(Output.of(accessPolicyName));
        }

        /**
         * @param cacheName The name of the HPC Cache, which the HPC Cache Blob NFS Target will be added to. Changing this forces a new HPC Cache Blob NFS Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder cacheName(@Nullable Output<String> cacheName) {
            $.cacheName = cacheName;
            return this;
        }

        /**
         * @param cacheName The name of the HPC Cache, which the HPC Cache Blob NFS Target will be added to. Changing this forces a new HPC Cache Blob NFS Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder cacheName(String cacheName) {
            return cacheName(Output.of(cacheName));
        }

        /**
         * @param name The name which should be used for this HPC Cache Blob NFS Target. Changing this forces a new HPC Cache Blob NFS Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this HPC Cache Blob NFS Target. Changing this forces a new HPC Cache Blob NFS Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespacePath The client-facing file path of the HPC Cache Blob NFS Target.
         * 
         * @return builder
         * 
         */
        public Builder namespacePath(@Nullable Output<String> namespacePath) {
            $.namespacePath = namespacePath;
            return this;
        }

        /**
         * @param namespacePath The client-facing file path of the HPC Cache Blob NFS Target.
         * 
         * @return builder
         * 
         */
        public Builder namespacePath(String namespacePath) {
            return namespacePath(Output.of(namespacePath));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the HPC Cache Blob NFS Target should exist. Changing this forces a new HPC Cache Blob NFS Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the HPC Cache Blob NFS Target should exist. Changing this forces a new HPC Cache Blob NFS Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageContainerId The Resource Manager ID of the Storage Container used as the HPC Cache Blob NFS Target. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerId(@Nullable Output<String> storageContainerId) {
            $.storageContainerId = storageContainerId;
            return this;
        }

        /**
         * @param storageContainerId The Resource Manager ID of the Storage Container used as the HPC Cache Blob NFS Target. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerId(String storageContainerId) {
            return storageContainerId(Output.of(storageContainerId));
        }

        /**
         * @param usageModel The type of usage of the HPC Cache Blob NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(@Nullable Output<String> usageModel) {
            $.usageModel = usageModel;
            return this;
        }

        /**
         * @param usageModel The type of usage of the HPC Cache Blob NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(String usageModel) {
            return usageModel(Output.of(usageModel));
        }

        public CacheBlobNfsTargetState build() {
            return $;
        }
    }

}
