// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocationResponse Empty = new LocationResponse();

    @InputImport(name="documentEndpoint", required=true)
    private final String documentEndpoint;

    public String getDocumentEndpoint() {
        return this.documentEndpoint;
    }

    @InputImport(name="failoverPriority")
    private final @Nullable Integer failoverPriority;

    public Optional<Integer> getFailoverPriority() {
        return this.failoverPriority == null ? Optional.empty() : Optional.ofNullable(this.failoverPriority);
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="isZoneRedundant")
    private final @Nullable Boolean isZoneRedundant;

    public Optional<Boolean> getIsZoneRedundant() {
        return this.isZoneRedundant == null ? Optional.empty() : Optional.ofNullable(this.isZoneRedundant);
    }

    @InputImport(name="locationName")
    private final @Nullable String locationName;

    public Optional<String> getLocationName() {
        return this.locationName == null ? Optional.empty() : Optional.ofNullable(this.locationName);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public LocationResponse(
        String documentEndpoint,
        @Nullable Integer failoverPriority,
        String id,
        @Nullable Boolean isZoneRedundant,
        @Nullable String locationName,
        String provisioningState) {
        this.documentEndpoint = Objects.requireNonNull(documentEndpoint, "expected parameter 'documentEndpoint' to be non-null");
        this.failoverPriority = failoverPriority;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isZoneRedundant = isZoneRedundant;
        this.locationName = locationName;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private LocationResponse() {
        this.documentEndpoint = null;
        this.failoverPriority = null;
        this.id = null;
        this.isZoneRedundant = null;
        this.locationName = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentEndpoint;
        private @Nullable Integer failoverPriority;
        private String id;
        private @Nullable Boolean isZoneRedundant;
        private @Nullable String locationName;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentEndpoint = defaults.documentEndpoint;
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.id = defaults.id;
    	      this.isZoneRedundant = defaults.isZoneRedundant;
    	      this.locationName = defaults.locationName;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setDocumentEndpoint(String documentEndpoint) {
            this.documentEndpoint = Objects.requireNonNull(documentEndpoint);
            return this;
        }

        public Builder setFailoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsZoneRedundant(@Nullable Boolean isZoneRedundant) {
            this.isZoneRedundant = isZoneRedundant;
            return this;
        }

        public Builder setLocationName(@Nullable String locationName) {
            this.locationName = locationName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public LocationResponse build() {
            return new LocationResponse(documentEndpoint, failoverPriority, id, isZoneRedundant, locationName, provisioningState);
        }
    }
}