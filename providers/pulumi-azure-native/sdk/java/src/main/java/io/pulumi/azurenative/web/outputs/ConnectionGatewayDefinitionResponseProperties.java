// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ConnectionGatewayReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionGatewayDefinitionResponseProperties {
    private final @Nullable String backendUri;
    private final @Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation;
    private final @Nullable List<String> contactInformation;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable String machineName;
    private final @Nullable Object status;

    @OutputCustomType.Constructor({"backendUri","connectionGatewayInstallation","contactInformation","description","displayName","machineName","status"})
    private ConnectionGatewayDefinitionResponseProperties(
        @Nullable String backendUri,
        @Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation,
        @Nullable List<String> contactInformation,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String machineName,
        @Nullable Object status) {
        this.backendUri = backendUri;
        this.connectionGatewayInstallation = connectionGatewayInstallation;
        this.contactInformation = contactInformation;
        this.description = description;
        this.displayName = displayName;
        this.machineName = machineName;
        this.status = status;
    }

    public Optional<String> getBackendUri() {
        return Optional.ofNullable(this.backendUri);
    }
    public Optional<ConnectionGatewayReferenceResponse> getConnectionGatewayInstallation() {
        return Optional.ofNullable(this.connectionGatewayInstallation);
    }
    public List<String> getContactInformation() {
        return this.contactInformation == null ? List.of() : this.contactInformation;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getMachineName() {
        return Optional.ofNullable(this.machineName);
    }
    public Optional<Object> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayDefinitionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backendUri;
        private @Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation;
        private @Nullable List<String> contactInformation;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String machineName;
        private @Nullable Object status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayDefinitionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendUri = defaults.backendUri;
    	      this.connectionGatewayInstallation = defaults.connectionGatewayInstallation;
    	      this.contactInformation = defaults.contactInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.machineName = defaults.machineName;
    	      this.status = defaults.status;
        }

        public Builder setBackendUri(@Nullable String backendUri) {
            this.backendUri = backendUri;
            return this;
        }

        public Builder setConnectionGatewayInstallation(@Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation) {
            this.connectionGatewayInstallation = connectionGatewayInstallation;
            return this;
        }

        public Builder setContactInformation(@Nullable List<String> contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setMachineName(@Nullable String machineName) {
            this.machineName = machineName;
            return this;
        }

        public Builder setStatus(@Nullable Object status) {
            this.status = status;
            return this;
        }

        public ConnectionGatewayDefinitionResponseProperties build() {
            return new ConnectionGatewayDefinitionResponseProperties(backendUri, connectionGatewayInstallation, contactInformation, description, displayName, machineName, status);
        }
    }
}