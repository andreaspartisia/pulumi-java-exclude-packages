// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2FulfillmentFeatureType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Whether fulfillment is enabled for the specific feature.
 * 
 */
public final class GoogleCloudDialogflowV2FulfillmentFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2FulfillmentFeatureArgs Empty = new GoogleCloudDialogflowV2FulfillmentFeatureArgs();

    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type;

    public Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public GoogleCloudDialogflowV2FulfillmentFeatureArgs(@Nullable Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type) {
        this.type = type;
    }

    private GoogleCloudDialogflowV2FulfillmentFeatureArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2FulfillmentFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable GoogleCloudDialogflowV2FulfillmentFeatureType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public GoogleCloudDialogflowV2FulfillmentFeatureArgs build() {
            return new GoogleCloudDialogflowV2FulfillmentFeatureArgs(type);
        }
    }
}
