// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a pause cluster operation. For example, a scheduled action to run the `PauseCluster` API operation.
 * 
 */
public final class ScheduledActionPauseClusterMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionPauseClusterMessageArgs Empty = new ScheduledActionPauseClusterMessageArgs();

    @InputImport(name="clusterIdentifier", required=true)
    private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public ScheduledActionPauseClusterMessageArgs(Input<String> clusterIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
    }

    private ScheduledActionPauseClusterMessageArgs() {
        this.clusterIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionPauseClusterMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionPauseClusterMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder setClusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public ScheduledActionPauseClusterMessageArgs build() {
            return new ScheduledActionPauseClusterMessageArgs(clusterIdentifier);
        }
    }
}