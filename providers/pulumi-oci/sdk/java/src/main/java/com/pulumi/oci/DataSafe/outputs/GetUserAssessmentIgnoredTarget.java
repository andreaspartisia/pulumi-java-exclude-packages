// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserAssessmentIgnoredTarget {
    private final String lifecycleState;
    private final String targetId;
    /**
     * @return The OCID of the user assessment.
     * 
     */
    private final String userAssessmentId;

    @CustomType.Constructor
    private GetUserAssessmentIgnoredTarget(
        @CustomType.Parameter("lifecycleState") String lifecycleState,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("userAssessmentId") String userAssessmentId) {
        this.lifecycleState = lifecycleState;
        this.targetId = targetId;
        this.userAssessmentId = userAssessmentId;
    }

    public String lifecycleState() {
        return this.lifecycleState;
    }
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The OCID of the user assessment.
     * 
     */
    public String userAssessmentId() {
        return this.userAssessmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserAssessmentIgnoredTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lifecycleState;
        private String targetId;
        private String userAssessmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserAssessmentIgnoredTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.targetId = defaults.targetId;
    	      this.userAssessmentId = defaults.userAssessmentId;
        }

        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = Objects.requireNonNull(userAssessmentId);
            return this;
        }        public GetUserAssessmentIgnoredTarget build() {
            return new GetUserAssessmentIgnoredTarget(lifecycleState, targetId, userAssessmentId);
        }
    }
}
