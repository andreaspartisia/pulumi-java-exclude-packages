// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetWorkloadIdentityPoolProviderOidc {
    private final List<String> allowedAudiences;
    private final String issuerUri;

    @OutputCustomType.Constructor
    private GetWorkloadIdentityPoolProviderOidc(
        @OutputCustomType.Parameter("allowedAudiences") List<String> allowedAudiences,
        @OutputCustomType.Parameter("issuerUri") String issuerUri) {
        this.allowedAudiences = allowedAudiences;
        this.issuerUri = issuerUri;
    }

    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }
    public String getIssuerUri() {
        return this.issuerUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolProviderOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;
        private String issuerUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolProviderOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
        }

        public Builder setAllowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }

        public Builder setIssuerUri(String issuerUri) {
            this.issuerUri = Objects.requireNonNull(issuerUri);
            return this;
        }
        public GetWorkloadIdentityPoolProviderOidc build() {
            return new GetWorkloadIdentityPoolProviderOidc(allowedAudiences, issuerUri);
        }
    }
}
