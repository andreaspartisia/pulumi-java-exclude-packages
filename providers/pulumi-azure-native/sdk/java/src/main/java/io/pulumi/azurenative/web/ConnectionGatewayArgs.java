// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ConnectionGatewayDefinitionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayArgs Empty = new ConnectionGatewayArgs();

    @InputImport(name="connectionGatewayName")
    private final @Nullable Input<String> connectionGatewayName;

    public Input<String> getConnectionGatewayName() {
        return this.connectionGatewayName == null ? Input.empty() : this.connectionGatewayName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties")
    private final @Nullable Input<ConnectionGatewayDefinitionPropertiesArgs> properties;

    public Input<ConnectionGatewayDefinitionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="subscriptionId")
    private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConnectionGatewayArgs(
        @Nullable Input<String> connectionGatewayName,
        @Nullable Input<String> location,
        @Nullable Input<ConnectionGatewayDefinitionPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> subscriptionId,
        @Nullable Input<Map<String,String>> tags) {
        this.connectionGatewayName = connectionGatewayName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    private ConnectionGatewayArgs() {
        this.connectionGatewayName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subscriptionId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionGatewayName;
        private @Nullable Input<String> location;
        private @Nullable Input<ConnectionGatewayDefinitionPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> subscriptionId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionGatewayName = defaults.connectionGatewayName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
        }

        public Builder setConnectionGatewayName(@Nullable Input<String> connectionGatewayName) {
            this.connectionGatewayName = connectionGatewayName;
            return this;
        }

        public Builder setConnectionGatewayName(@Nullable String connectionGatewayName) {
            this.connectionGatewayName = Input.ofNullable(connectionGatewayName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<ConnectionGatewayDefinitionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ConnectionGatewayDefinitionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ConnectionGatewayArgs build() {
            return new ConnectionGatewayArgs(connectionGatewayName, location, properties, resourceGroupName, subscriptionId, tags);
        }
    }
}