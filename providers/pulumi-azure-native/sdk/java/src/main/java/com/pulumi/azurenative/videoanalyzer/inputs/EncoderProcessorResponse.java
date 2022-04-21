// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.inputs.EncoderCustomPresetResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.EncoderSystemPresetResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.NodeInputResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Encoder processor allows for encoding of the input content. For example, it can used to change the resolution from 4K to 1280x720.
 * 
 */
public final class EncoderProcessorResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncoderProcessorResponse Empty = new EncoderProcessorResponse();

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    @Import(name="inputs", required=true)
    private List<NodeInputResponse> inputs;

    public List<NodeInputResponse> inputs() {
        return this.inputs;
    }

    /**
     * Node name. Must be unique within the topology.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The encoder preset, which defines the recipe or instructions on how the input content should be processed.
     * 
     */
    @Import(name="preset", required=true)
    private Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset;

    public Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset() {
        return this.preset;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.EncoderProcessor&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private EncoderProcessorResponse() {}

    private EncoderProcessorResponse(EncoderProcessorResponse $) {
        this.inputs = $.inputs;
        this.name = $.name;
        this.preset = $.preset;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncoderProcessorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncoderProcessorResponse $;

        public Builder() {
            $ = new EncoderProcessorResponse();
        }

        public Builder(EncoderProcessorResponse defaults) {
            $ = new EncoderProcessorResponse(Objects.requireNonNull(defaults));
        }

        public Builder inputs(List<NodeInputResponse> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(NodeInputResponse... inputs) {
            return inputs(List.of(inputs));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder preset(Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset) {
            $.preset = preset;
            return this;
        }

        public Builder preset(EncoderCustomPresetResponse preset) {
            return preset(Either.ofLeft(preset));
        }

        public Builder preset(EncoderSystemPresetResponse preset) {
            return preset(Either.ofRight(preset));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public EncoderProcessorResponse build() {
            $.inputs = Objects.requireNonNull($.inputs, "expected parameter 'inputs' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.preset = Objects.requireNonNull($.preset, "expected parameter 'preset' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
