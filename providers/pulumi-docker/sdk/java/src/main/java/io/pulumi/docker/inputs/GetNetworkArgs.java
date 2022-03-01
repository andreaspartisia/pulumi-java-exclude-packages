// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkArgs Empty = new GetNetworkArgs();

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetNetworkArgs(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetNetworkArgs() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetNetworkArgs build() {
            return new GetNetworkArgs(name);
        }
    }
}
