// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.ExprResponse;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleMatcherConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class SecurityPolicyRuleMatcherResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleMatcherResponse Empty = new SecurityPolicyRuleMatcherResponse();

    /**
     * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    @Import(name="config", required=true)
      private final SecurityPolicyRuleMatcherConfigResponse config;

    public SecurityPolicyRuleMatcherConfigResponse config() {
        return this.config;
    }

    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    @Import(name="expr", required=true)
      private final ExprResponse expr;

    public ExprResponse expr() {
        return this.expr;
    }

    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    @Import(name="versionedExpr", required=true)
      private final String versionedExpr;

    public String versionedExpr() {
        return this.versionedExpr;
    }

    public SecurityPolicyRuleMatcherResponse(
        SecurityPolicyRuleMatcherConfigResponse config,
        ExprResponse expr,
        String versionedExpr) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.expr = Objects.requireNonNull(expr, "expected parameter 'expr' to be non-null");
        this.versionedExpr = Objects.requireNonNull(versionedExpr, "expected parameter 'versionedExpr' to be non-null");
    }

    private SecurityPolicyRuleMatcherResponse() {
        this.config = null;
        this.expr = null;
        this.versionedExpr = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleMatcherConfigResponse config;
        private ExprResponse expr;
        private String versionedExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        public Builder config(SecurityPolicyRuleMatcherConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder expr(ExprResponse expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }
        public Builder versionedExpr(String versionedExpr) {
            this.versionedExpr = Objects.requireNonNull(versionedExpr);
            return this;
        }        public SecurityPolicyRuleMatcherResponse build() {
            return new SecurityPolicyRuleMatcherResponse(config, expr, versionedExpr);
        }
    }
}
