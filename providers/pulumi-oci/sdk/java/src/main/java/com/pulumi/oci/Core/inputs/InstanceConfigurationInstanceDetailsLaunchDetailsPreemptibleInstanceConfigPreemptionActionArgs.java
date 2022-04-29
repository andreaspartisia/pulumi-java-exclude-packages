// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs Empty = new InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs();

    /**
     * Whether to preserve the boot volume that was used to launch the preemptible instance when the instance is terminated. Defaults to false if not specified.
     * 
     */
    @Import(name="preserveBootVolume")
    private @Nullable Output<Boolean> preserveBootVolume;

    /**
     * @return Whether to preserve the boot volume that was used to launch the preemptible instance when the instance is terminated. Defaults to false if not specified.
     * 
     */
    public Optional<Output<Boolean>> preserveBootVolume() {
        return Optional.ofNullable(this.preserveBootVolume);
    }

    /**
     * The type of action to run when the instance is interrupted for eviction.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of action to run when the instance is interrupted for eviction.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs() {}

    private InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs(InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs $) {
        this.preserveBootVolume = $.preserveBootVolume;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs $;

        public Builder() {
            $ = new InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs();
        }

        public Builder(InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs defaults) {
            $ = new InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preserveBootVolume Whether to preserve the boot volume that was used to launch the preemptible instance when the instance is terminated. Defaults to false if not specified.
         * 
         * @return builder
         * 
         */
        public Builder preserveBootVolume(@Nullable Output<Boolean> preserveBootVolume) {
            $.preserveBootVolume = preserveBootVolume;
            return this;
        }

        /**
         * @param preserveBootVolume Whether to preserve the boot volume that was used to launch the preemptible instance when the instance is terminated. Defaults to false if not specified.
         * 
         * @return builder
         * 
         */
        public Builder preserveBootVolume(Boolean preserveBootVolume) {
            return preserveBootVolume(Output.of(preserveBootVolume));
        }

        /**
         * @param type The type of action to run when the instance is interrupted for eviction.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of action to run when the instance is interrupted for eviction.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InstanceConfigurationInstanceDetailsLaunchDetailsPreemptibleInstanceConfigPreemptionActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
