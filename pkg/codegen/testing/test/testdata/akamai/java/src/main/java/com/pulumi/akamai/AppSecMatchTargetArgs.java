// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AppSecMatchTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecMatchTargetArgs Empty = new AppSecMatchTargetArgs();

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * JSON-formatted definition of the match target
     * 
     */
    @Import(name="matchTarget", required=true)
    private Output<String> matchTarget;

    /**
     * @return JSON-formatted definition of the match target
     * 
     */
    public Output<String> matchTarget() {
        return this.matchTarget;
    }

    private AppSecMatchTargetArgs() {}

    private AppSecMatchTargetArgs(AppSecMatchTargetArgs $) {
        this.configId = $.configId;
        this.matchTarget = $.matchTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecMatchTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecMatchTargetArgs $;

        public Builder() {
            $ = new AppSecMatchTargetArgs();
        }

        public Builder(AppSecMatchTargetArgs defaults) {
            $ = new AppSecMatchTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param matchTarget JSON-formatted definition of the match target
         * 
         * @return builder
         * 
         */
        public Builder matchTarget(Output<String> matchTarget) {
            $.matchTarget = matchTarget;
            return this;
        }

        /**
         * @param matchTarget JSON-formatted definition of the match target
         * 
         * @return builder
         * 
         */
        public Builder matchTarget(String matchTarget) {
            return matchTarget(Output.of(matchTarget));
        }

        public AppSecMatchTargetArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("AppSecMatchTargetArgs", "configId");
            }
            if ($.matchTarget == null) {
                throw new MissingRequiredPropertyException("AppSecMatchTargetArgs", "matchTarget");
            }
            return $;
        }
    }

}
