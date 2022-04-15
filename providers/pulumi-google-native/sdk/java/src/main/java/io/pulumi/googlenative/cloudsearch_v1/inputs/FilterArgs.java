// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudsearch_v1.inputs.CompositeFilterArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.ValueFilterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A generic way of expressing filters in a query, which supports two approaches: **1. Setting a ValueFilter.** The name must match an operator_name defined in the schema for your data source. **2. Setting a CompositeFilter.** The filters are evaluated using the logical operator. The top-level operators can only be either an AND or a NOT. AND can appear only at the top-most level. OR can appear only under a top-level AND.
 * 
 */
public final class FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    @Import(name="compositeFilter")
      private final @Nullable Output<CompositeFilterArgs> compositeFilter;

    public Output<CompositeFilterArgs> compositeFilter() {
        return this.compositeFilter == null ? Codegen.empty() : this.compositeFilter;
    }

    @Import(name="valueFilter")
      private final @Nullable Output<ValueFilterArgs> valueFilter;

    public Output<ValueFilterArgs> valueFilter() {
        return this.valueFilter == null ? Codegen.empty() : this.valueFilter;
    }

    public FilterArgs(
        @Nullable Output<CompositeFilterArgs> compositeFilter,
        @Nullable Output<ValueFilterArgs> valueFilter) {
        this.compositeFilter = compositeFilter;
        this.valueFilter = valueFilter;
    }

    private FilterArgs() {
        this.compositeFilter = Codegen.empty();
        this.valueFilter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CompositeFilterArgs> compositeFilter;
        private @Nullable Output<ValueFilterArgs> valueFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeFilter = defaults.compositeFilter;
    	      this.valueFilter = defaults.valueFilter;
        }

        public Builder compositeFilter(@Nullable Output<CompositeFilterArgs> compositeFilter) {
            this.compositeFilter = compositeFilter;
            return this;
        }
        public Builder compositeFilter(@Nullable CompositeFilterArgs compositeFilter) {
            this.compositeFilter = Codegen.ofNullable(compositeFilter);
            return this;
        }
        public Builder valueFilter(@Nullable Output<ValueFilterArgs> valueFilter) {
            this.valueFilter = valueFilter;
            return this;
        }
        public Builder valueFilter(@Nullable ValueFilterArgs valueFilter) {
            this.valueFilter = Codegen.ofNullable(valueFilter);
            return this;
        }        public FilterArgs build() {
            return new FilterArgs(compositeFilter, valueFilter);
        }
    }
}
