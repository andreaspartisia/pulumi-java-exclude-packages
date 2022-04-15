// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network describes the GCP network used to create workers in.
 * 
 */
public final class NetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * Network on which the workers are created. "default" network is used if empty.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Project id containing the defined network and subnetwork. For a peered VPC, this will be the same as the project_id in which the workers are created. For a shared VPC, this will be the project sharing the network with the project_id project in which workers will be created. For custom workers with no VPC, this will be the same as project_id.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public NetworkArgs(
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> subnetwork) {
        this.network = network;
        this.project = project;
        this.subnetwork = subnetwork;
    }

    private NetworkArgs() {
        this.network = Codegen.empty();
        this.project = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public NetworkArgs build() {
            return new NetworkArgs(network, project, subnetwork);
        }
    }
}
