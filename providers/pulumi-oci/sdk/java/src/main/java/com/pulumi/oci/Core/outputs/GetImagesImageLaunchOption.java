// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageLaunchOption {
    /**
     * @return Emulation type for the boot volume.
     * 
     */
    private final String bootVolumeType;
    /**
     * @return Firmware used to boot VM. Select the option that matches your operating system.
     * 
     */
    private final String firmware;
    /**
     * @return Whether to enable consistent volume naming feature. Defaults to false.
     * 
     */
    private final Boolean isConsistentVolumeNamingEnabled;
    /**
     * @return Deprecated. Instead use `isPvEncryptionInTransitEnabled` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/datatypes/LaunchInstanceDetails).
     * 
     */
    private final Boolean isPvEncryptionInTransitEnabled;
    /**
     * @return Emulation type for the physical network interface card (NIC).
     * 
     */
    private final String networkType;
    /**
     * @return Emulation type for volume.
     * 
     */
    private final String remoteDataVolumeType;

    @CustomType.Constructor
    private GetImagesImageLaunchOption(
        @CustomType.Parameter("bootVolumeType") String bootVolumeType,
        @CustomType.Parameter("firmware") String firmware,
        @CustomType.Parameter("isConsistentVolumeNamingEnabled") Boolean isConsistentVolumeNamingEnabled,
        @CustomType.Parameter("isPvEncryptionInTransitEnabled") Boolean isPvEncryptionInTransitEnabled,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("remoteDataVolumeType") String remoteDataVolumeType) {
        this.bootVolumeType = bootVolumeType;
        this.firmware = firmware;
        this.isConsistentVolumeNamingEnabled = isConsistentVolumeNamingEnabled;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.networkType = networkType;
        this.remoteDataVolumeType = remoteDataVolumeType;
    }

    /**
     * @return Emulation type for the boot volume.
     * 
     */
    public String bootVolumeType() {
        return this.bootVolumeType;
    }
    /**
     * @return Firmware used to boot VM. Select the option that matches your operating system.
     * 
     */
    public String firmware() {
        return this.firmware;
    }
    /**
     * @return Whether to enable consistent volume naming feature. Defaults to false.
     * 
     */
    public Boolean isConsistentVolumeNamingEnabled() {
        return this.isConsistentVolumeNamingEnabled;
    }
    /**
     * @return Deprecated. Instead use `isPvEncryptionInTransitEnabled` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/datatypes/LaunchInstanceDetails).
     * 
     */
    public Boolean isPvEncryptionInTransitEnabled() {
        return this.isPvEncryptionInTransitEnabled;
    }
    /**
     * @return Emulation type for the physical network interface card (NIC).
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return Emulation type for volume.
     * 
     */
    public String remoteDataVolumeType() {
        return this.remoteDataVolumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImageLaunchOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootVolumeType;
        private String firmware;
        private Boolean isConsistentVolumeNamingEnabled;
        private Boolean isPvEncryptionInTransitEnabled;
        private String networkType;
        private String remoteDataVolumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagesImageLaunchOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootVolumeType = defaults.bootVolumeType;
    	      this.firmware = defaults.firmware;
    	      this.isConsistentVolumeNamingEnabled = defaults.isConsistentVolumeNamingEnabled;
    	      this.isPvEncryptionInTransitEnabled = defaults.isPvEncryptionInTransitEnabled;
    	      this.networkType = defaults.networkType;
    	      this.remoteDataVolumeType = defaults.remoteDataVolumeType;
        }

        public Builder bootVolumeType(String bootVolumeType) {
            this.bootVolumeType = Objects.requireNonNull(bootVolumeType);
            return this;
        }
        public Builder firmware(String firmware) {
            this.firmware = Objects.requireNonNull(firmware);
            return this;
        }
        public Builder isConsistentVolumeNamingEnabled(Boolean isConsistentVolumeNamingEnabled) {
            this.isConsistentVolumeNamingEnabled = Objects.requireNonNull(isConsistentVolumeNamingEnabled);
            return this;
        }
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = Objects.requireNonNull(isPvEncryptionInTransitEnabled);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder remoteDataVolumeType(String remoteDataVolumeType) {
            this.remoteDataVolumeType = Objects.requireNonNull(remoteDataVolumeType);
            return this;
        }        public GetImagesImageLaunchOption build() {
            return new GetImagesImageLaunchOption(bootVolumeType, firmware, isConsistentVolumeNamingEnabled, isPvEncryptionInTransitEnabled, networkType, remoteDataVolumeType);
        }
    }
}
