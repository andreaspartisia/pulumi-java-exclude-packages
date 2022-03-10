// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupLaunchTemplateGetArgs Empty = new NodeGroupLaunchTemplateGetArgs();

    /**
     * Identifier of the EC2 Launch Template. Conflicts with `name`.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
     */
    @InputImport(name="version", required=true)
      private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    public NodeGroupLaunchTemplateGetArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        Input<String> version) {
        this.id = id;
        this.name = name;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private NodeGroupLaunchTemplateGetArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setVersion(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public NodeGroupLaunchTemplateGetArgs build() {
            return new NodeGroupLaunchTemplateGetArgs(id, name, version);
        }
    }
}