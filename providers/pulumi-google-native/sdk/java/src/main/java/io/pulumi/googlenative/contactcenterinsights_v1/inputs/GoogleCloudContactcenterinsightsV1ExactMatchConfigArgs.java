// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Exact match configuration.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs Empty = new GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs();

    /**
     * Whether to consider case sensitivity when performing an exact match.
     * 
     */
    @Import(name="caseSensitive")
      private final @Nullable Output<Boolean> caseSensitive;

    public Output<Boolean> caseSensitive() {
        return this.caseSensitive == null ? Codegen.empty() : this.caseSensitive;
    }

    public GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs(@Nullable Output<Boolean> caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    private GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs() {
        this.caseSensitive = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> caseSensitive;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
        }

        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = Codegen.ofNullable(caseSensitive);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs build() {
            return new GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs(caseSensitive);
        }
    }
}
