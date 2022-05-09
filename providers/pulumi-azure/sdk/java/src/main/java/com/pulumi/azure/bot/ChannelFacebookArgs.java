// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelFacebookArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelFacebookArgs Empty = new ChannelFacebookArgs();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }

    /**
     * The Facebook Application ID for the Facebook Channel.
     * 
     */
    @Import(name="facebookApplicationId", required=true)
    private Output<String> facebookApplicationId;

    /**
     * @return The Facebook Application ID for the Facebook Channel.
     * 
     */
    public Output<String> facebookApplicationId() {
        return this.facebookApplicationId;
    }

    /**
     * The Facebook Application Secret for the Facebook Channel.
     * 
     */
    @Import(name="facebookApplicationSecret", required=true)
    private Output<String> facebookApplicationSecret;

    /**
     * @return The Facebook Application Secret for the Facebook Channel.
     * 
     */
    public Output<String> facebookApplicationSecret() {
        return this.facebookApplicationSecret;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * One or more `page` blocks as defined below.
     * 
     */
    @Import(name="pages", required=true)
    private Output<List<ChannelFacebookPageArgs>> pages;

    /**
     * @return One or more `page` blocks as defined below.
     * 
     */
    public Output<List<ChannelFacebookPageArgs>> pages() {
        return this.pages;
    }

    /**
     * The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ChannelFacebookArgs() {}

    private ChannelFacebookArgs(ChannelFacebookArgs $) {
        this.botName = $.botName;
        this.facebookApplicationId = $.facebookApplicationId;
        this.facebookApplicationSecret = $.facebookApplicationSecret;
        this.location = $.location;
        this.pages = $.pages;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelFacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelFacebookArgs $;

        public Builder() {
            $ = new ChannelFacebookArgs();
        }

        public Builder(ChannelFacebookArgs defaults) {
            $ = new ChannelFacebookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param facebookApplicationId The Facebook Application ID for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationId(Output<String> facebookApplicationId) {
            $.facebookApplicationId = facebookApplicationId;
            return this;
        }

        /**
         * @param facebookApplicationId The Facebook Application ID for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationId(String facebookApplicationId) {
            return facebookApplicationId(Output.of(facebookApplicationId));
        }

        /**
         * @param facebookApplicationSecret The Facebook Application Secret for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationSecret(Output<String> facebookApplicationSecret) {
            $.facebookApplicationSecret = facebookApplicationSecret;
            return this;
        }

        /**
         * @param facebookApplicationSecret The Facebook Application Secret for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationSecret(String facebookApplicationSecret) {
            return facebookApplicationSecret(Output.of(facebookApplicationSecret));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param pages One or more `page` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pages(Output<List<ChannelFacebookPageArgs>> pages) {
            $.pages = pages;
            return this;
        }

        /**
         * @param pages One or more `page` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pages(List<ChannelFacebookPageArgs> pages) {
            return pages(Output.of(pages));
        }

        /**
         * @param pages One or more `page` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pages(ChannelFacebookPageArgs... pages) {
            return pages(List.of(pages));
        }

        /**
         * @param resourceGroupName The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ChannelFacebookArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.facebookApplicationId = Objects.requireNonNull($.facebookApplicationId, "expected parameter 'facebookApplicationId' to be non-null");
            $.facebookApplicationSecret = Objects.requireNonNull($.facebookApplicationSecret, "expected parameter 'facebookApplicationSecret' to be non-null");
            $.pages = Objects.requireNonNull($.pages, "expected parameter 'pages' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
