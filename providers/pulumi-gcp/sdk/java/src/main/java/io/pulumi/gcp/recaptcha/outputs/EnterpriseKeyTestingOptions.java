// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseKeyTestingOptions {
    /**
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
     * 
     */
    private final @Nullable String testingChallenge;
    /**
     * All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
     * 
     */
    private final @Nullable Double testingScore;

    @OutputCustomType.Constructor({"testingChallenge","testingScore"})
    private EnterpriseKeyTestingOptions(
        @Nullable String testingChallenge,
        @Nullable Double testingScore) {
        this.testingChallenge = testingChallenge;
        this.testingScore = testingScore;
    }

    /**
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
     * 
     */
    public Optional<String> getTestingChallenge() {
        return Optional.ofNullable(this.testingChallenge);
    }
    /**
     * All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
     * 
     */
    public Optional<Double> getTestingScore() {
        return Optional.ofNullable(this.testingScore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyTestingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String testingChallenge;
        private @Nullable Double testingScore;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyTestingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testingChallenge = defaults.testingChallenge;
    	      this.testingScore = defaults.testingScore;
        }

        public Builder setTestingChallenge(@Nullable String testingChallenge) {
            this.testingChallenge = testingChallenge;
            return this;
        }

        public Builder setTestingScore(@Nullable Double testingScore) {
            this.testingScore = testingScore;
            return this;
        }

        public EnterpriseKeyTestingOptions build() {
            return new EnterpriseKeyTestingOptions(testingChallenge, testingScore);
        }
    }
}