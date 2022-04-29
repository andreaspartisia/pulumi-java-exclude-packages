// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Identity.outputs.GetCompartmentsCompartment;
import com.pulumi.oci.Identity.outputs.GetCompartmentsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCompartmentsResult {
    private final @Nullable String accessLevel;
    /**
     * @return The OCID of the parent compartment containing the compartment.
     * 
     */
    private final String compartmentId;
    private final @Nullable Boolean compartmentIdInSubtree;
    /**
     * @return The list of compartments.
     * 
     */
    private final List<GetCompartmentsCompartment> compartments;
    private final @Nullable List<GetCompartmentsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The name you assign to the compartment during creation. The name must be unique across all compartments in the parent. Avoid entering confidential information.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The compartment&#39;s current state.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetCompartmentsResult(
        @CustomType.Parameter("accessLevel") @Nullable String accessLevel,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("compartmentIdInSubtree") @Nullable Boolean compartmentIdInSubtree,
        @CustomType.Parameter("compartments") List<GetCompartmentsCompartment> compartments,
        @CustomType.Parameter("filters") @Nullable List<GetCompartmentsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("state") @Nullable String state) {
        this.accessLevel = accessLevel;
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.compartments = compartments;
        this.filters = filters;
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }
    /**
     * @return The OCID of the parent compartment containing the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }
    /**
     * @return The list of compartments.
     * 
     */
    public List<GetCompartmentsCompartment> compartments() {
        return this.compartments;
    }
    public List<GetCompartmentsFilter> filters() {
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
     * @return The name you assign to the compartment during creation. The name must be unique across all compartments in the parent. Avoid entering confidential information.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The compartment&#39;s current state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompartmentsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessLevel;
        private String compartmentId;
        private @Nullable Boolean compartmentIdInSubtree;
        private List<GetCompartmentsCompartment> compartments;
        private @Nullable List<GetCompartmentsFilter> filters;
        private String id;
        private @Nullable String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompartmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.compartmentId = defaults.compartmentId;
    	      this.compartmentIdInSubtree = defaults.compartmentIdInSubtree;
    	      this.compartments = defaults.compartments;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder accessLevel(@Nullable String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }
        public Builder compartments(List<GetCompartmentsCompartment> compartments) {
            this.compartments = Objects.requireNonNull(compartments);
            return this;
        }
        public Builder compartments(GetCompartmentsCompartment... compartments) {
            return compartments(List.of(compartments));
        }
        public Builder filters(@Nullable List<GetCompartmentsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCompartmentsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetCompartmentsResult build() {
            return new GetCompartmentsResult(accessLevel, compartmentId, compartmentIdInSubtree, compartments, filters, id, name, state);
        }
    }
}
