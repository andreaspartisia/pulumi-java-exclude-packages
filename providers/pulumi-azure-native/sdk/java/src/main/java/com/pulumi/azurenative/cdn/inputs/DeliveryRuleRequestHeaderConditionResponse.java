// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.RequestHeaderMatchConditionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestHeader condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestHeaderConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleRequestHeaderConditionResponse Empty = new DeliveryRuleRequestHeaderConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestHeader'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final RequestHeaderMatchConditionParametersResponse parameters;

    public RequestHeaderMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestHeaderConditionResponse(
        String name,
        RequestHeaderMatchConditionParametersResponse parameters) {
        this.name = Codegen.stringProp("name").arg(name).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestHeaderConditionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestHeaderConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestHeaderMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestHeaderConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(RequestHeaderMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestHeaderConditionResponse build() {
            return new DeliveryRuleRequestHeaderConditionResponse(name, parameters);
        }
    }
}
