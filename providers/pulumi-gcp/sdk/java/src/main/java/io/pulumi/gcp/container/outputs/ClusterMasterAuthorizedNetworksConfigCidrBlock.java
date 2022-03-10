// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterMasterAuthorizedNetworksConfigCidrBlock {
    /**
     * External network that can access Kubernetes master through HTTPS.
     * Must be specified in CIDR notation.
     * 
     */
    private final String cidrBlock;
    /**
     * Field for users to identify CIDR blocks.
     * 
     */
    private final @Nullable String displayName;

    @OutputCustomType.Constructor
    private ClusterMasterAuthorizedNetworksConfigCidrBlock(
        @OutputCustomType.Parameter("cidrBlock") String cidrBlock,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName) {
        this.cidrBlock = cidrBlock;
        this.displayName = displayName;
    }

    /**
     * External network that can access Kubernetes master through HTTPS.
     * Must be specified in CIDR notation.
     * 
    */
    public String getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * Field for users to identify CIDR blocks.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthorizedNetworksConfigCidrBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private @Nullable String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthorizedNetworksConfigCidrBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public ClusterMasterAuthorizedNetworksConfigCidrBlock build() {
            return new ClusterMasterAuthorizedNetworksConfigCidrBlock(cidrBlock, displayName);
        }
    }
}
