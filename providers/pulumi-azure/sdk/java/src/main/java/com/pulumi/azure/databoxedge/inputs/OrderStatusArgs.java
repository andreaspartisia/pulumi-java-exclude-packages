// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrderStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrderStatusArgs Empty = new OrderStatusArgs();

    /**
     * Dictionary to hold generic information which is not stored by the already existing properties.
     * 
     */
    @Import(name="additionalDetails")
    private @Nullable Output<Map<String,String>> additionalDetails;

    /**
     * @return Dictionary to hold generic information which is not stored by the already existing properties.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalDetails() {
        return Optional.ofNullable(this.additionalDetails);
    }

    /**
     * Comments related to this status change.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return Comments related to this status change.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * The current status of the order. Possible values include `Untracked`, `AwaitingFulfilment`, `AwaitingPreparation`, `AwaitingShipment`, `Shipped`, `Arriving`, `Delivered`, `ReplacementRequested`, `LostDevice`, `Declined`, `ReturnInitiated`, `AwaitingReturnShipment`, `ShippedBack` or `CollectedAtMicrosoft`.
     * 
     */
    @Import(name="info")
    private @Nullable Output<String> info;

    /**
     * @return The current status of the order. Possible values include `Untracked`, `AwaitingFulfilment`, `AwaitingPreparation`, `AwaitingShipment`, `Shipped`, `Arriving`, `Delivered`, `ReplacementRequested`, `LostDevice`, `Declined`, `ReturnInitiated`, `AwaitingReturnShipment`, `ShippedBack` or `CollectedAtMicrosoft`.
     * 
     */
    public Optional<Output<String>> info() {
        return Optional.ofNullable(this.info);
    }

    /**
     * Time of status update.
     * 
     */
    @Import(name="lastUpdate")
    private @Nullable Output<String> lastUpdate;

    /**
     * @return Time of status update.
     * 
     */
    public Optional<Output<String>> lastUpdate() {
        return Optional.ofNullable(this.lastUpdate);
    }

    private OrderStatusArgs() {}

    private OrderStatusArgs(OrderStatusArgs $) {
        this.additionalDetails = $.additionalDetails;
        this.comments = $.comments;
        this.info = $.info;
        this.lastUpdate = $.lastUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderStatusArgs $;

        public Builder() {
            $ = new OrderStatusArgs();
        }

        public Builder(OrderStatusArgs defaults) {
            $ = new OrderStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalDetails Dictionary to hold generic information which is not stored by the already existing properties.
         * 
         * @return builder
         * 
         */
        public Builder additionalDetails(@Nullable Output<Map<String,String>> additionalDetails) {
            $.additionalDetails = additionalDetails;
            return this;
        }

        /**
         * @param additionalDetails Dictionary to hold generic information which is not stored by the already existing properties.
         * 
         * @return builder
         * 
         */
        public Builder additionalDetails(Map<String,String> additionalDetails) {
            return additionalDetails(Output.of(additionalDetails));
        }

        /**
         * @param comments Comments related to this status change.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Comments related to this status change.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param info The current status of the order. Possible values include `Untracked`, `AwaitingFulfilment`, `AwaitingPreparation`, `AwaitingShipment`, `Shipped`, `Arriving`, `Delivered`, `ReplacementRequested`, `LostDevice`, `Declined`, `ReturnInitiated`, `AwaitingReturnShipment`, `ShippedBack` or `CollectedAtMicrosoft`.
         * 
         * @return builder
         * 
         */
        public Builder info(@Nullable Output<String> info) {
            $.info = info;
            return this;
        }

        /**
         * @param info The current status of the order. Possible values include `Untracked`, `AwaitingFulfilment`, `AwaitingPreparation`, `AwaitingShipment`, `Shipped`, `Arriving`, `Delivered`, `ReplacementRequested`, `LostDevice`, `Declined`, `ReturnInitiated`, `AwaitingReturnShipment`, `ShippedBack` or `CollectedAtMicrosoft`.
         * 
         * @return builder
         * 
         */
        public Builder info(String info) {
            return info(Output.of(info));
        }

        /**
         * @param lastUpdate Time of status update.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdate(@Nullable Output<String> lastUpdate) {
            $.lastUpdate = lastUpdate;
            return this;
        }

        /**
         * @param lastUpdate Time of status update.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdate(String lastUpdate) {
            return lastUpdate(Output.of(lastUpdate));
        }

        public OrderStatusArgs build() {
            return $;
        }
    }

}
