// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupTextTransformationType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Text Transformation on the Search String before match.
 * 
 */
public final class RuleGroupTextTransformation extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupTextTransformation Empty = new RuleGroupTextTransformation();

    @InputImport(name="priority", required=true)
    private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    @InputImport(name="type", required=true)
    private final RuleGroupTextTransformationType type;

    public RuleGroupTextTransformationType getType() {
        return this.type;
    }

    public RuleGroupTextTransformation(
        Integer priority,
        RuleGroupTextTransformationType type) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuleGroupTextTransformation() {
        this.priority = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupTextTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private RuleGroupTextTransformationType type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupTextTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setType(RuleGroupTextTransformationType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RuleGroupTextTransformation build() {
            return new RuleGroupTextTransformation(priority, type);
        }
    }
}