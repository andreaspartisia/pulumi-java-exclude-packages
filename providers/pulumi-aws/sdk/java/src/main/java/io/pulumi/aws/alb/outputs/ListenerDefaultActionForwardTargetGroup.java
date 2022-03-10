// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerDefaultActionForwardTargetGroup {
    /**
     * ARN of the target group.
     * 
     */
    private final String arn;
    /**
     * Weight. The range is 0 to 999.
     * 
     */
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor
    private ListenerDefaultActionForwardTargetGroup(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("weight") @Nullable Integer weight) {
        this.arn = arn;
        this.weight = weight;
    }

    /**
     * ARN of the target group.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Weight. The range is 0 to 999.
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public ListenerDefaultActionForwardTargetGroup build() {
            return new ListenerDefaultActionForwardTargetGroup(arn, weight);
        }
    }
}