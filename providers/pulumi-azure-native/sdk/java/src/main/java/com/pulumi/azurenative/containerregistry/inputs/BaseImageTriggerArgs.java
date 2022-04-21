// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.BaseImageTriggerType;
import com.pulumi.azurenative.containerregistry.enums.TriggerStatus;
import com.pulumi.azurenative.containerregistry.enums.UpdateTriggerPayloadType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The trigger based on base image dependency.
 * 
 */
public final class BaseImageTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaseImageTriggerArgs Empty = new BaseImageTriggerArgs();

    /**
     * The type of the auto trigger for base image dependency updates.
     * 
     */
    @Import(name="baseImageTriggerType", required=true)
    private Output<Either<String,BaseImageTriggerType>> baseImageTriggerType;

    public Output<Either<String,BaseImageTriggerType>> baseImageTriggerType() {
        return this.baseImageTriggerType;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The current status of trigger.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,TriggerStatus>> status;

    public Optional<Output<Either<String,TriggerStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The endpoint URL for receiving update triggers.
     * 
     */
    @Import(name="updateTriggerEndpoint")
    private @Nullable Output<String> updateTriggerEndpoint;

    public Optional<Output<String>> updateTriggerEndpoint() {
        return Optional.ofNullable(this.updateTriggerEndpoint);
    }

    /**
     * Type of Payload body for Base image update triggers.
     * 
     */
    @Import(name="updateTriggerPayloadType")
    private @Nullable Output<Either<String,UpdateTriggerPayloadType>> updateTriggerPayloadType;

    public Optional<Output<Either<String,UpdateTriggerPayloadType>>> updateTriggerPayloadType() {
        return Optional.ofNullable(this.updateTriggerPayloadType);
    }

    private BaseImageTriggerArgs() {}

    private BaseImageTriggerArgs(BaseImageTriggerArgs $) {
        this.baseImageTriggerType = $.baseImageTriggerType;
        this.name = $.name;
        this.status = $.status;
        this.updateTriggerEndpoint = $.updateTriggerEndpoint;
        this.updateTriggerPayloadType = $.updateTriggerPayloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseImageTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseImageTriggerArgs $;

        public Builder() {
            $ = new BaseImageTriggerArgs();
        }

        public Builder(BaseImageTriggerArgs defaults) {
            $ = new BaseImageTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseImageTriggerType(Output<Either<String,BaseImageTriggerType>> baseImageTriggerType) {
            $.baseImageTriggerType = baseImageTriggerType;
            return this;
        }

        public Builder baseImageTriggerType(Either<String,BaseImageTriggerType> baseImageTriggerType) {
            return baseImageTriggerType(Output.of(baseImageTriggerType));
        }

        public Builder baseImageTriggerType(String baseImageTriggerType) {
            return baseImageTriggerType(Either.ofLeft(baseImageTriggerType));
        }

        public Builder baseImageTriggerType(BaseImageTriggerType baseImageTriggerType) {
            return baseImageTriggerType(Either.ofRight(baseImageTriggerType));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder status(@Nullable Output<Either<String,TriggerStatus>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,TriggerStatus> status) {
            return status(Output.of(status));
        }

        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        public Builder status(TriggerStatus status) {
            return status(Either.ofRight(status));
        }

        public Builder updateTriggerEndpoint(@Nullable Output<String> updateTriggerEndpoint) {
            $.updateTriggerEndpoint = updateTriggerEndpoint;
            return this;
        }

        public Builder updateTriggerEndpoint(String updateTriggerEndpoint) {
            return updateTriggerEndpoint(Output.of(updateTriggerEndpoint));
        }

        public Builder updateTriggerPayloadType(@Nullable Output<Either<String,UpdateTriggerPayloadType>> updateTriggerPayloadType) {
            $.updateTriggerPayloadType = updateTriggerPayloadType;
            return this;
        }

        public Builder updateTriggerPayloadType(Either<String,UpdateTriggerPayloadType> updateTriggerPayloadType) {
            return updateTriggerPayloadType(Output.of(updateTriggerPayloadType));
        }

        public Builder updateTriggerPayloadType(String updateTriggerPayloadType) {
            return updateTriggerPayloadType(Either.ofLeft(updateTriggerPayloadType));
        }

        public Builder updateTriggerPayloadType(UpdateTriggerPayloadType updateTriggerPayloadType) {
            return updateTriggerPayloadType(Either.ofRight(updateTriggerPayloadType));
        }

        public BaseImageTriggerArgs build() {
            $.baseImageTriggerType = Objects.requireNonNull($.baseImageTriggerType, "expected parameter 'baseImageTriggerType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.status = Codegen.stringProp("status").left(TriggerStatus.class).output().arg($.status).def("Enabled").getNullable();
            return $;
        }
    }

}
