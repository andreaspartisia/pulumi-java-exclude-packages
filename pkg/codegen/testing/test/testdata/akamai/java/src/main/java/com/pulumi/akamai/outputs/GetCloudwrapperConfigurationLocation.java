// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationLocationCapacity;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperConfigurationLocation {
    private GetCloudwrapperConfigurationLocationCapacity capacity;
    private String comments;
    private String mapName;
    private Integer trafficTypeId;

    private GetCloudwrapperConfigurationLocation() {}
    public GetCloudwrapperConfigurationLocationCapacity capacity() {
        return this.capacity;
    }
    public String comments() {
        return this.comments;
    }
    public String mapName() {
        return this.mapName;
    }
    public Integer trafficTypeId() {
        return this.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetCloudwrapperConfigurationLocationCapacity capacity;
        private String comments;
        private String mapName;
        private Integer trafficTypeId;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.comments = defaults.comments;
    	      this.mapName = defaults.mapName;
    	      this.trafficTypeId = defaults.trafficTypeId;
        }

        @CustomType.Setter
        public Builder capacity(GetCloudwrapperConfigurationLocationCapacity capacity) {
            if (capacity == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationLocation", "capacity");
            }
            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder comments(String comments) {
            if (comments == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationLocation", "comments");
            }
            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder mapName(String mapName) {
            if (mapName == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationLocation", "mapName");
            }
            this.mapName = mapName;
            return this;
        }
        @CustomType.Setter
        public Builder trafficTypeId(Integer trafficTypeId) {
            if (trafficTypeId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationLocation", "trafficTypeId");
            }
            this.trafficTypeId = trafficTypeId;
            return this;
        }
        public GetCloudwrapperConfigurationLocation build() {
            final var _resultValue = new GetCloudwrapperConfigurationLocation();
            _resultValue.capacity = capacity;
            _resultValue.comments = comments;
            _resultValue.mapName = mapName;
            _resultValue.trafficTypeId = trafficTypeId;
            return _resultValue;
        }
    }
}
