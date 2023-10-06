// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyIncludesInclude;
import com.pulumi.akamai.outputs.GetPropertyIncludesParentProperty;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyIncludesResult {
    private String contractId;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetPropertyIncludesInclude> includes;
    private @Nullable GetPropertyIncludesParentProperty parentProperty;
    private @Nullable String type;

    private GetPropertyIncludesResult() {}
    public String contractId() {
        return this.contractId;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetPropertyIncludesInclude> includes() {
        return this.includes;
    }
    public Optional<GetPropertyIncludesParentProperty> parentProperty() {
        return Optional.ofNullable(this.parentProperty);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyIncludesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String groupId;
        private String id;
        private List<GetPropertyIncludesInclude> includes;
        private @Nullable GetPropertyIncludesParentProperty parentProperty;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetPropertyIncludesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.includes = defaults.includes;
    	      this.parentProperty = defaults.parentProperty;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetPropertyIncludesResult", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetPropertyIncludesResult", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPropertyIncludesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includes(List<GetPropertyIncludesInclude> includes) {
            if (includes == null) {
              throw new MissingRequiredPropertyException("GetPropertyIncludesResult", "includes");
            }
            this.includes = includes;
            return this;
        }
        public Builder includes(GetPropertyIncludesInclude... includes) {
            return includes(List.of(includes));
        }
        @CustomType.Setter
        public Builder parentProperty(@Nullable GetPropertyIncludesParentProperty parentProperty) {

            this.parentProperty = parentProperty;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetPropertyIncludesResult build() {
            final var _resultValue = new GetPropertyIncludesResult();
            _resultValue.contractId = contractId;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.includes = includes;
            _resultValue.parentProperty = parentProperty;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
