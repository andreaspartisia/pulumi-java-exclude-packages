// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3VersionVariantsVariantArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of flow version variants.
 * 
 */
public final class GoogleCloudDialogflowCxV3VersionVariantsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3VersionVariantsArgs Empty = new GoogleCloudDialogflowCxV3VersionVariantsArgs();

    /**
     * A list of flow version variants.
     * 
     */
    @Import(name="variants")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3VersionVariantsVariantArgs>> variants;

    public Output<List<GoogleCloudDialogflowCxV3VersionVariantsVariantArgs>> variants() {
        return this.variants == null ? Codegen.empty() : this.variants;
    }

    public GoogleCloudDialogflowCxV3VersionVariantsArgs(@Nullable Output<List<GoogleCloudDialogflowCxV3VersionVariantsVariantArgs>> variants) {
        this.variants = variants;
    }

    private GoogleCloudDialogflowCxV3VersionVariantsArgs() {
        this.variants = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VersionVariantsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowCxV3VersionVariantsVariantArgs>> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VersionVariantsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variants = defaults.variants;
        }

        public Builder variants(@Nullable Output<List<GoogleCloudDialogflowCxV3VersionVariantsVariantArgs>> variants) {
            this.variants = variants;
            return this;
        }
        public Builder variants(@Nullable List<GoogleCloudDialogflowCxV3VersionVariantsVariantArgs> variants) {
            this.variants = Codegen.ofNullable(variants);
            return this;
        }
        public Builder variants(GoogleCloudDialogflowCxV3VersionVariantsVariantArgs... variants) {
            return variants(List.of(variants));
        }        public GoogleCloudDialogflowCxV3VersionVariantsArgs build() {
            return new GoogleCloudDialogflowCxV3VersionVariantsArgs(variants);
        }
    }
}
