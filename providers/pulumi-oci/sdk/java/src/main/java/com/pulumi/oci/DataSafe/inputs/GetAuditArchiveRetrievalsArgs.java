// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetAuditArchiveRetrievalsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuditArchiveRetrievalsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuditArchiveRetrievalsArgs Empty = new GetAuditArchiveRetrievalsArgs();

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable String accessLevel;

    /**
     * @return Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * OCID of the archive retrieval.
     * 
     */
    @Import(name="auditArchiveRetrievalId")
    private @Nullable String auditArchiveRetrievalId;

    /**
     * @return OCID of the archive retrieval.
     * 
     */
    public Optional<String> auditArchiveRetrievalId() {
        return Optional.ofNullable(this.auditArchiveRetrievalId);
    }

    /**
     * A filter to return only resources that match the specified compartment OCID.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * A filter to return only resources that match the specified display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the specified display name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetAuditArchiveRetrievalsFilter> filters;

    public Optional<List<GetAuditArchiveRetrievalsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that matches the specified lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that matches the specified lifecycle state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of the target associated with the archive retrieval.
     * 
     */
    @Import(name="targetId")
    private @Nullable String targetId;

    /**
     * @return The OCID of the target associated with the archive retrieval.
     * 
     */
    public Optional<String> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    /**
     * The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
     * 
     */
    @Import(name="timeOfExpiry")
    private @Nullable String timeOfExpiry;

    /**
     * @return The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
     * 
     */
    public Optional<String> timeOfExpiry() {
        return Optional.ofNullable(this.timeOfExpiry);
    }

    private GetAuditArchiveRetrievalsArgs() {}

    private GetAuditArchiveRetrievalsArgs(GetAuditArchiveRetrievalsArgs $) {
        this.accessLevel = $.accessLevel;
        this.auditArchiveRetrievalId = $.auditArchiveRetrievalId;
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
        this.targetId = $.targetId;
        this.timeOfExpiry = $.timeOfExpiry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuditArchiveRetrievalsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuditArchiveRetrievalsArgs $;

        public Builder() {
            $ = new GetAuditArchiveRetrievalsArgs();
        }

        public Builder(GetAuditArchiveRetrievalsArgs defaults) {
            $ = new GetAuditArchiveRetrievalsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable String accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param auditArchiveRetrievalId OCID of the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder auditArchiveRetrievalId(@Nullable String auditArchiveRetrievalId) {
            $.auditArchiveRetrievalId = auditArchiveRetrievalId;
            return this;
        }

        /**
         * @param compartmentId A filter to return only resources that match the specified compartment OCID.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the specified display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetAuditArchiveRetrievalsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAuditArchiveRetrievalsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that matches the specified lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param targetId The OCID of the target associated with the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable String targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param timeOfExpiry The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
         * 
         * @return builder
         * 
         */
        public Builder timeOfExpiry(@Nullable String timeOfExpiry) {
            $.timeOfExpiry = timeOfExpiry;
            return this;
        }

        public GetAuditArchiveRetrievalsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
