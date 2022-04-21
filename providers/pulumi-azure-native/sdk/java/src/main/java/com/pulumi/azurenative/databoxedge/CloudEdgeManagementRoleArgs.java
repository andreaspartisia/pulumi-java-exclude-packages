// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.enums.RoleStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudEdgeManagementRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudEdgeManagementRoleArgs Empty = new CloudEdgeManagementRoleArgs();

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Role type.
     * Expected value is &#39;CloudEdgeManagement&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role status.
     * 
     */
    @Import(name="roleStatus", required=true)
    private Output<Either<String,RoleStatus>> roleStatus;

    public Output<Either<String,RoleStatus>> roleStatus() {
        return this.roleStatus;
    }

    private CloudEdgeManagementRoleArgs() {}

    private CloudEdgeManagementRoleArgs(CloudEdgeManagementRoleArgs $) {
        this.deviceName = $.deviceName;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.roleStatus = $.roleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudEdgeManagementRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudEdgeManagementRoleArgs $;

        public Builder() {
            $ = new CloudEdgeManagementRoleArgs();
        }

        public Builder(CloudEdgeManagementRoleArgs defaults) {
            $ = new CloudEdgeManagementRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder roleStatus(Output<Either<String,RoleStatus>> roleStatus) {
            $.roleStatus = roleStatus;
            return this;
        }

        public Builder roleStatus(Either<String,RoleStatus> roleStatus) {
            return roleStatus(Output.of(roleStatus));
        }

        public Builder roleStatus(String roleStatus) {
            return roleStatus(Either.ofLeft(roleStatus));
        }

        public Builder roleStatus(RoleStatus roleStatus) {
            return roleStatus(Either.ofRight(roleStatus));
        }

        public CloudEdgeManagementRoleArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.roleStatus = Objects.requireNonNull($.roleStatus, "expected parameter 'roleStatus' to be non-null");
            return $;
        }
    }

}
