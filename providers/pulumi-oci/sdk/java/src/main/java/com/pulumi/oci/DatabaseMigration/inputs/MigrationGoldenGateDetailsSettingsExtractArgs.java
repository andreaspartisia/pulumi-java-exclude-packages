// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationGoldenGateDetailsSettingsExtractArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrationGoldenGateDetailsSettingsExtractArgs Empty = new MigrationGoldenGateDetailsSettingsExtractArgs();

    /**
     * (Updatable) Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running. If not specified, Extract will not generate a warning on long-running transactions.
     * 
     */
    @Import(name="longTransDuration")
    private @Nullable Output<Integer> longTransDuration;

    /**
     * @return (Updatable) Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running. If not specified, Extract will not generate a warning on long-running transactions.
     * 
     */
    public Optional<Output<Integer>> longTransDuration() {
        return Optional.ofNullable(this.longTransDuration);
    }

    /**
     * (Updatable) Extract performance.
     * 
     */
    @Import(name="performanceProfile")
    private @Nullable Output<String> performanceProfile;

    /**
     * @return (Updatable) Extract performance.
     * 
     */
    public Optional<Output<String>> performanceProfile() {
        return Optional.ofNullable(this.performanceProfile);
    }

    private MigrationGoldenGateDetailsSettingsExtractArgs() {}

    private MigrationGoldenGateDetailsSettingsExtractArgs(MigrationGoldenGateDetailsSettingsExtractArgs $) {
        this.longTransDuration = $.longTransDuration;
        this.performanceProfile = $.performanceProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationGoldenGateDetailsSettingsExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationGoldenGateDetailsSettingsExtractArgs $;

        public Builder() {
            $ = new MigrationGoldenGateDetailsSettingsExtractArgs();
        }

        public Builder(MigrationGoldenGateDetailsSettingsExtractArgs defaults) {
            $ = new MigrationGoldenGateDetailsSettingsExtractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param longTransDuration (Updatable) Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running. If not specified, Extract will not generate a warning on long-running transactions.
         * 
         * @return builder
         * 
         */
        public Builder longTransDuration(@Nullable Output<Integer> longTransDuration) {
            $.longTransDuration = longTransDuration;
            return this;
        }

        /**
         * @param longTransDuration (Updatable) Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running. If not specified, Extract will not generate a warning on long-running transactions.
         * 
         * @return builder
         * 
         */
        public Builder longTransDuration(Integer longTransDuration) {
            return longTransDuration(Output.of(longTransDuration));
        }

        /**
         * @param performanceProfile (Updatable) Extract performance.
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(@Nullable Output<String> performanceProfile) {
            $.performanceProfile = performanceProfile;
            return this;
        }

        /**
         * @param performanceProfile (Updatable) Extract performance.
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(String performanceProfile) {
            return performanceProfile(Output.of(performanceProfile));
        }

        public MigrationGoldenGateDetailsSettingsExtractArgs build() {
            return $;
        }
    }

}
