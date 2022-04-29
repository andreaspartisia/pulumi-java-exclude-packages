// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation;
import com.pulumi.oci.Database.outputs.GetAutonomousDatabaseDataguardAssociationsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAutonomousDatabaseDataguardAssociationsResult {
    /**
     * @return The list of autonomous_database_dataguard_associations.
     * 
     */
    private final List<GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation> autonomousDatabaseDataguardAssociations;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database that has a relationship with the peer Autonomous Database.
     * 
     */
    private final String autonomousDatabaseId;
    private final @Nullable List<GetAutonomousDatabaseDataguardAssociationsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetAutonomousDatabaseDataguardAssociationsResult(
        @CustomType.Parameter("autonomousDatabaseDataguardAssociations") List<GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation> autonomousDatabaseDataguardAssociations,
        @CustomType.Parameter("autonomousDatabaseId") String autonomousDatabaseId,
        @CustomType.Parameter("filters") @Nullable List<GetAutonomousDatabaseDataguardAssociationsFilter> filters,
        @CustomType.Parameter("id") String id) {
        this.autonomousDatabaseDataguardAssociations = autonomousDatabaseDataguardAssociations;
        this.autonomousDatabaseId = autonomousDatabaseId;
        this.filters = filters;
        this.id = id;
    }

    /**
     * @return The list of autonomous_database_dataguard_associations.
     * 
     */
    public List<GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation> autonomousDatabaseDataguardAssociations() {
        return this.autonomousDatabaseDataguardAssociations;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database that has a relationship with the peer Autonomous Database.
     * 
     */
    public String autonomousDatabaseId() {
        return this.autonomousDatabaseId;
    }
    public List<GetAutonomousDatabaseDataguardAssociationsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousDatabaseDataguardAssociationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation> autonomousDatabaseDataguardAssociations;
        private String autonomousDatabaseId;
        private @Nullable List<GetAutonomousDatabaseDataguardAssociationsFilter> filters;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousDatabaseDataguardAssociationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomousDatabaseDataguardAssociations = defaults.autonomousDatabaseDataguardAssociations;
    	      this.autonomousDatabaseId = defaults.autonomousDatabaseId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
        }

        public Builder autonomousDatabaseDataguardAssociations(List<GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation> autonomousDatabaseDataguardAssociations) {
            this.autonomousDatabaseDataguardAssociations = Objects.requireNonNull(autonomousDatabaseDataguardAssociations);
            return this;
        }
        public Builder autonomousDatabaseDataguardAssociations(GetAutonomousDatabaseDataguardAssociationsAutonomousDatabaseDataguardAssociation... autonomousDatabaseDataguardAssociations) {
            return autonomousDatabaseDataguardAssociations(List.of(autonomousDatabaseDataguardAssociations));
        }
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = Objects.requireNonNull(autonomousDatabaseId);
            return this;
        }
        public Builder filters(@Nullable List<GetAutonomousDatabaseDataguardAssociationsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAutonomousDatabaseDataguardAssociationsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetAutonomousDatabaseDataguardAssociationsResult build() {
            return new GetAutonomousDatabaseDataguardAssociationsResult(autonomousDatabaseDataguardAssociations, autonomousDatabaseId, filters, id);
        }
    }
}
