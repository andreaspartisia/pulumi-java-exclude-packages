// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An RPM package file. RPM packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceRPMArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceRPMArgs Empty = new OSPolicyResourcePackageResourceRPMArgs();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps")
      private final @Nullable Output<Boolean> pullDeps;

    public Output<Boolean> pullDeps() {
        return this.pullDeps == null ? Codegen.empty() : this.pullDeps;
    }

    /**
     * An rpm package.
     * 
     */
    @Import(name="source", required=true)
      private final Output<OSPolicyResourceFileArgs> source;

    public Output<OSPolicyResourceFileArgs> source() {
        return this.source;
    }

    public OSPolicyResourcePackageResourceRPMArgs(
        @Nullable Output<Boolean> pullDeps,
        Output<OSPolicyResourceFileArgs> source) {
        this.pullDeps = pullDeps;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OSPolicyResourcePackageResourceRPMArgs() {
        this.pullDeps = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceRPMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> pullDeps;
        private Output<OSPolicyResourceFileArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceRPMArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            this.pullDeps = pullDeps;
            return this;
        }
        public Builder pullDeps(@Nullable Boolean pullDeps) {
            this.pullDeps = Codegen.ofNullable(pullDeps);
            return this;
        }
        public Builder source(Output<OSPolicyResourceFileArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(OSPolicyResourceFileArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }        public OSPolicyResourcePackageResourceRPMArgs build() {
            return new OSPolicyResourcePackageResourceRPMArgs(pullDeps, source);
        }
    }
}
