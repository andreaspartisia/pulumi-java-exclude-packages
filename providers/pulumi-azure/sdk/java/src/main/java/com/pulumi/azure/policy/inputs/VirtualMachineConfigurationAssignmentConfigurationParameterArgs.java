// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualMachineConfigurationAssignmentConfigurationParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineConfigurationAssignmentConfigurationParameterArgs Empty = new VirtualMachineConfigurationAssignmentConfigurationParameterArgs();

    /**
     * The name of the configuration parameter to check.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the configuration parameter to check.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value to check the configuration parameter with.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value to check the configuration parameter with.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private VirtualMachineConfigurationAssignmentConfigurationParameterArgs() {}

    private VirtualMachineConfigurationAssignmentConfigurationParameterArgs(VirtualMachineConfigurationAssignmentConfigurationParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineConfigurationAssignmentConfigurationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineConfigurationAssignmentConfigurationParameterArgs $;

        public Builder() {
            $ = new VirtualMachineConfigurationAssignmentConfigurationParameterArgs();
        }

        public Builder(VirtualMachineConfigurationAssignmentConfigurationParameterArgs defaults) {
            $ = new VirtualMachineConfigurationAssignmentConfigurationParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the configuration parameter to check.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the configuration parameter to check.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value to check the configuration parameter with.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to check the configuration parameter with.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VirtualMachineConfigurationAssignmentConfigurationParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
