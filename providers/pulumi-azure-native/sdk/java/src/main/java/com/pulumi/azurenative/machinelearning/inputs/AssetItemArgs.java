// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.enums.AssetType;
import com.pulumi.azurenative.machinelearning.inputs.BlobLocationArgs;
import com.pulumi.azurenative.machinelearning.inputs.InputPortArgs;
import com.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterArgs;
import com.pulumi.azurenative.machinelearning.inputs.OutputPortArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about an asset associated with the web service.
 * 
 */
public final class AssetItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetItemArgs Empty = new AssetItemArgs();

    /**
     * Asset&#39;s Id.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Information about the asset&#39;s input ports.
     * 
     */
    @Import(name="inputPorts")
    private @Nullable Output<Map<String,InputPortArgs>> inputPorts;

    public Optional<Output<Map<String,InputPortArgs>>> inputPorts() {
        return Optional.ofNullable(this.inputPorts);
    }

    /**
     * Access information for the asset.
     * 
     */
    @Import(name="locationInfo", required=true)
    private Output<BlobLocationArgs> locationInfo;

    public Output<BlobLocationArgs> locationInfo() {
        return this.locationInfo;
    }

    /**
     * If the asset is a custom module, this holds the module&#39;s metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Asset&#39;s friendly name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Information about the asset&#39;s output ports.
     * 
     */
    @Import(name="outputPorts")
    private @Nullable Output<Map<String,OutputPortArgs>> outputPorts;

    public Optional<Output<Map<String,OutputPortArgs>>> outputPorts() {
        return Optional.ofNullable(this.outputPorts);
    }

    /**
     * If the asset is a custom module, this holds the module&#39;s parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ModuleAssetParameterArgs>> parameters;

    public Optional<Output<List<ModuleAssetParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Asset&#39;s type.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,AssetType>> type;

    public Output<Either<String,AssetType>> type() {
        return this.type;
    }

    private AssetItemArgs() {}

    private AssetItemArgs(AssetItemArgs $) {
        this.id = $.id;
        this.inputPorts = $.inputPorts;
        this.locationInfo = $.locationInfo;
        this.metadata = $.metadata;
        this.name = $.name;
        this.outputPorts = $.outputPorts;
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetItemArgs $;

        public Builder() {
            $ = new AssetItemArgs();
        }

        public Builder(AssetItemArgs defaults) {
            $ = new AssetItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder inputPorts(@Nullable Output<Map<String,InputPortArgs>> inputPorts) {
            $.inputPorts = inputPorts;
            return this;
        }

        public Builder inputPorts(Map<String,InputPortArgs> inputPorts) {
            return inputPorts(Output.of(inputPorts));
        }

        public Builder locationInfo(Output<BlobLocationArgs> locationInfo) {
            $.locationInfo = locationInfo;
            return this;
        }

        public Builder locationInfo(BlobLocationArgs locationInfo) {
            return locationInfo(Output.of(locationInfo));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder outputPorts(@Nullable Output<Map<String,OutputPortArgs>> outputPorts) {
            $.outputPorts = outputPorts;
            return this;
        }

        public Builder outputPorts(Map<String,OutputPortArgs> outputPorts) {
            return outputPorts(Output.of(outputPorts));
        }

        public Builder parameters(@Nullable Output<List<ModuleAssetParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<ModuleAssetParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(ModuleAssetParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder type(Output<Either<String,AssetType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,AssetType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(AssetType type) {
            return type(Either.ofRight(type));
        }

        public AssetItemArgs build() {
            $.locationInfo = Objects.requireNonNull($.locationInfo, "expected parameter 'locationInfo' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
