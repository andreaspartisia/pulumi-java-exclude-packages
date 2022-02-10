// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ProtocolCustomSettingsFormatResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDdosCustomPolicyResult {
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String location;
    private final String name;
    private final @Nullable List<ProtocolCustomSettingsFormatResponse> protocolCustomSettings;
    private final String provisioningState;
    private final List<SubResourceResponse> publicIPAddresses;
    private final String resourceGuid;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","location","name","protocolCustomSettings","provisioningState","publicIPAddresses","resourceGuid","tags","type"})
    private GetDdosCustomPolicyResult(
        String etag,
        @Nullable String id,
        @Nullable String location,
        String name,
        @Nullable List<ProtocolCustomSettingsFormatResponse> protocolCustomSettings,
        String provisioningState,
        List<SubResourceResponse> publicIPAddresses,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.protocolCustomSettings = protocolCustomSettings;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public List<ProtocolCustomSettingsFormatResponse> getProtocolCustomSettings() {
        return this.protocolCustomSettings == null ? List.of() : this.protocolCustomSettings;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<SubResourceResponse> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    public String getResourceGuid() {
        return this.resourceGuid;
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

    public static Builder builder(GetDdosCustomPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private @Nullable List<ProtocolCustomSettingsFormatResponse> protocolCustomSettings;
        private String provisioningState;
        private List<SubResourceResponse> publicIPAddresses;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDdosCustomPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.protocolCustomSettings = defaults.protocolCustomSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddresses = defaults.publicIPAddresses;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtocolCustomSettings(@Nullable List<ProtocolCustomSettingsFormatResponse> protocolCustomSettings) {
            this.protocolCustomSettings = protocolCustomSettings;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddresses(List<SubResourceResponse> publicIPAddresses) {
            this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
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

        public GetDdosCustomPolicyResult build() {
            return new GetDdosCustomPolicyResult(etag, id, location, name, protocolCustomSettings, provisioningState, publicIPAddresses, resourceGuid, tags, type);
        }
    }
}