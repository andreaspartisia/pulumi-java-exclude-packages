// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnrollmentStatusResult {
    /**
     * @return The OCID of the compartment.
     * 
     */
    private final String compartmentId;
    private final String enrollmentStatusId;
    /**
     * @return The OCID of the enrollment status.
     * 
     */
    private final String id;
    /**
     * @return The enrollment status&#39; current state.
     * 
     */
    private final String state;
    /**
     * @return The current Cloud Advisor enrollment status.
     * 
     */
    private final String status;
    /**
     * @return The reason for the enrollment status of the tenancy.
     * 
     */
    private final String statusReason;
    /**
     * @return The date and time the enrollment status was created, in the format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the enrollment status was last updated, in the format defined by RFC3339.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetEnrollmentStatusResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("enrollmentStatusId") String enrollmentStatusId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusReason") String statusReason,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.compartmentId = compartmentId;
        this.enrollmentStatusId = enrollmentStatusId;
        this.id = id;
        this.state = state;
        this.status = status;
        this.statusReason = statusReason;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public String enrollmentStatusId() {
        return this.enrollmentStatusId;
    }
    /**
     * @return The OCID of the enrollment status.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The enrollment status&#39; current state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The current Cloud Advisor enrollment status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The reason for the enrollment status of the tenancy.
     * 
     */
    public String statusReason() {
        return this.statusReason;
    }
    /**
     * @return The date and time the enrollment status was created, in the format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the enrollment status was last updated, in the format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnrollmentStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String enrollmentStatusId;
        private String id;
        private String state;
        private String status;
        private String statusReason;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnrollmentStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.enrollmentStatusId = defaults.enrollmentStatusId;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder enrollmentStatusId(String enrollmentStatusId) {
            this.enrollmentStatusId = Objects.requireNonNull(enrollmentStatusId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetEnrollmentStatusResult build() {
            return new GetEnrollmentStatusResult(compartmentId, enrollmentStatusId, id, state, status, statusReason, timeCreated, timeUpdated);
        }
    }
}
