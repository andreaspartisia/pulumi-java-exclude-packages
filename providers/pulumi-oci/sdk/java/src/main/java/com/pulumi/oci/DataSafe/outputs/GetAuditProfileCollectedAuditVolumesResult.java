// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection;
import com.pulumi.oci.DataSafe.outputs.GetAuditProfileCollectedAuditVolumesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuditProfileCollectedAuditVolumesResult {
    /**
     * @return The OCID of the audit profile resource.
     * 
     */
    private final String auditProfileId;
    /**
     * @return The list of collected_audit_volume_collection.
     * 
     */
    private final List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection> collectedAuditVolumeCollections;
    private final @Nullable List<GetAuditProfileCollectedAuditVolumesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String monthInConsiderationGreaterThan;
    private final @Nullable String monthInConsiderationLessThan;
    private final String workRequestId;

    @CustomType.Constructor
    private GetAuditProfileCollectedAuditVolumesResult(
        @CustomType.Parameter("auditProfileId") String auditProfileId,
        @CustomType.Parameter("collectedAuditVolumeCollections") List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection> collectedAuditVolumeCollections,
        @CustomType.Parameter("filters") @Nullable List<GetAuditProfileCollectedAuditVolumesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("monthInConsiderationGreaterThan") @Nullable String monthInConsiderationGreaterThan,
        @CustomType.Parameter("monthInConsiderationLessThan") @Nullable String monthInConsiderationLessThan,
        @CustomType.Parameter("workRequestId") String workRequestId) {
        this.auditProfileId = auditProfileId;
        this.collectedAuditVolumeCollections = collectedAuditVolumeCollections;
        this.filters = filters;
        this.id = id;
        this.monthInConsiderationGreaterThan = monthInConsiderationGreaterThan;
        this.monthInConsiderationLessThan = monthInConsiderationLessThan;
        this.workRequestId = workRequestId;
    }

    /**
     * @return The OCID of the audit profile resource.
     * 
     */
    public String auditProfileId() {
        return this.auditProfileId;
    }
    /**
     * @return The list of collected_audit_volume_collection.
     * 
     */
    public List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection> collectedAuditVolumeCollections() {
        return this.collectedAuditVolumeCollections;
    }
    public List<GetAuditProfileCollectedAuditVolumesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> monthInConsiderationGreaterThan() {
        return Optional.ofNullable(this.monthInConsiderationGreaterThan);
    }
    public Optional<String> monthInConsiderationLessThan() {
        return Optional.ofNullable(this.monthInConsiderationLessThan);
    }
    public String workRequestId() {
        return this.workRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditProfileCollectedAuditVolumesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String auditProfileId;
        private List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection> collectedAuditVolumeCollections;
        private @Nullable List<GetAuditProfileCollectedAuditVolumesFilter> filters;
        private String id;
        private @Nullable String monthInConsiderationGreaterThan;
        private @Nullable String monthInConsiderationLessThan;
        private String workRequestId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditProfileCollectedAuditVolumesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditProfileId = defaults.auditProfileId;
    	      this.collectedAuditVolumeCollections = defaults.collectedAuditVolumeCollections;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.monthInConsiderationGreaterThan = defaults.monthInConsiderationGreaterThan;
    	      this.monthInConsiderationLessThan = defaults.monthInConsiderationLessThan;
    	      this.workRequestId = defaults.workRequestId;
        }

        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = Objects.requireNonNull(auditProfileId);
            return this;
        }
        public Builder collectedAuditVolumeCollections(List<GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection> collectedAuditVolumeCollections) {
            this.collectedAuditVolumeCollections = Objects.requireNonNull(collectedAuditVolumeCollections);
            return this;
        }
        public Builder collectedAuditVolumeCollections(GetAuditProfileCollectedAuditVolumesCollectedAuditVolumeCollection... collectedAuditVolumeCollections) {
            return collectedAuditVolumeCollections(List.of(collectedAuditVolumeCollections));
        }
        public Builder filters(@Nullable List<GetAuditProfileCollectedAuditVolumesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAuditProfileCollectedAuditVolumesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder monthInConsiderationGreaterThan(@Nullable String monthInConsiderationGreaterThan) {
            this.monthInConsiderationGreaterThan = monthInConsiderationGreaterThan;
            return this;
        }
        public Builder monthInConsiderationLessThan(@Nullable String monthInConsiderationLessThan) {
            this.monthInConsiderationLessThan = monthInConsiderationLessThan;
            return this;
        }
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = Objects.requireNonNull(workRequestId);
            return this;
        }        public GetAuditProfileCollectedAuditVolumesResult build() {
            return new GetAuditProfileCollectedAuditVolumesResult(auditProfileId, collectedAuditVolumeCollections, filters, id, monthInConsiderationGreaterThan, monthInConsiderationLessThan, workRequestId);
        }
    }
}
