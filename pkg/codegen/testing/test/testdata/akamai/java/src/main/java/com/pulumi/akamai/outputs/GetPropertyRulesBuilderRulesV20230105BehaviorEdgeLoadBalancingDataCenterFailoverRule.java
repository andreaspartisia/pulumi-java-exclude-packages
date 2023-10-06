// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule {
    private @Nullable Boolean absolutePath;
    private @Nullable String contextRoot;
    private @Nullable String failoverHostname;
    private @Nullable Boolean modifyRequest;
    private @Nullable Boolean overrideHostname;

    private GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule() {}
    public Optional<Boolean> absolutePath() {
        return Optional.ofNullable(this.absolutePath);
    }
    public Optional<String> contextRoot() {
        return Optional.ofNullable(this.contextRoot);
    }
    public Optional<String> failoverHostname() {
        return Optional.ofNullable(this.failoverHostname);
    }
    public Optional<Boolean> modifyRequest() {
        return Optional.ofNullable(this.modifyRequest);
    }
    public Optional<Boolean> overrideHostname() {
        return Optional.ofNullable(this.overrideHostname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean absolutePath;
        private @Nullable String contextRoot;
        private @Nullable String failoverHostname;
        private @Nullable Boolean modifyRequest;
        private @Nullable Boolean overrideHostname;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absolutePath = defaults.absolutePath;
    	      this.contextRoot = defaults.contextRoot;
    	      this.failoverHostname = defaults.failoverHostname;
    	      this.modifyRequest = defaults.modifyRequest;
    	      this.overrideHostname = defaults.overrideHostname;
        }

        @CustomType.Setter
        public Builder absolutePath(@Nullable Boolean absolutePath) {

            this.absolutePath = absolutePath;
            return this;
        }
        @CustomType.Setter
        public Builder contextRoot(@Nullable String contextRoot) {

            this.contextRoot = contextRoot;
            return this;
        }
        @CustomType.Setter
        public Builder failoverHostname(@Nullable String failoverHostname) {

            this.failoverHostname = failoverHostname;
            return this;
        }
        @CustomType.Setter
        public Builder modifyRequest(@Nullable Boolean modifyRequest) {

            this.modifyRequest = modifyRequest;
            return this;
        }
        @CustomType.Setter
        public Builder overrideHostname(@Nullable Boolean overrideHostname) {

            this.overrideHostname = overrideHostname;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRule();
            _resultValue.absolutePath = absolutePath;
            _resultValue.contextRoot = contextRoot;
            _resultValue.failoverHostname = failoverHostname;
            _resultValue.modifyRequest = modifyRequest;
            _resultValue.overrideHostname = overrideHostname;
            return _resultValue;
        }
    }
}
