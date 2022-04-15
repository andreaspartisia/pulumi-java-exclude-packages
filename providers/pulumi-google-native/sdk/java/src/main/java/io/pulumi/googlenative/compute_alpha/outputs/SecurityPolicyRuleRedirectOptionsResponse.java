// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleRedirectOptionsResponse {
    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    private final String target;
    /**
     * Type of the redirect action.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SecurityPolicyRuleRedirectOptionsResponse(
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("type") String type) {
        this.target = target;
        this.type = type;
    }

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
    */
    public String target() {
        return this.target;
    }
    /**
     * Type of the redirect action.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SecurityPolicyRuleRedirectOptionsResponse build() {
            return new SecurityPolicyRuleRedirectOptionsResponse(target, type);
        }
    }
}
