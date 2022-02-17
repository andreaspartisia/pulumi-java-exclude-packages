// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomExprArgs;
import java.util.Objects;


public final class AccessLevelsAccessLevelCustomArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsAccessLevelCustomArgs Empty = new AccessLevelsAccessLevelCustomArgs();

    /**
     * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * 
     */
    @InputImport(name="expr", required=true)
    private final Input<AccessLevelsAccessLevelCustomExprArgs> expr;

    public Input<AccessLevelsAccessLevelCustomExprArgs> getExpr() {
        return this.expr;
    }

    public AccessLevelsAccessLevelCustomArgs(Input<AccessLevelsAccessLevelCustomExprArgs> expr) {
        this.expr = Objects.requireNonNull(expr, "expected parameter 'expr' to be non-null");
    }

    private AccessLevelsAccessLevelCustomArgs() {
        this.expr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AccessLevelsAccessLevelCustomExprArgs> expr;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelCustomArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder setExpr(Input<AccessLevelsAccessLevelCustomExprArgs> expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }

        public Builder setExpr(AccessLevelsAccessLevelCustomExprArgs expr) {
            this.expr = Input.of(Objects.requireNonNull(expr));
            return this;
        }

        public AccessLevelsAccessLevelCustomArgs build() {
            return new AccessLevelsAccessLevelCustomArgs(expr);
        }
    }
}