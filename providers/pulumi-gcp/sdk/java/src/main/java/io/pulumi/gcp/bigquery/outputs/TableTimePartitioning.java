// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableTimePartitioning {
    /**
     * Number of milliseconds for which to keep the
     * storage for a partition.
     * 
     */
    private final @Nullable Integer expirationMs;
    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
     */
    private final @Nullable String field;
    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    private final @Nullable Boolean requirePartitionFilter;
    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private TableTimePartitioning(
        @OutputCustomType.Parameter("expirationMs") @Nullable Integer expirationMs,
        @OutputCustomType.Parameter("field") @Nullable String field,
        @OutputCustomType.Parameter("requirePartitionFilter") @Nullable Boolean requirePartitionFilter,
        @OutputCustomType.Parameter("type") String type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.requirePartitionFilter = requirePartitionFilter;
        this.type = type;
    }

    /**
     * Number of milliseconds for which to keep the
     * storage for a partition.
     * 
    */
    public Optional<Integer> getExpirationMs() {
        return Optional.ofNullable(this.expirationMs);
    }
    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
    */
    public Optional<String> getField() {
        return Optional.ofNullable(this.field);
    }
    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
    */
    public Optional<Boolean> getRequirePartitionFilter() {
        return Optional.ofNullable(this.requirePartitionFilter);
    }
    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableTimePartitioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expirationMs;
        private @Nullable String field;
        private @Nullable Boolean requirePartitionFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableTimePartitioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder setExpirationMs(@Nullable Integer expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TableTimePartitioning build() {
            return new TableTimePartitioning(expirationMs, field, requirePartitionFilter, type);
        }
    }
}
