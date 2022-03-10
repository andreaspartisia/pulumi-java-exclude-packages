// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ScramSecretAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScramSecretAssociationArgs Empty = new ScramSecretAssociationArgs();

    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @InputImport(name="clusterArn", required=true)
      private final Input<String> clusterArn;

    public Input<String> getClusterArn() {
        return this.clusterArn;
    }

    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @InputImport(name="secretArnLists", required=true)
      private final Input<List<String>> secretArnLists;

    public Input<List<String>> getSecretArnLists() {
        return this.secretArnLists;
    }

    public ScramSecretAssociationArgs(
        Input<String> clusterArn,
        Input<List<String>> secretArnLists) {
        this.clusterArn = Objects.requireNonNull(clusterArn, "expected parameter 'clusterArn' to be non-null");
        this.secretArnLists = Objects.requireNonNull(secretArnLists, "expected parameter 'secretArnLists' to be non-null");
    }

    private ScramSecretAssociationArgs() {
        this.clusterArn = Input.empty();
        this.secretArnLists = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScramSecretAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterArn;
        private Input<List<String>> secretArnLists;

        public Builder() {
    	      // Empty
        }

        public Builder(ScramSecretAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.secretArnLists = defaults.secretArnLists;
        }

        public Builder setClusterArn(Input<String> clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }

        public Builder setClusterArn(String clusterArn) {
            this.clusterArn = Input.of(Objects.requireNonNull(clusterArn));
            return this;
        }

        public Builder setSecretArnLists(Input<List<String>> secretArnLists) {
            this.secretArnLists = Objects.requireNonNull(secretArnLists);
            return this;
        }

        public Builder setSecretArnLists(List<String> secretArnLists) {
            this.secretArnLists = Input.of(Objects.requireNonNull(secretArnLists));
            return this;
        }
        public ScramSecretAssociationArgs build() {
            return new ScramSecretAssociationArgs(clusterArn, secretArnLists);
        }
    }
}