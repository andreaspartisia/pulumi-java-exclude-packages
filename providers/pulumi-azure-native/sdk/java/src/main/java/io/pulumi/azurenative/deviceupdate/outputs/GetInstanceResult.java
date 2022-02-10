// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.DiagnosticStoragePropertiesResponse;
import io.pulumi.azurenative.deviceupdate.outputs.IotHubSettingsResponse;
import io.pulumi.azurenative.deviceupdate.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceResult {
    private final String accountName;
    private final @Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties;
    private final @Nullable Boolean enableDiagnostics;
    private final String id;
    private final @Nullable List<IotHubSettingsResponse> iotHubs;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"accountName","diagnosticStorageProperties","enableDiagnostics","id","iotHubs","location","name","provisioningState","systemData","tags","type"})
    private GetInstanceResult(
        String accountName,
        @Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties,
        @Nullable Boolean enableDiagnostics,
        String id,
        @Nullable List<IotHubSettingsResponse> iotHubs,
        String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.accountName = Objects.requireNonNull(accountName);
        this.diagnosticStorageProperties = diagnosticStorageProperties;
        this.enableDiagnostics = enableDiagnostics;
        this.id = Objects.requireNonNull(id);
        this.iotHubs = iotHubs;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getAccountName() {
        return this.accountName;
    }
    public Optional<DiagnosticStoragePropertiesResponse> getDiagnosticStorageProperties() {
        return Optional.ofNullable(this.diagnosticStorageProperties);
    }
    public Optional<Boolean> getEnableDiagnostics() {
        return Optional.ofNullable(this.enableDiagnostics);
    }
    public String getId() {
        return this.id;
    }
    public List<IotHubSettingsResponse> getIotHubs() {
        return this.iotHubs == null ? List.of() : this.iotHubs;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
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

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties;
        private @Nullable Boolean enableDiagnostics;
        private String id;
        private @Nullable List<IotHubSettingsResponse> iotHubs;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.diagnosticStorageProperties = defaults.diagnosticStorageProperties;
    	      this.enableDiagnostics = defaults.enableDiagnostics;
    	      this.id = defaults.id;
    	      this.iotHubs = defaults.iotHubs;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setDiagnosticStorageProperties(@Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties) {
            this.diagnosticStorageProperties = diagnosticStorageProperties;
            return this;
        }

        public Builder setEnableDiagnostics(@Nullable Boolean enableDiagnostics) {
            this.enableDiagnostics = enableDiagnostics;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIotHubs(@Nullable List<IotHubSettingsResponse> iotHubs) {
            this.iotHubs = iotHubs;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public GetInstanceResult build() {
            return new GetInstanceResult(accountName, diagnosticStorageProperties, enableDiagnostics, id, iotHubs, location, name, provisioningState, systemData, tags, type);
        }
    }
}