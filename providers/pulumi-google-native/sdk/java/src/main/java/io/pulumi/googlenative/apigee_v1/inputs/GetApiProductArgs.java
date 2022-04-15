// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiProductArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiProductArgs Empty = new GetApiProductArgs();

    @Import(name="apiproductId", required=true)
      private final String apiproductId;

    public String apiproductId() {
        return this.apiproductId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    public GetApiProductArgs(
        String apiproductId,
        String organizationId) {
        this.apiproductId = Objects.requireNonNull(apiproductId, "expected parameter 'apiproductId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetApiProductArgs() {
        this.apiproductId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiproductId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproductId = defaults.apiproductId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder apiproductId(String apiproductId) {
            this.apiproductId = Objects.requireNonNull(apiproductId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GetApiProductArgs build() {
            return new GetApiProductArgs(apiproductId, organizationId);
        }
    }
}
