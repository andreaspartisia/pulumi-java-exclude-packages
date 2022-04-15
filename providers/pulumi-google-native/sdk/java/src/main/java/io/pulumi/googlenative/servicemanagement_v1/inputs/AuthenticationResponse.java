// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.AuthProviderResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.AuthenticationRuleResponse;
import java.util.List;
import java.util.Objects;


/**
 * `Authentication` defines the authentication configuration for API methods provided by an API service. Example: name: calendar.googleapis.com authentication: providers: - id: google_calendar_auth jwks_uri: https://www.googleapis.com/oauth2/v1/certs issuer: https://securetoken.google.com rules: - selector: "*" requirements: provider_id: google_calendar_auth - selector: google.calendar.Delegate oauth: canonical_scopes: https://www.googleapis.com/auth/calendar.read
 * 
 */
public final class AuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthenticationResponse Empty = new AuthenticationResponse();

    /**
     * Defines a set of authentication providers that a service supports.
     * 
     */
    @Import(name="providers", required=true)
      private final List<AuthProviderResponse> providers;

    public List<AuthProviderResponse> providers() {
        return this.providers;
    }

    /**
     * A list of authentication rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @Import(name="rules", required=true)
      private final List<AuthenticationRuleResponse> rules;

    public List<AuthenticationRuleResponse> rules() {
        return this.rules;
    }

    public AuthenticationResponse(
        List<AuthProviderResponse> providers,
        List<AuthenticationRuleResponse> rules) {
        this.providers = Objects.requireNonNull(providers, "expected parameter 'providers' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private AuthenticationResponse() {
        this.providers = List.of();
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AuthProviderResponse> providers;
        private List<AuthenticationRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providers = defaults.providers;
    	      this.rules = defaults.rules;
        }

        public Builder providers(List<AuthProviderResponse> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public Builder providers(AuthProviderResponse... providers) {
            return providers(List.of(providers));
        }
        public Builder rules(List<AuthenticationRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(AuthenticationRuleResponse... rules) {
            return rules(List.of(rules));
        }        public AuthenticationResponse build() {
            return new AuthenticationResponse(providers, rules);
        }
    }
}
