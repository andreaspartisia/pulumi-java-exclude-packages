// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.gkehub.outputs.FeatureSpecMulticlusteringress;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureSpec {
    /**
     * Multicluster Ingress-specific spec.
     * The `multiclusteringress` block supports:
     * 
     */
    private final @Nullable FeatureSpecMulticlusteringress multiclusteringress;

    @OutputCustomType.Constructor
    private FeatureSpec(@OutputCustomType.Parameter("multiclusteringress") @Nullable FeatureSpecMulticlusteringress multiclusteringress) {
        this.multiclusteringress = multiclusteringress;
    }

    /**
     * Multicluster Ingress-specific spec.
     * The `multiclusteringress` block supports:
     * 
    */
    public Optional<FeatureSpecMulticlusteringress> getMulticlusteringress() {
        return Optional.ofNullable(this.multiclusteringress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FeatureSpecMulticlusteringress multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder setMulticlusteringress(@Nullable FeatureSpecMulticlusteringress multiclusteringress) {
            this.multiclusteringress = multiclusteringress;
            return this;
        }
        public FeatureSpec build() {
            return new FeatureSpec(multiclusteringress);
        }
    }
}
