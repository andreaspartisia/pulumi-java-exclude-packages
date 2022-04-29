// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetVirtualCircuitsFilter;
import com.pulumi.oci.Core.outputs.GetVirtualCircuitsVirtualCircuit;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualCircuitsResult {
    /**
     * @return The OCID of the compartment containing the virtual circuit.
     * 
     */
    private final String compartmentId;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetVirtualCircuitsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The virtual circuit&#39;s current state. For information about the different states, see [FastConnect Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     * 
     */
    private final @Nullable String state;
    /**
     * @return The list of virtual_circuits.
     * 
     */
    private final List<GetVirtualCircuitsVirtualCircuit> virtualCircuits;

    @CustomType.Constructor
    private GetVirtualCircuitsResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetVirtualCircuitsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("virtualCircuits") List<GetVirtualCircuitsVirtualCircuit> virtualCircuits) {
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.state = state;
        this.virtualCircuits = virtualCircuits;
    }

    /**
     * @return The OCID of the compartment containing the virtual circuit.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetVirtualCircuitsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The virtual circuit&#39;s current state. For information about the different states, see [FastConnect Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The list of virtual_circuits.
     * 
     */
    public List<GetVirtualCircuitsVirtualCircuit> virtualCircuits() {
        return this.virtualCircuits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualCircuitsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable List<GetVirtualCircuitsFilter> filters;
        private String id;
        private @Nullable String state;
        private List<GetVirtualCircuitsVirtualCircuit> virtualCircuits;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualCircuitsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
    	      this.virtualCircuits = defaults.virtualCircuits;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetVirtualCircuitsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVirtualCircuitsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder virtualCircuits(List<GetVirtualCircuitsVirtualCircuit> virtualCircuits) {
            this.virtualCircuits = Objects.requireNonNull(virtualCircuits);
            return this;
        }
        public Builder virtualCircuits(GetVirtualCircuitsVirtualCircuit... virtualCircuits) {
            return virtualCircuits(List.of(virtualCircuits));
        }        public GetVirtualCircuitsResult build() {
            return new GetVirtualCircuitsResult(compartmentId, displayName, filters, id, state, virtualCircuits);
        }
    }
}
