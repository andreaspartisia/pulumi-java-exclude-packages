// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BigQueryOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BigQueryOptionsArgs Empty = new BigQueryOptionsArgs();

    @InputImport(name="usePartitionedTables")
    private final @Nullable Input<Boolean> usePartitionedTables;

    public Input<Boolean> getUsePartitionedTables() {
        return this.usePartitionedTables == null ? Input.empty() : this.usePartitionedTables;
    }

    public BigQueryOptionsArgs(@Nullable Input<Boolean> usePartitionedTables) {
        this.usePartitionedTables = usePartitionedTables;
    }

    private BigQueryOptionsArgs() {
        this.usePartitionedTables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> usePartitionedTables;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usePartitionedTables = defaults.usePartitionedTables;
        }

        public Builder setUsePartitionedTables(@Nullable Input<Boolean> usePartitionedTables) {
            this.usePartitionedTables = usePartitionedTables;
            return this;
        }

        public Builder setUsePartitionedTables(@Nullable Boolean usePartitionedTables) {
            this.usePartitionedTables = Input.ofNullable(usePartitionedTables);
            return this;
        }

        public BigQueryOptionsArgs build() {
            return new BigQueryOptionsArgs(usePartitionedTables);
        }
    }
}