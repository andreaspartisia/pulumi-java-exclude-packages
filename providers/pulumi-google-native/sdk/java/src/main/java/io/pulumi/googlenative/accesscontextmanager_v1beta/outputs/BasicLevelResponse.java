// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.accesscontextmanager_v1beta.outputs.ConditionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BasicLevelResponse {
    /**
     * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    private final String combiningFunction;
    /**
     * A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    private final List<ConditionResponse> conditions;

    @CustomType.Constructor
    private BasicLevelResponse(
        @CustomType.Parameter("combiningFunction") String combiningFunction,
        @CustomType.Parameter("conditions") List<ConditionResponse> conditions) {
        this.combiningFunction = combiningFunction;
        this.conditions = conditions;
    }

    /**
     * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
    */
    public String combiningFunction() {
        return this.combiningFunction;
    }
    /**
     * A list of requirements for the `AccessLevel` to be granted.
     * 
    */
    public List<ConditionResponse> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String combiningFunction;
        private List<ConditionResponse> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        public Builder combiningFunction(String combiningFunction) {
            this.combiningFunction = Objects.requireNonNull(combiningFunction);
            return this;
        }
        public Builder conditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }        public BasicLevelResponse build() {
            return new BasicLevelResponse(combiningFunction, conditions);
        }
    }
}
