// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.SubscriptionNotificationOperation;
import io.pulumi.azurenative.providerhub.enums.SubscriptionTransitioningState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SubscriptionStateOverrideActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionStateOverrideActionArgs Empty = new SubscriptionStateOverrideActionArgs();

    @InputImport(name="action", required=true)
    private final Input<Either<String,SubscriptionNotificationOperation>> action;

    public Input<Either<String,SubscriptionNotificationOperation>> getAction() {
        return this.action;
    }

    @InputImport(name="state", required=true)
    private final Input<Either<String,SubscriptionTransitioningState>> state;

    public Input<Either<String,SubscriptionTransitioningState>> getState() {
        return this.state;
    }

    public SubscriptionStateOverrideActionArgs(
        Input<Either<String,SubscriptionNotificationOperation>> action,
        Input<Either<String,SubscriptionTransitioningState>> state) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private SubscriptionStateOverrideActionArgs() {
        this.action = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionStateOverrideActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SubscriptionNotificationOperation>> action;
        private Input<Either<String,SubscriptionTransitioningState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionStateOverrideActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
        }

        public Builder setAction(Input<Either<String,SubscriptionNotificationOperation>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(Either<String,SubscriptionNotificationOperation> action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setState(Input<Either<String,SubscriptionTransitioningState>> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(Either<String,SubscriptionTransitioningState> state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public SubscriptionStateOverrideActionArgs build() {
            return new SubscriptionStateOverrideActionArgs(action, state);
        }
    }
}