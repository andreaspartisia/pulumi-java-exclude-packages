// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TimePartitioningArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimePartitioningArgs Empty = new TimePartitioningArgs();

    /**
     * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
     * 
     */
    @Import(name="expirationMs")
      private final @Nullable Output<String> expirationMs;

    public Output<String> expirationMs() {
        return this.expirationMs == null ? Codegen.empty() : this.expirationMs;
    }

    /**
     * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> field() {
        return this.field == null ? Codegen.empty() : this.field;
    }

    @Import(name="requirePartitionFilter")
      private final @Nullable Output<Boolean> requirePartitionFilter;

    public Output<Boolean> requirePartitionFilter() {
        return this.requirePartitionFilter == null ? Codegen.empty() : this.requirePartitionFilter;
    }

    /**
     * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public TimePartitioningArgs(
        @Nullable Output<String> expirationMs,
        @Nullable Output<String> field,
        @Nullable Output<Boolean> requirePartitionFilter,
        @Nullable Output<String> type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.requirePartitionFilter = requirePartitionFilter;
        this.type = type;
    }

    private TimePartitioningArgs() {
        this.expirationMs = Codegen.empty();
        this.field = Codegen.empty();
        this.requirePartitionFilter = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimePartitioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationMs;
        private @Nullable Output<String> field;
        private @Nullable Output<Boolean> requirePartitionFilter;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TimePartitioningArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder expirationMs(@Nullable Output<String> expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }
        public Builder expirationMs(@Nullable String expirationMs) {
            this.expirationMs = Codegen.ofNullable(expirationMs);
            return this;
        }
        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Codegen.ofNullable(field);
            return this;
        }
        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }
        public Builder requirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Codegen.ofNullable(requirePartitionFilter);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public TimePartitioningArgs build() {
            return new TimePartitioningArgs(expirationMs, field, requirePartitionFilter, type);
        }
    }
}
