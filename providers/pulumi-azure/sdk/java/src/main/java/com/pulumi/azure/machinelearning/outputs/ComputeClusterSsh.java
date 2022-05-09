// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeClusterSsh {
    /**
     * @return Password of the administrator user account. Changing this forces a new Machine Learning Compute Cluster to be created.
     * 
     */
    private final @Nullable String adminPassword;
    /**
     * @return Name of the administrator user account which can be used to SSH to nodes. Changing this forces a new Machine Learning Compute Cluster to be created.
     * 
     */
    private final String adminUsername;
    /**
     * @return SSH public key of the administrator user account. Changing this forces a new Machine Learning Compute Cluster to be created.
     * 
     */
    private final @Nullable String keyValue;

    @CustomType.Constructor
    private ComputeClusterSsh(
        @CustomType.Parameter("adminPassword") @Nullable String adminPassword,
        @CustomType.Parameter("adminUsername") String adminUsername,
        @CustomType.Parameter("keyValue") @Nullable String keyValue) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.keyValue = keyValue;
    }

    /**
     * @return Password of the administrator user account. Changing this forces a new Machine Learning Compute Cluster to be created.
     * 
     */
    public Optional<String> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * @return Name of the administrator user account which can be used to SSH to nodes. Changing this forces a new Machine Learning Compute Cluster to be created.
     * 
     */
    public String adminUsername() {
        return this.adminUsername;
    }
    /**
     * @return SSH public key of the administrator user account. Changing this forces a new Machine Learning Compute Cluster to be created.
     * 
     */
    public Optional<String> keyValue() {
        return Optional.ofNullable(this.keyValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeClusterSsh defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private String adminUsername;
        private @Nullable String keyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeClusterSsh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.keyValue = defaults.keyValue;
        }

        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }
        public Builder keyValue(@Nullable String keyValue) {
            this.keyValue = keyValue;
            return this;
        }        public ComputeClusterSsh build() {
            return new ComputeClusterSsh(adminPassword, adminUsername, keyValue);
        }
    }
}
