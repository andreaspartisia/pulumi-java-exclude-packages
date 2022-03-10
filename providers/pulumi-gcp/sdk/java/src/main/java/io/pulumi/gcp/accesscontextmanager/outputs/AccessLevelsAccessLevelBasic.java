// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasicCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessLevelsAccessLevelBasic {
    /**
     * How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are `AND` and `OR`.
     * 
     */
    private final @Nullable String combiningFunction;
    /**
     * A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    private final List<AccessLevelsAccessLevelBasicCondition> conditions;

    @OutputCustomType.Constructor
    private AccessLevelsAccessLevelBasic(
        @OutputCustomType.Parameter("combiningFunction") @Nullable String combiningFunction,
        @OutputCustomType.Parameter("conditions") List<AccessLevelsAccessLevelBasicCondition> conditions) {
        this.combiningFunction = combiningFunction;
        this.conditions = conditions;
    }

    /**
     * How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are `AND` and `OR`.
     * 
    */
    public Optional<String> getCombiningFunction() {
        return Optional.ofNullable(this.combiningFunction);
    }
    /**
     * A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
    */
    public List<AccessLevelsAccessLevelBasicCondition> getConditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String combiningFunction;
        private List<AccessLevelsAccessLevelBasicCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelBasic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        public Builder setCombiningFunction(@Nullable String combiningFunction) {
            this.combiningFunction = combiningFunction;
            return this;
        }

        public Builder setConditions(List<AccessLevelsAccessLevelBasicCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public AccessLevelsAccessLevelBasic build() {
            return new AccessLevelsAccessLevelBasic(combiningFunction, conditions);
        }
    }
}
