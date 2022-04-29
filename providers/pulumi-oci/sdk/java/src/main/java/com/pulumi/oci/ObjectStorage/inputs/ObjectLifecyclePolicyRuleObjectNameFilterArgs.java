// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectLifecyclePolicyRuleObjectNameFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectLifecyclePolicyRuleObjectNameFilterArgs Empty = new ObjectLifecyclePolicyRuleObjectNameFilterArgs();

    /**
     * (Updatable) An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    @Import(name="exclusionPatterns")
    private @Nullable Output<List<String>> exclusionPatterns;

    /**
     * @return (Updatable) An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    public Optional<Output<List<String>>> exclusionPatterns() {
        return Optional.ofNullable(this.exclusionPatterns);
    }

    /**
     * (Updatable) An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    @Import(name="inclusionPatterns")
    private @Nullable Output<List<String>> inclusionPatterns;

    /**
     * @return (Updatable) An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
     * 
     */
    public Optional<Output<List<String>>> inclusionPatterns() {
        return Optional.ofNullable(this.inclusionPatterns);
    }

    /**
     * (Updatable) An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
     * 
     */
    @Import(name="inclusionPrefixes")
    private @Nullable Output<List<String>> inclusionPrefixes;

    /**
     * @return (Updatable) An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
     * 
     */
    public Optional<Output<List<String>>> inclusionPrefixes() {
        return Optional.ofNullable(this.inclusionPrefixes);
    }

    private ObjectLifecyclePolicyRuleObjectNameFilterArgs() {}

    private ObjectLifecyclePolicyRuleObjectNameFilterArgs(ObjectLifecyclePolicyRuleObjectNameFilterArgs $) {
        this.exclusionPatterns = $.exclusionPatterns;
        this.inclusionPatterns = $.inclusionPatterns;
        this.inclusionPrefixes = $.inclusionPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectLifecyclePolicyRuleObjectNameFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectLifecyclePolicyRuleObjectNameFilterArgs $;

        public Builder() {
            $ = new ObjectLifecyclePolicyRuleObjectNameFilterArgs();
        }

        public Builder(ObjectLifecyclePolicyRuleObjectNameFilterArgs defaults) {
            $ = new ObjectLifecyclePolicyRuleObjectNameFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusionPatterns (Updatable) An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder exclusionPatterns(@Nullable Output<List<String>> exclusionPatterns) {
            $.exclusionPatterns = exclusionPatterns;
            return this;
        }

        /**
         * @param exclusionPatterns (Updatable) An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder exclusionPatterns(List<String> exclusionPatterns) {
            return exclusionPatterns(Output.of(exclusionPatterns));
        }

        /**
         * @param exclusionPatterns (Updatable) An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }

        /**
         * @param inclusionPatterns (Updatable) An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPatterns(@Nullable Output<List<String>> inclusionPatterns) {
            $.inclusionPatterns = inclusionPatterns;
            return this;
        }

        /**
         * @param inclusionPatterns (Updatable) An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPatterns(List<String> inclusionPatterns) {
            return inclusionPatterns(Output.of(inclusionPatterns));
        }

        /**
         * @param inclusionPatterns (Updatable) An array of glob patterns to match the object names to include. An empty array includes all objects in the bucket. Exclusion patterns take precedence over inclusion patterns. A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other than the special pattern characters described below, matches itself. Glob patterns must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }

        /**
         * @param inclusionPrefixes (Updatable) An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPrefixes(@Nullable Output<List<String>> inclusionPrefixes) {
            $.inclusionPrefixes = inclusionPrefixes;
            return this;
        }

        /**
         * @param inclusionPrefixes (Updatable) An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPrefixes(List<String> inclusionPrefixes) {
            return inclusionPrefixes(Output.of(inclusionPrefixes));
        }

        /**
         * @param inclusionPrefixes (Updatable) An array of object name prefixes that the rule will apply to. An empty array means to include all objects.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }

        public ObjectLifecyclePolicyRuleObjectNameFilterArgs build() {
            return $;
        }
    }

}
