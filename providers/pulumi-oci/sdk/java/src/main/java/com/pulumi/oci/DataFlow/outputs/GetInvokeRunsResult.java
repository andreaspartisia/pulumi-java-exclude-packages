// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataFlow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataFlow.outputs.GetInvokeRunsFilter;
import com.pulumi.oci.DataFlow.outputs.GetInvokeRunsRun;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInvokeRunsResult {
    /**
     * @return The application ID.
     * 
     */
    private final @Nullable String applicationId;
    /**
     * @return The OCID of a compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return A user-friendly name. This name is not necessarily unique.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable String displayNameStartsWith;
    private final @Nullable List<GetInvokeRunsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the user who created the resource.
     * 
     */
    private final @Nullable String ownerPrincipalId;
    /**
     * @return The list of runs.
     * 
     */
    private final List<GetInvokeRunsRun> runs;
    /**
     * @return The current state of this run.
     * 
     */
    private final @Nullable String state;
    private final @Nullable String timeCreatedGreaterThan;

    @CustomType.Constructor
    private GetInvokeRunsResult(
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("displayNameStartsWith") @Nullable String displayNameStartsWith,
        @CustomType.Parameter("filters") @Nullable List<GetInvokeRunsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ownerPrincipalId") @Nullable String ownerPrincipalId,
        @CustomType.Parameter("runs") List<GetInvokeRunsRun> runs,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("timeCreatedGreaterThan") @Nullable String timeCreatedGreaterThan) {
        this.applicationId = applicationId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.displayNameStartsWith = displayNameStartsWith;
        this.filters = filters;
        this.id = id;
        this.ownerPrincipalId = ownerPrincipalId;
        this.runs = runs;
        this.state = state;
        this.timeCreatedGreaterThan = timeCreatedGreaterThan;
    }

    /**
     * @return The application ID.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * @return The OCID of a compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return A user-friendly name. This name is not necessarily unique.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> displayNameStartsWith() {
        return Optional.ofNullable(this.displayNameStartsWith);
    }
    public List<GetInvokeRunsFilter> filters() {
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
     * @return The OCID of the user who created the resource.
     * 
     */
    public Optional<String> ownerPrincipalId() {
        return Optional.ofNullable(this.ownerPrincipalId);
    }
    /**
     * @return The list of runs.
     * 
     */
    public List<GetInvokeRunsRun> runs() {
        return this.runs;
    }
    /**
     * @return The current state of this run.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> timeCreatedGreaterThan() {
        return Optional.ofNullable(this.timeCreatedGreaterThan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvokeRunsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable String displayNameStartsWith;
        private @Nullable List<GetInvokeRunsFilter> filters;
        private String id;
        private @Nullable String ownerPrincipalId;
        private List<GetInvokeRunsRun> runs;
        private @Nullable String state;
        private @Nullable String timeCreatedGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvokeRunsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.displayNameStartsWith = defaults.displayNameStartsWith;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerPrincipalId = defaults.ownerPrincipalId;
    	      this.runs = defaults.runs;
    	      this.state = defaults.state;
    	      this.timeCreatedGreaterThan = defaults.timeCreatedGreaterThan;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayNameStartsWith(@Nullable String displayNameStartsWith) {
            this.displayNameStartsWith = displayNameStartsWith;
            return this;
        }
        public Builder filters(@Nullable List<GetInvokeRunsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInvokeRunsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ownerPrincipalId(@Nullable String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }
        public Builder runs(List<GetInvokeRunsRun> runs) {
            this.runs = Objects.requireNonNull(runs);
            return this;
        }
        public Builder runs(GetInvokeRunsRun... runs) {
            return runs(List.of(runs));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder timeCreatedGreaterThan(@Nullable String timeCreatedGreaterThan) {
            this.timeCreatedGreaterThan = timeCreatedGreaterThan;
            return this;
        }        public GetInvokeRunsResult build() {
            return new GetInvokeRunsResult(applicationId, compartmentId, displayName, displayNameStartsWith, filters, id, ownerPrincipalId, runs, state, timeCreatedGreaterThan);
        }
    }
}
