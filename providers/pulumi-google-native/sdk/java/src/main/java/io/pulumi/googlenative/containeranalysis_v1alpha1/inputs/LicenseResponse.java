// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LicenseResponse extends io.pulumi.resources.InvokeArgs {

    public static final LicenseResponse Empty = new LicenseResponse();

    @InputImport(name="comments", required=true)
    private final String comments;

    public String getComments() {
        return this.comments;
    }

    @InputImport(name="expression", required=true)
    private final String expression;

    public String getExpression() {
        return this.expression;
    }

    public LicenseResponse(
        String comments,
        String expression) {
        this.comments = Objects.requireNonNull(comments, "expected parameter 'comments' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private LicenseResponse() {
        this.comments = null;
        this.expression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comments;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.expression = defaults.expression;
        }

        public Builder setComments(String comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public LicenseResponse build() {
            return new LicenseResponse(comments, expression);
        }
    }
}