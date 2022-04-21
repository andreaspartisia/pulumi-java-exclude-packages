// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.eventgrid.enums.ResourceProvisioningState;
import com.pulumi.azurenative.eventgrid.inputs.ConnectionStateArgs;
import com.pulumi.azurenative.eventgrid.inputs.PrivateEndpointArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * GroupIds from the private link service resource.
     * 
     */
    @Import(name="groupIds")
    private @Nullable Output<List<String>> groupIds;

    public Optional<Output<List<String>>> groupIds() {
        return Optional.ofNullable(this.groupIds);
    }

    /**
     * The name of the parent resource (namely, either, the topic name or domain name).
     * 
     */
    @Import(name="parentName", required=true)
    private Output<String> parentName;

    public Output<String> parentName() {
        return this.parentName;
    }

    /**
     * The type of the parent resource. This can be either \&#39;topics\&#39; or \&#39;domains\&#39;.
     * 
     */
    @Import(name="parentType", required=true)
    private Output<String> parentType;

    public Output<String> parentType() {
        return this.parentType;
    }

    /**
     * The Private Endpoint resource for this Connection.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    public Optional<Output<PrivateEndpointArgs>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * The name of the private endpoint connection connection.
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * Details about the state of the connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState;

    public Optional<Output<ConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ResourceProvisioningState>> provisioningState;

    public Optional<Output<Either<String,ResourceProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.groupIds = $.groupIds;
        this.parentName = $.parentName;
        this.parentType = $.parentType;
        this.privateEndpoint = $.privateEndpoint;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        public Builder parentName(Output<String> parentName) {
            $.parentName = parentName;
            return this;
        }

        public Builder parentName(String parentName) {
            return parentName(Output.of(parentName));
        }

        public Builder parentType(Output<String> parentType) {
            $.parentType = parentType;
            return this;
        }

        public Builder parentType(String parentType) {
            return parentType(Output.of(parentType));
        }

        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateEndpoint(PrivateEndpointArgs privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        public Builder privateLinkServiceConnectionState(@Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(ConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        public Builder provisioningState(@Nullable Output<Either<String,ResourceProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(Either<String,ResourceProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        public Builder provisioningState(ResourceProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public PrivateEndpointConnectionArgs build() {
            $.parentName = Objects.requireNonNull($.parentName, "expected parameter 'parentName' to be non-null");
            $.parentType = Objects.requireNonNull($.parentType, "expected parameter 'parentType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
