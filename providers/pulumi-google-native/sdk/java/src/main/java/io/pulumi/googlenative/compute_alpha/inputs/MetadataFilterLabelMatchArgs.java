// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetadataFilter label name value pairs that are expected to match corresponding labels presented as metadata to the load balancer.
 * 
 */
public final class MetadataFilterLabelMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataFilterLabelMatchArgs Empty = new MetadataFilterLabelMatchArgs();

    /**
     * Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The value of the label must match the specified value. value can have a maximum length of 1024 characters.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public MetadataFilterLabelMatchArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> value) {
        this.name = name;
        this.value = value;
    }

    private MetadataFilterLabelMatchArgs() {
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterLabelMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterLabelMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public MetadataFilterLabelMatchArgs build() {
            return new MetadataFilterLabelMatchArgs(name, value);
        }
    }
}
