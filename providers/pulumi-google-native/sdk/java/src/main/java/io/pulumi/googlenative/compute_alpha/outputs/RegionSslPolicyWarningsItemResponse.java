// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_alpha.outputs.RegionSslPolicyWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RegionSslPolicyWarningsItemResponse {
    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    private final String code;
    /**
     * Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" }
     * 
     */
    private final List<RegionSslPolicyWarningsItemDataItemResponse> data;
    /**
     * A human-readable description of the warning code.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private RegionSslPolicyWarningsItemResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("data") List<RegionSslPolicyWarningsItemDataItemResponse> data,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
    */
    public String code() {
        return this.code;
    }
    /**
     * Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" }
     * 
    */
    public List<RegionSslPolicyWarningsItemDataItemResponse> data() {
        return this.data;
    }
    /**
     * A human-readable description of the warning code.
     * 
    */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSslPolicyWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<RegionSslPolicyWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSslPolicyWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder data(List<RegionSslPolicyWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(RegionSslPolicyWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public RegionSslPolicyWarningsItemResponse build() {
            return new RegionSslPolicyWarningsItemResponse(code, data, message);
        }
    }
}
