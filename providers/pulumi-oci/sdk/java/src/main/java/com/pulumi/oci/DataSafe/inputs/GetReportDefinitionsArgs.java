// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetReportDefinitionsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReportDefinitionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportDefinitionsArgs Empty = new GetReportDefinitionsArgs();

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
     * An optional filter to return only resources that match the specified category.
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return An optional filter to return only resources that match the specified category.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
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
     * Specifies the name of a resource that provides data for the report. For example  alerts, events.
     * 
     */
    @Import(name="dataSource")
    private @Nullable String dataSource;

    /**
     * @return Specifies the name of a resource that provides data for the report. For example  alerts, events.
     * 
     */
    public Optional<String> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * The name of the report definition to query.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The name of the report definition to query.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetReportDefinitionsFilter> filters;

    public Optional<List<GetReportDefinitionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A boolean flag indicating to list seeded report definitions. Set this parameter to get list of seeded report definitions.
     * 
     */
    @Import(name="isSeeded")
    private @Nullable Boolean isSeeded;

    /**
     * @return A boolean flag indicating to list seeded report definitions. Set this parameter to get list of seeded report definitions.
     * 
     */
    public Optional<Boolean> isSeeded() {
        return Optional.ofNullable(this.isSeeded);
    }

    /**
     * An optional filter to return only resources that match the specified lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return An optional filter to return only resources that match the specified lifecycle state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetReportDefinitionsArgs() {}

    private GetReportDefinitionsArgs(GetReportDefinitionsArgs $) {
        this.accessLevel = $.accessLevel;
        this.category = $.category;
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.dataSource = $.dataSource;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.isSeeded = $.isSeeded;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportDefinitionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportDefinitionsArgs $;

        public Builder() {
            $ = new GetReportDefinitionsArgs();
        }

        public Builder(GetReportDefinitionsArgs defaults) {
            $ = new GetReportDefinitionsArgs(Objects.requireNonNull(defaults));
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
         * @param category An optional filter to return only resources that match the specified category.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
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
         * @param dataSource Specifies the name of a resource that provides data for the report. For example  alerts, events.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(@Nullable String dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param displayName The name of the report definition to query.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetReportDefinitionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetReportDefinitionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isSeeded A boolean flag indicating to list seeded report definitions. Set this parameter to get list of seeded report definitions.
         * 
         * @return builder
         * 
         */
        public Builder isSeeded(@Nullable Boolean isSeeded) {
            $.isSeeded = isSeeded;
            return this;
        }

        /**
         * @param state An optional filter to return only resources that match the specified lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetReportDefinitionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
