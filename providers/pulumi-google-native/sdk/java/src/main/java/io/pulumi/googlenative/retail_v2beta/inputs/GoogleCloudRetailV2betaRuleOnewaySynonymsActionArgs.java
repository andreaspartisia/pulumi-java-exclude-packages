// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Maps a set of terms to a set of synonyms. Set of synonyms will be treated as synonyms of each query term only. `query_terms` will not be treated as synonyms of each other. Example: "sneakers" will use a synonym of "shoes". "shoes" will not use a synonym of "sneakers".
 * 
 */
public final class GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs Empty = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs();

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @Import(name="onewayTerms")
      private final @Nullable Output<List<String>> onewayTerms;

    public Output<List<String>> onewayTerms() {
        return this.onewayTerms == null ? Codegen.empty() : this.onewayTerms;
    }

    /**
     * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    @Import(name="queryTerms")
      private final @Nullable Output<List<String>> queryTerms;

    public Output<List<String>> queryTerms() {
        return this.queryTerms == null ? Codegen.empty() : this.queryTerms;
    }

    /**
     * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    @Import(name="synonyms")
      private final @Nullable Output<List<String>> synonyms;

    public Output<List<String>> synonyms() {
        return this.synonyms == null ? Codegen.empty() : this.synonyms;
    }

    public GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs(
        @Nullable Output<List<String>> onewayTerms,
        @Nullable Output<List<String>> queryTerms,
        @Nullable Output<List<String>> synonyms) {
        this.onewayTerms = onewayTerms;
        this.queryTerms = queryTerms;
        this.synonyms = synonyms;
    }

    private GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs() {
        this.onewayTerms = Codegen.empty();
        this.queryTerms = Codegen.empty();
        this.synonyms = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> onewayTerms;
        private @Nullable Output<List<String>> queryTerms;
        private @Nullable Output<List<String>> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onewayTerms = defaults.onewayTerms;
    	      this.queryTerms = defaults.queryTerms;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder onewayTerms(@Nullable Output<List<String>> onewayTerms) {
            this.onewayTerms = onewayTerms;
            return this;
        }
        public Builder onewayTerms(@Nullable List<String> onewayTerms) {
            this.onewayTerms = Codegen.ofNullable(onewayTerms);
            return this;
        }
        public Builder onewayTerms(String... onewayTerms) {
            return onewayTerms(List.of(onewayTerms));
        }
        public Builder queryTerms(@Nullable Output<List<String>> queryTerms) {
            this.queryTerms = queryTerms;
            return this;
        }
        public Builder queryTerms(@Nullable List<String> queryTerms) {
            this.queryTerms = Codegen.ofNullable(queryTerms);
            return this;
        }
        public Builder queryTerms(String... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }
        public Builder synonyms(@Nullable Output<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public Builder synonyms(@Nullable List<String> synonyms) {
            this.synonyms = Codegen.ofNullable(synonyms);
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }        public GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs build() {
            return new GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs(onewayTerms, queryTerms, synonyms);
        }
    }
}
