// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1AdvancedApiOpsConfigResponse {
    /**
     * Flag that specifies whether the Advanced API Ops add-on is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GoogleCloudApigeeV1AdvancedApiOpsConfigResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Flag that specifies whether the Advanced API Ops add-on is enabled.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AdvancedApiOpsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AdvancedApiOpsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GoogleCloudApigeeV1AdvancedApiOpsConfigResponse build() {
            return new GoogleCloudApigeeV1AdvancedApiOpsConfigResponse(enabled);
        }
    }
}
