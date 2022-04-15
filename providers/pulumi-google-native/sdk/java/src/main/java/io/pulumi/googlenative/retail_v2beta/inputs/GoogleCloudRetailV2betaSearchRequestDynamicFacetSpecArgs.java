// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.retail_v2beta.enums.GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specifications of dynamically generated facets.
 * 
 */
public final class GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs Empty = new GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs();

    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode> mode;

    public Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    public GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs(@Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode> mode) {
        this.mode = mode;
    }

    private GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs() {
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(@Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }        public GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs build() {
            return new GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs(mode);
        }
    }
}
