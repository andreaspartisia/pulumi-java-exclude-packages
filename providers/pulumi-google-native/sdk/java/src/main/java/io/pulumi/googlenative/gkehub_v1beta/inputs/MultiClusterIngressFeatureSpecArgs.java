// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress feature.
 * 
 */
public final class MultiClusterIngressFeatureSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiClusterIngressFeatureSpecArgs Empty = new MultiClusterIngressFeatureSpecArgs();

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    @Import(name="configMembership")
      private final @Nullable Output<String> configMembership;

    public Output<String> configMembership() {
        return this.configMembership == null ? Codegen.empty() : this.configMembership;
    }

    public MultiClusterIngressFeatureSpecArgs(@Nullable Output<String> configMembership) {
        this.configMembership = configMembership;
    }

    private MultiClusterIngressFeatureSpecArgs() {
        this.configMembership = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterIngressFeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configMembership;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiClusterIngressFeatureSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMembership = defaults.configMembership;
        }

        public Builder configMembership(@Nullable Output<String> configMembership) {
            this.configMembership = configMembership;
            return this;
        }
        public Builder configMembership(@Nullable String configMembership) {
            this.configMembership = Codegen.ofNullable(configMembership);
            return this;
        }        public MultiClusterIngressFeatureSpecArgs build() {
            return new MultiClusterIngressFeatureSpecArgs(configMembership);
        }
    }
}
