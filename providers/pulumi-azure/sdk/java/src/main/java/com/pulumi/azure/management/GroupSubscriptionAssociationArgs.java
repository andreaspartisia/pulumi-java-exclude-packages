// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GroupSubscriptionAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupSubscriptionAssociationArgs Empty = new GroupSubscriptionAssociationArgs();

    /**
     * The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    /**
     * @return The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
     * 
     */
    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private GroupSubscriptionAssociationArgs() {}

    private GroupSubscriptionAssociationArgs(GroupSubscriptionAssociationArgs $) {
        this.managementGroupId = $.managementGroupId;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupSubscriptionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupSubscriptionAssociationArgs $;

        public Builder() {
            $ = new GroupSubscriptionAssociationArgs();
        }

        public Builder(GroupSubscriptionAssociationArgs defaults) {
            $ = new GroupSubscriptionAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementGroupId The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupId The ID of the Management Group to associate the Subscription with. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param subscriptionId The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The ID of the Subscription to be associated with the Management Group. Changing this forces a new Management to be created.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public GroupSubscriptionAssociationArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
