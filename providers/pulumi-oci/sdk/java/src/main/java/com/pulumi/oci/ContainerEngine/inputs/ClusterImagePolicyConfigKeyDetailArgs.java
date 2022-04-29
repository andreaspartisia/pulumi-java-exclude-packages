// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterImagePolicyConfigKeyDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterImagePolicyConfigKeyDetailArgs Empty = new ClusterImagePolicyConfigKeyDetailArgs();

    /**
     * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption. When used, `kubernetesVersion` must be at least `v1.13.0`.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption. When used, `kubernetesVersion` must be at least `v1.13.0`.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    private ClusterImagePolicyConfigKeyDetailArgs() {}

    private ClusterImagePolicyConfigKeyDetailArgs(ClusterImagePolicyConfigKeyDetailArgs $) {
        this.kmsKeyId = $.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterImagePolicyConfigKeyDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterImagePolicyConfigKeyDetailArgs $;

        public Builder() {
            $ = new ClusterImagePolicyConfigKeyDetailArgs();
        }

        public Builder(ClusterImagePolicyConfigKeyDetailArgs defaults) {
            $ = new ClusterImagePolicyConfigKeyDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyId The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption. When used, `kubernetesVersion` must be at least `v1.13.0`.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption. When used, `kubernetesVersion` must be at least `v1.13.0`.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public ClusterImagePolicyConfigKeyDetailArgs build() {
            return $;
        }
    }

}
