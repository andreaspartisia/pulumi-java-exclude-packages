// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.State;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkExperimentProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkExperimentProfileArgs Empty = new NetworkExperimentProfileArgs();

    /**
     * The state of the Experiment
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,State>> enabledState;

    public Optional<Output<Either<String,State>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Profile
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Profile identifier associated with the Tenant and Partner
     * 
     */
    @Import(name="profileName")
    private @Nullable Output<String> profileName;

    public Optional<Output<String>> profileName() {
        return Optional.ofNullable(this.profileName);
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkExperimentProfileArgs() {}

    private NetworkExperimentProfileArgs(NetworkExperimentProfileArgs $) {
        this.enabledState = $.enabledState;
        this.location = $.location;
        this.name = $.name;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkExperimentProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkExperimentProfileArgs $;

        public Builder() {
            $ = new NetworkExperimentProfileArgs();
        }

        public Builder(NetworkExperimentProfileArgs defaults) {
            $ = new NetworkExperimentProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabledState(@Nullable Output<Either<String,State>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(Either<String,State> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        public Builder enabledState(String enabledState) {
            return enabledState(Either.ofLeft(enabledState));
        }

        public Builder enabledState(State enabledState) {
            return enabledState(Either.ofRight(enabledState));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder profileName(@Nullable Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkExperimentProfileArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
