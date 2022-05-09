// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetLinuxWebAppAuthSettingActiveDirectory;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppAuthSettingFacebook;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppAuthSettingGithub;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppAuthSettingGoogle;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppAuthSettingMicrosoft;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppAuthSettingTwitter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppAuthSetting {
    /**
     * @return A `active_directory` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppAuthSettingActiveDirectory> activeDirectories;
    /**
     * @return A `additional_login_parameters` block as defined above.
     * 
     */
    private final Map<String,String> additionalLoginParameters;
    /**
     * @return A `allowed_external_redirect_urls` block as defined above.
     * 
     */
    private final List<String> allowedExternalRedirectUrls;
    /**
     * @return The default authentication provider in use when multiple providers are configured.
     * 
     */
    private final String defaultProvider;
    /**
     * @return Is the Backup enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return A `facebook` block as defined below.
     * 
     */
    private final List<GetLinuxWebAppAuthSettingFacebook> facebooks;
    /**
     * @return A `github` block as defined below.
     * 
     */
    private final List<GetLinuxWebAppAuthSettingGithub> githubs;
    /**
     * @return A `google` block as defined below.
     * 
     */
    private final List<GetLinuxWebAppAuthSettingGoogle> googles;
    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Linux Web App.
     * 
     */
    private final String issuer;
    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    private final List<GetLinuxWebAppAuthSettingMicrosoft> microsofts;
    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use for the Linux Web App.
     * 
     */
    private final String runtimeVersion;
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API.
     * 
     */
    private final Double tokenRefreshExtensionHours;
    /**
     * @return Does Linux Web App durably store platform-specific security tokens that are obtained during login flows enabled?
     * 
     */
    private final Boolean tokenStoreEnabled;
    /**
     * @return A `twitter` block as defined below.
     * 
     */
    private final List<GetLinuxWebAppAuthSettingTwitter> twitters;
    /**
     * @return The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    private final String unauthenticatedClientAction;

    @CustomType.Constructor
    private GetLinuxWebAppAuthSetting(
        @CustomType.Parameter("activeDirectories") List<GetLinuxWebAppAuthSettingActiveDirectory> activeDirectories,
        @CustomType.Parameter("additionalLoginParameters") Map<String,String> additionalLoginParameters,
        @CustomType.Parameter("allowedExternalRedirectUrls") List<String> allowedExternalRedirectUrls,
        @CustomType.Parameter("defaultProvider") String defaultProvider,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("facebooks") List<GetLinuxWebAppAuthSettingFacebook> facebooks,
        @CustomType.Parameter("githubs") List<GetLinuxWebAppAuthSettingGithub> githubs,
        @CustomType.Parameter("googles") List<GetLinuxWebAppAuthSettingGoogle> googles,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("microsofts") List<GetLinuxWebAppAuthSettingMicrosoft> microsofts,
        @CustomType.Parameter("runtimeVersion") String runtimeVersion,
        @CustomType.Parameter("tokenRefreshExtensionHours") Double tokenRefreshExtensionHours,
        @CustomType.Parameter("tokenStoreEnabled") Boolean tokenStoreEnabled,
        @CustomType.Parameter("twitters") List<GetLinuxWebAppAuthSettingTwitter> twitters,
        @CustomType.Parameter("unauthenticatedClientAction") String unauthenticatedClientAction) {
        this.activeDirectories = activeDirectories;
        this.additionalLoginParameters = additionalLoginParameters;
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        this.defaultProvider = defaultProvider;
        this.enabled = enabled;
        this.facebooks = facebooks;
        this.githubs = githubs;
        this.googles = googles;
        this.issuer = issuer;
        this.microsofts = microsofts;
        this.runtimeVersion = runtimeVersion;
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
        this.tokenStoreEnabled = tokenStoreEnabled;
        this.twitters = twitters;
        this.unauthenticatedClientAction = unauthenticatedClientAction;
    }

    /**
     * @return A `active_directory` block as defined above.
     * 
     */
    public List<GetLinuxWebAppAuthSettingActiveDirectory> activeDirectories() {
        return this.activeDirectories;
    }
    /**
     * @return A `additional_login_parameters` block as defined above.
     * 
     */
    public Map<String,String> additionalLoginParameters() {
        return this.additionalLoginParameters;
    }
    /**
     * @return A `allowed_external_redirect_urls` block as defined above.
     * 
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }
    /**
     * @return The default authentication provider in use when multiple providers are configured.
     * 
     */
    public String defaultProvider() {
        return this.defaultProvider;
    }
    /**
     * @return Is the Backup enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A `facebook` block as defined below.
     * 
     */
    public List<GetLinuxWebAppAuthSettingFacebook> facebooks() {
        return this.facebooks;
    }
    /**
     * @return A `github` block as defined below.
     * 
     */
    public List<GetLinuxWebAppAuthSettingGithub> githubs() {
        return this.githubs;
    }
    /**
     * @return A `google` block as defined below.
     * 
     */
    public List<GetLinuxWebAppAuthSettingGoogle> googles() {
        return this.googles;
    }
    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Linux Web App.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    public List<GetLinuxWebAppAuthSettingMicrosoft> microsofts() {
        return this.microsofts;
    }
    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use for the Linux Web App.
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API.
     * 
     */
    public Double tokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours;
    }
    /**
     * @return Does Linux Web App durably store platform-specific security tokens that are obtained during login flows enabled?
     * 
     */
    public Boolean tokenStoreEnabled() {
        return this.tokenStoreEnabled;
    }
    /**
     * @return A `twitter` block as defined below.
     * 
     */
    public List<GetLinuxWebAppAuthSettingTwitter> twitters() {
        return this.twitters;
    }
    /**
     * @return The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    public String unauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppAuthSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetLinuxWebAppAuthSettingActiveDirectory> activeDirectories;
        private Map<String,String> additionalLoginParameters;
        private List<String> allowedExternalRedirectUrls;
        private String defaultProvider;
        private Boolean enabled;
        private List<GetLinuxWebAppAuthSettingFacebook> facebooks;
        private List<GetLinuxWebAppAuthSettingGithub> githubs;
        private List<GetLinuxWebAppAuthSettingGoogle> googles;
        private String issuer;
        private List<GetLinuxWebAppAuthSettingMicrosoft> microsofts;
        private String runtimeVersion;
        private Double tokenRefreshExtensionHours;
        private Boolean tokenStoreEnabled;
        private List<GetLinuxWebAppAuthSettingTwitter> twitters;
        private String unauthenticatedClientAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppAuthSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectories = defaults.activeDirectories;
    	      this.additionalLoginParameters = defaults.additionalLoginParameters;
    	      this.allowedExternalRedirectUrls = defaults.allowedExternalRedirectUrls;
    	      this.defaultProvider = defaults.defaultProvider;
    	      this.enabled = defaults.enabled;
    	      this.facebooks = defaults.facebooks;
    	      this.githubs = defaults.githubs;
    	      this.googles = defaults.googles;
    	      this.issuer = defaults.issuer;
    	      this.microsofts = defaults.microsofts;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.tokenRefreshExtensionHours = defaults.tokenRefreshExtensionHours;
    	      this.tokenStoreEnabled = defaults.tokenStoreEnabled;
    	      this.twitters = defaults.twitters;
    	      this.unauthenticatedClientAction = defaults.unauthenticatedClientAction;
        }

        public Builder activeDirectories(List<GetLinuxWebAppAuthSettingActiveDirectory> activeDirectories) {
            this.activeDirectories = Objects.requireNonNull(activeDirectories);
            return this;
        }
        public Builder activeDirectories(GetLinuxWebAppAuthSettingActiveDirectory... activeDirectories) {
            return activeDirectories(List.of(activeDirectories));
        }
        public Builder additionalLoginParameters(Map<String,String> additionalLoginParameters) {
            this.additionalLoginParameters = Objects.requireNonNull(additionalLoginParameters);
            return this;
        }
        public Builder allowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = Objects.requireNonNull(allowedExternalRedirectUrls);
            return this;
        }
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }
        public Builder defaultProvider(String defaultProvider) {
            this.defaultProvider = Objects.requireNonNull(defaultProvider);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder facebooks(List<GetLinuxWebAppAuthSettingFacebook> facebooks) {
            this.facebooks = Objects.requireNonNull(facebooks);
            return this;
        }
        public Builder facebooks(GetLinuxWebAppAuthSettingFacebook... facebooks) {
            return facebooks(List.of(facebooks));
        }
        public Builder githubs(List<GetLinuxWebAppAuthSettingGithub> githubs) {
            this.githubs = Objects.requireNonNull(githubs);
            return this;
        }
        public Builder githubs(GetLinuxWebAppAuthSettingGithub... githubs) {
            return githubs(List.of(githubs));
        }
        public Builder googles(List<GetLinuxWebAppAuthSettingGoogle> googles) {
            this.googles = Objects.requireNonNull(googles);
            return this;
        }
        public Builder googles(GetLinuxWebAppAuthSettingGoogle... googles) {
            return googles(List.of(googles));
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder microsofts(List<GetLinuxWebAppAuthSettingMicrosoft> microsofts) {
            this.microsofts = Objects.requireNonNull(microsofts);
            return this;
        }
        public Builder microsofts(GetLinuxWebAppAuthSettingMicrosoft... microsofts) {
            return microsofts(List.of(microsofts));
        }
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }
        public Builder tokenRefreshExtensionHours(Double tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = Objects.requireNonNull(tokenRefreshExtensionHours);
            return this;
        }
        public Builder tokenStoreEnabled(Boolean tokenStoreEnabled) {
            this.tokenStoreEnabled = Objects.requireNonNull(tokenStoreEnabled);
            return this;
        }
        public Builder twitters(List<GetLinuxWebAppAuthSettingTwitter> twitters) {
            this.twitters = Objects.requireNonNull(twitters);
            return this;
        }
        public Builder twitters(GetLinuxWebAppAuthSettingTwitter... twitters) {
            return twitters(List.of(twitters));
        }
        public Builder unauthenticatedClientAction(String unauthenticatedClientAction) {
            this.unauthenticatedClientAction = Objects.requireNonNull(unauthenticatedClientAction);
            return this;
        }        public GetLinuxWebAppAuthSetting build() {
            return new GetLinuxWebAppAuthSetting(activeDirectories, additionalLoginParameters, allowedExternalRedirectUrls, defaultProvider, enabled, facebooks, githubs, googles, issuer, microsofts, runtimeVersion, tokenRefreshExtensionHours, tokenStoreEnabled, twitters, unauthenticatedClientAction);
        }
    }
}
