// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetDbSystemsDbSystemIormConfigCachDbPlan;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDbSystemsDbSystemIormConfigCach {
    private final List<GetDbSystemsDbSystemIormConfigCachDbPlan> dbPlans;
    private final String dbSystemId;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    private final String objective;
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetDbSystemsDbSystemIormConfigCach(
        @CustomType.Parameter("dbPlans") List<GetDbSystemsDbSystemIormConfigCachDbPlan> dbPlans,
        @CustomType.Parameter("dbSystemId") String dbSystemId,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("objective") String objective,
        @CustomType.Parameter("state") String state) {
        this.dbPlans = dbPlans;
        this.dbSystemId = dbSystemId;
        this.lifecycleDetails = lifecycleDetails;
        this.objective = objective;
        this.state = state;
    }

    public List<GetDbSystemsDbSystemIormConfigCachDbPlan> dbPlans() {
        return this.dbPlans;
    }
    public String dbSystemId() {
        return this.dbSystemId;
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    public String objective() {
        return this.objective;
    }
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbSystemsDbSystemIormConfigCach defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDbSystemsDbSystemIormConfigCachDbPlan> dbPlans;
        private String dbSystemId;
        private String lifecycleDetails;
        private String objective;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDbSystemsDbSystemIormConfigCach defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbPlans = defaults.dbPlans;
    	      this.dbSystemId = defaults.dbSystemId;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.objective = defaults.objective;
    	      this.state = defaults.state;
        }

        public Builder dbPlans(List<GetDbSystemsDbSystemIormConfigCachDbPlan> dbPlans) {
            this.dbPlans = Objects.requireNonNull(dbPlans);
            return this;
        }
        public Builder dbPlans(GetDbSystemsDbSystemIormConfigCachDbPlan... dbPlans) {
            return dbPlans(List.of(dbPlans));
        }
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = Objects.requireNonNull(dbSystemId);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder objective(String objective) {
            this.objective = Objects.requireNonNull(objective);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetDbSystemsDbSystemIormConfigCach build() {
            return new GetDbSystemsDbSystemIormConfigCach(dbPlans, dbSystemId, lifecycleDetails, objective, state);
        }
    }
}
