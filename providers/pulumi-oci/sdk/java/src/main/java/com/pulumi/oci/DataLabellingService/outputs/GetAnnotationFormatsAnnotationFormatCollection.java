// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataLabellingService.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataLabellingService.outputs.GetAnnotationFormatsAnnotationFormatCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAnnotationFormatsAnnotationFormatCollection {
    /**
     * @return List of annotation formats.
     * 
     */
    private final List<GetAnnotationFormatsAnnotationFormatCollectionItem> items;

    @CustomType.Constructor
    private GetAnnotationFormatsAnnotationFormatCollection(@CustomType.Parameter("items") List<GetAnnotationFormatsAnnotationFormatCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return List of annotation formats.
     * 
     */
    public List<GetAnnotationFormatsAnnotationFormatCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnnotationFormatsAnnotationFormatCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAnnotationFormatsAnnotationFormatCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnnotationFormatsAnnotationFormatCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAnnotationFormatsAnnotationFormatCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAnnotationFormatsAnnotationFormatCollectionItem... items) {
            return items(List.of(items));
        }        public GetAnnotationFormatsAnnotationFormatCollection build() {
            return new GetAnnotationFormatsAnnotationFormatCollection(items);
        }
    }
}
