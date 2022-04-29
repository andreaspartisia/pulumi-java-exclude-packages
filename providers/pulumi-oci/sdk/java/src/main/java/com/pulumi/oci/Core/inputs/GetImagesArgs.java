// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetImagesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagesArgs Empty = new GetImagesArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetImagesFilter> filters;

    public Optional<List<GetImagesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The image&#39;s operating system.  Example: `Oracle Linux`
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable String operatingSystem;

    /**
     * @return The image&#39;s operating system.  Example: `Oracle Linux`
     * 
     */
    public Optional<String> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * The image&#39;s operating system version.  Example: `7.2`
     * 
     */
    @Import(name="operatingSystemVersion")
    private @Nullable String operatingSystemVersion;

    /**
     * @return The image&#39;s operating system version.  Example: `7.2`
     * 
     */
    public Optional<String> operatingSystemVersion() {
        return Optional.ofNullable(this.operatingSystemVersion);
    }

    /**
     * Shape name.
     * 
     */
    @Import(name="shape")
    private @Nullable String shape;

    /**
     * @return Shape name.
     * 
     */
    public Optional<String> shape() {
        return Optional.ofNullable(this.shape);
    }

    /**
     * Sort the resources returned, by creation time or display name. Example `TIMECREATED` or `DISPLAYNAME`.
     * 
     */
    @Import(name="sortBy")
    private @Nullable String sortBy;

    /**
     * @return Sort the resources returned, by creation time or display name. Example `TIMECREATED` or `DISPLAYNAME`.
     * 
     */
    public Optional<String> sortBy() {
        return Optional.ofNullable(this.sortBy);
    }

    /**
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`).
     * 
     */
    @Import(name="sortOrder")
    private @Nullable String sortOrder;

    /**
     * @return The sort order to use, either ascending (`ASC`) or descending (`DESC`).
     * 
     */
    public Optional<String> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }

    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetImagesArgs() {}

    private GetImagesArgs(GetImagesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.operatingSystem = $.operatingSystem;
        this.operatingSystemVersion = $.operatingSystemVersion;
        this.shape = $.shape;
        this.sortBy = $.sortBy;
        this.sortOrder = $.sortOrder;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesArgs $;

        public Builder() {
            $ = new GetImagesArgs();
        }

        public Builder(GetImagesArgs defaults) {
            $ = new GetImagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetImagesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetImagesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param operatingSystem The image&#39;s operating system.  Example: `Oracle Linux`
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable String operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystemVersion The image&#39;s operating system version.  Example: `7.2`
         * 
         * @return builder
         * 
         */
        public Builder operatingSystemVersion(@Nullable String operatingSystemVersion) {
            $.operatingSystemVersion = operatingSystemVersion;
            return this;
        }

        /**
         * @param shape Shape name.
         * 
         * @return builder
         * 
         */
        public Builder shape(@Nullable String shape) {
            $.shape = shape;
            return this;
        }

        /**
         * @param sortBy Sort the resources returned, by creation time or display name. Example `TIMECREATED` or `DISPLAYNAME`.
         * 
         * @return builder
         * 
         */
        public Builder sortBy(@Nullable String sortBy) {
            $.sortBy = sortBy;
            return this;
        }

        /**
         * @param sortOrder The sort order to use, either ascending (`ASC`) or descending (`DESC`).
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(@Nullable String sortOrder) {
            $.sortOrder = sortOrder;
            return this;
        }

        /**
         * @param state A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetImagesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
