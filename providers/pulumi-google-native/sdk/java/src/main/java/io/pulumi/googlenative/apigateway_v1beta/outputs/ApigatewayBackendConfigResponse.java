// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApigatewayBackendConfigResponse {
    /**
     * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend). This may either be the Service Account's email (i.e. "{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com") or its full resource name (i.e. "projects/{PROJECT}/accounts/{UNIQUE_ID}"). This is most often used when the backend is a GCP resource such as a Cloud Run Service or an IAP-secured service. Note that this token is always sent as an authorization header bearer token. The audience of the OIDC token is configured in the associated Service Config in the BackendRule option (https://github.com/googleapis/googleapis/blob/master/google/api/backend.proto#L125).
     * 
     */
    private final String googleServiceAccount;

    @CustomType.Constructor
    private ApigatewayBackendConfigResponse(@CustomType.Parameter("googleServiceAccount") String googleServiceAccount) {
        this.googleServiceAccount = googleServiceAccount;
    }

    /**
     * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend). This may either be the Service Account's email (i.e. "{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com") or its full resource name (i.e. "projects/{PROJECT}/accounts/{UNIQUE_ID}"). This is most often used when the backend is a GCP resource such as a Cloud Run Service or an IAP-secured service. Note that this token is always sent as an authorization header bearer token. The audience of the OIDC token is configured in the associated Service Config in the BackendRule option (https://github.com/googleapis/googleapis/blob/master/google/api/backend.proto#L125).
     * 
    */
    public String googleServiceAccount() {
        return this.googleServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayBackendConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String googleServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayBackendConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleServiceAccount = defaults.googleServiceAccount;
        }

        public Builder googleServiceAccount(String googleServiceAccount) {
            this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount);
            return this;
        }        public ApigatewayBackendConfigResponse build() {
            return new ApigatewayBackendConfigResponse(googleServiceAccount);
        }
    }
}
