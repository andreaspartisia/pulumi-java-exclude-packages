// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information needed for generating an [OpenID Connect token](https://developers.google.com/identity/protocols/OpenIDConnect). This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
 * 
 */
public final class OidcTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final OidcTokenArgs Empty = new OidcTokenArgs();

    /**
     * Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    @Import(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> audience() {
        return this.audience == null ? Codegen.empty() : this.audience;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail")
      private final @Nullable Output<String> serviceAccountEmail;

    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail == null ? Codegen.empty() : this.serviceAccountEmail;
    }

    public OidcTokenArgs(
        @Nullable Output<String> audience,
        @Nullable Output<String> serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = serviceAccountEmail;
    }

    private OidcTokenArgs() {
        this.audience = Codegen.empty();
        this.serviceAccountEmail = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audience;
        private @Nullable Output<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }
        public Builder audience(@Nullable String audience) {
            this.audience = Codegen.ofNullable(audience);
            return this;
        }
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Codegen.ofNullable(serviceAccountEmail);
            return this;
        }        public OidcTokenArgs build() {
            return new OidcTokenArgs(audience, serviceAccountEmail);
        }
    }
}
