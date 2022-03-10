// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs;
import io.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationConfigurationReplicationConfigurationRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleGetArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleGetArgs();

    /**
     * the details of a replication destination. A maximum of 25 are allowed per `rule`. See Destination.
     * 
     */
    @InputImport(name="destinations", required=true)
      private final Input<List<ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs>> destinations;

    public Input<List<ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs>> getDestinations() {
        return this.destinations;
    }

    /**
     * filters for a replication rule. See Repository Filter.
     * 
     */
    @InputImport(name="repositoryFilters")
      private final @Nullable Input<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs>> repositoryFilters;

    public Input<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs>> getRepositoryFilters() {
        return this.repositoryFilters == null ? Input.empty() : this.repositoryFilters;
    }

    public ReplicationConfigurationReplicationConfigurationRuleGetArgs(
        Input<List<ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs>> destinations,
        @Nullable Input<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs>> repositoryFilters) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.repositoryFilters = repositoryFilters;
    }

    private ReplicationConfigurationReplicationConfigurationRuleGetArgs() {
        this.destinations = Input.empty();
        this.repositoryFilters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs>> destinations;
        private @Nullable Input<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs>> repositoryFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.repositoryFilters = defaults.repositoryFilters;
        }

        public Builder setDestinations(Input<List<ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDestinations(List<ReplicationConfigurationReplicationConfigurationRuleDestinationGetArgs> destinations) {
            this.destinations = Input.of(Objects.requireNonNull(destinations));
            return this;
        }

        public Builder setRepositoryFilters(@Nullable Input<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs>> repositoryFilters) {
            this.repositoryFilters = repositoryFilters;
            return this;
        }

        public Builder setRepositoryFilters(@Nullable List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs> repositoryFilters) {
            this.repositoryFilters = Input.ofNullable(repositoryFilters);
            return this;
        }
        public ReplicationConfigurationReplicationConfigurationRuleGetArgs build() {
            return new ReplicationConfigurationReplicationConfigurationRuleGetArgs(destinations, repositoryFilters);
        }
    }
}