// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegistryDataAssetRegistryMetadata {
    /**
     * @return The owning object&#39;s key for this object.
     * 
     */
    private final String aggregatorKey;
    /**
     * @return The id of the user who created the object.
     * 
     */
    private final String createdByUserId;
    /**
     * @return The name of the user who created the object.
     * 
     */
    private final String createdByUserName;
    /**
     * @return Specifies whether this object is a favorite or not.
     * 
     */
    private final Boolean isFavorite;
    /**
     * @return The identifying key for the object.
     * 
     */
    private final String key;
    /**
     * @return Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    private final List<String> labels;
    /**
     * @return The registry version.
     * 
     */
    private final Integer registryVersion;
    /**
     * @return The date and time that the object was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time that the object was updated.
     * 
     */
    private final String timeUpdated;
    /**
     * @return The id of the user who updated the object.
     * 
     */
    private final String updatedByUserId;
    /**
     * @return The name of the user who updated the object.
     * 
     */
    private final String updatedByUserName;

    @CustomType.Constructor
    private GetRegistryDataAssetRegistryMetadata(
        @CustomType.Parameter("aggregatorKey") String aggregatorKey,
        @CustomType.Parameter("createdByUserId") String createdByUserId,
        @CustomType.Parameter("createdByUserName") String createdByUserName,
        @CustomType.Parameter("isFavorite") Boolean isFavorite,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("labels") List<String> labels,
        @CustomType.Parameter("registryVersion") Integer registryVersion,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("updatedByUserId") String updatedByUserId,
        @CustomType.Parameter("updatedByUserName") String updatedByUserName) {
        this.aggregatorKey = aggregatorKey;
        this.createdByUserId = createdByUserId;
        this.createdByUserName = createdByUserName;
        this.isFavorite = isFavorite;
        this.key = key;
        this.labels = labels;
        this.registryVersion = registryVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.updatedByUserId = updatedByUserId;
        this.updatedByUserName = updatedByUserName;
    }

    /**
     * @return The owning object&#39;s key for this object.
     * 
     */
    public String aggregatorKey() {
        return this.aggregatorKey;
    }
    /**
     * @return The id of the user who created the object.
     * 
     */
    public String createdByUserId() {
        return this.createdByUserId;
    }
    /**
     * @return The name of the user who created the object.
     * 
     */
    public String createdByUserName() {
        return this.createdByUserName;
    }
    /**
     * @return Specifies whether this object is a favorite or not.
     * 
     */
    public Boolean isFavorite() {
        return this.isFavorite;
    }
    /**
     * @return The identifying key for the object.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    public List<String> labels() {
        return this.labels;
    }
    /**
     * @return The registry version.
     * 
     */
    public Integer registryVersion() {
        return this.registryVersion;
    }
    /**
     * @return The date and time that the object was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time that the object was updated.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return The id of the user who updated the object.
     * 
     */
    public String updatedByUserId() {
        return this.updatedByUserId;
    }
    /**
     * @return The name of the user who updated the object.
     * 
     */
    public String updatedByUserName() {
        return this.updatedByUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryDataAssetRegistryMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregatorKey;
        private String createdByUserId;
        private String createdByUserName;
        private Boolean isFavorite;
        private String key;
        private List<String> labels;
        private Integer registryVersion;
        private String timeCreated;
        private String timeUpdated;
        private String updatedByUserId;
        private String updatedByUserName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryDataAssetRegistryMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregatorKey = defaults.aggregatorKey;
    	      this.createdByUserId = defaults.createdByUserId;
    	      this.createdByUserName = defaults.createdByUserName;
    	      this.isFavorite = defaults.isFavorite;
    	      this.key = defaults.key;
    	      this.labels = defaults.labels;
    	      this.registryVersion = defaults.registryVersion;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.updatedByUserId = defaults.updatedByUserId;
    	      this.updatedByUserName = defaults.updatedByUserName;
        }

        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = Objects.requireNonNull(aggregatorKey);
            return this;
        }
        public Builder createdByUserId(String createdByUserId) {
            this.createdByUserId = Objects.requireNonNull(createdByUserId);
            return this;
        }
        public Builder createdByUserName(String createdByUserName) {
            this.createdByUserName = Objects.requireNonNull(createdByUserName);
            return this;
        }
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = Objects.requireNonNull(isFavorite);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder labels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder registryVersion(Integer registryVersion) {
            this.registryVersion = Objects.requireNonNull(registryVersion);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder updatedByUserId(String updatedByUserId) {
            this.updatedByUserId = Objects.requireNonNull(updatedByUserId);
            return this;
        }
        public Builder updatedByUserName(String updatedByUserName) {
            this.updatedByUserName = Objects.requireNonNull(updatedByUserName);
            return this;
        }        public GetRegistryDataAssetRegistryMetadata build() {
            return new GetRegistryDataAssetRegistryMetadata(aggregatorKey, createdByUserId, createdByUserName, isFavorite, key, labels, registryVersion, timeCreated, timeUpdated, updatedByUserId, updatedByUserName);
        }
    }
}
