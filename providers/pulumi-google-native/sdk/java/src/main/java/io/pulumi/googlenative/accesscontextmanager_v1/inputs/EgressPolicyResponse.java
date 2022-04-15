// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressFromResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressToResponse;
import java.util.Objects;


/**
 * Policy for egress from perimeter. EgressPolicies match requests based on `egress_from` and `egress_to` stanzas. For an EgressPolicy to match, both `egress_from` and `egress_to` stanzas must be matched. If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter boundary. For example, an EgressPolicy can be used to allow VMs on networks within the ServicePerimeter to access a defined set of projects outside the perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket or query against a BigQuery dataset). EgressPolicies are concerned with the *resources* that a request relates as well as the API services and API actions being used. They do not related to the direction of data movement. More detailed documentation for this concept can be found in the descriptions of EgressFrom and EgressTo.
 * 
 */
public final class EgressPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final EgressPolicyResponse Empty = new EgressPolicyResponse();

    /**
     * Defines conditions on the source of a request causing this EgressPolicy to apply.
     * 
     */
    @Import(name="egressFrom", required=true)
      private final EgressFromResponse egressFrom;

    public EgressFromResponse egressFrom() {
        return this.egressFrom;
    }

    /**
     * Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply.
     * 
     */
    @Import(name="egressTo", required=true)
      private final EgressToResponse egressTo;

    public EgressToResponse egressTo() {
        return this.egressTo;
    }

    public EgressPolicyResponse(
        EgressFromResponse egressFrom,
        EgressToResponse egressTo) {
        this.egressFrom = Objects.requireNonNull(egressFrom, "expected parameter 'egressFrom' to be non-null");
        this.egressTo = Objects.requireNonNull(egressTo, "expected parameter 'egressTo' to be non-null");
    }

    private EgressPolicyResponse() {
        this.egressFrom = null;
        this.egressTo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EgressFromResponse egressFrom;
        private EgressToResponse egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(EgressFromResponse egressFrom) {
            this.egressFrom = Objects.requireNonNull(egressFrom);
            return this;
        }
        public Builder egressTo(EgressToResponse egressTo) {
            this.egressTo = Objects.requireNonNull(egressTo);
            return this;
        }        public EgressPolicyResponse build() {
            return new EgressPolicyResponse(egressFrom, egressTo);
        }
    }
}
