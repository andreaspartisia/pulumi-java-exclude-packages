// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MessageStoragePolicyResponse {
    /**
     * A list of IDs of GCP regions where messages that are published to the topic may be persisted in storage. Messages published by publishers running in non-allowed GCP regions (or running outside of GCP altogether) will be routed for storage in one of the allowed regions. An empty list means that no regions are allowed, and is not a valid configuration.
     * 
     */
    private final List<String> allowedPersistenceRegions;

    @CustomType.Constructor
    private MessageStoragePolicyResponse(@CustomType.Parameter("allowedPersistenceRegions") List<String> allowedPersistenceRegions) {
        this.allowedPersistenceRegions = allowedPersistenceRegions;
    }

    /**
     * A list of IDs of GCP regions where messages that are published to the topic may be persisted in storage. Messages published by publishers running in non-allowed GCP regions (or running outside of GCP altogether) will be routed for storage in one of the allowed regions. An empty list means that no regions are allowed, and is not a valid configuration.
     * 
    */
    public List<String> allowedPersistenceRegions() {
        return this.allowedPersistenceRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessageStoragePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedPersistenceRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(MessageStoragePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPersistenceRegions = defaults.allowedPersistenceRegions;
        }

        public Builder allowedPersistenceRegions(List<String> allowedPersistenceRegions) {
            this.allowedPersistenceRegions = Objects.requireNonNull(allowedPersistenceRegions);
            return this;
        }
        public Builder allowedPersistenceRegions(String... allowedPersistenceRegions) {
            return allowedPersistenceRegions(List.of(allowedPersistenceRegions));
        }        public MessageStoragePolicyResponse build() {
            return new MessageStoragePolicyResponse(allowedPersistenceRegions);
        }
    }
}
