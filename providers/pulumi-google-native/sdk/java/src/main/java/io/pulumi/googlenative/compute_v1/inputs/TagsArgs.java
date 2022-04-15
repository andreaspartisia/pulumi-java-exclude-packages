// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of instance tags.
 * 
 */
public final class TagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagsArgs Empty = new TagsArgs();

    /**
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    public TagsArgs(@Nullable Output<List<String>> items) {
        this.items = items;
    }

    private TagsArgs() {
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(TagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable Output<List<String>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<String> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public TagsArgs build() {
            return new TagsArgs(items);
        }
    }
}
