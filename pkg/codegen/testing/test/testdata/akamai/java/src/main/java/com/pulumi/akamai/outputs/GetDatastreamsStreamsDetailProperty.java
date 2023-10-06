// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatastreamsStreamsDetailProperty {
    private Integer propertyId;
    private String propertyName;

    private GetDatastreamsStreamsDetailProperty() {}
    public Integer propertyId() {
        return this.propertyId;
    }
    public String propertyName() {
        return this.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamsStreamsDetailProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer propertyId;
        private String propertyName;
        public Builder() {}
        public Builder(GetDatastreamsStreamsDetailProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyId = defaults.propertyId;
    	      this.propertyName = defaults.propertyName;
        }

        @CustomType.Setter
        public Builder propertyId(Integer propertyId) {
            if (propertyId == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetailProperty", "propertyId");
            }
            this.propertyId = propertyId;
            return this;
        }
        @CustomType.Setter
        public Builder propertyName(String propertyName) {
            if (propertyName == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetailProperty", "propertyName");
            }
            this.propertyName = propertyName;
            return this;
        }
        public GetDatastreamsStreamsDetailProperty build() {
            final var _resultValue = new GetDatastreamsStreamsDetailProperty();
            _resultValue.propertyId = propertyId;
            _resultValue.propertyName = propertyName;
            return _resultValue;
        }
    }
}
