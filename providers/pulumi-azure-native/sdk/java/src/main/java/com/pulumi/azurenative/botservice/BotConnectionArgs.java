// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice;

import com.pulumi.azurenative.botservice.enums.Kind;
import com.pulumi.azurenative.botservice.inputs.ConnectionSettingPropertiesArgs;
import com.pulumi.azurenative.botservice.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotConnectionArgs Empty = new BotConnectionArgs();

    /**
     * The name of the Bot Service Connection Setting resource.
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Required. Gets or sets the Kind of the resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Either<String,Kind>> kind;

    public Optional<Output<Either<String,Kind>>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to bot channel resource
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ConnectionSettingPropertiesArgs> properties;

    public Optional<Output<ConnectionSettingPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the Bot resource group in the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Bot resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BotConnectionArgs() {}

    private BotConnectionArgs(BotConnectionArgs $) {
        this.connectionName = $.connectionName;
        this.kind = $.kind;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotConnectionArgs $;

        public Builder() {
            $ = new BotConnectionArgs();
        }

        public Builder(BotConnectionArgs defaults) {
            $ = new BotConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        public Builder kind(@Nullable Output<Either<String,Kind>> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(Either<String,Kind> kind) {
            return kind(Output.of(kind));
        }

        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        public Builder kind(Kind kind) {
            return kind(Either.ofRight(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(@Nullable Output<ConnectionSettingPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(ConnectionSettingPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BotConnectionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
