// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OperatorAccessControl.inputs.GetAccessRequestsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccessRequestsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessRequestsArgs Empty = new GetAccessRequestsArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetAccessRequestsFilter> filters;

    public Optional<List<GetAccessRequestsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given ResourceName.
     * 
     */
    @Import(name="resourceName")
    private @Nullable String resourceName;

    /**
     * @return A filter to return only resources that match the given ResourceName.
     * 
     */
    public Optional<String> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * A filter to return only lists of resources that match the entire given service type.
     * 
     */
    @Import(name="resourceType")
    private @Nullable String resourceType;

    /**
     * @return A filter to return only lists of resources that match the entire given service type.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * A filter to return only resources whose lifecycleState matches the given AccessRequest lifecycleState.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources whose lifecycleState matches the given AccessRequest lifecycleState.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Query start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd parameters are used together.
     * 
     */
    @Import(name="timeEnd")
    private @Nullable String timeEnd;

    /**
     * @return Query start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd parameters are used together.
     * 
     */
    public Optional<String> timeEnd() {
        return Optional.ofNullable(this.timeEnd);
    }

    /**
     * Query start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd parameters are used together.
     * 
     */
    @Import(name="timeStart")
    private @Nullable String timeStart;

    /**
     * @return Query start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd parameters are used together.
     * 
     */
    public Optional<String> timeStart() {
        return Optional.ofNullable(this.timeStart);
    }

    private GetAccessRequestsArgs() {}

    private GetAccessRequestsArgs(GetAccessRequestsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
        this.state = $.state;
        this.timeEnd = $.timeEnd;
        this.timeStart = $.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessRequestsArgs $;

        public Builder() {
            $ = new GetAccessRequestsArgs();
        }

        public Builder(GetAccessRequestsArgs defaults) {
            $ = new GetAccessRequestsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetAccessRequestsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAccessRequestsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param resourceName A filter to return only resources that match the given ResourceName.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceType A filter to return only lists of resources that match the entire given service type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param state A filter to return only resources whose lifecycleState matches the given AccessRequest lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param timeEnd Query start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd parameters are used together.
         * 
         * @return builder
         * 
         */
        public Builder timeEnd(@Nullable String timeEnd) {
            $.timeEnd = timeEnd;
            return this;
        }

        /**
         * @param timeStart Query start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd parameters are used together.
         * 
         * @return builder
         * 
         */
        public Builder timeStart(@Nullable String timeStart) {
            $.timeStart = timeStart;
            return this;
        }

        public GetAccessRequestsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
