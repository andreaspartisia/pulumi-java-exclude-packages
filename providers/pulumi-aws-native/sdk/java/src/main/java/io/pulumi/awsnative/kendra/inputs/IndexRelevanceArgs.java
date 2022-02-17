// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.IndexOrder;
import io.pulumi.awsnative.kendra.inputs.IndexValueImportanceItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexRelevanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexRelevanceArgs Empty = new IndexRelevanceArgs();

    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    @InputImport(name="freshness")
    private final @Nullable Input<Boolean> freshness;

    public Input<Boolean> getFreshness() {
        return this.freshness == null ? Input.empty() : this.freshness;
    }

    @InputImport(name="importance")
    private final @Nullable Input<Integer> importance;

    public Input<Integer> getImportance() {
        return this.importance == null ? Input.empty() : this.importance;
    }

    @InputImport(name="rankOrder")
    private final @Nullable Input<IndexOrder> rankOrder;

    public Input<IndexOrder> getRankOrder() {
        return this.rankOrder == null ? Input.empty() : this.rankOrder;
    }

    @InputImport(name="valueImportanceItems")
    private final @Nullable Input<List<IndexValueImportanceItemArgs>> valueImportanceItems;

    public Input<List<IndexValueImportanceItemArgs>> getValueImportanceItems() {
        return this.valueImportanceItems == null ? Input.empty() : this.valueImportanceItems;
    }

    public IndexRelevanceArgs(
        @Nullable Input<String> duration,
        @Nullable Input<Boolean> freshness,
        @Nullable Input<Integer> importance,
        @Nullable Input<IndexOrder> rankOrder,
        @Nullable Input<List<IndexValueImportanceItemArgs>> valueImportanceItems) {
        this.duration = duration;
        this.freshness = freshness;
        this.importance = importance;
        this.rankOrder = rankOrder;
        this.valueImportanceItems = valueImportanceItems;
    }

    private IndexRelevanceArgs() {
        this.duration = Input.empty();
        this.freshness = Input.empty();
        this.importance = Input.empty();
        this.rankOrder = Input.empty();
        this.valueImportanceItems = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexRelevanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> duration;
        private @Nullable Input<Boolean> freshness;
        private @Nullable Input<Integer> importance;
        private @Nullable Input<IndexOrder> rankOrder;
        private @Nullable Input<List<IndexValueImportanceItemArgs>> valueImportanceItems;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexRelevanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.freshness = defaults.freshness;
    	      this.importance = defaults.importance;
    	      this.rankOrder = defaults.rankOrder;
    	      this.valueImportanceItems = defaults.valueImportanceItems;
        }

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setFreshness(@Nullable Input<Boolean> freshness) {
            this.freshness = freshness;
            return this;
        }

        public Builder setFreshness(@Nullable Boolean freshness) {
            this.freshness = Input.ofNullable(freshness);
            return this;
        }

        public Builder setImportance(@Nullable Input<Integer> importance) {
            this.importance = importance;
            return this;
        }

        public Builder setImportance(@Nullable Integer importance) {
            this.importance = Input.ofNullable(importance);
            return this;
        }

        public Builder setRankOrder(@Nullable Input<IndexOrder> rankOrder) {
            this.rankOrder = rankOrder;
            return this;
        }

        public Builder setRankOrder(@Nullable IndexOrder rankOrder) {
            this.rankOrder = Input.ofNullable(rankOrder);
            return this;
        }

        public Builder setValueImportanceItems(@Nullable Input<List<IndexValueImportanceItemArgs>> valueImportanceItems) {
            this.valueImportanceItems = valueImportanceItems;
            return this;
        }

        public Builder setValueImportanceItems(@Nullable List<IndexValueImportanceItemArgs> valueImportanceItems) {
            this.valueImportanceItems = Input.ofNullable(valueImportanceItems);
            return this;
        }

        public IndexRelevanceArgs build() {
            return new IndexRelevanceArgs(duration, freshness, importance, rankOrder, valueImportanceItems);
        }
    }
}