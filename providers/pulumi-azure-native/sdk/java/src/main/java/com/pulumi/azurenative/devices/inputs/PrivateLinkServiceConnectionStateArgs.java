// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.enums.PrivateLinkServiceConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable Output<String> actionsRequired;

    public Optional<Output<String>> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @Import(name="status", required=true)
    private Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

    public Output<Either<String,PrivateLinkServiceConnectionStatus>> status() {
        return this.status;
    }

    private PrivateLinkServiceConnectionStateArgs() {}

    private PrivateLinkServiceConnectionStateArgs(PrivateLinkServiceConnectionStateArgs $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateArgs $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateArgs();
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
            $ = new PrivateLinkServiceConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        public Builder actionsRequired(String actionsRequired) {
            return actionsRequired(Output.of(actionsRequired));
        }

        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder status(Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,PrivateLinkServiceConnectionStatus> status) {
            return status(Output.of(status));
        }

        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        public Builder status(PrivateLinkServiceConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
