// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterNotificationConfigPubsub;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNotificationConfig {
    private final List<GetClusterNotificationConfigPubsub> pubsubs;

    @OutputCustomType.Constructor
    private GetClusterNotificationConfig(@OutputCustomType.Parameter("pubsubs") List<GetClusterNotificationConfigPubsub> pubsubs) {
        this.pubsubs = pubsubs;
    }

    public List<GetClusterNotificationConfigPubsub> getPubsubs() {
        return this.pubsubs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterNotificationConfigPubsub> pubsubs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubs = defaults.pubsubs;
        }

        public Builder setPubsubs(List<GetClusterNotificationConfigPubsub> pubsubs) {
            this.pubsubs = Objects.requireNonNull(pubsubs);
            return this;
        }
        public GetClusterNotificationConfig build() {
            return new GetClusterNotificationConfig(pubsubs);
        }
    }
}
