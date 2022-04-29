// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAssociationResult {
    /**
     * @return The OCID of the associated resource.
     * 
     */
    private final String associatedResourceId;
    private final String associationId;
    /**
     * @return Type of the association.
     * 
     */
    private final String associationType;
    /**
     * @return The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
     * 
     */
    private final String certificatesResourceId;
    /**
     * @return The compartment OCID of the association, which is strongly tied to the compartment OCID of the certificate-related resource.
     * 
     */
    private final String compartmentId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A user-friendly name generated by the service for the association, expressed in a format that follows the pattern: [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
     * 
     */
    private final String name;
    /**
     * @return The current lifecycle state of the association.
     * 
     */
    private final String state;
    /**
     * @return A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetAssociationResult(
        @CustomType.Parameter("associatedResourceId") String associatedResourceId,
        @CustomType.Parameter("associationId") String associationId,
        @CustomType.Parameter("associationType") String associationType,
        @CustomType.Parameter("certificatesResourceId") String certificatesResourceId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.associatedResourceId = associatedResourceId;
        this.associationId = associationId;
        this.associationType = associationType;
        this.certificatesResourceId = certificatesResourceId;
        this.compartmentId = compartmentId;
        this.id = id;
        this.name = name;
        this.state = state;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID of the associated resource.
     * 
     */
    public String associatedResourceId() {
        return this.associatedResourceId;
    }
    public String associationId() {
        return this.associationId;
    }
    /**
     * @return Type of the association.
     * 
     */
    public String associationType() {
        return this.associationType;
    }
    /**
     * @return The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
     * 
     */
    public String certificatesResourceId() {
        return this.certificatesResourceId;
    }
    /**
     * @return The compartment OCID of the association, which is strongly tied to the compartment OCID of the certificate-related resource.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A user-friendly name generated by the service for the association, expressed in a format that follows the pattern: [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current lifecycle state of the association.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associatedResourceId;
        private String associationId;
        private String associationType;
        private String certificatesResourceId;
        private String compartmentId;
        private String id;
        private String name;
        private String state;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedResourceId = defaults.associatedResourceId;
    	      this.associationId = defaults.associationId;
    	      this.associationType = defaults.associationType;
    	      this.certificatesResourceId = defaults.certificatesResourceId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder associatedResourceId(String associatedResourceId) {
            this.associatedResourceId = Objects.requireNonNull(associatedResourceId);
            return this;
        }
        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public Builder associationType(String associationType) {
            this.associationType = Objects.requireNonNull(associationType);
            return this;
        }
        public Builder certificatesResourceId(String certificatesResourceId) {
            this.certificatesResourceId = Objects.requireNonNull(certificatesResourceId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetAssociationResult build() {
            return new GetAssociationResult(associatedResourceId, associationId, associationType, certificatesResourceId, compartmentId, id, name, state, timeCreated);
        }
    }
}
