// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.DataBindingMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputDataBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputDataBindingArgs Empty = new OutputDataBindingArgs();

    /**
     * ARM resource ID of the datastore where the data output will be stored.
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * Mechanism for data movement to datastore.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,DataBindingMode>> mode;

    public Optional<Output<Either<String,DataBindingMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Location of data inside the container process.
     * 
     */
    @Import(name="pathOnCompute")
    private @Nullable Output<String> pathOnCompute;

    public Optional<Output<String>> pathOnCompute() {
        return Optional.ofNullable(this.pathOnCompute);
    }

    /**
     * Path within the datastore to the data.
     * 
     */
    @Import(name="pathOnDatastore")
    private @Nullable Output<String> pathOnDatastore;

    public Optional<Output<String>> pathOnDatastore() {
        return Optional.ofNullable(this.pathOnDatastore);
    }

    private OutputDataBindingArgs() {}

    private OutputDataBindingArgs(OutputDataBindingArgs $) {
        this.datastoreId = $.datastoreId;
        this.mode = $.mode;
        this.pathOnCompute = $.pathOnCompute;
        this.pathOnDatastore = $.pathOnDatastore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputDataBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputDataBindingArgs $;

        public Builder() {
            $ = new OutputDataBindingArgs();
        }

        public Builder(OutputDataBindingArgs defaults) {
            $ = new OutputDataBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        public Builder mode(@Nullable Output<Either<String,DataBindingMode>> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(Either<String,DataBindingMode> mode) {
            return mode(Output.of(mode));
        }

        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        public Builder mode(DataBindingMode mode) {
            return mode(Either.ofRight(mode));
        }

        public Builder pathOnCompute(@Nullable Output<String> pathOnCompute) {
            $.pathOnCompute = pathOnCompute;
            return this;
        }

        public Builder pathOnCompute(String pathOnCompute) {
            return pathOnCompute(Output.of(pathOnCompute));
        }

        public Builder pathOnDatastore(@Nullable Output<String> pathOnDatastore) {
            $.pathOnDatastore = pathOnDatastore;
            return this;
        }

        public Builder pathOnDatastore(String pathOnDatastore) {
            return pathOnDatastore(Output.of(pathOnDatastore));
        }

        public OutputDataBindingArgs build() {
            return $;
        }
    }

}
