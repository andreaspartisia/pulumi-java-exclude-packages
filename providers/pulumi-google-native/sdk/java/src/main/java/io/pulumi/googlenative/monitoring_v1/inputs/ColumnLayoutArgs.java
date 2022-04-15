// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v1.inputs.ColumnArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A simplified layout that divides the available space into vertical columns and arranges a set of widgets vertically in each column.
 * 
 */
public final class ColumnLayoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final ColumnLayoutArgs Empty = new ColumnLayoutArgs();

    /**
     * The columns of content to display.
     * 
     */
    @Import(name="columns")
      private final @Nullable Output<List<ColumnArgs>> columns;

    public Output<List<ColumnArgs>> columns() {
        return this.columns == null ? Codegen.empty() : this.columns;
    }

    public ColumnLayoutArgs(@Nullable Output<List<ColumnArgs>> columns) {
        this.columns = columns;
    }

    private ColumnLayoutArgs() {
        this.columns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ColumnArgs>> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnLayoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder columns(@Nullable Output<List<ColumnArgs>> columns) {
            this.columns = columns;
            return this;
        }
        public Builder columns(@Nullable List<ColumnArgs> columns) {
            this.columns = Codegen.ofNullable(columns);
            return this;
        }
        public Builder columns(ColumnArgs... columns) {
            return columns(List.of(columns));
        }        public ColumnLayoutArgs build() {
            return new ColumnLayoutArgs(columns);
        }
    }
}
