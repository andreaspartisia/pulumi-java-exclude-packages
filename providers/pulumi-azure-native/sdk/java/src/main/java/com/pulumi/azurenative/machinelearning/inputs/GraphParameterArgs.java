// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.enums.ParameterType;
import com.pulumi.azurenative.machinelearning.inputs.GraphParameterLinkArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a global parameter in the graph.
 * 
 */
public final class GraphParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphParameterArgs Empty = new GraphParameterArgs();

    /**
     * Description of this graph parameter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Association links for this parameter to nodes in the graph.
     * 
     */
    @Import(name="links", required=true)
    private Output<List<GraphParameterLinkArgs>> links;

    public Output<List<GraphParameterLinkArgs>> links() {
        return this.links;
    }

    /**
     * Graph parameter&#39;s type.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ParameterType>> type;

    public Output<Either<String,ParameterType>> type() {
        return this.type;
    }

    private GraphParameterArgs() {}

    private GraphParameterArgs(GraphParameterArgs $) {
        this.description = $.description;
        this.links = $.links;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphParameterArgs $;

        public Builder() {
            $ = new GraphParameterArgs();
        }

        public Builder(GraphParameterArgs defaults) {
            $ = new GraphParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder links(Output<List<GraphParameterLinkArgs>> links) {
            $.links = links;
            return this;
        }

        public Builder links(List<GraphParameterLinkArgs> links) {
            return links(Output.of(links));
        }

        public Builder links(GraphParameterLinkArgs... links) {
            return links(List.of(links));
        }

        public Builder type(Output<Either<String,ParameterType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ParameterType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(ParameterType type) {
            return type(Either.ofRight(type));
        }

        public GraphParameterArgs build() {
            $.links = Objects.requireNonNull($.links, "expected parameter 'links' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
