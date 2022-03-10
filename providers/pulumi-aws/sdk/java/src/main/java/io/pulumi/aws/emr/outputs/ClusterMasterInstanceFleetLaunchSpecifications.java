// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification;
import io.pulumi.aws.emr.outputs.ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterMasterInstanceFleetLaunchSpecifications {
    /**
     * Configuration block for on demand instances launch specifications.
     * 
     */
    private final @Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications;
    /**
     * Configuration block for spot instances launch specifications.
     * 
     */
    private final @Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications;

    @OutputCustomType.Constructor
    private ClusterMasterInstanceFleetLaunchSpecifications(
        @OutputCustomType.Parameter("onDemandSpecifications") @Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications,
        @OutputCustomType.Parameter("spotSpecifications") @Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    /**
     * Configuration block for on demand instances launch specifications.
     * 
    */
    public List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? List.of() : this.onDemandSpecifications;
    }
    /**
     * Configuration block for spot instances launch specifications.
     * 
    */
    public List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification> getSpotSpecifications() {
        return this.spotSpecifications == null ? List.of() : this.spotSpecifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetLaunchSpecifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications;
        private @Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetLaunchSpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder setOnDemandSpecifications(@Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        public Builder setSpotSpecifications(@Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }
        public ClusterMasterInstanceFleetLaunchSpecifications build() {
            return new ClusterMasterInstanceFleetLaunchSpecifications(onDemandSpecifications, spotSpecifications);
        }
    }
}