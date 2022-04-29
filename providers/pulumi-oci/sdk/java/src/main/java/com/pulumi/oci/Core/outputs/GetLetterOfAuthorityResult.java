// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLetterOfAuthorityResult {
    /**
     * @return The name of the entity authorized by this Letter of Authority.
     * 
     */
    private final String authorizedEntityName;
    /**
     * @return The type of cross-connect fiber, termination, and optical specification.
     * 
     */
    private final String circuitType;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
     * 
     */
    private final String crossConnectId;
    /**
     * @return The address of the FastConnect location.
     * 
     */
    private final String facilityLocation;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The meet-me room port for this cross-connect.
     * 
     */
    private final String portName;
    /**
     * @return The date and time when the Letter of Authority expires, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeExpires;
    /**
     * @return The date and time the Letter of Authority was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeIssued;

    @CustomType.Constructor
    private GetLetterOfAuthorityResult(
        @CustomType.Parameter("authorizedEntityName") String authorizedEntityName,
        @CustomType.Parameter("circuitType") String circuitType,
        @CustomType.Parameter("crossConnectId") String crossConnectId,
        @CustomType.Parameter("facilityLocation") String facilityLocation,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("portName") String portName,
        @CustomType.Parameter("timeExpires") String timeExpires,
        @CustomType.Parameter("timeIssued") String timeIssued) {
        this.authorizedEntityName = authorizedEntityName;
        this.circuitType = circuitType;
        this.crossConnectId = crossConnectId;
        this.facilityLocation = facilityLocation;
        this.id = id;
        this.portName = portName;
        this.timeExpires = timeExpires;
        this.timeIssued = timeIssued;
    }

    /**
     * @return The name of the entity authorized by this Letter of Authority.
     * 
     */
    public String authorizedEntityName() {
        return this.authorizedEntityName;
    }
    /**
     * @return The type of cross-connect fiber, termination, and optical specification.
     * 
     */
    public String circuitType() {
        return this.circuitType;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
     * 
     */
    public String crossConnectId() {
        return this.crossConnectId;
    }
    /**
     * @return The address of the FastConnect location.
     * 
     */
    public String facilityLocation() {
        return this.facilityLocation;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The meet-me room port for this cross-connect.
     * 
     */
    public String portName() {
        return this.portName;
    }
    /**
     * @return The date and time when the Letter of Authority expires, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeExpires() {
        return this.timeExpires;
    }
    /**
     * @return The date and time the Letter of Authority was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeIssued() {
        return this.timeIssued;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLetterOfAuthorityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizedEntityName;
        private String circuitType;
        private String crossConnectId;
        private String facilityLocation;
        private String id;
        private String portName;
        private String timeExpires;
        private String timeIssued;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLetterOfAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedEntityName = defaults.authorizedEntityName;
    	      this.circuitType = defaults.circuitType;
    	      this.crossConnectId = defaults.crossConnectId;
    	      this.facilityLocation = defaults.facilityLocation;
    	      this.id = defaults.id;
    	      this.portName = defaults.portName;
    	      this.timeExpires = defaults.timeExpires;
    	      this.timeIssued = defaults.timeIssued;
        }

        public Builder authorizedEntityName(String authorizedEntityName) {
            this.authorizedEntityName = Objects.requireNonNull(authorizedEntityName);
            return this;
        }
        public Builder circuitType(String circuitType) {
            this.circuitType = Objects.requireNonNull(circuitType);
            return this;
        }
        public Builder crossConnectId(String crossConnectId) {
            this.crossConnectId = Objects.requireNonNull(crossConnectId);
            return this;
        }
        public Builder facilityLocation(String facilityLocation) {
            this.facilityLocation = Objects.requireNonNull(facilityLocation);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        public Builder timeExpires(String timeExpires) {
            this.timeExpires = Objects.requireNonNull(timeExpires);
            return this;
        }
        public Builder timeIssued(String timeIssued) {
            this.timeIssued = Objects.requireNonNull(timeIssued);
            return this;
        }        public GetLetterOfAuthorityResult build() {
            return new GetLetterOfAuthorityResult(authorizedEntityName, circuitType, crossConnectId, facilityLocation, id, portName, timeExpires, timeIssued);
        }
    }
}
