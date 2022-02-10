// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class WebtestLocationAvailabilityCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebtestLocationAvailabilityCriteriaResponse Empty = new WebtestLocationAvailabilityCriteriaResponse();

    @InputImport(name="componentId", required=true)
    private final String componentId;

    public String getComponentId() {
        return this.componentId;
    }

    @InputImport(name="failedLocationCount", required=true)
    private final Double failedLocationCount;

    public Double getFailedLocationCount() {
        return this.failedLocationCount;
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="webTestId", required=true)
    private final String webTestId;

    public String getWebTestId() {
        return this.webTestId;
    }

    public WebtestLocationAvailabilityCriteriaResponse(
        String componentId,
        Double failedLocationCount,
        String odataType,
        String webTestId) {
        this.componentId = Objects.requireNonNull(componentId, "expected parameter 'componentId' to be non-null");
        this.failedLocationCount = Objects.requireNonNull(failedLocationCount, "expected parameter 'failedLocationCount' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.webTestId = Objects.requireNonNull(webTestId, "expected parameter 'webTestId' to be non-null");
    }

    private WebtestLocationAvailabilityCriteriaResponse() {
        this.componentId = null;
        this.failedLocationCount = null;
        this.odataType = null;
        this.webTestId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebtestLocationAvailabilityCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentId;
        private Double failedLocationCount;
        private String odataType;
        private String webTestId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebtestLocationAvailabilityCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.failedLocationCount = defaults.failedLocationCount;
    	      this.odataType = defaults.odataType;
    	      this.webTestId = defaults.webTestId;
        }

        public Builder setComponentId(String componentId) {
            this.componentId = Objects.requireNonNull(componentId);
            return this;
        }

        public Builder setFailedLocationCount(Double failedLocationCount) {
            this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setWebTestId(String webTestId) {
            this.webTestId = Objects.requireNonNull(webTestId);
            return this;
        }

        public WebtestLocationAvailabilityCriteriaResponse build() {
            return new WebtestLocationAvailabilityCriteriaResponse(componentId, failedLocationCount, odataType, webTestId);
        }
    }
}