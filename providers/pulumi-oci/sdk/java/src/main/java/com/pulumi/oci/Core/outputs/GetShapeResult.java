// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetShapeFilter;
import com.pulumi.oci.Core.outputs.GetShapeShape;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetShapeResult {
    private final @Nullable String availabilityDomain;
    private final String compartmentId;
    private final @Nullable List<GetShapeFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String imageId;
    private final List<GetShapeShape> shapes;

    @CustomType.Constructor
    private GetShapeResult(
        @CustomType.Parameter("availabilityDomain") @Nullable String availabilityDomain,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetShapeFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") @Nullable String imageId,
        @CustomType.Parameter("shapes") List<GetShapeShape> shapes) {
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.imageId = imageId;
        this.shapes = shapes;
    }

    public Optional<String> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetShapeFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    public List<GetShapeShape> shapes() {
        return this.shapes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShapeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityDomain;
        private String compartmentId;
        private @Nullable List<GetShapeFilter> filters;
        private String id;
        private @Nullable String imageId;
        private List<GetShapeShape> shapes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetShapeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.shapes = defaults.shapes;
        }

        public Builder availabilityDomain(@Nullable String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetShapeFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetShapeFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(@Nullable String imageId) {
            this.imageId = imageId;
            return this;
        }
        public Builder shapes(List<GetShapeShape> shapes) {
            this.shapes = Objects.requireNonNull(shapes);
            return this;
        }
        public Builder shapes(GetShapeShape... shapes) {
            return shapes(List.of(shapes));
        }        public GetShapeResult build() {
            return new GetShapeResult(availabilityDomain, compartmentId, filters, id, imageId, shapes);
        }
    }
}
