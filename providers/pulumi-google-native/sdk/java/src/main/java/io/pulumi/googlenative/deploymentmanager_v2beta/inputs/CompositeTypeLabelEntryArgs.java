// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Label object for CompositeTypes
 * 
 */
public final class CompositeTypeLabelEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompositeTypeLabelEntryArgs Empty = new CompositeTypeLabelEntryArgs();

    /**
     * Key of the label
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * Value of the label
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public CompositeTypeLabelEntryArgs(
        @Nullable Output<String> key,
        @Nullable Output<String> value) {
        this.key = key;
        this.value = value;
    }

    private CompositeTypeLabelEntryArgs() {
        this.key = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositeTypeLabelEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositeTypeLabelEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public CompositeTypeLabelEntryArgs build() {
            return new CompositeTypeLabelEntryArgs(key, value);
        }
    }
}
