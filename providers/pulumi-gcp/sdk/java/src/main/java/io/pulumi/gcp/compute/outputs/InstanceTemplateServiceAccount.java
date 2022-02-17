// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceTemplateServiceAccount {
    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    private final @Nullable String email;
    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    private final List<String> scopes;

    @OutputCustomType.Constructor({"email","scopes"})
    private InstanceTemplateServiceAccount(
        @Nullable String email,
        List<String> scopes) {
        this.email = email;
        this.scopes = Objects.requireNonNull(scopes);
    }

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    public List<String> getScopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public InstanceTemplateServiceAccount build() {
            return new InstanceTemplateServiceAccount(email, scopes);
        }
    }
}