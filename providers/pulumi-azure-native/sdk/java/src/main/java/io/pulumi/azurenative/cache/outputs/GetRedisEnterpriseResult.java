// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.azurenative.cache.outputs.EnterpriseSkuResponse;
import io.pulumi.azurenative.cache.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRedisEnterpriseResult {
    private final String hostName;
    private final String id;
    private final String location;
    private final @Nullable String minimumTlsVersion;
    private final String name;
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    private final String provisioningState;
    private final String redisVersion;
    private final String resourceState;
    private final EnterpriseSkuResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"hostName","id","location","minimumTlsVersion","name","privateEndpointConnections","provisioningState","redisVersion","resourceState","sku","tags","type","zones"})
    private GetRedisEnterpriseResult(
        String hostName,
        String id,
        String location,
        @Nullable String minimumTlsVersion,
        String name,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        String redisVersion,
        String resourceState,
        EnterpriseSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<String> zones) {
        this.hostName = Objects.requireNonNull(hostName);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = Objects.requireNonNull(name);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.redisVersion = Objects.requireNonNull(redisVersion);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.sku = Objects.requireNonNull(sku);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
    }

    public String getHostName() {
        return this.hostName;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<String> getMinimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    public String getName() {
        return this.name;
    }
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getRedisVersion() {
        return this.redisVersion;
    }
    public String getResourceState() {
        return this.resourceState;
    }
    public EnterpriseSkuResponse getSku() {
        return this.sku;
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

    public static Builder builder(GetRedisEnterpriseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private String id;
        private String location;
        private @Nullable String minimumTlsVersion;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private String redisVersion;
        private String resourceState;
        private EnterpriseSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRedisEnterpriseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redisVersion = defaults.redisVersion;
    	      this.resourceState = defaults.resourceState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedisVersion(String redisVersion) {
            this.redisVersion = Objects.requireNonNull(redisVersion);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setSku(EnterpriseSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
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

        public GetRedisEnterpriseResult build() {
            return new GetRedisEnterpriseResult(hostName, id, location, minimumTlsVersion, name, privateEndpointConnections, provisioningState, redisVersion, resourceState, sku, tags, type, zones);
        }
    }
}