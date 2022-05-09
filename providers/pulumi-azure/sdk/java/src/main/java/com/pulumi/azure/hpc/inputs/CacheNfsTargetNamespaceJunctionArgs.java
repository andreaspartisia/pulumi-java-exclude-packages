// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheNfsTargetNamespaceJunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheNfsTargetNamespaceJunctionArgs Empty = new CacheNfsTargetNamespaceJunctionArgs();

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
     * The client-facing file path of this NFS target within the HPC Cache NFS Target.
     * 
     */
    @Import(name="namespacePath", required=true)
    private Output<String> namespacePath;

    /**
     * @return The client-facing file path of this NFS target within the HPC Cache NFS Target.
     * 
     */
    public Output<String> namespacePath() {
        return this.namespacePath;
    }

    /**
     * The NFS export of this NFS target within the HPC Cache NFS Target.
     * 
     */
    @Import(name="nfsExport", required=true)
    private Output<String> nfsExport;

    /**
     * @return The NFS export of this NFS target within the HPC Cache NFS Target.
     * 
     */
    public Output<String> nfsExport() {
        return this.nfsExport;
    }

    /**
     * The relative subdirectory path from the `nfs_export` to map to the `namespace_path`. Defaults to `&#34;&#34;`, in which case the whole `nfs_export` is exported.
     * 
     */
    @Import(name="targetPath")
    private @Nullable Output<String> targetPath;

    /**
     * @return The relative subdirectory path from the `nfs_export` to map to the `namespace_path`. Defaults to `&#34;&#34;`, in which case the whole `nfs_export` is exported.
     * 
     */
    public Optional<Output<String>> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    private CacheNfsTargetNamespaceJunctionArgs() {}

    private CacheNfsTargetNamespaceJunctionArgs(CacheNfsTargetNamespaceJunctionArgs $) {
        this.accessPolicyName = $.accessPolicyName;
        this.namespacePath = $.namespacePath;
        this.nfsExport = $.nfsExport;
        this.targetPath = $.targetPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheNfsTargetNamespaceJunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheNfsTargetNamespaceJunctionArgs $;

        public Builder() {
            $ = new CacheNfsTargetNamespaceJunctionArgs();
        }

        public Builder(CacheNfsTargetNamespaceJunctionArgs defaults) {
            $ = new CacheNfsTargetNamespaceJunctionArgs(Objects.requireNonNull(defaults));
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
         * @param namespacePath The client-facing file path of this NFS target within the HPC Cache NFS Target.
         * 
         * @return builder
         * 
         */
        public Builder namespacePath(Output<String> namespacePath) {
            $.namespacePath = namespacePath;
            return this;
        }

        /**
         * @param namespacePath The client-facing file path of this NFS target within the HPC Cache NFS Target.
         * 
         * @return builder
         * 
         */
        public Builder namespacePath(String namespacePath) {
            return namespacePath(Output.of(namespacePath));
        }

        /**
         * @param nfsExport The NFS export of this NFS target within the HPC Cache NFS Target.
         * 
         * @return builder
         * 
         */
        public Builder nfsExport(Output<String> nfsExport) {
            $.nfsExport = nfsExport;
            return this;
        }

        /**
         * @param nfsExport The NFS export of this NFS target within the HPC Cache NFS Target.
         * 
         * @return builder
         * 
         */
        public Builder nfsExport(String nfsExport) {
            return nfsExport(Output.of(nfsExport));
        }

        /**
         * @param targetPath The relative subdirectory path from the `nfs_export` to map to the `namespace_path`. Defaults to `&#34;&#34;`, in which case the whole `nfs_export` is exported.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(@Nullable Output<String> targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        /**
         * @param targetPath The relative subdirectory path from the `nfs_export` to map to the `namespace_path`. Defaults to `&#34;&#34;`, in which case the whole `nfs_export` is exported.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(String targetPath) {
            return targetPath(Output.of(targetPath));
        }

        public CacheNfsTargetNamespaceJunctionArgs build() {
            $.namespacePath = Objects.requireNonNull($.namespacePath, "expected parameter 'namespacePath' to be non-null");
            $.nfsExport = Objects.requireNonNull($.nfsExport, "expected parameter 'nfsExport' to be non-null");
            return $;
        }
    }

}
