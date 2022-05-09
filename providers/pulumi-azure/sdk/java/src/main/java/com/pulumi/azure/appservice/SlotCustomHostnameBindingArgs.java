// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlotCustomHostnameBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlotCustomHostnameBindingArgs Empty = new SlotCustomHostnameBindingArgs();

    /**
     * The ID of the App Service Slot. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServiceSlotId", required=true)
    private Output<String> appServiceSlotId;

    /**
     * @return The ID of the App Service Slot. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceSlotId() {
        return this.appServiceSlotId;
    }

    /**
     * Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sslState")
    private @Nullable Output<String> sslState;

    /**
     * @return The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sslState() {
        return Optional.ofNullable(this.sslState);
    }

    /**
     * The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private SlotCustomHostnameBindingArgs() {}

    private SlotCustomHostnameBindingArgs(SlotCustomHostnameBindingArgs $) {
        this.appServiceSlotId = $.appServiceSlotId;
        this.hostname = $.hostname;
        this.sslState = $.sslState;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlotCustomHostnameBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlotCustomHostnameBindingArgs $;

        public Builder() {
            $ = new SlotCustomHostnameBindingArgs();
        }

        public Builder(SlotCustomHostnameBindingArgs defaults) {
            $ = new SlotCustomHostnameBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceSlotId The ID of the App Service Slot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceSlotId(Output<String> appServiceSlotId) {
            $.appServiceSlotId = appServiceSlotId;
            return this;
        }

        /**
         * @param appServiceSlotId The ID of the App Service Slot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceSlotId(String appServiceSlotId) {
            return appServiceSlotId(Output.of(appServiceSlotId));
        }

        /**
         * @param hostname Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param sslState The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sslState(@Nullable Output<String> sslState) {
            $.sslState = sslState;
            return this;
        }

        /**
         * @param sslState The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sslState(String sslState) {
            return sslState(Output.of(sslState));
        }

        /**
         * @param thumbprint The SSL certificate thumbprint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The SSL certificate thumbprint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public SlotCustomHostnameBindingArgs build() {
            $.appServiceSlotId = Objects.requireNonNull($.appServiceSlotId, "expected parameter 'appServiceSlotId' to be non-null");
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            return $;
        }
    }

}
