// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.enums.OSType;
import com.pulumi.azurenative.containerservice.enums.OpenShiftContainerServiceVMSize;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OpenShiftManagedClusterMaterPoolProfile contains configuration for OpenShift master VMs.
 * 
 */
public final class OpenShiftManagedClusterMasterPoolProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterMasterPoolProfileArgs Empty = new OpenShiftManagedClusterMasterPoolProfileArgs();

    /**
     * Number of masters (VMs) to host docker containers. The default value is 3.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    /**
     * Unique name of the master pool profile in the context of the subscription and resource group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<Either<String,OSType>> osType;

    public Optional<Output<Either<String,OSType>>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * Subnet CIDR for the peering.
     * 
     */
    @Import(name="subnetCidr")
    private @Nullable Output<String> subnetCidr;

    public Optional<Output<String>> subnetCidr() {
        return Optional.ofNullable(this.subnetCidr);
    }

    /**
     * Size of agent VMs.
     * 
     */
    @Import(name="vmSize", required=true)
    private Output<Either<String,OpenShiftContainerServiceVMSize>> vmSize;

    public Output<Either<String,OpenShiftContainerServiceVMSize>> vmSize() {
        return this.vmSize;
    }

    private OpenShiftManagedClusterMasterPoolProfileArgs() {}

    private OpenShiftManagedClusterMasterPoolProfileArgs(OpenShiftManagedClusterMasterPoolProfileArgs $) {
        this.count = $.count;
        this.name = $.name;
        this.osType = $.osType;
        this.subnetCidr = $.subnetCidr;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenShiftManagedClusterMasterPoolProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenShiftManagedClusterMasterPoolProfileArgs $;

        public Builder() {
            $ = new OpenShiftManagedClusterMasterPoolProfileArgs();
        }

        public Builder(OpenShiftManagedClusterMasterPoolProfileArgs defaults) {
            $ = new OpenShiftManagedClusterMasterPoolProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder osType(@Nullable Output<Either<String,OSType>> osType) {
            $.osType = osType;
            return this;
        }

        public Builder osType(Either<String,OSType> osType) {
            return osType(Output.of(osType));
        }

        public Builder osType(String osType) {
            return osType(Either.ofLeft(osType));
        }

        public Builder osType(OSType osType) {
            return osType(Either.ofRight(osType));
        }

        public Builder subnetCidr(@Nullable Output<String> subnetCidr) {
            $.subnetCidr = subnetCidr;
            return this;
        }

        public Builder subnetCidr(String subnetCidr) {
            return subnetCidr(Output.of(subnetCidr));
        }

        public Builder vmSize(Output<Either<String,OpenShiftContainerServiceVMSize>> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        public Builder vmSize(Either<String,OpenShiftContainerServiceVMSize> vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public Builder vmSize(String vmSize) {
            return vmSize(Either.ofLeft(vmSize));
        }

        public Builder vmSize(OpenShiftContainerServiceVMSize vmSize) {
            return vmSize(Either.ofRight(vmSize));
        }

        public OpenShiftManagedClusterMasterPoolProfileArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.vmSize = Objects.requireNonNull($.vmSize, "expected parameter 'vmSize' to be non-null");
            return $;
        }
    }

}
