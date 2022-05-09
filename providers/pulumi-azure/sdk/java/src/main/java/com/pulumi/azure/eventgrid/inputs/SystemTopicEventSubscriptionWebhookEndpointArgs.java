// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemTopicEventSubscriptionWebhookEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemTopicEventSubscriptionWebhookEndpointArgs Empty = new SystemTopicEventSubscriptionWebhookEndpointArgs();

    /**
     * The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    @Import(name="activeDirectoryAppIdOrUri")
    private @Nullable Output<String> activeDirectoryAppIdOrUri;

    /**
     * @return The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    public Optional<Output<String>> activeDirectoryAppIdOrUri() {
        return Optional.ofNullable(this.activeDirectoryAppIdOrUri);
    }

    /**
     * The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    @Import(name="activeDirectoryTenantId")
    private @Nullable Output<String> activeDirectoryTenantId;

    /**
     * @return The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    public Optional<Output<String>> activeDirectoryTenantId() {
        return Optional.ofNullable(this.activeDirectoryTenantId);
    }

    /**
     * The base url of the webhook where the Event Subscription will receive events.
     * 
     */
    @Import(name="baseUrl")
    private @Nullable Output<String> baseUrl;

    /**
     * @return The base url of the webhook where the Event Subscription will receive events.
     * 
     */
    public Optional<Output<String>> baseUrl() {
        return Optional.ofNullable(this.baseUrl);
    }

    /**
     * Maximum number of events per batch.
     * 
     */
    @Import(name="maxEventsPerBatch")
    private @Nullable Output<Integer> maxEventsPerBatch;

    /**
     * @return Maximum number of events per batch.
     * 
     */
    public Optional<Output<Integer>> maxEventsPerBatch() {
        return Optional.ofNullable(this.maxEventsPerBatch);
    }

    /**
     * Preferred batch size in Kilobytes.
     * 
     */
    @Import(name="preferredBatchSizeInKilobytes")
    private @Nullable Output<Integer> preferredBatchSizeInKilobytes;

    /**
     * @return Preferred batch size in Kilobytes.
     * 
     */
    public Optional<Output<Integer>> preferredBatchSizeInKilobytes() {
        return Optional.ofNullable(this.preferredBatchSizeInKilobytes);
    }

    /**
     * Specifies the url of the webhook where the Event Subscription will receive events.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Specifies the url of the webhook where the Event Subscription will receive events.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private SystemTopicEventSubscriptionWebhookEndpointArgs() {}

    private SystemTopicEventSubscriptionWebhookEndpointArgs(SystemTopicEventSubscriptionWebhookEndpointArgs $) {
        this.activeDirectoryAppIdOrUri = $.activeDirectoryAppIdOrUri;
        this.activeDirectoryTenantId = $.activeDirectoryTenantId;
        this.baseUrl = $.baseUrl;
        this.maxEventsPerBatch = $.maxEventsPerBatch;
        this.preferredBatchSizeInKilobytes = $.preferredBatchSizeInKilobytes;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemTopicEventSubscriptionWebhookEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemTopicEventSubscriptionWebhookEndpointArgs $;

        public Builder() {
            $ = new SystemTopicEventSubscriptionWebhookEndpointArgs();
        }

        public Builder(SystemTopicEventSubscriptionWebhookEndpointArgs defaults) {
            $ = new SystemTopicEventSubscriptionWebhookEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectoryAppIdOrUri The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryAppIdOrUri(@Nullable Output<String> activeDirectoryAppIdOrUri) {
            $.activeDirectoryAppIdOrUri = activeDirectoryAppIdOrUri;
            return this;
        }

        /**
         * @param activeDirectoryAppIdOrUri The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryAppIdOrUri(String activeDirectoryAppIdOrUri) {
            return activeDirectoryAppIdOrUri(Output.of(activeDirectoryAppIdOrUri));
        }

        /**
         * @param activeDirectoryTenantId The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryTenantId(@Nullable Output<String> activeDirectoryTenantId) {
            $.activeDirectoryTenantId = activeDirectoryTenantId;
            return this;
        }

        /**
         * @param activeDirectoryTenantId The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryTenantId(String activeDirectoryTenantId) {
            return activeDirectoryTenantId(Output.of(activeDirectoryTenantId));
        }

        /**
         * @param baseUrl The base url of the webhook where the Event Subscription will receive events.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(@Nullable Output<String> baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        /**
         * @param baseUrl The base url of the webhook where the Event Subscription will receive events.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(String baseUrl) {
            return baseUrl(Output.of(baseUrl));
        }

        /**
         * @param maxEventsPerBatch Maximum number of events per batch.
         * 
         * @return builder
         * 
         */
        public Builder maxEventsPerBatch(@Nullable Output<Integer> maxEventsPerBatch) {
            $.maxEventsPerBatch = maxEventsPerBatch;
            return this;
        }

        /**
         * @param maxEventsPerBatch Maximum number of events per batch.
         * 
         * @return builder
         * 
         */
        public Builder maxEventsPerBatch(Integer maxEventsPerBatch) {
            return maxEventsPerBatch(Output.of(maxEventsPerBatch));
        }

        /**
         * @param preferredBatchSizeInKilobytes Preferred batch size in Kilobytes.
         * 
         * @return builder
         * 
         */
        public Builder preferredBatchSizeInKilobytes(@Nullable Output<Integer> preferredBatchSizeInKilobytes) {
            $.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
            return this;
        }

        /**
         * @param preferredBatchSizeInKilobytes Preferred batch size in Kilobytes.
         * 
         * @return builder
         * 
         */
        public Builder preferredBatchSizeInKilobytes(Integer preferredBatchSizeInKilobytes) {
            return preferredBatchSizeInKilobytes(Output.of(preferredBatchSizeInKilobytes));
        }

        /**
         * @param url Specifies the url of the webhook where the Event Subscription will receive events.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Specifies the url of the webhook where the Event Subscription will receive events.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SystemTopicEventSubscriptionWebhookEndpointArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
