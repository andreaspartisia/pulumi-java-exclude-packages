// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.inputs;

import com.pulumi.azurenative.elastic.enums.MonitoringStatus;
import com.pulumi.azurenative.elastic.enums.ProvisioningState;
import com.pulumi.azurenative.elastic.inputs.UserInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to the monitor resource.
 * 
 */
public final class MonitorPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorPropertiesArgs Empty = new MonitorPropertiesArgs();

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @Import(name="monitoringStatus")
    private @Nullable Output<Either<String,MonitoringStatus>> monitoringStatus;

    public Optional<Output<Either<String,MonitoringStatus>>> monitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }

    /**
     * Provisioning state of the monitor resource.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Optional<Output<Either<String,ProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * User information.
     * 
     */
    @Import(name="userInfo")
    private @Nullable Output<UserInfoArgs> userInfo;

    public Optional<Output<UserInfoArgs>> userInfo() {
        return Optional.ofNullable(this.userInfo);
    }

    private MonitorPropertiesArgs() {}

    private MonitorPropertiesArgs(MonitorPropertiesArgs $) {
        this.monitoringStatus = $.monitoringStatus;
        this.provisioningState = $.provisioningState;
        this.userInfo = $.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorPropertiesArgs $;

        public Builder() {
            $ = new MonitorPropertiesArgs();
        }

        public Builder(MonitorPropertiesArgs defaults) {
            $ = new MonitorPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder monitoringStatus(@Nullable Output<Either<String,MonitoringStatus>> monitoringStatus) {
            $.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder monitoringStatus(Either<String,MonitoringStatus> monitoringStatus) {
            return monitoringStatus(Output.of(monitoringStatus));
        }

        public Builder monitoringStatus(String monitoringStatus) {
            return monitoringStatus(Either.ofLeft(monitoringStatus));
        }

        public Builder monitoringStatus(MonitoringStatus monitoringStatus) {
            return monitoringStatus(Either.ofRight(monitoringStatus));
        }

        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(Either<String,ProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        public Builder provisioningState(ProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        public Builder userInfo(@Nullable Output<UserInfoArgs> userInfo) {
            $.userInfo = userInfo;
            return this;
        }

        public Builder userInfo(UserInfoArgs userInfo) {
            return userInfo(Output.of(userInfo));
        }

        public MonitorPropertiesArgs build() {
            return $;
        }
    }

}
