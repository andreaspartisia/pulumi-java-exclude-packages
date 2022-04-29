// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.FileStorage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.FileStorage.inputs.GetSnapshotsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotsArgs Empty = new GetSnapshotsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file system.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private String fileSystemId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file system.
     * 
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    @Import(name="filters")
    private @Nullable List<GetSnapshotsFilter> filters;

    public Optional<List<GetSnapshotsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Filter results by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be an OCID of the correct type for the resouce type.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Filter results by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be an OCID of the correct type for the resouce type.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Filter results by the specified lifecycle state. Must be a valid state for the resource type.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Filter results by the specified lifecycle state. Must be a valid state for the resource type.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetSnapshotsArgs() {}

    private GetSnapshotsArgs(GetSnapshotsArgs $) {
        this.fileSystemId = $.fileSystemId;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotsArgs $;

        public Builder() {
            $ = new GetSnapshotsArgs();
        }

        public Builder(GetSnapshotsArgs defaults) {
            $ = new GetSnapshotsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file system.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public Builder filters(@Nullable List<GetSnapshotsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetSnapshotsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Filter results by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be an OCID of the correct type for the resouce type.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param state Filter results by the specified lifecycle state. Must be a valid state for the resource type.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetSnapshotsArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}
