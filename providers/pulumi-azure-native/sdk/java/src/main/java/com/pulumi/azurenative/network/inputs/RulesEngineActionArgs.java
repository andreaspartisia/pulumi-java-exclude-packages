// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ForwardingConfigurationArgs;
import com.pulumi.azurenative.network.inputs.HeaderActionArgs;
import com.pulumi.azurenative.network.inputs.RedirectConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * One or more actions that will execute, modifying the request and/or response.
 * 
 */
public final class RulesEngineActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesEngineActionArgs Empty = new RulesEngineActionArgs();

    /**
     * A list of header actions to apply from the request from AFD to the origin.
     * 
     */
    @Import(name="requestHeaderActions")
    private @Nullable Output<List<HeaderActionArgs>> requestHeaderActions;

    public Optional<Output<List<HeaderActionArgs>>> requestHeaderActions() {
        return Optional.ofNullable(this.requestHeaderActions);
    }

    /**
     * A list of header actions to apply from the response from AFD to the client.
     * 
     */
    @Import(name="responseHeaderActions")
    private @Nullable Output<List<HeaderActionArgs>> responseHeaderActions;

    public Optional<Output<List<HeaderActionArgs>>> responseHeaderActions() {
        return Optional.ofNullable(this.responseHeaderActions);
    }

    /**
     * Override the route configuration.
     * 
     */
    @Import(name="routeConfigurationOverride")
    private @Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride;

    public Optional<Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>>> routeConfigurationOverride() {
        return Optional.ofNullable(this.routeConfigurationOverride);
    }

    private RulesEngineActionArgs() {}

    private RulesEngineActionArgs(RulesEngineActionArgs $) {
        this.requestHeaderActions = $.requestHeaderActions;
        this.responseHeaderActions = $.responseHeaderActions;
        this.routeConfigurationOverride = $.routeConfigurationOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesEngineActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesEngineActionArgs $;

        public Builder() {
            $ = new RulesEngineActionArgs();
        }

        public Builder(RulesEngineActionArgs defaults) {
            $ = new RulesEngineActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder requestHeaderActions(@Nullable Output<List<HeaderActionArgs>> requestHeaderActions) {
            $.requestHeaderActions = requestHeaderActions;
            return this;
        }

        public Builder requestHeaderActions(List<HeaderActionArgs> requestHeaderActions) {
            return requestHeaderActions(Output.of(requestHeaderActions));
        }

        public Builder requestHeaderActions(HeaderActionArgs... requestHeaderActions) {
            return requestHeaderActions(List.of(requestHeaderActions));
        }

        public Builder responseHeaderActions(@Nullable Output<List<HeaderActionArgs>> responseHeaderActions) {
            $.responseHeaderActions = responseHeaderActions;
            return this;
        }

        public Builder responseHeaderActions(List<HeaderActionArgs> responseHeaderActions) {
            return responseHeaderActions(Output.of(responseHeaderActions));
        }

        public Builder responseHeaderActions(HeaderActionArgs... responseHeaderActions) {
            return responseHeaderActions(List.of(responseHeaderActions));
        }

        public Builder routeConfigurationOverride(@Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride) {
            $.routeConfigurationOverride = routeConfigurationOverride;
            return this;
        }

        public Builder routeConfigurationOverride(Either<ForwardingConfigurationArgs,RedirectConfigurationArgs> routeConfigurationOverride) {
            return routeConfigurationOverride(Output.of(routeConfigurationOverride));
        }

        public Builder routeConfigurationOverride(ForwardingConfigurationArgs routeConfigurationOverride) {
            return routeConfigurationOverride(Either.ofLeft(routeConfigurationOverride));
        }

        public Builder routeConfigurationOverride(RedirectConfigurationArgs routeConfigurationOverride) {
            return routeConfigurationOverride(Either.ofRight(routeConfigurationOverride));
        }

        public RulesEngineActionArgs build() {
            return $;
        }
    }

}
