// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectFieldArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDefinitionPipelineObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionPipelineObjectArgs Empty = new PipelineDefinitionPipelineObjectArgs();

    /**
     * Configuration block for Key-value pairs that define the properties of the object. See below
     * 
     */
    @InputImport(name="fields")
      private final @Nullable Input<List<PipelineDefinitionPipelineObjectFieldArgs>> fields;

    public Input<List<PipelineDefinitionPipelineObjectFieldArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    /**
     * ID of the parameter value.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * ARN of the storage connector.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PipelineDefinitionPipelineObjectArgs(
        @Nullable Input<List<PipelineDefinitionPipelineObjectFieldArgs>> fields,
        Input<String> id,
        Input<String> name) {
        this.fields = fields;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineDefinitionPipelineObjectArgs() {
        this.fields = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionPipelineObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PipelineDefinitionPipelineObjectFieldArgs>> fields;
        private Input<String> id;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionPipelineObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setFields(@Nullable Input<List<PipelineDefinitionPipelineObjectFieldArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<PipelineDefinitionPipelineObjectFieldArgs> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public PipelineDefinitionPipelineObjectArgs build() {
            return new PipelineDefinitionPipelineObjectArgs(fields, id, name);
        }
    }
}