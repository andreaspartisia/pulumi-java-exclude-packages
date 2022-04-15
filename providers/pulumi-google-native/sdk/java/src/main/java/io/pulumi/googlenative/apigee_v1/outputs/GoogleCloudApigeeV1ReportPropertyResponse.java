// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1ReportPropertyResponse {
    /**
     * name of the property
     * 
     */
    private final String property;
    /**
     * property values
     * 
     */
    private final List<GoogleCloudApigeeV1AttributeResponse> value;

    @CustomType.Constructor
    private GoogleCloudApigeeV1ReportPropertyResponse(
        @CustomType.Parameter("property") String property,
        @CustomType.Parameter("value") List<GoogleCloudApigeeV1AttributeResponse> value) {
        this.property = property;
        this.value = value;
    }

    /**
     * name of the property
     * 
    */
    public String property() {
        return this.property;
    }
    /**
     * property values
     * 
    */
    public List<GoogleCloudApigeeV1AttributeResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ReportPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String property;
        private List<GoogleCloudApigeeV1AttributeResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ReportPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder property(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        public Builder value(List<GoogleCloudApigeeV1AttributeResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(GoogleCloudApigeeV1AttributeResponse... value) {
            return value(List.of(value));
        }        public GoogleCloudApigeeV1ReportPropertyResponse build() {
            return new GoogleCloudApigeeV1ReportPropertyResponse(property, value);
        }
    }
}
