// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.LicenseType;
import com.pulumi.azurenative.recoveryservices.inputs.InMageRcmDiskInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.InMageRcmDisksDefaultInputArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InMageRcm specific enable protection input.
 * 
 */
public final class InMageRcmEnableProtectionInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final InMageRcmEnableProtectionInputArgs Empty = new InMageRcmEnableProtectionInputArgs();

    /**
     * The default disk input.
     * 
     */
    @Import(name="disksDefault")
    private @Nullable Output<InMageRcmDisksDefaultInputArgs> disksDefault;

    public Optional<Output<InMageRcmDisksDefaultInputArgs>> disksDefault() {
        return Optional.ofNullable(this.disksDefault);
    }

    /**
     * The disks to include list.
     * 
     */
    @Import(name="disksToInclude")
    private @Nullable Output<List<InMageRcmDiskInputArgs>> disksToInclude;

    public Optional<Output<List<InMageRcmDiskInputArgs>>> disksToInclude() {
        return Optional.ofNullable(this.disksToInclude);
    }

    /**
     * The ARM Id of discovered machine.
     * 
     */
    @Import(name="fabricDiscoveryMachineId")
    private @Nullable Output<String> fabricDiscoveryMachineId;

    public Optional<Output<String>> fabricDiscoveryMachineId() {
        return Optional.ofNullable(this.fabricDiscoveryMachineId);
    }

    /**
     * The class type.
     * Expected value is &#39;InMageRcm&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The license type.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,LicenseType>> licenseType;

    public Optional<Output<Either<String,LicenseType>>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * The multi VM group name.
     * 
     */
    @Import(name="multiVmGroupName")
    private @Nullable Output<String> multiVmGroupName;

    public Optional<Output<String>> multiVmGroupName() {
        return Optional.ofNullable(this.multiVmGroupName);
    }

    /**
     * The process server Id.
     * 
     */
    @Import(name="processServerId")
    private @Nullable Output<String> processServerId;

    public Optional<Output<String>> processServerId() {
        return Optional.ofNullable(this.processServerId);
    }

    /**
     * The run-as account Id.
     * 
     */
    @Import(name="runAsAccountId")
    private @Nullable Output<String> runAsAccountId;

    public Optional<Output<String>> runAsAccountId() {
        return Optional.ofNullable(this.runAsAccountId);
    }

    /**
     * The target availability set ARM Id.
     * 
     */
    @Import(name="targetAvailabilitySetId")
    private @Nullable Output<String> targetAvailabilitySetId;

    public Optional<Output<String>> targetAvailabilitySetId() {
        return Optional.ofNullable(this.targetAvailabilitySetId);
    }

    /**
     * The target availability zone.
     * 
     */
    @Import(name="targetAvailabilityZone")
    private @Nullable Output<String> targetAvailabilityZone;

    public Optional<Output<String>> targetAvailabilityZone() {
        return Optional.ofNullable(this.targetAvailabilityZone);
    }

    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    @Import(name="targetBootDiagnosticsStorageAccountId")
    private @Nullable Output<String> targetBootDiagnosticsStorageAccountId;

    public Optional<Output<String>> targetBootDiagnosticsStorageAccountId() {
        return Optional.ofNullable(this.targetBootDiagnosticsStorageAccountId);
    }

    /**
     * The selected target network ARM Id.
     * 
     */
    @Import(name="targetNetworkId")
    private @Nullable Output<String> targetNetworkId;

    public Optional<Output<String>> targetNetworkId() {
        return Optional.ofNullable(this.targetNetworkId);
    }

    /**
     * The target proximity placement group Id.
     * 
     */
    @Import(name="targetProximityPlacementGroupId")
    private @Nullable Output<String> targetProximityPlacementGroupId;

    public Optional<Output<String>> targetProximityPlacementGroupId() {
        return Optional.ofNullable(this.targetProximityPlacementGroupId);
    }

    /**
     * The target resource group ARM Id.
     * 
     */
    @Import(name="targetResourceGroupId")
    private @Nullable Output<String> targetResourceGroupId;

    public Optional<Output<String>> targetResourceGroupId() {
        return Optional.ofNullable(this.targetResourceGroupId);
    }

    /**
     * The selected target subnet name.
     * 
     */
    @Import(name="targetSubnetName")
    private @Nullable Output<String> targetSubnetName;

    public Optional<Output<String>> targetSubnetName() {
        return Optional.ofNullable(this.targetSubnetName);
    }

    /**
     * The target VM name.
     * 
     */
    @Import(name="targetVmName")
    private @Nullable Output<String> targetVmName;

    public Optional<Output<String>> targetVmName() {
        return Optional.ofNullable(this.targetVmName);
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize")
    private @Nullable Output<String> targetVmSize;

    public Optional<Output<String>> targetVmSize() {
        return Optional.ofNullable(this.targetVmSize);
    }

    /**
     * The selected test network ARM Id.
     * 
     */
    @Import(name="testNetworkId")
    private @Nullable Output<String> testNetworkId;

    public Optional<Output<String>> testNetworkId() {
        return Optional.ofNullable(this.testNetworkId);
    }

    /**
     * The selected test subnet name.
     * 
     */
    @Import(name="testSubnetName")
    private @Nullable Output<String> testSubnetName;

    public Optional<Output<String>> testSubnetName() {
        return Optional.ofNullable(this.testSubnetName);
    }

    private InMageRcmEnableProtectionInputArgs() {}

    private InMageRcmEnableProtectionInputArgs(InMageRcmEnableProtectionInputArgs $) {
        this.disksDefault = $.disksDefault;
        this.disksToInclude = $.disksToInclude;
        this.fabricDiscoveryMachineId = $.fabricDiscoveryMachineId;
        this.instanceType = $.instanceType;
        this.licenseType = $.licenseType;
        this.multiVmGroupName = $.multiVmGroupName;
        this.processServerId = $.processServerId;
        this.runAsAccountId = $.runAsAccountId;
        this.targetAvailabilitySetId = $.targetAvailabilitySetId;
        this.targetAvailabilityZone = $.targetAvailabilityZone;
        this.targetBootDiagnosticsStorageAccountId = $.targetBootDiagnosticsStorageAccountId;
        this.targetNetworkId = $.targetNetworkId;
        this.targetProximityPlacementGroupId = $.targetProximityPlacementGroupId;
        this.targetResourceGroupId = $.targetResourceGroupId;
        this.targetSubnetName = $.targetSubnetName;
        this.targetVmName = $.targetVmName;
        this.targetVmSize = $.targetVmSize;
        this.testNetworkId = $.testNetworkId;
        this.testSubnetName = $.testSubnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageRcmEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageRcmEnableProtectionInputArgs $;

        public Builder() {
            $ = new InMageRcmEnableProtectionInputArgs();
        }

        public Builder(InMageRcmEnableProtectionInputArgs defaults) {
            $ = new InMageRcmEnableProtectionInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder disksDefault(@Nullable Output<InMageRcmDisksDefaultInputArgs> disksDefault) {
            $.disksDefault = disksDefault;
            return this;
        }

        public Builder disksDefault(InMageRcmDisksDefaultInputArgs disksDefault) {
            return disksDefault(Output.of(disksDefault));
        }

        public Builder disksToInclude(@Nullable Output<List<InMageRcmDiskInputArgs>> disksToInclude) {
            $.disksToInclude = disksToInclude;
            return this;
        }

        public Builder disksToInclude(List<InMageRcmDiskInputArgs> disksToInclude) {
            return disksToInclude(Output.of(disksToInclude));
        }

        public Builder disksToInclude(InMageRcmDiskInputArgs... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }

        public Builder fabricDiscoveryMachineId(@Nullable Output<String> fabricDiscoveryMachineId) {
            $.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
            return this;
        }

        public Builder fabricDiscoveryMachineId(String fabricDiscoveryMachineId) {
            return fabricDiscoveryMachineId(Output.of(fabricDiscoveryMachineId));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder licenseType(@Nullable Output<Either<String,LicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        public Builder licenseType(Either<String,LicenseType> licenseType) {
            return licenseType(Output.of(licenseType));
        }

        public Builder licenseType(String licenseType) {
            return licenseType(Either.ofLeft(licenseType));
        }

        public Builder licenseType(LicenseType licenseType) {
            return licenseType(Either.ofRight(licenseType));
        }

        public Builder multiVmGroupName(@Nullable Output<String> multiVmGroupName) {
            $.multiVmGroupName = multiVmGroupName;
            return this;
        }

        public Builder multiVmGroupName(String multiVmGroupName) {
            return multiVmGroupName(Output.of(multiVmGroupName));
        }

        public Builder processServerId(@Nullable Output<String> processServerId) {
            $.processServerId = processServerId;
            return this;
        }

        public Builder processServerId(String processServerId) {
            return processServerId(Output.of(processServerId));
        }

        public Builder runAsAccountId(@Nullable Output<String> runAsAccountId) {
            $.runAsAccountId = runAsAccountId;
            return this;
        }

        public Builder runAsAccountId(String runAsAccountId) {
            return runAsAccountId(Output.of(runAsAccountId));
        }

        public Builder targetAvailabilitySetId(@Nullable Output<String> targetAvailabilitySetId) {
            $.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder targetAvailabilitySetId(String targetAvailabilitySetId) {
            return targetAvailabilitySetId(Output.of(targetAvailabilitySetId));
        }

        public Builder targetAvailabilityZone(@Nullable Output<String> targetAvailabilityZone) {
            $.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder targetAvailabilityZone(String targetAvailabilityZone) {
            return targetAvailabilityZone(Output.of(targetAvailabilityZone));
        }

        public Builder targetBootDiagnosticsStorageAccountId(@Nullable Output<String> targetBootDiagnosticsStorageAccountId) {
            $.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }

        public Builder targetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
            return targetBootDiagnosticsStorageAccountId(Output.of(targetBootDiagnosticsStorageAccountId));
        }

        public Builder targetNetworkId(@Nullable Output<String> targetNetworkId) {
            $.targetNetworkId = targetNetworkId;
            return this;
        }

        public Builder targetNetworkId(String targetNetworkId) {
            return targetNetworkId(Output.of(targetNetworkId));
        }

        public Builder targetProximityPlacementGroupId(@Nullable Output<String> targetProximityPlacementGroupId) {
            $.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }

        public Builder targetProximityPlacementGroupId(String targetProximityPlacementGroupId) {
            return targetProximityPlacementGroupId(Output.of(targetProximityPlacementGroupId));
        }

        public Builder targetResourceGroupId(@Nullable Output<String> targetResourceGroupId) {
            $.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        public Builder targetResourceGroupId(String targetResourceGroupId) {
            return targetResourceGroupId(Output.of(targetResourceGroupId));
        }

        public Builder targetSubnetName(@Nullable Output<String> targetSubnetName) {
            $.targetSubnetName = targetSubnetName;
            return this;
        }

        public Builder targetSubnetName(String targetSubnetName) {
            return targetSubnetName(Output.of(targetSubnetName));
        }

        public Builder targetVmName(@Nullable Output<String> targetVmName) {
            $.targetVmName = targetVmName;
            return this;
        }

        public Builder targetVmName(String targetVmName) {
            return targetVmName(Output.of(targetVmName));
        }

        public Builder targetVmSize(@Nullable Output<String> targetVmSize) {
            $.targetVmSize = targetVmSize;
            return this;
        }

        public Builder targetVmSize(String targetVmSize) {
            return targetVmSize(Output.of(targetVmSize));
        }

        public Builder testNetworkId(@Nullable Output<String> testNetworkId) {
            $.testNetworkId = testNetworkId;
            return this;
        }

        public Builder testNetworkId(String testNetworkId) {
            return testNetworkId(Output.of(testNetworkId));
        }

        public Builder testSubnetName(@Nullable Output<String> testSubnetName) {
            $.testSubnetName = testSubnetName;
            return this;
        }

        public Builder testSubnetName(String testSubnetName) {
            return testSubnetName(Output.of(testSubnetName));
        }

        public InMageRcmEnableProtectionInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            return $;
        }
    }

}
