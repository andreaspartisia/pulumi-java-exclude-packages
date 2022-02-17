// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.MulticastGroupLoRaWAN;
import io.pulumi.awsnative.iotwireless.outputs.MulticastGroupTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMulticastGroupResult {
    /**
     * Multicast group arn. Returned after successful create.
     * 
     */
    private final @Nullable String arn;
    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    private final @Nullable String associateWirelessDevice;
    /**
     * Multicast group description
     * 
     */
    private final @Nullable String description;
    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    private final @Nullable String disassociateWirelessDevice;
    /**
     * Multicast group id. Returned after successful create.
     * 
     */
    private final @Nullable String id;
    /**
     * Multicast group LoRaWAN
     * 
     */
    private final @Nullable MulticastGroupLoRaWAN loRaWAN;
    /**
     * Name of Multicast group
     * 
     */
    private final @Nullable String name;
    /**
     * Multicast group status. Returned after successful read.
     * 
     */
    private final @Nullable String status;
    /**
     * A list of key-value pairs that contain metadata for the Multicast group.
     * 
     */
    private final @Nullable List<MulticastGroupTag> tags;

    @OutputCustomType.Constructor({"arn","associateWirelessDevice","description","disassociateWirelessDevice","id","loRaWAN","name","status","tags"})
    private GetMulticastGroupResult(
        @Nullable String arn,
        @Nullable String associateWirelessDevice,
        @Nullable String description,
        @Nullable String disassociateWirelessDevice,
        @Nullable String id,
        @Nullable MulticastGroupLoRaWAN loRaWAN,
        @Nullable String name,
        @Nullable String status,
        @Nullable List<MulticastGroupTag> tags) {
        this.arn = arn;
        this.associateWirelessDevice = associateWirelessDevice;
        this.description = description;
        this.disassociateWirelessDevice = disassociateWirelessDevice;
        this.id = id;
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.status = status;
        this.tags = tags;
    }

    /**
     * Multicast group arn. Returned after successful create.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    public Optional<String> getAssociateWirelessDevice() {
        return Optional.ofNullable(this.associateWirelessDevice);
    }
    /**
     * Multicast group description
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    public Optional<String> getDisassociateWirelessDevice() {
        return Optional.ofNullable(this.disassociateWirelessDevice);
    }
    /**
     * Multicast group id. Returned after successful create.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Multicast group LoRaWAN
     * 
     */
    public Optional<MulticastGroupLoRaWAN> getLoRaWAN() {
        return Optional.ofNullable(this.loRaWAN);
    }
    /**
     * Name of Multicast group
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Multicast group status. Returned after successful read.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * A list of key-value pairs that contain metadata for the Multicast group.
     * 
     */
    public List<MulticastGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMulticastGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String associateWirelessDevice;
        private @Nullable String description;
        private @Nullable String disassociateWirelessDevice;
        private @Nullable String id;
        private @Nullable MulticastGroupLoRaWAN loRaWAN;
        private @Nullable String name;
        private @Nullable String status;
        private @Nullable List<MulticastGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMulticastGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associateWirelessDevice = defaults.associateWirelessDevice;
    	      this.description = defaults.description;
    	      this.disassociateWirelessDevice = defaults.disassociateWirelessDevice;
    	      this.id = defaults.id;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAssociateWirelessDevice(@Nullable String associateWirelessDevice) {
            this.associateWirelessDevice = associateWirelessDevice;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisassociateWirelessDevice(@Nullable String disassociateWirelessDevice) {
            this.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLoRaWAN(@Nullable MulticastGroupLoRaWAN loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable List<MulticastGroupTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetMulticastGroupResult build() {
            return new GetMulticastGroupResult(arn, associateWirelessDevice, description, disassociateWirelessDevice, id, loRaWAN, name, status, tags);
        }
    }
}