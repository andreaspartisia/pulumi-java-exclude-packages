// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.enums.ArmUpgradeFailureAction;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policy used for monitoring the application upgrade
 * 
 */
public final class ArmRollingUpgradeMonitoringPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArmRollingUpgradeMonitoringPolicyArgs Empty = new ArmRollingUpgradeMonitoringPolicyArgs();

    /**
     * The activation Mode of the service package
     * 
     */
    @Import(name="failureAction")
    private @Nullable Output<Either<String,ArmUpgradeFailureAction>> failureAction;

    public Optional<Output<Either<String,ArmUpgradeFailureAction>>> failureAction() {
        return Optional.ofNullable(this.failureAction);
    }

    /**
     * The amount of time to retry health evaluation when the application or cluster is unhealthy before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @Import(name="healthCheckRetryTimeout")
    private @Nullable Output<String> healthCheckRetryTimeout;

    public Optional<Output<String>> healthCheckRetryTimeout() {
        return Optional.ofNullable(this.healthCheckRetryTimeout);
    }

    /**
     * The amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @Import(name="healthCheckStableDuration")
    private @Nullable Output<String> healthCheckStableDuration;

    public Optional<Output<String>> healthCheckStableDuration() {
        return Optional.ofNullable(this.healthCheckStableDuration);
    }

    /**
     * The amount of time to wait after completing an upgrade domain before applying health policies. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @Import(name="healthCheckWaitDuration")
    private @Nullable Output<String> healthCheckWaitDuration;

    public Optional<Output<String>> healthCheckWaitDuration() {
        return Optional.ofNullable(this.healthCheckWaitDuration);
    }

    /**
     * The amount of time each upgrade domain has to complete before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @Import(name="upgradeDomainTimeout")
    private @Nullable Output<String> upgradeDomainTimeout;

    public Optional<Output<String>> upgradeDomainTimeout() {
        return Optional.ofNullable(this.upgradeDomainTimeout);
    }

    /**
     * The amount of time the overall upgrade has to complete before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @Import(name="upgradeTimeout")
    private @Nullable Output<String> upgradeTimeout;

    public Optional<Output<String>> upgradeTimeout() {
        return Optional.ofNullable(this.upgradeTimeout);
    }

    private ArmRollingUpgradeMonitoringPolicyArgs() {}

    private ArmRollingUpgradeMonitoringPolicyArgs(ArmRollingUpgradeMonitoringPolicyArgs $) {
        this.failureAction = $.failureAction;
        this.healthCheckRetryTimeout = $.healthCheckRetryTimeout;
        this.healthCheckStableDuration = $.healthCheckStableDuration;
        this.healthCheckWaitDuration = $.healthCheckWaitDuration;
        this.upgradeDomainTimeout = $.upgradeDomainTimeout;
        this.upgradeTimeout = $.upgradeTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArmRollingUpgradeMonitoringPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArmRollingUpgradeMonitoringPolicyArgs $;

        public Builder() {
            $ = new ArmRollingUpgradeMonitoringPolicyArgs();
        }

        public Builder(ArmRollingUpgradeMonitoringPolicyArgs defaults) {
            $ = new ArmRollingUpgradeMonitoringPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder failureAction(@Nullable Output<Either<String,ArmUpgradeFailureAction>> failureAction) {
            $.failureAction = failureAction;
            return this;
        }

        public Builder failureAction(Either<String,ArmUpgradeFailureAction> failureAction) {
            return failureAction(Output.of(failureAction));
        }

        public Builder failureAction(String failureAction) {
            return failureAction(Either.ofLeft(failureAction));
        }

        public Builder failureAction(ArmUpgradeFailureAction failureAction) {
            return failureAction(Either.ofRight(failureAction));
        }

        public Builder healthCheckRetryTimeout(@Nullable Output<String> healthCheckRetryTimeout) {
            $.healthCheckRetryTimeout = healthCheckRetryTimeout;
            return this;
        }

        public Builder healthCheckRetryTimeout(String healthCheckRetryTimeout) {
            return healthCheckRetryTimeout(Output.of(healthCheckRetryTimeout));
        }

        public Builder healthCheckStableDuration(@Nullable Output<String> healthCheckStableDuration) {
            $.healthCheckStableDuration = healthCheckStableDuration;
            return this;
        }

        public Builder healthCheckStableDuration(String healthCheckStableDuration) {
            return healthCheckStableDuration(Output.of(healthCheckStableDuration));
        }

        public Builder healthCheckWaitDuration(@Nullable Output<String> healthCheckWaitDuration) {
            $.healthCheckWaitDuration = healthCheckWaitDuration;
            return this;
        }

        public Builder healthCheckWaitDuration(String healthCheckWaitDuration) {
            return healthCheckWaitDuration(Output.of(healthCheckWaitDuration));
        }

        public Builder upgradeDomainTimeout(@Nullable Output<String> upgradeDomainTimeout) {
            $.upgradeDomainTimeout = upgradeDomainTimeout;
            return this;
        }

        public Builder upgradeDomainTimeout(String upgradeDomainTimeout) {
            return upgradeDomainTimeout(Output.of(upgradeDomainTimeout));
        }

        public Builder upgradeTimeout(@Nullable Output<String> upgradeTimeout) {
            $.upgradeTimeout = upgradeTimeout;
            return this;
        }

        public Builder upgradeTimeout(String upgradeTimeout) {
            return upgradeTimeout(Output.of(upgradeTimeout));
        }

        public ArmRollingUpgradeMonitoringPolicyArgs build() {
            return $;
        }
    }

}
