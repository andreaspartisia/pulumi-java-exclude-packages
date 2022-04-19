// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.CacheExpirationActionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the cache expiration action for the delivery rule.
 * 
 */
public final class DeliveryRuleCacheExpirationActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleCacheExpirationActionArgs Empty = new DeliveryRuleCacheExpirationActionArgs();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'CacheExpiration'.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<CacheExpirationActionParametersArgs> parameters;

    public Output<CacheExpirationActionParametersArgs> parameters() {
        return this.parameters;
    }

    public DeliveryRuleCacheExpirationActionArgs(
        Output<String> name,
        Output<CacheExpirationActionParametersArgs> parameters) {
        this.name = Codegen.stringProp("name").output().arg(name).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleCacheExpirationActionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCacheExpirationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<CacheExpirationActionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCacheExpirationActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(Output<CacheExpirationActionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(CacheExpirationActionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public DeliveryRuleCacheExpirationActionArgs build() {
            return new DeliveryRuleCacheExpirationActionArgs(name, parameters);
        }
    }
}
