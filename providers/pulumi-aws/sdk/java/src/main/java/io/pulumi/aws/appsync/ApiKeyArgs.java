// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiKeyArgs Empty = new ApiKeyArgs();

    /**
     * The ID of the associated AppSync API
     * 
     */
    @InputImport(name="apiId", required=true)
      private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * The API key description. Defaults to "Managed by Pulumi".
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    @InputImport(name="expires")
      private final @Nullable Input<String> expires;

    public Input<String> getExpires() {
        return this.expires == null ? Input.empty() : this.expires;
    }

    public ApiKeyArgs(
        Input<String> apiId,
        @Nullable Input<String> description,
        @Nullable Input<String> expires) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.description = description == null ? Input.ofNullable("Managed by Pulumi") : description;
        this.expires = expires;
    }

    private ApiKeyArgs() {
        this.apiId = Input.empty();
        this.description = Input.empty();
        this.expires = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> expires;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.description = defaults.description;
    	      this.expires = defaults.expires;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpires(@Nullable Input<String> expires) {
            this.expires = expires;
            return this;
        }

        public Builder setExpires(@Nullable String expires) {
            this.expires = Input.ofNullable(expires);
            return this;
        }
        public ApiKeyArgs build() {
            return new ApiKeyArgs(apiId, description, expires);
        }
    }
}