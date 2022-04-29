// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Marketplace.inputs.GetPublishersFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublishersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublishersArgs Empty = new GetPublishersArgs();

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    @Import(name="filters")
    private @Nullable List<GetPublishersFilter> filters;

    public Optional<List<GetPublishersFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Limit results to just this publisher.
     * 
     */
    @Import(name="publisherId")
    private @Nullable String publisherId;

    /**
     * @return Limit results to just this publisher.
     * 
     */
    public Optional<String> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }

    private GetPublishersArgs() {}

    private GetPublishersArgs(GetPublishersArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.publisherId = $.publisherId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublishersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublishersArgs $;

        public Builder() {
            $ = new GetPublishersArgs();
        }

        public Builder(GetPublishersArgs defaults) {
            $ = new GetPublishersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetPublishersFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetPublishersFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param publisherId Limit results to just this publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(@Nullable String publisherId) {
            $.publisherId = publisherId;
            return this;
        }

        public GetPublishersArgs build() {
            return $;
        }
    }

}
