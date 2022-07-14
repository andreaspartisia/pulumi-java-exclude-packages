// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mypkg.outputs.SsisEnvironmentResponse;
import com.pulumi.mypkg.outputs.SsisFolderResponse;
import com.pulumi.mypkg.outputs.SsisPackageResponse;
import com.pulumi.mypkg.outputs.SsisProjectResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIntegrationRuntimeObjectMetadatumResult {
    /**
     * @return The link to the next page of results, if any remaining results exist.
     * 
     */
    private @Nullable String nextLink;
    /**
     * @return List of SSIS object metadata.
     * 
     */
    private @Nullable List<Object> value;

    private GetIntegrationRuntimeObjectMetadatumResult() {}
    /**
     * @return The link to the next page of results, if any remaining results exist.
     * 
     */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * @return List of SSIS object metadata.
     * 
     */
    public List<Object> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeObjectMetadatumResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<Object> value;
        public Builder() {}
        public Builder(GetIntegrationRuntimeObjectMetadatumResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable List<Object> value) {
            this.value = value;
            return this;
        }
        public Builder value(Object... value) {
            return value(List.of(value));
        }
        public GetIntegrationRuntimeObjectMetadatumResult build() {
            final var o = new GetIntegrationRuntimeObjectMetadatumResult();
            o.nextLink = nextLink;
            o.value = value;
            return o;
        }
    }
}
