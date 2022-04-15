// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.policysimulator_v1.inputs.GoogleCloudPolicysimulatorV1ReplayConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationReplayArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationReplayArgs Empty = new OrganizationReplayArgs();

    /**
     * The configuration used for the `Replay`.
     * 
     */
    @Import(name="config", required=true)
      private final Output<GoogleCloudPolicysimulatorV1ReplayConfigArgs> config;

    public Output<GoogleCloudPolicysimulatorV1ReplayConfigArgs> config() {
        return this.config;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    public OrganizationReplayArgs(
        Output<GoogleCloudPolicysimulatorV1ReplayConfigArgs> config,
        @Nullable Output<String> location,
        Output<String> organizationId) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.location = location;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private OrganizationReplayArgs() {
        this.config = Codegen.empty();
        this.location = Codegen.empty();
        this.organizationId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GoogleCloudPolicysimulatorV1ReplayConfigArgs> config;
        private @Nullable Output<String> location;
        private Output<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationReplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.location = defaults.location;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder config(Output<GoogleCloudPolicysimulatorV1ReplayConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(GoogleCloudPolicysimulatorV1ReplayConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }        public OrganizationReplayArgs build() {
            return new OrganizationReplayArgs(config, location, organizationId);
        }
    }
}
