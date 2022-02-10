// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ManagedRuleGroupOverrideArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedRuleSetArgs Empty = new ManagedRuleSetArgs();

    @InputImport(name="ruleGroupOverrides")
    private final @Nullable Input<List<ManagedRuleGroupOverrideArgs>> ruleGroupOverrides;

    public Input<List<ManagedRuleGroupOverrideArgs>> getRuleGroupOverrides() {
        return this.ruleGroupOverrides == null ? Input.empty() : this.ruleGroupOverrides;
    }

    @InputImport(name="ruleSetType", required=true)
    private final Input<String> ruleSetType;

    public Input<String> getRuleSetType() {
        return this.ruleSetType;
    }

    @InputImport(name="ruleSetVersion", required=true)
    private final Input<String> ruleSetVersion;

    public Input<String> getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public ManagedRuleSetArgs(
        @Nullable Input<List<ManagedRuleGroupOverrideArgs>> ruleGroupOverrides,
        Input<String> ruleSetType,
        Input<String> ruleSetVersion) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetType = Objects.requireNonNull(ruleSetType, "expected parameter 'ruleSetType' to be non-null");
        this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion, "expected parameter 'ruleSetVersion' to be non-null");
    }

    private ManagedRuleSetArgs() {
        this.ruleGroupOverrides = Input.empty();
        this.ruleSetType = Input.empty();
        this.ruleSetVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ManagedRuleGroupOverrideArgs>> ruleGroupOverrides;
        private Input<String> ruleSetType;
        private Input<String> ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder setRuleGroupOverrides(@Nullable Input<List<ManagedRuleGroupOverrideArgs>> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }

        public Builder setRuleGroupOverrides(@Nullable List<ManagedRuleGroupOverrideArgs> ruleGroupOverrides) {
            this.ruleGroupOverrides = Input.ofNullable(ruleGroupOverrides);
            return this;
        }

        public Builder setRuleSetType(Input<String> ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder setRuleSetType(String ruleSetType) {
            this.ruleSetType = Input.of(Objects.requireNonNull(ruleSetType));
            return this;
        }

        public Builder setRuleSetVersion(Input<String> ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }

        public Builder setRuleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Input.of(Objects.requireNonNull(ruleSetVersion));
            return this;
        }

        public ManagedRuleSetArgs build() {
            return new ManagedRuleSetArgs(ruleGroupOverrides, ruleSetType, ruleSetVersion);
        }
    }
}