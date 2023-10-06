// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyVideoPolicyBreakpoints;
import com.pulumi.akamai.outputs.GetImagingPolicyVideoPolicyOutput;
import com.pulumi.akamai.outputs.GetImagingPolicyVideoPolicyVariable;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyVideoPolicy {
    private @Nullable GetImagingPolicyVideoPolicyBreakpoints breakpoints;
    private @Nullable List<String> hosts;
    private @Nullable GetImagingPolicyVideoPolicyOutput output;
    private @Nullable String rolloutDuration;
    private @Nullable List<GetImagingPolicyVideoPolicyVariable> variables;

    private GetImagingPolicyVideoPolicy() {}
    public Optional<GetImagingPolicyVideoPolicyBreakpoints> breakpoints() {
        return Optional.ofNullable(this.breakpoints);
    }
    public List<String> hosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    public Optional<GetImagingPolicyVideoPolicyOutput> output() {
        return Optional.ofNullable(this.output);
    }
    public Optional<String> rolloutDuration() {
        return Optional.ofNullable(this.rolloutDuration);
    }
    public List<GetImagingPolicyVideoPolicyVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyVideoPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetImagingPolicyVideoPolicyBreakpoints breakpoints;
        private @Nullable List<String> hosts;
        private @Nullable GetImagingPolicyVideoPolicyOutput output;
        private @Nullable String rolloutDuration;
        private @Nullable List<GetImagingPolicyVideoPolicyVariable> variables;
        public Builder() {}
        public Builder(GetImagingPolicyVideoPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.breakpoints = defaults.breakpoints;
    	      this.hosts = defaults.hosts;
    	      this.output = defaults.output;
    	      this.rolloutDuration = defaults.rolloutDuration;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder breakpoints(@Nullable GetImagingPolicyVideoPolicyBreakpoints breakpoints) {

            this.breakpoints = breakpoints;
            return this;
        }
        @CustomType.Setter
        public Builder hosts(@Nullable List<String> hosts) {

            this.hosts = hosts;
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        @CustomType.Setter
        public Builder output(@Nullable GetImagingPolicyVideoPolicyOutput output) {

            this.output = output;
            return this;
        }
        @CustomType.Setter
        public Builder rolloutDuration(@Nullable String rolloutDuration) {

            this.rolloutDuration = rolloutDuration;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<GetImagingPolicyVideoPolicyVariable> variables) {

            this.variables = variables;
            return this;
        }
        public Builder variables(GetImagingPolicyVideoPolicyVariable... variables) {
            return variables(List.of(variables));
        }
        public GetImagingPolicyVideoPolicy build() {
            final var _resultValue = new GetImagingPolicyVideoPolicy();
            _resultValue.breakpoints = breakpoints;
            _resultValue.hosts = hosts;
            _resultValue.output = output;
            _resultValue.rolloutDuration = rolloutDuration;
            _resultValue.variables = variables;
            return _resultValue;
        }
    }
}
