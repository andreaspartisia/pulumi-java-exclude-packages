// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointServicePrivateDnsNameConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServicePrivateDnsNameConfigurationArgs Empty = new VpcEndpointServicePrivateDnsNameConfigurationArgs();

    /**
     * Name of the record subdomain the service provider needs to create.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Endpoint service verification type, for example `TXT`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Value the service provider adds to the private DNS name domain record before verification.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public VpcEndpointServicePrivateDnsNameConfigurationArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> state,
        @Nullable Input<String> type,
        @Nullable Input<String> value) {
        this.name = name;
        this.state = state;
        this.type = type;
        this.value = value;
    }

    private VpcEndpointServicePrivateDnsNameConfigurationArgs() {
        this.name = Input.empty();
        this.state = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointServicePrivateDnsNameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> state;
        private @Nullable Input<String> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointServicePrivateDnsNameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public VpcEndpointServicePrivateDnsNameConfigurationArgs build() {
            return new VpcEndpointServicePrivateDnsNameConfigurationArgs(name, state, type, value);
        }
    }
}