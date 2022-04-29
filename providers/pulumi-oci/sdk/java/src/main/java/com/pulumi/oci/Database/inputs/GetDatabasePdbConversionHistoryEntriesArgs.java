// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDatabasePdbConversionHistoryEntriesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasePdbConversionHistoryEntriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasePdbConversionHistoryEntriesArgs Empty = new GetDatabasePdbConversionHistoryEntriesArgs();

    /**
     * The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="databaseId", required=true)
    private String databaseId;

    /**
     * @return The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String databaseId() {
        return this.databaseId;
    }

    @Import(name="filters")
    private @Nullable List<GetDatabasePdbConversionHistoryEntriesFilter> filters;

    public Optional<List<GetDatabasePdbConversionHistoryEntriesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only the pluggable database conversion history entries that match the specified conversion action. For example, you can use this filter to return only entries for the precheck operation.
     * 
     */
    @Import(name="pdbConversionAction")
    private @Nullable String pdbConversionAction;

    /**
     * @return A filter to return only the pluggable database conversion history entries that match the specified conversion action. For example, you can use this filter to return only entries for the precheck operation.
     * 
     */
    public Optional<String> pdbConversionAction() {
        return Optional.ofNullable(this.pdbConversionAction);
    }

    /**
     * A filter to return only the pluggable database conversion history entries that match the specified lifecycle state. For example, you can use this filter to return only entries in the &#34;failed&#34; lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only the pluggable database conversion history entries that match the specified lifecycle state. For example, you can use this filter to return only entries in the &#34;failed&#34; lifecycle state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetDatabasePdbConversionHistoryEntriesArgs() {}

    private GetDatabasePdbConversionHistoryEntriesArgs(GetDatabasePdbConversionHistoryEntriesArgs $) {
        this.databaseId = $.databaseId;
        this.filters = $.filters;
        this.pdbConversionAction = $.pdbConversionAction;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasePdbConversionHistoryEntriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasePdbConversionHistoryEntriesArgs $;

        public Builder() {
            $ = new GetDatabasePdbConversionHistoryEntriesArgs();
        }

        public Builder(GetDatabasePdbConversionHistoryEntriesArgs defaults) {
            $ = new GetDatabasePdbConversionHistoryEntriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder filters(@Nullable List<GetDatabasePdbConversionHistoryEntriesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDatabasePdbConversionHistoryEntriesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param pdbConversionAction A filter to return only the pluggable database conversion history entries that match the specified conversion action. For example, you can use this filter to return only entries for the precheck operation.
         * 
         * @return builder
         * 
         */
        public Builder pdbConversionAction(@Nullable String pdbConversionAction) {
            $.pdbConversionAction = pdbConversionAction;
            return this;
        }

        /**
         * @param state A filter to return only the pluggable database conversion history entries that match the specified lifecycle state. For example, you can use this filter to return only entries in the &#34;failed&#34; lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetDatabasePdbConversionHistoryEntriesArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            return $;
        }
    }

}
