// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.ApiOperationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on information about the ApiOperation intended to be performed on the target resource of the request. The request must satisfy what is defined in `operations` AND `resources` in order to match.
 * 
 */
public final class IngressToResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngressToResponse Empty = new IngressToResponse();

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
     * 
     */
    @Import(name="operations", required=true)
      private final List<ApiOperationResponse> operations;

    public List<ApiOperationResponse> operations() {
        return this.operations;
    }

    /**
     * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
     * 
     */
    @Import(name="resources", required=true)
      private final List<String> resources;

    public List<String> resources() {
        return this.resources;
    }

    public IngressToResponse(
        List<ApiOperationResponse> operations,
        List<String> resources) {
        this.operations = Objects.requireNonNull(operations, "expected parameter 'operations' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private IngressToResponse() {
        this.operations = List.of();
        this.resources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressToResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApiOperationResponse> operations;
        private List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressToResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(List<ApiOperationResponse> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }
        public Builder operations(ApiOperationResponse... operations) {
            return operations(List.of(operations));
        }
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public IngressToResponse build() {
            return new IngressToResponse(operations, resources);
        }
    }
}
