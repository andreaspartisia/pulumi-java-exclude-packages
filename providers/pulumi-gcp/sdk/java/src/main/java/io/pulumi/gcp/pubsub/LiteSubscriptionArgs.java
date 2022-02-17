// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteSubscriptionArgs Empty = new LiteSubscriptionArgs();

    /**
     * The settings for this subscription's message delivery.
     * Structure is documented below.
     * 
     */
    @InputImport(name="deliveryConfig")
    private final @Nullable Input<LiteSubscriptionDeliveryConfigArgs> deliveryConfig;

    public Input<LiteSubscriptionDeliveryConfigArgs> getDeliveryConfig() {
        return this.deliveryConfig == null ? Input.empty() : this.deliveryConfig;
    }

    /**
     * Name of the subscription.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * A reference to a Topic resource.
     * 
     */
    @InputImport(name="topic", required=true)
    private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public LiteSubscriptionArgs(
        @Nullable Input<LiteSubscriptionDeliveryConfigArgs> deliveryConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> topic,
        @Nullable Input<String> zone) {
        this.deliveryConfig = deliveryConfig;
        this.name = name;
        this.project = project;
        this.region = region;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
        this.zone = zone;
    }

    private LiteSubscriptionArgs() {
        this.deliveryConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.topic = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LiteSubscriptionDeliveryConfigArgs> deliveryConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> topic;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryConfig = defaults.deliveryConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.topic = defaults.topic;
    	      this.zone = defaults.zone;
        }

        public Builder setDeliveryConfig(@Nullable Input<LiteSubscriptionDeliveryConfigArgs> deliveryConfig) {
            this.deliveryConfig = deliveryConfig;
            return this;
        }

        public Builder setDeliveryConfig(@Nullable LiteSubscriptionDeliveryConfigArgs deliveryConfig) {
            this.deliveryConfig = Input.ofNullable(deliveryConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public LiteSubscriptionArgs build() {
            return new LiteSubscriptionArgs(deliveryConfig, name, project, region, topic, zone);
        }
    }
}