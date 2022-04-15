// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DiscoveredArgs;
import java.util.Objects;


/**
 * Details of a discovery occurrence.
 * 
 */
public final class GrafeasV1beta1DiscoveryDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1DiscoveryDetailsArgs Empty = new GrafeasV1beta1DiscoveryDetailsArgs();

    /**
     * Analysis status for the discovered resource.
     * 
     */
    @Import(name="discovered", required=true)
      private final Output<DiscoveredArgs> discovered;

    public Output<DiscoveredArgs> discovered() {
        return this.discovered;
    }

    public GrafeasV1beta1DiscoveryDetailsArgs(Output<DiscoveredArgs> discovered) {
        this.discovered = Objects.requireNonNull(discovered, "expected parameter 'discovered' to be non-null");
    }

    private GrafeasV1beta1DiscoveryDetailsArgs() {
        this.discovered = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DiscoveryDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DiscoveredArgs> discovered;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DiscoveryDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discovered = defaults.discovered;
        }

        public Builder discovered(Output<DiscoveredArgs> discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }
        public Builder discovered(DiscoveredArgs discovered) {
            this.discovered = Output.of(Objects.requireNonNull(discovered));
            return this;
        }        public GrafeasV1beta1DiscoveryDetailsArgs build() {
            return new GrafeasV1beta1DiscoveryDetailsArgs(discovered);
        }
    }
}
