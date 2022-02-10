// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlSigningParamIdentifierResponse {
    private final String paramIndicator;
    private final String paramName;

    @OutputCustomType.Constructor({"paramIndicator","paramName"})
    private UrlSigningParamIdentifierResponse(
        String paramIndicator,
        String paramName) {
        this.paramIndicator = Objects.requireNonNull(paramIndicator);
        this.paramName = Objects.requireNonNull(paramName);
    }

    public String getParamIndicator() {
        return this.paramIndicator;
    }
    public String getParamName() {
        return this.paramName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningParamIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String paramIndicator;
        private String paramName;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningParamIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paramIndicator = defaults.paramIndicator;
    	      this.paramName = defaults.paramName;
        }

        public Builder setParamIndicator(String paramIndicator) {
            this.paramIndicator = Objects.requireNonNull(paramIndicator);
            return this;
        }

        public Builder setParamName(String paramName) {
            this.paramName = Objects.requireNonNull(paramName);
            return this;
        }

        public UrlSigningParamIdentifierResponse build() {
            return new UrlSigningParamIdentifierResponse(paramIndicator, paramName);
        }
    }
}