// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.jobs_v4.outputs.LocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobDerivedInfoResponse {
    /**
     * Job categories derived from Job.title and Job.description.
     * 
     */
    private final List<String> jobCategories;
    /**
     * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
     * 
     */
    private final List<LocationResponse> locations;

    @CustomType.Constructor
    private JobDerivedInfoResponse(
        @CustomType.Parameter("jobCategories") List<String> jobCategories,
        @CustomType.Parameter("locations") List<LocationResponse> locations) {
        this.jobCategories = jobCategories;
        this.locations = locations;
    }

    /**
     * Job categories derived from Job.title and Job.description.
     * 
    */
    public List<String> jobCategories() {
        return this.jobCategories;
    }
    /**
     * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
     * 
    */
    public List<LocationResponse> locations() {
        return this.locations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDerivedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jobCategories;
        private List<LocationResponse> locations;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDerivedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCategories = defaults.jobCategories;
    	      this.locations = defaults.locations;
        }

        public Builder jobCategories(List<String> jobCategories) {
            this.jobCategories = Objects.requireNonNull(jobCategories);
            return this;
        }
        public Builder jobCategories(String... jobCategories) {
            return jobCategories(List.of(jobCategories));
        }
        public Builder locations(List<LocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(LocationResponse... locations) {
            return locations(List.of(locations));
        }        public JobDerivedInfoResponse build() {
            return new JobDerivedInfoResponse(jobCategories, locations);
        }
    }
}
