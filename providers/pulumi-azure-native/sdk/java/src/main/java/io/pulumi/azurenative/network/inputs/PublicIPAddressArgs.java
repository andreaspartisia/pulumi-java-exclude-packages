// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.IPAllocationMethod;
import io.pulumi.azurenative.network.enums.IPVersion;
import io.pulumi.azurenative.network.enums.PublicIPAddressMigrationPhase;
import io.pulumi.azurenative.network.inputs.DdosSettingsArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.IpTagArgs;
import io.pulumi.azurenative.network.inputs.NatGatewayArgs;
import io.pulumi.azurenative.network.inputs.PublicIPAddressDnsSettingsArgs;
import io.pulumi.azurenative.network.inputs.PublicIPAddressSkuArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicIPAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressArgs Empty = new PublicIPAddressArgs();

    @InputImport(name="ddosSettings")
    private final @Nullable Input<DdosSettingsArgs> ddosSettings;

    public Input<DdosSettingsArgs> getDdosSettings() {
        return this.ddosSettings == null ? Input.empty() : this.ddosSettings;
    }

    @InputImport(name="dnsSettings")
    private final @Nullable Input<PublicIPAddressDnsSettingsArgs> dnsSettings;

    public Input<PublicIPAddressDnsSettingsArgs> getDnsSettings() {
        return this.dnsSettings == null ? Input.empty() : this.dnsSettings;
    }

    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="idleTimeoutInMinutes")
    private final @Nullable Input<Integer> idleTimeoutInMinutes;

    public Input<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Input.empty() : this.idleTimeoutInMinutes;
    }

    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    @InputImport(name="ipTags")
    private final @Nullable Input<List<IpTagArgs>> ipTags;

    public Input<List<IpTagArgs>> getIpTags() {
        return this.ipTags == null ? Input.empty() : this.ipTags;
    }

    @InputImport(name="linkedPublicIPAddress")
    private final @Nullable Input<PublicIPAddressArgs> linkedPublicIPAddress;

    public Input<PublicIPAddressArgs> getLinkedPublicIPAddress() {
        return this.linkedPublicIPAddress == null ? Input.empty() : this.linkedPublicIPAddress;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="migrationPhase")
    private final @Nullable Input<Either<String,PublicIPAddressMigrationPhase>> migrationPhase;

    public Input<Either<String,PublicIPAddressMigrationPhase>> getMigrationPhase() {
        return this.migrationPhase == null ? Input.empty() : this.migrationPhase;
    }

    @InputImport(name="natGateway")
    private final @Nullable Input<NatGatewayArgs> natGateway;

    public Input<NatGatewayArgs> getNatGateway() {
        return this.natGateway == null ? Input.empty() : this.natGateway;
    }

    @InputImport(name="publicIPAddressVersion")
    private final @Nullable Input<Either<String,IPVersion>> publicIPAddressVersion;

    public Input<Either<String,IPVersion>> getPublicIPAddressVersion() {
        return this.publicIPAddressVersion == null ? Input.empty() : this.publicIPAddressVersion;
    }

    @InputImport(name="publicIPAllocationMethod")
    private final @Nullable Input<Either<String,IPAllocationMethod>> publicIPAllocationMethod;

    public Input<Either<String,IPAllocationMethod>> getPublicIPAllocationMethod() {
        return this.publicIPAllocationMethod == null ? Input.empty() : this.publicIPAllocationMethod;
    }

    @InputImport(name="publicIPPrefix")
    private final @Nullable Input<SubResourceArgs> publicIPPrefix;

    public Input<SubResourceArgs> getPublicIPPrefix() {
        return this.publicIPPrefix == null ? Input.empty() : this.publicIPPrefix;
    }

    @InputImport(name="servicePublicIPAddress")
    private final @Nullable Input<PublicIPAddressArgs> servicePublicIPAddress;

    public Input<PublicIPAddressArgs> getServicePublicIPAddress() {
        return this.servicePublicIPAddress == null ? Input.empty() : this.servicePublicIPAddress;
    }

    @InputImport(name="sku")
    private final @Nullable Input<PublicIPAddressSkuArgs> sku;

    public Input<PublicIPAddressSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="zones")
    private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public PublicIPAddressArgs(
        @Nullable Input<DdosSettingsArgs> ddosSettings,
        @Nullable Input<PublicIPAddressDnsSettingsArgs> dnsSettings,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> id,
        @Nullable Input<Integer> idleTimeoutInMinutes,
        @Nullable Input<String> ipAddress,
        @Nullable Input<List<IpTagArgs>> ipTags,
        @Nullable Input<PublicIPAddressArgs> linkedPublicIPAddress,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,PublicIPAddressMigrationPhase>> migrationPhase,
        @Nullable Input<NatGatewayArgs> natGateway,
        @Nullable Input<Either<String,IPVersion>> publicIPAddressVersion,
        @Nullable Input<Either<String,IPAllocationMethod>> publicIPAllocationMethod,
        @Nullable Input<SubResourceArgs> publicIPPrefix,
        @Nullable Input<PublicIPAddressArgs> servicePublicIPAddress,
        @Nullable Input<PublicIPAddressSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> zones) {
        this.ddosSettings = ddosSettings;
        this.dnsSettings = dnsSettings;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipAddress = ipAddress;
        this.ipTags = ipTags;
        this.linkedPublicIPAddress = linkedPublicIPAddress;
        this.location = location;
        this.migrationPhase = migrationPhase;
        this.natGateway = natGateway;
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        this.publicIPPrefix = publicIPPrefix;
        this.servicePublicIPAddress = servicePublicIPAddress;
        this.sku = sku;
        this.tags = tags;
        this.zones = zones;
    }

    private PublicIPAddressArgs() {
        this.ddosSettings = Input.empty();
        this.dnsSettings = Input.empty();
        this.extendedLocation = Input.empty();
        this.id = Input.empty();
        this.idleTimeoutInMinutes = Input.empty();
        this.ipAddress = Input.empty();
        this.ipTags = Input.empty();
        this.linkedPublicIPAddress = Input.empty();
        this.location = Input.empty();
        this.migrationPhase = Input.empty();
        this.natGateway = Input.empty();
        this.publicIPAddressVersion = Input.empty();
        this.publicIPAllocationMethod = Input.empty();
        this.publicIPPrefix = Input.empty();
        this.servicePublicIPAddress = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DdosSettingsArgs> ddosSettings;
        private @Nullable Input<PublicIPAddressDnsSettingsArgs> dnsSettings;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> idleTimeoutInMinutes;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<List<IpTagArgs>> ipTags;
        private @Nullable Input<PublicIPAddressArgs> linkedPublicIPAddress;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,PublicIPAddressMigrationPhase>> migrationPhase;
        private @Nullable Input<NatGatewayArgs> natGateway;
        private @Nullable Input<Either<String,IPVersion>> publicIPAddressVersion;
        private @Nullable Input<Either<String,IPAllocationMethod>> publicIPAllocationMethod;
        private @Nullable Input<SubResourceArgs> publicIPPrefix;
        private @Nullable Input<PublicIPAddressArgs> servicePublicIPAddress;
        private @Nullable Input<PublicIPAddressSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosSettings = defaults.ddosSettings;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipTags = defaults.ipTags;
    	      this.linkedPublicIPAddress = defaults.linkedPublicIPAddress;
    	      this.location = defaults.location;
    	      this.migrationPhase = defaults.migrationPhase;
    	      this.natGateway = defaults.natGateway;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPAllocationMethod = defaults.publicIPAllocationMethod;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.servicePublicIPAddress = defaults.servicePublicIPAddress;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder setDdosSettings(@Nullable Input<DdosSettingsArgs> ddosSettings) {
            this.ddosSettings = ddosSettings;
            return this;
        }

        public Builder setDdosSettings(@Nullable DdosSettingsArgs ddosSettings) {
            this.ddosSettings = Input.ofNullable(ddosSettings);
            return this;
        }

        public Builder setDnsSettings(@Nullable Input<PublicIPAddressDnsSettingsArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setDnsSettings(@Nullable PublicIPAddressDnsSettingsArgs dnsSettings) {
            this.dnsSettings = Input.ofNullable(dnsSettings);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Input<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Input.ofNullable(idleTimeoutInMinutes);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setIpTags(@Nullable Input<List<IpTagArgs>> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder setIpTags(@Nullable List<IpTagArgs> ipTags) {
            this.ipTags = Input.ofNullable(ipTags);
            return this;
        }

        public Builder setLinkedPublicIPAddress(@Nullable Input<PublicIPAddressArgs> linkedPublicIPAddress) {
            this.linkedPublicIPAddress = linkedPublicIPAddress;
            return this;
        }

        public Builder setLinkedPublicIPAddress(@Nullable PublicIPAddressArgs linkedPublicIPAddress) {
            this.linkedPublicIPAddress = Input.ofNullable(linkedPublicIPAddress);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMigrationPhase(@Nullable Input<Either<String,PublicIPAddressMigrationPhase>> migrationPhase) {
            this.migrationPhase = migrationPhase;
            return this;
        }

        public Builder setMigrationPhase(@Nullable Either<String,PublicIPAddressMigrationPhase> migrationPhase) {
            this.migrationPhase = Input.ofNullable(migrationPhase);
            return this;
        }

        public Builder setNatGateway(@Nullable Input<NatGatewayArgs> natGateway) {
            this.natGateway = natGateway;
            return this;
        }

        public Builder setNatGateway(@Nullable NatGatewayArgs natGateway) {
            this.natGateway = Input.ofNullable(natGateway);
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable Input<Either<String,IPVersion>> publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable Either<String,IPVersion> publicIPAddressVersion) {
            this.publicIPAddressVersion = Input.ofNullable(publicIPAddressVersion);
            return this;
        }

        public Builder setPublicIPAllocationMethod(@Nullable Input<Either<String,IPAllocationMethod>> publicIPAllocationMethod) {
            this.publicIPAllocationMethod = publicIPAllocationMethod;
            return this;
        }

        public Builder setPublicIPAllocationMethod(@Nullable Either<String,IPAllocationMethod> publicIPAllocationMethod) {
            this.publicIPAllocationMethod = Input.ofNullable(publicIPAllocationMethod);
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable Input<SubResourceArgs> publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceArgs publicIPPrefix) {
            this.publicIPPrefix = Input.ofNullable(publicIPPrefix);
            return this;
        }

        public Builder setServicePublicIPAddress(@Nullable Input<PublicIPAddressArgs> servicePublicIPAddress) {
            this.servicePublicIPAddress = servicePublicIPAddress;
            return this;
        }

        public Builder setServicePublicIPAddress(@Nullable PublicIPAddressArgs servicePublicIPAddress) {
            this.servicePublicIPAddress = Input.ofNullable(servicePublicIPAddress);
            return this;
        }

        public Builder setSku(@Nullable Input<PublicIPAddressSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable PublicIPAddressSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }

        public PublicIPAddressArgs build() {
            return new PublicIPAddressArgs(ddosSettings, dnsSettings, extendedLocation, id, idleTimeoutInMinutes, ipAddress, ipTags, linkedPublicIPAddress, location, migrationPhase, natGateway, publicIPAddressVersion, publicIPAllocationMethod, publicIPPrefix, servicePublicIPAddress, sku, tags, zones);
        }
    }
}