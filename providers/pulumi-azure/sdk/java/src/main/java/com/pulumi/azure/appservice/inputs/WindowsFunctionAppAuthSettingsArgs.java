// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsActiveDirectoryArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsFacebookArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsGithubArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsGoogleArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsMicrosoftArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsTwitterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppAuthSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppAuthSettingsArgs Empty = new WindowsFunctionAppAuthSettingsArgs();

    /**
     * An `active_directory` block as defined above.
     * 
     */
    @Import(name="activeDirectory")
    private @Nullable Output<WindowsFunctionAppAuthSettingsActiveDirectoryArgs> activeDirectory;

    /**
     * @return An `active_directory` block as defined above.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsActiveDirectoryArgs>> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }

    /**
     * Specifies a map of Login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
     * 
     */
    @Import(name="additionalLoginParameters")
    private @Nullable Output<Map<String,String>> additionalLoginParameters;

    /**
     * @return Specifies a map of Login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalLoginParameters() {
        return Optional.ofNullable(this.additionalLoginParameters);
    }

    /**
     * Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Function App.
     * 
     */
    @Import(name="allowedExternalRedirectUrls")
    private @Nullable Output<List<String>> allowedExternalRedirectUrls;

    /**
     * @return Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Function App.
     * 
     */
    public Optional<Output<List<String>>> allowedExternalRedirectUrls() {
        return Optional.ofNullable(this.allowedExternalRedirectUrls);
    }

    /**
     * The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`
     * 
     */
    @Import(name="defaultProvider")
    private @Nullable Output<String> defaultProvider;

    /**
     * @return The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`
     * 
     */
    public Optional<Output<String>> defaultProvider() {
        return Optional.ofNullable(this.defaultProvider);
    }

    /**
     * Should the Authentication / Authorization feature be enabled for the Windows Function App?
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Should the Authentication / Authorization feature be enabled for the Windows Function App?
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A `facebook` block as defined below.
     * 
     */
    @Import(name="facebook")
    private @Nullable Output<WindowsFunctionAppAuthSettingsFacebookArgs> facebook;

    /**
     * @return A `facebook` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsFacebookArgs>> facebook() {
        return Optional.ofNullable(this.facebook);
    }

    /**
     * A `github` block as defined below.
     * 
     */
    @Import(name="github")
    private @Nullable Output<WindowsFunctionAppAuthSettingsGithubArgs> github;

    /**
     * @return A `github` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * A `google` block as defined below.
     * 
     */
    @Import(name="google")
    private @Nullable Output<WindowsFunctionAppAuthSettingsGoogleArgs> google;

    /**
     * @return A `google` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsGoogleArgs>> google() {
        return Optional.ofNullable(this.google);
    }

    /**
     * The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Windows Function App.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Windows Function App.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * A `microsoft` block as defined below.
     * 
     */
    @Import(name="microsoft")
    private @Nullable Output<WindowsFunctionAppAuthSettingsMicrosoftArgs> microsoft;

    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsMicrosoftArgs>> microsoft() {
        return Optional.ofNullable(this.microsoft);
    }

    /**
     * The Runtime Version of the Authentication / Authorization feature in use for the Windows Function App.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    /**
     * @return The Runtime Version of the Authentication / Authorization feature in use for the Windows Function App.
     * 
     */
    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    /**
     * The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
     * 
     */
    @Import(name="tokenRefreshExtensionHours")
    private @Nullable Output<Double> tokenRefreshExtensionHours;

    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
     * 
     */
    public Optional<Output<Double>> tokenRefreshExtensionHours() {
        return Optional.ofNullable(this.tokenRefreshExtensionHours);
    }

    /**
     * Should the Windows Function App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
     * 
     */
    @Import(name="tokenStoreEnabled")
    private @Nullable Output<Boolean> tokenStoreEnabled;

    /**
     * @return Should the Windows Function App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tokenStoreEnabled() {
        return Optional.ofNullable(this.tokenStoreEnabled);
    }

    /**
     * A `twitter` block as defined below.
     * 
     */
    @Import(name="twitter")
    private @Nullable Output<WindowsFunctionAppAuthSettingsTwitterArgs> twitter;

    /**
     * @return A `twitter` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsTwitterArgs>> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    /**
     * The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
     * 
     */
    @Import(name="unauthenticatedClientAction")
    private @Nullable Output<String> unauthenticatedClientAction;

    /**
     * @return The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
     * 
     */
    public Optional<Output<String>> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    private WindowsFunctionAppAuthSettingsArgs() {}

    private WindowsFunctionAppAuthSettingsArgs(WindowsFunctionAppAuthSettingsArgs $) {
        this.activeDirectory = $.activeDirectory;
        this.additionalLoginParameters = $.additionalLoginParameters;
        this.allowedExternalRedirectUrls = $.allowedExternalRedirectUrls;
        this.defaultProvider = $.defaultProvider;
        this.enabled = $.enabled;
        this.facebook = $.facebook;
        this.github = $.github;
        this.google = $.google;
        this.issuer = $.issuer;
        this.microsoft = $.microsoft;
        this.runtimeVersion = $.runtimeVersion;
        this.tokenRefreshExtensionHours = $.tokenRefreshExtensionHours;
        this.tokenStoreEnabled = $.tokenStoreEnabled;
        this.twitter = $.twitter;
        this.unauthenticatedClientAction = $.unauthenticatedClientAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppAuthSettingsArgs $;

        public Builder() {
            $ = new WindowsFunctionAppAuthSettingsArgs();
        }

        public Builder(WindowsFunctionAppAuthSettingsArgs defaults) {
            $ = new WindowsFunctionAppAuthSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectory An `active_directory` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(@Nullable Output<WindowsFunctionAppAuthSettingsActiveDirectoryArgs> activeDirectory) {
            $.activeDirectory = activeDirectory;
            return this;
        }

        /**
         * @param activeDirectory An `active_directory` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(WindowsFunctionAppAuthSettingsActiveDirectoryArgs activeDirectory) {
            return activeDirectory(Output.of(activeDirectory));
        }

        /**
         * @param additionalLoginParameters Specifies a map of Login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
         * 
         * @return builder
         * 
         */
        public Builder additionalLoginParameters(@Nullable Output<Map<String,String>> additionalLoginParameters) {
            $.additionalLoginParameters = additionalLoginParameters;
            return this;
        }

        /**
         * @param additionalLoginParameters Specifies a map of Login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
         * 
         * @return builder
         * 
         */
        public Builder additionalLoginParameters(Map<String,String> additionalLoginParameters) {
            return additionalLoginParameters(Output.of(additionalLoginParameters));
        }

        /**
         * @param allowedExternalRedirectUrls Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder allowedExternalRedirectUrls(@Nullable Output<List<String>> allowedExternalRedirectUrls) {
            $.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            return this;
        }

        /**
         * @param allowedExternalRedirectUrls Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder allowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(Output.of(allowedExternalRedirectUrls));
        }

        /**
         * @param allowedExternalRedirectUrls Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }

        /**
         * @param defaultProvider The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`
         * 
         * @return builder
         * 
         */
        public Builder defaultProvider(@Nullable Output<String> defaultProvider) {
            $.defaultProvider = defaultProvider;
            return this;
        }

        /**
         * @param defaultProvider The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`
         * 
         * @return builder
         * 
         */
        public Builder defaultProvider(String defaultProvider) {
            return defaultProvider(Output.of(defaultProvider));
        }

        /**
         * @param enabled Should the Authentication / Authorization feature be enabled for the Windows Function App?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the Authentication / Authorization feature be enabled for the Windows Function App?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param facebook A `facebook` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder facebook(@Nullable Output<WindowsFunctionAppAuthSettingsFacebookArgs> facebook) {
            $.facebook = facebook;
            return this;
        }

        /**
         * @param facebook A `facebook` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder facebook(WindowsFunctionAppAuthSettingsFacebookArgs facebook) {
            return facebook(Output.of(facebook));
        }

        /**
         * @param github A `github` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<WindowsFunctionAppAuthSettingsGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github A `github` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder github(WindowsFunctionAppAuthSettingsGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param google A `google` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder google(@Nullable Output<WindowsFunctionAppAuthSettingsGoogleArgs> google) {
            $.google = google;
            return this;
        }

        /**
         * @param google A `google` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder google(WindowsFunctionAppAuthSettingsGoogleArgs google) {
            return google(Output.of(google));
        }

        /**
         * @param issuer The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param microsoft A `microsoft` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder microsoft(@Nullable Output<WindowsFunctionAppAuthSettingsMicrosoftArgs> microsoft) {
            $.microsoft = microsoft;
            return this;
        }

        /**
         * @param microsoft A `microsoft` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder microsoft(WindowsFunctionAppAuthSettingsMicrosoftArgs microsoft) {
            return microsoft(Output.of(microsoft));
        }

        /**
         * @param runtimeVersion The Runtime Version of the Authentication / Authorization feature in use for the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion The Runtime Version of the Authentication / Authorization feature in use for the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        /**
         * @param tokenRefreshExtensionHours The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
         * 
         * @return builder
         * 
         */
        public Builder tokenRefreshExtensionHours(@Nullable Output<Double> tokenRefreshExtensionHours) {
            $.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }

        /**
         * @param tokenRefreshExtensionHours The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
         * 
         * @return builder
         * 
         */
        public Builder tokenRefreshExtensionHours(Double tokenRefreshExtensionHours) {
            return tokenRefreshExtensionHours(Output.of(tokenRefreshExtensionHours));
        }

        /**
         * @param tokenStoreEnabled Should the Windows Function App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tokenStoreEnabled(@Nullable Output<Boolean> tokenStoreEnabled) {
            $.tokenStoreEnabled = tokenStoreEnabled;
            return this;
        }

        /**
         * @param tokenStoreEnabled Should the Windows Function App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tokenStoreEnabled(Boolean tokenStoreEnabled) {
            return tokenStoreEnabled(Output.of(tokenStoreEnabled));
        }

        /**
         * @param twitter A `twitter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder twitter(@Nullable Output<WindowsFunctionAppAuthSettingsTwitterArgs> twitter) {
            $.twitter = twitter;
            return this;
        }

        /**
         * @param twitter A `twitter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder twitter(WindowsFunctionAppAuthSettingsTwitterArgs twitter) {
            return twitter(Output.of(twitter));
        }

        /**
         * @param unauthenticatedClientAction The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
         * 
         * @return builder
         * 
         */
        public Builder unauthenticatedClientAction(@Nullable Output<String> unauthenticatedClientAction) {
            $.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }

        /**
         * @param unauthenticatedClientAction The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
         * 
         * @return builder
         * 
         */
        public Builder unauthenticatedClientAction(String unauthenticatedClientAction) {
            return unauthenticatedClientAction(Output.of(unauthenticatedClientAction));
        }

        public WindowsFunctionAppAuthSettingsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
