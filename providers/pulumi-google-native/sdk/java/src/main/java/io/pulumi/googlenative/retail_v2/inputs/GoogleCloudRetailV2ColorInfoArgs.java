// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The color information of a Product.
 * 
 */
public final class GoogleCloudRetailV2ColorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2ColorInfoArgs Empty = new GoogleCloudRetailV2ColorInfoArgs();

    /**
     * The standard color families. Strongly recommended to use the following standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colorFamilies")
      private final @Nullable Output<List<String>> colorFamilies;

    public Output<List<String>> colorFamilies() {
        return this.colorFamilies == null ? Codegen.empty() : this.colorFamilies;
    }

    /**
     * The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colors")
      private final @Nullable Output<List<String>> colors;

    public Output<List<String>> colors() {
        return this.colors == null ? Codegen.empty() : this.colors;
    }

    public GoogleCloudRetailV2ColorInfoArgs(
        @Nullable Output<List<String>> colorFamilies,
        @Nullable Output<List<String>> colors) {
        this.colorFamilies = colorFamilies;
        this.colors = colors;
    }

    private GoogleCloudRetailV2ColorInfoArgs() {
        this.colorFamilies = Codegen.empty();
        this.colors = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2ColorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> colorFamilies;
        private @Nullable Output<List<String>> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2ColorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder colorFamilies(@Nullable Output<List<String>> colorFamilies) {
            this.colorFamilies = colorFamilies;
            return this;
        }
        public Builder colorFamilies(@Nullable List<String> colorFamilies) {
            this.colorFamilies = Codegen.ofNullable(colorFamilies);
            return this;
        }
        public Builder colorFamilies(String... colorFamilies) {
            return colorFamilies(List.of(colorFamilies));
        }
        public Builder colors(@Nullable Output<List<String>> colors) {
            this.colors = colors;
            return this;
        }
        public Builder colors(@Nullable List<String> colors) {
            this.colors = Codegen.ofNullable(colors);
            return this;
        }
        public Builder colors(String... colors) {
            return colors(List.of(colors));
        }        public GoogleCloudRetailV2ColorInfoArgs build() {
            return new GoogleCloudRetailV2ColorInfoArgs(colorFamilies, colors);
        }
    }
}
