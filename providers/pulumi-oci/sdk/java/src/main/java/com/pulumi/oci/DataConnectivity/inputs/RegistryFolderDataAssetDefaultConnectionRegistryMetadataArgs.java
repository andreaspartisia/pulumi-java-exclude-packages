// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs Empty = new RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs();

    /**
     * (Updatable) The owning object&#39;s key for this object.
     * 
     */
    @Import(name="aggregatorKey")
    private @Nullable Output<String> aggregatorKey;

    /**
     * @return (Updatable) The owning object&#39;s key for this object.
     * 
     */
    public Optional<Output<String>> aggregatorKey() {
        return Optional.ofNullable(this.aggregatorKey);
    }

    /**
     * (Updatable) The id of the user who created the object.
     * 
     */
    @Import(name="createdByUserId")
    private @Nullable Output<String> createdByUserId;

    /**
     * @return (Updatable) The id of the user who created the object.
     * 
     */
    public Optional<Output<String>> createdByUserId() {
        return Optional.ofNullable(this.createdByUserId);
    }

    /**
     * (Updatable) The name of the user who created the object.
     * 
     */
    @Import(name="createdByUserName")
    private @Nullable Output<String> createdByUserName;

    /**
     * @return (Updatable) The name of the user who created the object.
     * 
     */
    public Optional<Output<String>> createdByUserName() {
        return Optional.ofNullable(this.createdByUserName);
    }

    /**
     * (Updatable) Specifies whether this object is a favorite or not.
     * 
     */
    @Import(name="isFavorite")
    private @Nullable Output<Boolean> isFavorite;

    /**
     * @return (Updatable) Specifies whether this object is a favorite or not.
     * 
     */
    public Optional<Output<Boolean>> isFavorite() {
        return Optional.ofNullable(this.isFavorite);
    }

    /**
     * (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * (Updatable) The registry version.
     * 
     */
    @Import(name="registryVersion")
    private @Nullable Output<Integer> registryVersion;

    /**
     * @return (Updatable) The registry version.
     * 
     */
    public Optional<Output<Integer>> registryVersion() {
        return Optional.ofNullable(this.registryVersion);
    }

    /**
     * (Updatable) The date and time that the object was created.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return (Updatable) The date and time that the object was created.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * (Updatable) The date and time that the object was updated.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return (Updatable) The date and time that the object was updated.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    /**
     * (Updatable) The id of the user who updated the object.
     * 
     */
    @Import(name="updatedByUserId")
    private @Nullable Output<String> updatedByUserId;

    /**
     * @return (Updatable) The id of the user who updated the object.
     * 
     */
    public Optional<Output<String>> updatedByUserId() {
        return Optional.ofNullable(this.updatedByUserId);
    }

    /**
     * (Updatable) The name of the user who updated the object.
     * 
     */
    @Import(name="updatedByUserName")
    private @Nullable Output<String> updatedByUserName;

    /**
     * @return (Updatable) The name of the user who updated the object.
     * 
     */
    public Optional<Output<String>> updatedByUserName() {
        return Optional.ofNullable(this.updatedByUserName);
    }

    private RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs() {}

    private RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs(RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs $) {
        this.aggregatorKey = $.aggregatorKey;
        this.createdByUserId = $.createdByUserId;
        this.createdByUserName = $.createdByUserName;
        this.isFavorite = $.isFavorite;
        this.key = $.key;
        this.labels = $.labels;
        this.registryVersion = $.registryVersion;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
        this.updatedByUserId = $.updatedByUserId;
        this.updatedByUserName = $.updatedByUserName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs $;

        public Builder() {
            $ = new RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs();
        }

        public Builder(RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs defaults) {
            $ = new RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregatorKey (Updatable) The owning object&#39;s key for this object.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorKey(@Nullable Output<String> aggregatorKey) {
            $.aggregatorKey = aggregatorKey;
            return this;
        }

        /**
         * @param aggregatorKey (Updatable) The owning object&#39;s key for this object.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorKey(String aggregatorKey) {
            return aggregatorKey(Output.of(aggregatorKey));
        }

        /**
         * @param createdByUserId (Updatable) The id of the user who created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdByUserId(@Nullable Output<String> createdByUserId) {
            $.createdByUserId = createdByUserId;
            return this;
        }

        /**
         * @param createdByUserId (Updatable) The id of the user who created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdByUserId(String createdByUserId) {
            return createdByUserId(Output.of(createdByUserId));
        }

        /**
         * @param createdByUserName (Updatable) The name of the user who created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdByUserName(@Nullable Output<String> createdByUserName) {
            $.createdByUserName = createdByUserName;
            return this;
        }

        /**
         * @param createdByUserName (Updatable) The name of the user who created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdByUserName(String createdByUserName) {
            return createdByUserName(Output.of(createdByUserName));
        }

        /**
         * @param isFavorite (Updatable) Specifies whether this object is a favorite or not.
         * 
         * @return builder
         * 
         */
        public Builder isFavorite(@Nullable Output<Boolean> isFavorite) {
            $.isFavorite = isFavorite;
            return this;
        }

        /**
         * @param isFavorite (Updatable) Specifies whether this object is a favorite or not.
         * 
         * @return builder
         * 
         */
        public Builder isFavorite(Boolean isFavorite) {
            return isFavorite(Output.of(isFavorite));
        }

        /**
         * @param key (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param labels (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param registryVersion (Updatable) The registry version.
         * 
         * @return builder
         * 
         */
        public Builder registryVersion(@Nullable Output<Integer> registryVersion) {
            $.registryVersion = registryVersion;
            return this;
        }

        /**
         * @param registryVersion (Updatable) The registry version.
         * 
         * @return builder
         * 
         */
        public Builder registryVersion(Integer registryVersion) {
            return registryVersion(Output.of(registryVersion));
        }

        /**
         * @param timeCreated (Updatable) The date and time that the object was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated (Updatable) The date and time that the object was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated (Updatable) The date and time that the object was updated.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated (Updatable) The date and time that the object was updated.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        /**
         * @param updatedByUserId (Updatable) The id of the user who updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedByUserId(@Nullable Output<String> updatedByUserId) {
            $.updatedByUserId = updatedByUserId;
            return this;
        }

        /**
         * @param updatedByUserId (Updatable) The id of the user who updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedByUserId(String updatedByUserId) {
            return updatedByUserId(Output.of(updatedByUserId));
        }

        /**
         * @param updatedByUserName (Updatable) The name of the user who updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedByUserName(@Nullable Output<String> updatedByUserName) {
            $.updatedByUserName = updatedByUserName;
            return this;
        }

        /**
         * @param updatedByUserName (Updatable) The name of the user who updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedByUserName(String updatedByUserName) {
            return updatedByUserName(Output.of(updatedByUserName));
        }

        public RegistryFolderDataAssetDefaultConnectionRegistryMetadataArgs build() {
            return $;
        }
    }

}
