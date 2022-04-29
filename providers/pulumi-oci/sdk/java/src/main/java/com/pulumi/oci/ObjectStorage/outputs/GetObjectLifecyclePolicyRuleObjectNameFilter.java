// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetObjectLifecyclePolicyRuleObjectNameFilter {
    /**
     * @return An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    private final List<String> exclusionPatterns;
    /**
     * @return An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    private final List<String> inclusionPatterns;
    /**
     * @return An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
     * 
     */
    private final List<String> inclusionPrefixes;

    @CustomType.Constructor
    private GetObjectLifecyclePolicyRuleObjectNameFilter(
        @CustomType.Parameter("exclusionPatterns") List<String> exclusionPatterns,
        @CustomType.Parameter("inclusionPatterns") List<String> inclusionPatterns,
        @CustomType.Parameter("inclusionPrefixes") List<String> inclusionPrefixes) {
        this.exclusionPatterns = exclusionPatterns;
        this.inclusionPatterns = inclusionPatterns;
        this.inclusionPrefixes = inclusionPrefixes;
    }

    /**
     * @return An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    public List<String> exclusionPatterns() {
        return this.exclusionPatterns;
    }
    /**
     * @return An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    public List<String> inclusionPatterns() {
        return this.inclusionPatterns;
    }
    /**
     * @return An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
     * 
     */
    public List<String> inclusionPrefixes() {
        return this.inclusionPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectLifecyclePolicyRuleObjectNameFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exclusionPatterns;
        private List<String> inclusionPatterns;
        private List<String> inclusionPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectLifecyclePolicyRuleObjectNameFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.inclusionPrefixes = defaults.inclusionPrefixes;
        }

        public Builder exclusionPatterns(List<String> exclusionPatterns) {
            this.exclusionPatterns = Objects.requireNonNull(exclusionPatterns);
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder inclusionPatterns(List<String> inclusionPatterns) {
            this.inclusionPatterns = Objects.requireNonNull(inclusionPatterns);
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder inclusionPrefixes(List<String> inclusionPrefixes) {
            this.inclusionPrefixes = Objects.requireNonNull(inclusionPrefixes);
            return this;
        }
        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }        public GetObjectLifecyclePolicyRuleObjectNameFilter build() {
            return new GetObjectLifecyclePolicyRuleObjectNameFilter(exclusionPatterns, inclusionPatterns, inclusionPrefixes);
        }
    }
}
