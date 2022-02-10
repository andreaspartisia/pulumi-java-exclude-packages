// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules.outputs;

import io.pulumi.azurenative.hardwaresecuritymodules.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.hardwaresecuritymodules.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDedicatedHsmResult {
    private final String id;
    private final String location;
    private final String name;
    private final @Nullable NetworkProfileResponse networkProfile;
    private final String provisioningState;
    private final SkuResponse sku;
    private final @Nullable String stampId;
    private final String statusMessage;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"id","location","name","networkProfile","provisioningState","sku","stampId","statusMessage","tags","type","zones"})
    private GetDedicatedHsmResult(
        String id,
        String location,
        String name,
        @Nullable NetworkProfileResponse networkProfile,
        String provisioningState,
        SkuResponse sku,
        @Nullable String stampId,
        String statusMessage,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<String> zones) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.networkProfile = networkProfile;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = Objects.requireNonNull(sku);
        this.stampId = stampId;
        this.statusMessage = Objects.requireNonNull(statusMessage);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
    }

    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SkuResponse getSku() {
        return this.sku;
    }
    public Optional<String> getStampId() {
        return Optional.ofNullable(this.stampId);
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHsmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private String provisioningState;
        private SkuResponse sku;
        private @Nullable String stampId;
        private String statusMessage;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHsmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.stampId = defaults.stampId;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setNetworkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setStampId(@Nullable String stampId) {
            this.stampId = stampId;
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
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

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public GetDedicatedHsmResult build() {
            return new GetDedicatedHsmResult(id, location, name, networkProfile, provisioningState, sku, stampId, statusMessage, tags, type, zones);
        }
    }
}