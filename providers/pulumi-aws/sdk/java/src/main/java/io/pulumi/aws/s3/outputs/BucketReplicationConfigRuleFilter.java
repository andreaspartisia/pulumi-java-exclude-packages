// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleFilterAnd;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleFilterTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationConfigRuleFilter {
    /**
     * A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleFilterAnd and;
    /**
     * An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    private final @Nullable String prefix;
    /**
     * A configuration block for specifying a tag key and value documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleFilterTag tag;

    @OutputCustomType.Constructor
    private BucketReplicationConfigRuleFilter(
        @OutputCustomType.Parameter("and") @Nullable BucketReplicationConfigRuleFilterAnd and,
        @OutputCustomType.Parameter("prefix") @Nullable String prefix,
        @OutputCustomType.Parameter("tag") @Nullable BucketReplicationConfigRuleFilterTag tag) {
        this.and = and;
        this.prefix = prefix;
        this.tag = tag;
    }

    /**
     * A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * 
    */
    public Optional<BucketReplicationConfigRuleFilterAnd> getAnd() {
        return Optional.ofNullable(this.and);
    }
    /**
     * An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * A configuration block for specifying a tag key and value documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleFilterTag> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigRuleFilterAnd and;
        private @Nullable String prefix;
        private @Nullable BucketReplicationConfigRuleFilterTag tag;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.prefix = defaults.prefix;
    	      this.tag = defaults.tag;
        }

        public Builder setAnd(@Nullable BucketReplicationConfigRuleFilterAnd and) {
            this.and = and;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setTag(@Nullable BucketReplicationConfigRuleFilterTag tag) {
            this.tag = tag;
            return this;
        }
        public BucketReplicationConfigRuleFilter build() {
            return new BucketReplicationConfigRuleFilter(and, prefix, tag);
        }
    }
}