// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetInstanceConfigurationInstanceDetailBlockVolume;
import com.pulumi.oci.Core.outputs.GetInstanceConfigurationInstanceDetailLaunchDetail;
import com.pulumi.oci.Core.outputs.GetInstanceConfigurationInstanceDetailSecondaryVnic;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceConfigurationInstanceDetail {
    private final List<GetInstanceConfigurationInstanceDetailBlockVolume> blockVolumes;
    /**
     * @return The type of instance details. Supported instanceType is compute
     * 
     */
    private final String instanceType;
    /**
     * @return Instance launch details for creating an instance from an instance configuration. Use the `sourceDetails` parameter to specify whether a boot volume or an image should be used to launch a new instance.
     * 
     */
    private final List<GetInstanceConfigurationInstanceDetailLaunchDetail> launchDetails;
    private final List<GetInstanceConfigurationInstanceDetailSecondaryVnic> secondaryVnics;

    @CustomType.Constructor
    private GetInstanceConfigurationInstanceDetail(
        @CustomType.Parameter("blockVolumes") List<GetInstanceConfigurationInstanceDetailBlockVolume> blockVolumes,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("launchDetails") List<GetInstanceConfigurationInstanceDetailLaunchDetail> launchDetails,
        @CustomType.Parameter("secondaryVnics") List<GetInstanceConfigurationInstanceDetailSecondaryVnic> secondaryVnics) {
        this.blockVolumes = blockVolumes;
        this.instanceType = instanceType;
        this.launchDetails = launchDetails;
        this.secondaryVnics = secondaryVnics;
    }

    public List<GetInstanceConfigurationInstanceDetailBlockVolume> blockVolumes() {
        return this.blockVolumes;
    }
    /**
     * @return The type of instance details. Supported instanceType is compute
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Instance launch details for creating an instance from an instance configuration. Use the `sourceDetails` parameter to specify whether a boot volume or an image should be used to launch a new instance.
     * 
     */
    public List<GetInstanceConfigurationInstanceDetailLaunchDetail> launchDetails() {
        return this.launchDetails;
    }
    public List<GetInstanceConfigurationInstanceDetailSecondaryVnic> secondaryVnics() {
        return this.secondaryVnics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfigurationInstanceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceConfigurationInstanceDetailBlockVolume> blockVolumes;
        private String instanceType;
        private List<GetInstanceConfigurationInstanceDetailLaunchDetail> launchDetails;
        private List<GetInstanceConfigurationInstanceDetailSecondaryVnic> secondaryVnics;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfigurationInstanceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockVolumes = defaults.blockVolumes;
    	      this.instanceType = defaults.instanceType;
    	      this.launchDetails = defaults.launchDetails;
    	      this.secondaryVnics = defaults.secondaryVnics;
        }

        public Builder blockVolumes(List<GetInstanceConfigurationInstanceDetailBlockVolume> blockVolumes) {
            this.blockVolumes = Objects.requireNonNull(blockVolumes);
            return this;
        }
        public Builder blockVolumes(GetInstanceConfigurationInstanceDetailBlockVolume... blockVolumes) {
            return blockVolumes(List.of(blockVolumes));
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder launchDetails(List<GetInstanceConfigurationInstanceDetailLaunchDetail> launchDetails) {
            this.launchDetails = Objects.requireNonNull(launchDetails);
            return this;
        }
        public Builder launchDetails(GetInstanceConfigurationInstanceDetailLaunchDetail... launchDetails) {
            return launchDetails(List.of(launchDetails));
        }
        public Builder secondaryVnics(List<GetInstanceConfigurationInstanceDetailSecondaryVnic> secondaryVnics) {
            this.secondaryVnics = Objects.requireNonNull(secondaryVnics);
            return this;
        }
        public Builder secondaryVnics(GetInstanceConfigurationInstanceDetailSecondaryVnic... secondaryVnics) {
            return secondaryVnics(List.of(secondaryVnics));
        }        public GetInstanceConfigurationInstanceDetail build() {
            return new GetInstanceConfigurationInstanceDetail(blockVolumes, instanceType, launchDetails, secondaryVnics);
        }
    }
}
