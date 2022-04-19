// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AudioTrackDescriptorArgs;
import com.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeArgs;
import com.pulumi.azurenative.media.inputs.SelectAudioTrackByIdArgs;
import com.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeArgs;
import com.pulumi.azurenative.media.inputs.SelectVideoTrackByIdArgs;
import com.pulumi.azurenative.media.inputs.VideoTrackDescriptorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An InputDefinition for a single file.  TrackSelections are scoped to the file specified.
 * 
 */
public final class InputFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final InputFileArgs Empty = new InputFileArgs();

    /**
     * Name of the file that this input definition applies to.
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> filename() {
        return this.filename == null ? Codegen.empty() : this.filename;
    }

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @Import(name="includedTracks")
      private final @Nullable Output<List<Object>> includedTracks;

    public Output<List<Object>> includedTracks() {
        return this.includedTracks == null ? Codegen.empty() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.InputFile'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public InputFileArgs(
        @Nullable Output<String> filename,
        @Nullable Output<List<Object>> includedTracks,
        Output<String> odataType) {
        this.filename = filename;
        this.includedTracks = includedTracks;
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
    }

    private InputFileArgs() {
        this.filename = Codegen.empty();
        this.includedTracks = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filename;
        private @Nullable Output<List<Object>> includedTracks;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(InputFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filename = defaults.filename;
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = Codegen.ofNullable(filename);
            return this;
        }
        public Builder includedTracks(@Nullable Output<List<Object>> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }
        public Builder includedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = Codegen.ofNullable(includedTracks);
            return this;
        }
        public Builder includedTracks(Object... includedTracks) {
            return includedTracks(List.of(includedTracks));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public InputFileArgs build() {
            return new InputFileArgs(filename, includedTracks, odataType);
        }
    }
}
