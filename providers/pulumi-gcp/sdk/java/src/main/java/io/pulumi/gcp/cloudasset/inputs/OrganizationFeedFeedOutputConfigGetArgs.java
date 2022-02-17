// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs;
import java.util.Objects;


public final class OrganizationFeedFeedOutputConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationFeedFeedOutputConfigGetArgs Empty = new OrganizationFeedFeedOutputConfigGetArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubDestination", required=true)
    private final Input<OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

    public Input<OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs> getPubsubDestination() {
        return this.pubsubDestination;
    }

    public OrganizationFeedFeedOutputConfigGetArgs(Input<OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private OrganizationFeedFeedOutputConfigGetArgs() {
        this.pubsubDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedFeedOutputConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationFeedFeedOutputConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(Input<OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder setPubsubDestination(OrganizationFeedFeedOutputConfigPubsubDestinationGetArgs pubsubDestination) {
            this.pubsubDestination = Input.of(Objects.requireNonNull(pubsubDestination));
            return this;
        }

        public OrganizationFeedFeedOutputConfigGetArgs build() {
            return new OrganizationFeedFeedOutputConfigGetArgs(pubsubDestination);
        }
    }
}