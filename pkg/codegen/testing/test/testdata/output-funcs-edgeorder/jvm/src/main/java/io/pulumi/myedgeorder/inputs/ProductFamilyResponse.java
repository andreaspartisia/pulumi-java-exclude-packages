// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.myedgeorder.inputs.AvailabilityInformationResponse;
import io.pulumi.myedgeorder.inputs.CostInformationResponse;
import io.pulumi.myedgeorder.inputs.DescriptionResponse;
import io.pulumi.myedgeorder.inputs.FilterablePropertyResponse;
import io.pulumi.myedgeorder.inputs.HierarchyInformationResponse;
import io.pulumi.myedgeorder.inputs.ImageInformationResponse;
import io.pulumi.myedgeorder.inputs.ProductLineResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Product Family
 * 
 */
public final class ProductFamilyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProductFamilyResponse Empty = new ProductFamilyResponse();

    /**
     * Availability information of the product system.
     * 
     */
    @Import(name="availabilityInformation", required=true)
      private final AvailabilityInformationResponse availabilityInformation;

    public AvailabilityInformationResponse availabilityInformation() {
        return this.availabilityInformation;
    }

    /**
     * Cost information for the product system.
     * 
     */
    @Import(name="costInformation", required=true)
      private final CostInformationResponse costInformation;

    public CostInformationResponse costInformation() {
        return this.costInformation;
    }

    /**
     * Description related to the product system.
     * 
     */
    @Import(name="description", required=true)
      private final DescriptionResponse description;

    public DescriptionResponse description() {
        return this.description;
    }

    /**
     * Display Name for the product system.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * list of filters supported for a product
     * 
     */
    @Import(name="filterableProperties", required=true)
      private final List<FilterablePropertyResponse> filterableProperties;

    public List<FilterablePropertyResponse> filterableProperties() {
        return this.filterableProperties;
    }

    /**
     * Hierarchy information of a product.
     * 
     */
    @Import(name="hierarchyInformation", required=true)
      private final HierarchyInformationResponse hierarchyInformation;

    public HierarchyInformationResponse hierarchyInformation() {
        return this.hierarchyInformation;
    }

    /**
     * Image information for the product system.
     * 
     */
    @Import(name="imageInformation", required=true)
      private final List<ImageInformationResponse> imageInformation;

    public List<ImageInformationResponse> imageInformation() {
        return this.imageInformation;
    }

    /**
     * List of product lines supported in the product family
     * 
     */
    @Import(name="productLines", required=true)
      private final List<ProductLineResponse> productLines;

    public List<ProductLineResponse> productLines() {
        return this.productLines;
    }

    public ProductFamilyResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<ProductLineResponse> productLines) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation, "expected parameter 'availabilityInformation' to be non-null");
        this.costInformation = Objects.requireNonNull(costInformation, "expected parameter 'costInformation' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
        this.imageInformation = Objects.requireNonNull(imageInformation, "expected parameter 'imageInformation' to be non-null");
        this.productLines = Objects.requireNonNull(productLines, "expected parameter 'productLines' to be non-null");
    }

    private ProductFamilyResponse() {
        this.availabilityInformation = null;
        this.costInformation = null;
        this.description = null;
        this.displayName = null;
        this.filterableProperties = List.of();
        this.hierarchyInformation = null;
        this.imageInformation = List.of();
        this.productLines = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductFamilyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<ProductLineResponse> productLines;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductFamilyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.productLines = defaults.productLines;
        }

        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }
        public Builder costInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }
        public Builder description(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder filterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }
        public Builder filterableProperties(FilterablePropertyResponse... filterableProperties) {
            return filterableProperties(List.of(filterableProperties));
        }
        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }
        public Builder imageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }
        public Builder imageInformation(ImageInformationResponse... imageInformation) {
            return imageInformation(List.of(imageInformation));
        }
        public Builder productLines(List<ProductLineResponse> productLines) {
            this.productLines = Objects.requireNonNull(productLines);
            return this;
        }
        public Builder productLines(ProductLineResponse... productLines) {
            return productLines(List.of(productLines));
        }        public ProductFamilyResponse build() {
            return new ProductFamilyResponse(availabilityInformation, costInformation, description, displayName, filterableProperties, hierarchyInformation, imageInformation, productLines);
        }
    }
}
