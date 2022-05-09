// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs Empty = new WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs();

    /**
     * The executable to run for the `custom_action`.
     * 
     */
    @Import(name="executable", required=true)
    private Output<String> executable;

    /**
     * @return The executable to run for the `custom_action`.
     * 
     */
    public Output<String> executable() {
        return this.executable;
    }

    /**
     * The parameters to pass to the specified `executable`.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return The parameters to pass to the specified `executable`.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs() {}

    private WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs(WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs $) {
        this.executable = $.executable;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs $;

        public Builder() {
            $ = new WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs();
        }

        public Builder(WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs defaults) {
            $ = new WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executable The executable to run for the `custom_action`.
         * 
         * @return builder
         * 
         */
        public Builder executable(Output<String> executable) {
            $.executable = executable;
            return this;
        }

        /**
         * @param executable The executable to run for the `custom_action`.
         * 
         * @return builder
         * 
         */
        public Builder executable(String executable) {
            return executable(Output.of(executable));
        }

        /**
         * @param parameters The parameters to pass to the specified `executable`.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters to pass to the specified `executable`.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        public WindowsWebAppSiteConfigAutoHealSettingActionCustomActionArgs build() {
            $.executable = Objects.requireNonNull($.executable, "expected parameter 'executable' to be non-null");
            return $;
        }
    }

}
