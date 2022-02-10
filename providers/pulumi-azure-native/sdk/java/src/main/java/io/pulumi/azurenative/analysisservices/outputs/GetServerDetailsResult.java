// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.azurenative.analysisservices.outputs.GatewayDetailsResponse;
import io.pulumi.azurenative.analysisservices.outputs.IPv4FirewallSettingsResponse;
import io.pulumi.azurenative.analysisservices.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.analysisservices.outputs.ServerAdministratorsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerDetailsResult {
    private final @Nullable ServerAdministratorsResponse asAdministrators;
    private final @Nullable String backupBlobContainerUri;
    private final @Nullable GatewayDetailsResponse gatewayDetails;
    private final String id;
    private final @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings;
    private final String location;
    private final @Nullable Integer managedMode;
    private final String name;
    private final String provisioningState;
    private final @Nullable String querypoolConnectionMode;
    private final String serverFullName;
    private final @Nullable Integer serverMonitorMode;
    private final ResourceSkuResponse sku;
    private final String state;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"asAdministrators","backupBlobContainerUri","gatewayDetails","id","ipV4FirewallSettings","location","managedMode","name","provisioningState","querypoolConnectionMode","serverFullName","serverMonitorMode","sku","state","tags","type"})
    private GetServerDetailsResult(
        @Nullable ServerAdministratorsResponse asAdministrators,
        @Nullable String backupBlobContainerUri,
        @Nullable GatewayDetailsResponse gatewayDetails,
        String id,
        @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings,
        String location,
        @Nullable Integer managedMode,
        String name,
        String provisioningState,
        @Nullable String querypoolConnectionMode,
        String serverFullName,
        @Nullable Integer serverMonitorMode,
        ResourceSkuResponse sku,
        String state,
        @Nullable Map<String,String> tags,
        String type) {
        this.asAdministrators = asAdministrators;
        this.backupBlobContainerUri = backupBlobContainerUri;
        this.gatewayDetails = gatewayDetails;
        this.id = Objects.requireNonNull(id);
        this.ipV4FirewallSettings = ipV4FirewallSettings;
        this.location = Objects.requireNonNull(location);
        this.managedMode = managedMode;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.querypoolConnectionMode = querypoolConnectionMode;
        this.serverFullName = Objects.requireNonNull(serverFullName);
        this.serverMonitorMode = serverMonitorMode;
        this.sku = Objects.requireNonNull(sku);
        this.state = Objects.requireNonNull(state);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<ServerAdministratorsResponse> getAsAdministrators() {
        return Optional.ofNullable(this.asAdministrators);
    }
    public Optional<String> getBackupBlobContainerUri() {
        return Optional.ofNullable(this.backupBlobContainerUri);
    }
    public Optional<GatewayDetailsResponse> getGatewayDetails() {
        return Optional.ofNullable(this.gatewayDetails);
    }
    public String getId() {
        return this.id;
    }
    public Optional<IPv4FirewallSettingsResponse> getIpV4FirewallSettings() {
        return Optional.ofNullable(this.ipV4FirewallSettings);
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<Integer> getManagedMode() {
        return Optional.ofNullable(this.managedMode);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getQuerypoolConnectionMode() {
        return Optional.ofNullable(this.querypoolConnectionMode);
    }
    public String getServerFullName() {
        return this.serverFullName;
    }
    public Optional<Integer> getServerMonitorMode() {
        return Optional.ofNullable(this.serverMonitorMode);
    }
    public ResourceSkuResponse getSku() {
        return this.sku;
    }
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServerAdministratorsResponse asAdministrators;
        private @Nullable String backupBlobContainerUri;
        private @Nullable GatewayDetailsResponse gatewayDetails;
        private String id;
        private @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings;
        private String location;
        private @Nullable Integer managedMode;
        private String name;
        private String provisioningState;
        private @Nullable String querypoolConnectionMode;
        private String serverFullName;
        private @Nullable Integer serverMonitorMode;
        private ResourceSkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asAdministrators = defaults.asAdministrators;
    	      this.backupBlobContainerUri = defaults.backupBlobContainerUri;
    	      this.gatewayDetails = defaults.gatewayDetails;
    	      this.id = defaults.id;
    	      this.ipV4FirewallSettings = defaults.ipV4FirewallSettings;
    	      this.location = defaults.location;
    	      this.managedMode = defaults.managedMode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.querypoolConnectionMode = defaults.querypoolConnectionMode;
    	      this.serverFullName = defaults.serverFullName;
    	      this.serverMonitorMode = defaults.serverMonitorMode;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAsAdministrators(@Nullable ServerAdministratorsResponse asAdministrators) {
            this.asAdministrators = asAdministrators;
            return this;
        }

        public Builder setBackupBlobContainerUri(@Nullable String backupBlobContainerUri) {
            this.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }

        public Builder setGatewayDetails(@Nullable GatewayDetailsResponse gatewayDetails) {
            this.gatewayDetails = gatewayDetails;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpV4FirewallSettings(@Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings) {
            this.ipV4FirewallSettings = ipV4FirewallSettings;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedMode(@Nullable Integer managedMode) {
            this.managedMode = managedMode;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setQuerypoolConnectionMode(@Nullable String querypoolConnectionMode) {
            this.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }

        public Builder setServerFullName(String serverFullName) {
            this.serverFullName = Objects.requireNonNull(serverFullName);
            return this;
        }

        public Builder setServerMonitorMode(@Nullable Integer serverMonitorMode) {
            this.serverMonitorMode = serverMonitorMode;
            return this;
        }

        public Builder setSku(ResourceSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerDetailsResult build() {
            return new GetServerDetailsResult(asAdministrators, backupBlobContainerUri, gatewayDetails, id, ipV4FirewallSettings, location, managedMode, name, provisioningState, querypoolConnectionMode, serverFullName, serverMonitorMode, sku, state, tags, type);
        }
    }
}