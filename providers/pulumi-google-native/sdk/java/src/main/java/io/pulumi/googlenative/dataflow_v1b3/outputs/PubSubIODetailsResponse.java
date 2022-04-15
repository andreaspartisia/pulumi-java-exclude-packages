// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PubSubIODetailsResponse {
    /**
     * Subscription used in the connection.
     * 
     */
    private final String subscription;
    /**
     * Topic accessed in the connection.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private PubSubIODetailsResponse(
        @CustomType.Parameter("subscription") String subscription,
        @CustomType.Parameter("topic") String topic) {
        this.subscription = subscription;
        this.topic = topic;
    }

    /**
     * Subscription used in the connection.
     * 
    */
    public String subscription() {
        return this.subscription;
    }
    /**
     * Topic accessed in the connection.
     * 
    */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubSubIODetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscription;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubSubIODetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder subscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public PubSubIODetailsResponse build() {
            return new PubSubIODetailsResponse(subscription, topic);
        }
    }
}
