// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetInstanceMeasuredBootReportMeasurement;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceMeasuredBootReportResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceId;
    /**
     * @return Whether the verification succeeded, and the new values match the expected values.
     * 
     */
    private final Boolean isPolicyVerificationSuccessful;
    /**
     * @return A list of Trusted Platform Module (TPM) Platform Configuration Register (PCR) entries.
     * 
     */
    private final List<GetInstanceMeasuredBootReportMeasurement> measurements;

    @CustomType.Constructor
    private GetInstanceMeasuredBootReportResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("isPolicyVerificationSuccessful") Boolean isPolicyVerificationSuccessful,
        @CustomType.Parameter("measurements") List<GetInstanceMeasuredBootReportMeasurement> measurements) {
        this.id = id;
        this.instanceId = instanceId;
        this.isPolicyVerificationSuccessful = isPolicyVerificationSuccessful;
        this.measurements = measurements;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Whether the verification succeeded, and the new values match the expected values.
     * 
     */
    public Boolean isPolicyVerificationSuccessful() {
        return this.isPolicyVerificationSuccessful;
    }
    /**
     * @return A list of Trusted Platform Module (TPM) Platform Configuration Register (PCR) entries.
     * 
     */
    public List<GetInstanceMeasuredBootReportMeasurement> measurements() {
        return this.measurements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMeasuredBootReportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String instanceId;
        private Boolean isPolicyVerificationSuccessful;
        private List<GetInstanceMeasuredBootReportMeasurement> measurements;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMeasuredBootReportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.isPolicyVerificationSuccessful = defaults.isPolicyVerificationSuccessful;
    	      this.measurements = defaults.measurements;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder isPolicyVerificationSuccessful(Boolean isPolicyVerificationSuccessful) {
            this.isPolicyVerificationSuccessful = Objects.requireNonNull(isPolicyVerificationSuccessful);
            return this;
        }
        public Builder measurements(List<GetInstanceMeasuredBootReportMeasurement> measurements) {
            this.measurements = Objects.requireNonNull(measurements);
            return this;
        }
        public Builder measurements(GetInstanceMeasuredBootReportMeasurement... measurements) {
            return measurements(List.of(measurements));
        }        public GetInstanceMeasuredBootReportResult build() {
            return new GetInstanceMeasuredBootReportResult(id, instanceId, isPolicyVerificationSuccessful, measurements);
        }
    }
}
