// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsubSubscription.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OsubSubscription.inputs.GetRatecardsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRatecardsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRatecardsArgs Empty = new GetRatecardsArgs();

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetRatecardsFilter> filters;

    public Optional<List<GetRatecardsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * This param is used to get the rate card(s) filterd by the partNumber
     * 
     */
    @Import(name="partNumber")
    private @Nullable String partNumber;

    /**
     * @return This param is used to get the rate card(s) filterd by the partNumber
     * 
     */
    public Optional<String> partNumber() {
        return Optional.ofNullable(this.partNumber);
    }

    /**
     * Line level Subscription Id
     * 
     */
    @Import(name="subscriptionId", required=true)
    private String subscriptionId;

    /**
     * @return Line level Subscription Id
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * This param is used to get the rate card(s) whose effective start date starts on or after a particular date
     * 
     */
    @Import(name="timeFrom")
    private @Nullable String timeFrom;

    /**
     * @return This param is used to get the rate card(s) whose effective start date starts on or after a particular date
     * 
     */
    public Optional<String> timeFrom() {
        return Optional.ofNullable(this.timeFrom);
    }

    /**
     * This param is used to get the rate card(s) whose effective end date ends on or before a particular date
     * 
     */
    @Import(name="timeTo")
    private @Nullable String timeTo;

    /**
     * @return This param is used to get the rate card(s) whose effective end date ends on or before a particular date
     * 
     */
    public Optional<String> timeTo() {
        return Optional.ofNullable(this.timeTo);
    }

    /**
     * The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
     * 
     */
    @Import(name="xOneOriginRegion")
    private @Nullable String xOneOriginRegion;

    /**
     * @return The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
     * 
     */
    public Optional<String> xOneOriginRegion() {
        return Optional.ofNullable(this.xOneOriginRegion);
    }

    private GetRatecardsArgs() {}

    private GetRatecardsArgs(GetRatecardsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.partNumber = $.partNumber;
        this.subscriptionId = $.subscriptionId;
        this.timeFrom = $.timeFrom;
        this.timeTo = $.timeTo;
        this.xOneOriginRegion = $.xOneOriginRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRatecardsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRatecardsArgs $;

        public Builder() {
            $ = new GetRatecardsArgs();
        }

        public Builder(GetRatecardsArgs defaults) {
            $ = new GetRatecardsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetRatecardsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRatecardsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param partNumber This param is used to get the rate card(s) filterd by the partNumber
         * 
         * @return builder
         * 
         */
        public Builder partNumber(@Nullable String partNumber) {
            $.partNumber = partNumber;
            return this;
        }

        /**
         * @param subscriptionId Line level Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param timeFrom This param is used to get the rate card(s) whose effective start date starts on or after a particular date
         * 
         * @return builder
         * 
         */
        public Builder timeFrom(@Nullable String timeFrom) {
            $.timeFrom = timeFrom;
            return this;
        }

        /**
         * @param timeTo This param is used to get the rate card(s) whose effective end date ends on or before a particular date
         * 
         * @return builder
         * 
         */
        public Builder timeTo(@Nullable String timeTo) {
            $.timeTo = timeTo;
            return this;
        }

        /**
         * @param xOneOriginRegion The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
         * 
         * @return builder
         * 
         */
        public Builder xOneOriginRegion(@Nullable String xOneOriginRegion) {
            $.xOneOriginRegion = xOneOriginRegion;
            return this;
        }

        public GetRatecardsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
