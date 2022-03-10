// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketNotificationTopic {
    /**
     * [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
     */
    private final List<String> events;
    /**
     * Object key name prefix.
     * 
     */
    private final @Nullable String filterPrefix;
    /**
     * Object key name suffix.
     * 
     */
    private final @Nullable String filterSuffix;
    /**
     * Unique identifier for each of the notification configurations.
     * 
     */
    private final @Nullable String id;
    /**
     * SNS topic ARN.
     * 
     */
    private final String topicArn;

    @OutputCustomType.Constructor
    private BucketNotificationTopic(
        @OutputCustomType.Parameter("events") List<String> events,
        @OutputCustomType.Parameter("filterPrefix") @Nullable String filterPrefix,
        @OutputCustomType.Parameter("filterSuffix") @Nullable String filterSuffix,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("topicArn") String topicArn) {
        this.events = events;
        this.filterPrefix = filterPrefix;
        this.filterSuffix = filterSuffix;
        this.id = id;
        this.topicArn = topicArn;
    }

    /**
     * [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
    */
    public List<String> getEvents() {
        return this.events;
    }
    /**
     * Object key name prefix.
     * 
    */
    public Optional<String> getFilterPrefix() {
        return Optional.ofNullable(this.filterPrefix);
    }
    /**
     * Object key name suffix.
     * 
    */
    public Optional<String> getFilterSuffix() {
        return Optional.ofNullable(this.filterSuffix);
    }
    /**
     * Unique identifier for each of the notification configurations.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * SNS topic ARN.
     * 
    */
    public String getTopicArn() {
        return this.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationTopic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> events;
        private @Nullable String filterPrefix;
        private @Nullable String filterSuffix;
        private @Nullable String id;
        private String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationTopic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.filterPrefix = defaults.filterPrefix;
    	      this.filterSuffix = defaults.filterSuffix;
    	      this.id = defaults.id;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setEvents(List<String> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setFilterPrefix(@Nullable String filterPrefix) {
            this.filterPrefix = filterPrefix;
            return this;
        }

        public Builder setFilterSuffix(@Nullable String filterSuffix) {
            this.filterSuffix = filterSuffix;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setTopicArn(String topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        public BucketNotificationTopic build() {
            return new BucketNotificationTopic(events, filterPrefix, filterSuffix, id, topicArn);
        }
    }
}