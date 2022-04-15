// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1TlsInfoCommonNameArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TLS configuration information for virtual hosts and TargetServers.
 * 
 */
public final class GoogleCloudApigeeV1TlsInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1TlsInfoArgs Empty = new GoogleCloudApigeeV1TlsInfoArgs();

    /**
     * The SSL/TLS cipher suites to be used. Must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites
     * 
     */
    @Import(name="ciphers")
      private final @Nullable Output<List<String>> ciphers;

    public Output<List<String>> ciphers() {
        return this.ciphers == null ? Codegen.empty() : this.ciphers;
    }

    /**
     * Optional. Enables two-way TLS.
     * 
     */
    @Import(name="clientAuthEnabled")
      private final @Nullable Output<Boolean> clientAuthEnabled;

    public Output<Boolean> clientAuthEnabled() {
        return this.clientAuthEnabled == null ? Codegen.empty() : this.clientAuthEnabled;
    }

    /**
     * The TLS Common Name of the certificate.
     * 
     */
    @Import(name="commonName")
      private final @Nullable Output<GoogleCloudApigeeV1TlsInfoCommonNameArgs> commonName;

    public Output<GoogleCloudApigeeV1TlsInfoCommonNameArgs> commonName() {
        return this.commonName == null ? Codegen.empty() : this.commonName;
    }

    /**
     * Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
     * 
     */
    @Import(name="ignoreValidationErrors")
      private final @Nullable Output<Boolean> ignoreValidationErrors;

    public Output<Boolean> ignoreValidationErrors() {
        return this.ignoreValidationErrors == null ? Codegen.empty() : this.ignoreValidationErrors;
    }

    /**
     * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private key and cert.
     * 
     */
    @Import(name="keyAlias")
      private final @Nullable Output<String> keyAlias;

    public Output<String> keyAlias() {
        return this.keyAlias == null ? Codegen.empty() : this.keyAlias;
    }

    /**
     * Required if `client_auth_enabled` is true. The resource ID of the keystore.
     * 
     */
    @Import(name="keyStore")
      private final @Nullable Output<String> keyStore;

    public Output<String> keyStore() {
        return this.keyStore == null ? Codegen.empty() : this.keyStore;
    }

    /**
     * The TLS versioins to be used.
     * 
     */
    @Import(name="protocols")
      private final @Nullable Output<List<String>> protocols;

    public Output<List<String>> protocols() {
        return this.protocols == null ? Codegen.empty() : this.protocols;
    }

    /**
     * The resource ID of the truststore.
     * 
     */
    @Import(name="trustStore")
      private final @Nullable Output<String> trustStore;

    public Output<String> trustStore() {
        return this.trustStore == null ? Codegen.empty() : this.trustStore;
    }

    public GoogleCloudApigeeV1TlsInfoArgs(
        @Nullable Output<List<String>> ciphers,
        @Nullable Output<Boolean> clientAuthEnabled,
        @Nullable Output<GoogleCloudApigeeV1TlsInfoCommonNameArgs> commonName,
        Output<Boolean> enabled,
        @Nullable Output<Boolean> ignoreValidationErrors,
        @Nullable Output<String> keyAlias,
        @Nullable Output<String> keyStore,
        @Nullable Output<List<String>> protocols,
        @Nullable Output<String> trustStore) {
        this.ciphers = ciphers;
        this.clientAuthEnabled = clientAuthEnabled;
        this.commonName = commonName;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.ignoreValidationErrors = ignoreValidationErrors;
        this.keyAlias = keyAlias;
        this.keyStore = keyStore;
        this.protocols = protocols;
        this.trustStore = trustStore;
    }

    private GoogleCloudApigeeV1TlsInfoArgs() {
        this.ciphers = Codegen.empty();
        this.clientAuthEnabled = Codegen.empty();
        this.commonName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.ignoreValidationErrors = Codegen.empty();
        this.keyAlias = Codegen.empty();
        this.keyStore = Codegen.empty();
        this.protocols = Codegen.empty();
        this.trustStore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TlsInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ciphers;
        private @Nullable Output<Boolean> clientAuthEnabled;
        private @Nullable Output<GoogleCloudApigeeV1TlsInfoCommonNameArgs> commonName;
        private Output<Boolean> enabled;
        private @Nullable Output<Boolean> ignoreValidationErrors;
        private @Nullable Output<String> keyAlias;
        private @Nullable Output<String> keyStore;
        private @Nullable Output<List<String>> protocols;
        private @Nullable Output<String> trustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TlsInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphers = defaults.ciphers;
    	      this.clientAuthEnabled = defaults.clientAuthEnabled;
    	      this.commonName = defaults.commonName;
    	      this.enabled = defaults.enabled;
    	      this.ignoreValidationErrors = defaults.ignoreValidationErrors;
    	      this.keyAlias = defaults.keyAlias;
    	      this.keyStore = defaults.keyStore;
    	      this.protocols = defaults.protocols;
    	      this.trustStore = defaults.trustStore;
        }

        public Builder ciphers(@Nullable Output<List<String>> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public Builder ciphers(@Nullable List<String> ciphers) {
            this.ciphers = Codegen.ofNullable(ciphers);
            return this;
        }
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }
        public Builder clientAuthEnabled(@Nullable Output<Boolean> clientAuthEnabled) {
            this.clientAuthEnabled = clientAuthEnabled;
            return this;
        }
        public Builder clientAuthEnabled(@Nullable Boolean clientAuthEnabled) {
            this.clientAuthEnabled = Codegen.ofNullable(clientAuthEnabled);
            return this;
        }
        public Builder commonName(@Nullable Output<GoogleCloudApigeeV1TlsInfoCommonNameArgs> commonName) {
            this.commonName = commonName;
            return this;
        }
        public Builder commonName(@Nullable GoogleCloudApigeeV1TlsInfoCommonNameArgs commonName) {
            this.commonName = Codegen.ofNullable(commonName);
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder ignoreValidationErrors(@Nullable Output<Boolean> ignoreValidationErrors) {
            this.ignoreValidationErrors = ignoreValidationErrors;
            return this;
        }
        public Builder ignoreValidationErrors(@Nullable Boolean ignoreValidationErrors) {
            this.ignoreValidationErrors = Codegen.ofNullable(ignoreValidationErrors);
            return this;
        }
        public Builder keyAlias(@Nullable Output<String> keyAlias) {
            this.keyAlias = keyAlias;
            return this;
        }
        public Builder keyAlias(@Nullable String keyAlias) {
            this.keyAlias = Codegen.ofNullable(keyAlias);
            return this;
        }
        public Builder keyStore(@Nullable Output<String> keyStore) {
            this.keyStore = keyStore;
            return this;
        }
        public Builder keyStore(@Nullable String keyStore) {
            this.keyStore = Codegen.ofNullable(keyStore);
            return this;
        }
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(@Nullable List<String> protocols) {
            this.protocols = Codegen.ofNullable(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder trustStore(@Nullable Output<String> trustStore) {
            this.trustStore = trustStore;
            return this;
        }
        public Builder trustStore(@Nullable String trustStore) {
            this.trustStore = Codegen.ofNullable(trustStore);
            return this;
        }        public GoogleCloudApigeeV1TlsInfoArgs build() {
            return new GoogleCloudApigeeV1TlsInfoArgs(ciphers, clientAuthEnabled, commonName, enabled, ignoreValidationErrors, keyAlias, keyStore, protocols, trustStore);
        }
    }
}
