// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetAutonomousContainerPatchesAutonomousPatch;
import com.pulumi.oci.Database.outputs.GetAutonomousContainerPatchesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAutonomousContainerPatchesResult {
    private final String autonomousContainerDatabaseId;
    /**
     * @return The list of autonomous_patches.
     * 
     */
    private final List<GetAutonomousContainerPatchesAutonomousPatch> autonomousPatches;
    private final String compartmentId;
    private final @Nullable List<GetAutonomousContainerPatchesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetAutonomousContainerPatchesResult(
        @CustomType.Parameter("autonomousContainerDatabaseId") String autonomousContainerDatabaseId,
        @CustomType.Parameter("autonomousPatches") List<GetAutonomousContainerPatchesAutonomousPatch> autonomousPatches,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetAutonomousContainerPatchesFilter> filters,
        @CustomType.Parameter("id") String id) {
        this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
        this.autonomousPatches = autonomousPatches;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
    }

    public String autonomousContainerDatabaseId() {
        return this.autonomousContainerDatabaseId;
    }
    /**
     * @return The list of autonomous_patches.
     * 
     */
    public List<GetAutonomousContainerPatchesAutonomousPatch> autonomousPatches() {
        return this.autonomousPatches;
    }
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetAutonomousContainerPatchesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousContainerPatchesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autonomousContainerDatabaseId;
        private List<GetAutonomousContainerPatchesAutonomousPatch> autonomousPatches;
        private String compartmentId;
        private @Nullable List<GetAutonomousContainerPatchesFilter> filters;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousContainerPatchesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomousContainerDatabaseId = defaults.autonomousContainerDatabaseId;
    	      this.autonomousPatches = defaults.autonomousPatches;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
        }

        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = Objects.requireNonNull(autonomousContainerDatabaseId);
            return this;
        }
        public Builder autonomousPatches(List<GetAutonomousContainerPatchesAutonomousPatch> autonomousPatches) {
            this.autonomousPatches = Objects.requireNonNull(autonomousPatches);
            return this;
        }
        public Builder autonomousPatches(GetAutonomousContainerPatchesAutonomousPatch... autonomousPatches) {
            return autonomousPatches(List.of(autonomousPatches));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetAutonomousContainerPatchesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAutonomousContainerPatchesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetAutonomousContainerPatchesResult build() {
            return new GetAutonomousContainerPatchesResult(autonomousContainerDatabaseId, autonomousPatches, compartmentId, filters, id);
        }
    }
}
