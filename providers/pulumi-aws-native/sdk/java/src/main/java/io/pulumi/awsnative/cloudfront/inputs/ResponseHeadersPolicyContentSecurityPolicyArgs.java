// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyContentSecurityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyContentSecurityPolicyArgs Empty = new ResponseHeadersPolicyContentSecurityPolicyArgs();

    @InputImport(name="contentSecurityPolicy", required=true)
    private final Input<String> contentSecurityPolicy;

    public Input<String> getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }

    @InputImport(name="override", required=true)
    private final Input<Boolean> override;

    public Input<Boolean> getOverride() {
        return this.override;
    }

    public ResponseHeadersPolicyContentSecurityPolicyArgs(
        Input<String> contentSecurityPolicy,
        Input<Boolean> override) {
        this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy, "expected parameter 'contentSecurityPolicy' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private ResponseHeadersPolicyContentSecurityPolicyArgs() {
        this.contentSecurityPolicy = Input.empty();
        this.override = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyContentSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentSecurityPolicy;
        private Input<Boolean> override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyContentSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.override = defaults.override;
        }

        public Builder setContentSecurityPolicy(Input<String> contentSecurityPolicy) {
            this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy);
            return this;
        }

        public Builder setContentSecurityPolicy(String contentSecurityPolicy) {
            this.contentSecurityPolicy = Input.of(Objects.requireNonNull(contentSecurityPolicy));
            return this;
        }

        public Builder setOverride(Input<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Input.of(Objects.requireNonNull(override));
            return this;
        }

        public ResponseHeadersPolicyContentSecurityPolicyArgs build() {
            return new ResponseHeadersPolicyContentSecurityPolicyArgs(contentSecurityPolicy, override);
        }
    }
}