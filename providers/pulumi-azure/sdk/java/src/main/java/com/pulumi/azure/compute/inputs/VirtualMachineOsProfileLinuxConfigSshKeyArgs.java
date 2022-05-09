// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualMachineOsProfileLinuxConfigSshKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineOsProfileLinuxConfigSshKeyArgs Empty = new VirtualMachineOsProfileLinuxConfigSshKeyArgs();

    /**
     * The Public SSH Key which should be written to the `path` defined above.
     * 
     */
    @Import(name="keyData", required=true)
    private Output<String> keyData;

    /**
     * @return The Public SSH Key which should be written to the `path` defined above.
     * 
     */
    public Output<String> keyData() {
        return this.keyData;
    }

    /**
     * The path of the destination file on the virtual machine
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path of the destination file on the virtual machine
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private VirtualMachineOsProfileLinuxConfigSshKeyArgs() {}

    private VirtualMachineOsProfileLinuxConfigSshKeyArgs(VirtualMachineOsProfileLinuxConfigSshKeyArgs $) {
        this.keyData = $.keyData;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineOsProfileLinuxConfigSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineOsProfileLinuxConfigSshKeyArgs $;

        public Builder() {
            $ = new VirtualMachineOsProfileLinuxConfigSshKeyArgs();
        }

        public Builder(VirtualMachineOsProfileLinuxConfigSshKeyArgs defaults) {
            $ = new VirtualMachineOsProfileLinuxConfigSshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyData The Public SSH Key which should be written to the `path` defined above.
         * 
         * @return builder
         * 
         */
        public Builder keyData(Output<String> keyData) {
            $.keyData = keyData;
            return this;
        }

        /**
         * @param keyData The Public SSH Key which should be written to the `path` defined above.
         * 
         * @return builder
         * 
         */
        public Builder keyData(String keyData) {
            return keyData(Output.of(keyData));
        }

        /**
         * @param path The path of the destination file on the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the destination file on the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public VirtualMachineOsProfileLinuxConfigSshKeyArgs build() {
            $.keyData = Objects.requireNonNull($.keyData, "expected parameter 'keyData' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
