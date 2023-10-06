// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetDatastreamDatasetFieldsDatasetField;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatastreamDatasetFieldsResult {
    private List<GetDatastreamDatasetFieldsDatasetField> datasetFields;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String productId;

    private GetDatastreamDatasetFieldsResult() {}
    public List<GetDatastreamDatasetFieldsDatasetField> datasetFields() {
        return this.datasetFields;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> productId() {
        return Optional.ofNullable(this.productId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamDatasetFieldsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatastreamDatasetFieldsDatasetField> datasetFields;
        private String id;
        private @Nullable String productId;
        public Builder() {}
        public Builder(GetDatastreamDatasetFieldsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetFields = defaults.datasetFields;
    	      this.id = defaults.id;
    	      this.productId = defaults.productId;
        }

        @CustomType.Setter
        public Builder datasetFields(List<GetDatastreamDatasetFieldsDatasetField> datasetFields) {
            if (datasetFields == null) {
              throw new MissingRequiredPropertyException("GetDatastreamDatasetFieldsResult", "datasetFields");
            }
            this.datasetFields = datasetFields;
            return this;
        }
        public Builder datasetFields(GetDatastreamDatasetFieldsDatasetField... datasetFields) {
            return datasetFields(List.of(datasetFields));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatastreamDatasetFieldsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder productId(@Nullable String productId) {

            this.productId = productId;
            return this;
        }
        public GetDatastreamDatasetFieldsResult build() {
            final var _resultValue = new GetDatastreamDatasetFieldsResult();
            _resultValue.datasetFields = datasetFields;
            _resultValue.id = id;
            _resultValue.productId = productId;
            return _resultValue;
        }
    }
}
