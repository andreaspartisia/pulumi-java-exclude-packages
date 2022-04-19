// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineRunSourcePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PipelineRunSourcePropertiesResponse Empty = new PipelineRunSourcePropertiesResponse();

    /**
     * The name of the source.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The type of the source.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public PipelineRunSourcePropertiesResponse(
        @Nullable String name,
        @Nullable String type) {
        this.name = name;
        this.type = Codegen.stringProp("type").arg(type).def("AzureStorageBlob").getNullable();
    }

    private PipelineRunSourcePropertiesResponse() {
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunSourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunSourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PipelineRunSourcePropertiesResponse build() {
            return new PipelineRunSourcePropertiesResponse(name, type);
        }
    }
}
