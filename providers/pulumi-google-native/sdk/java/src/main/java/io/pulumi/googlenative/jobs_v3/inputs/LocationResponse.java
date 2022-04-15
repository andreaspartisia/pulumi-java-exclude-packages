// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.jobs_v3.inputs.LatLngResponse;
import io.pulumi.googlenative.jobs_v3.inputs.PostalAddressResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Output only. A resource that represents a location with full geographic information.
 * 
 */
public final class LocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocationResponse Empty = new LocationResponse();

    /**
     * An object representing a latitude/longitude pair.
     * 
     */
    @Import(name="latLng", required=true)
      private final LatLngResponse latLng;

    public LatLngResponse latLng() {
        return this.latLng;
    }

    /**
     * The type of a location, which corresponds to the address lines field of PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType#NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType#LOCALITY.
     * 
     */
    @Import(name="locationType", required=true)
      private final String locationType;

    public String locationType() {
        return this.locationType;
    }

    /**
     * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
     * 
     */
    @Import(name="postalAddress", required=true)
      private final PostalAddressResponse postalAddress;

    public PostalAddressResponse postalAddress() {
        return this.postalAddress;
    }

    /**
     * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from LatLng covers the area associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
     * 
     */
    @Import(name="radiusInMiles", required=true)
      private final Double radiusInMiles;

    public Double radiusInMiles() {
        return this.radiusInMiles;
    }

    public LocationResponse(
        LatLngResponse latLng,
        String locationType,
        PostalAddressResponse postalAddress,
        Double radiusInMiles) {
        this.latLng = Objects.requireNonNull(latLng, "expected parameter 'latLng' to be non-null");
        this.locationType = Objects.requireNonNull(locationType, "expected parameter 'locationType' to be non-null");
        this.postalAddress = Objects.requireNonNull(postalAddress, "expected parameter 'postalAddress' to be non-null");
        this.radiusInMiles = Objects.requireNonNull(radiusInMiles, "expected parameter 'radiusInMiles' to be non-null");
    }

    private LocationResponse() {
        this.latLng = null;
        this.locationType = null;
        this.postalAddress = null;
        this.radiusInMiles = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LatLngResponse latLng;
        private String locationType;
        private PostalAddressResponse postalAddress;
        private Double radiusInMiles;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latLng = defaults.latLng;
    	      this.locationType = defaults.locationType;
    	      this.postalAddress = defaults.postalAddress;
    	      this.radiusInMiles = defaults.radiusInMiles;
        }

        public Builder latLng(LatLngResponse latLng) {
            this.latLng = Objects.requireNonNull(latLng);
            return this;
        }
        public Builder locationType(String locationType) {
            this.locationType = Objects.requireNonNull(locationType);
            return this;
        }
        public Builder postalAddress(PostalAddressResponse postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }
        public Builder radiusInMiles(Double radiusInMiles) {
            this.radiusInMiles = Objects.requireNonNull(radiusInMiles);
            return this;
        }        public LocationResponse build() {
            return new LocationResponse(latLng, locationType, postalAddress, radiusInMiles);
        }
    }
}
