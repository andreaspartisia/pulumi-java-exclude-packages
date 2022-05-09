// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs Empty = new LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs();

    /**
     * Specifies a list of Azure Front Door IDs.
     * 
     */
    @Import(name="xAzureFdids")
    private @Nullable Output<List<String>> xAzureFdids;

    /**
     * @return Specifies a list of Azure Front Door IDs.
     * 
     */
    public Optional<Output<List<String>>> xAzureFdids() {
        return Optional.ofNullable(this.xAzureFdids);
    }

    /**
     * Specifies if a Front Door Health Probe should be expected.
     * 
     */
    @Import(name="xFdHealthProbe")
    private @Nullable Output<String> xFdHealthProbe;

    /**
     * @return Specifies if a Front Door Health Probe should be expected.
     * 
     */
    public Optional<Output<String>> xFdHealthProbe() {
        return Optional.ofNullable(this.xFdHealthProbe);
    }

    /**
     * Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
     * 
     */
    @Import(name="xForwardedFors")
    private @Nullable Output<List<String>> xForwardedFors;

    /**
     * @return Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
     * 
     */
    public Optional<Output<List<String>>> xForwardedFors() {
        return Optional.ofNullable(this.xForwardedFors);
    }

    /**
     * Specifies a list of Hosts for which matching should be applied.
     * 
     */
    @Import(name="xForwardedHosts")
    private @Nullable Output<List<String>> xForwardedHosts;

    /**
     * @return Specifies a list of Hosts for which matching should be applied.
     * 
     */
    public Optional<Output<List<String>>> xForwardedHosts() {
        return Optional.ofNullable(this.xForwardedHosts);
    }

    private LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs() {}

    private LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs(LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs $) {
        this.xAzureFdids = $.xAzureFdids;
        this.xFdHealthProbe = $.xFdHealthProbe;
        this.xForwardedFors = $.xForwardedFors;
        this.xForwardedHosts = $.xForwardedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs $;

        public Builder() {
            $ = new LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs();
        }

        public Builder(LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs defaults) {
            $ = new LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param xAzureFdids Specifies a list of Azure Front Door IDs.
         * 
         * @return builder
         * 
         */
        public Builder xAzureFdids(@Nullable Output<List<String>> xAzureFdids) {
            $.xAzureFdids = xAzureFdids;
            return this;
        }

        /**
         * @param xAzureFdids Specifies a list of Azure Front Door IDs.
         * 
         * @return builder
         * 
         */
        public Builder xAzureFdids(List<String> xAzureFdids) {
            return xAzureFdids(Output.of(xAzureFdids));
        }

        /**
         * @param xAzureFdids Specifies a list of Azure Front Door IDs.
         * 
         * @return builder
         * 
         */
        public Builder xAzureFdids(String... xAzureFdids) {
            return xAzureFdids(List.of(xAzureFdids));
        }

        /**
         * @param xFdHealthProbe Specifies if a Front Door Health Probe should be expected.
         * 
         * @return builder
         * 
         */
        public Builder xFdHealthProbe(@Nullable Output<String> xFdHealthProbe) {
            $.xFdHealthProbe = xFdHealthProbe;
            return this;
        }

        /**
         * @param xFdHealthProbe Specifies if a Front Door Health Probe should be expected.
         * 
         * @return builder
         * 
         */
        public Builder xFdHealthProbe(String xFdHealthProbe) {
            return xFdHealthProbe(Output.of(xFdHealthProbe));
        }

        /**
         * @param xForwardedFors Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedFors(@Nullable Output<List<String>> xForwardedFors) {
            $.xForwardedFors = xForwardedFors;
            return this;
        }

        /**
         * @param xForwardedFors Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedFors(List<String> xForwardedFors) {
            return xForwardedFors(Output.of(xForwardedFors));
        }

        /**
         * @param xForwardedFors Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedFors(String... xForwardedFors) {
            return xForwardedFors(List.of(xForwardedFors));
        }

        /**
         * @param xForwardedHosts Specifies a list of Hosts for which matching should be applied.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedHosts(@Nullable Output<List<String>> xForwardedHosts) {
            $.xForwardedHosts = xForwardedHosts;
            return this;
        }

        /**
         * @param xForwardedHosts Specifies a list of Hosts for which matching should be applied.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedHosts(List<String> xForwardedHosts) {
            return xForwardedHosts(Output.of(xForwardedHosts));
        }

        /**
         * @param xForwardedHosts Specifies a list of Hosts for which matching should be applied.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedHosts(String... xForwardedHosts) {
            return xForwardedHosts(List.of(xForwardedHosts));
        }

        public LinuxFunctionAppSiteConfigIpRestrictionHeadersArgs build() {
            return $;
        }
    }

}
