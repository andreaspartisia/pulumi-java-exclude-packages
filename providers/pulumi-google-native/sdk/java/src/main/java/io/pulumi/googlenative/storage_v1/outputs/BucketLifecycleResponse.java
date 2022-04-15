// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.storage_v1.outputs.BucketLifecycleRuleItemResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketLifecycleResponse {
    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
     */
    private final List<BucketLifecycleRuleItemResponse> rule;

    @CustomType.Constructor
    private BucketLifecycleResponse(@CustomType.Parameter("rule") List<BucketLifecycleRuleItemResponse> rule) {
        this.rule = rule;
    }

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
    */
    public List<BucketLifecycleRuleItemResponse> rule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketLifecycleRuleItemResponse> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        public Builder rule(List<BucketLifecycleRuleItemResponse> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public Builder rule(BucketLifecycleRuleItemResponse... rule) {
            return rule(List.of(rule));
        }        public BucketLifecycleResponse build() {
            return new BucketLifecycleResponse(rule);
        }
    }
}
