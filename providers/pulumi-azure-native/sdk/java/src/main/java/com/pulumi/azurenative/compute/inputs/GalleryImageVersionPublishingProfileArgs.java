// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.StorageAccountType;
import com.pulumi.azurenative.compute.inputs.TargetRegionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The publishing profile of a gallery image Version.
 * 
 */
public final class GalleryImageVersionPublishingProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final GalleryImageVersionPublishingProfileArgs Empty = new GalleryImageVersionPublishingProfileArgs();

    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @Import(name="endOfLifeDate")
    private @Nullable Output<String> endOfLifeDate;

    public Optional<Output<String>> endOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }

    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won&#39;t use this Image Version.
     * 
     */
    @Import(name="excludeFromLatest")
    private @Nullable Output<Boolean> excludeFromLatest;

    public Optional<Output<Boolean>> excludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }

    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     */
    @Import(name="replicaCount")
    private @Nullable Output<Integer> replicaCount;

    public Optional<Output<Integer>> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<Either<String,StorageAccountType>> storageAccountType;

    public Optional<Output<Either<String,StorageAccountType>>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
     */
    @Import(name="targetRegions")
    private @Nullable Output<List<TargetRegionArgs>> targetRegions;

    public Optional<Output<List<TargetRegionArgs>>> targetRegions() {
        return Optional.ofNullable(this.targetRegions);
    }

    private GalleryImageVersionPublishingProfileArgs() {}

    private GalleryImageVersionPublishingProfileArgs(GalleryImageVersionPublishingProfileArgs $) {
        this.endOfLifeDate = $.endOfLifeDate;
        this.excludeFromLatest = $.excludeFromLatest;
        this.replicaCount = $.replicaCount;
        this.storageAccountType = $.storageAccountType;
        this.targetRegions = $.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryImageVersionPublishingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryImageVersionPublishingProfileArgs $;

        public Builder() {
            $ = new GalleryImageVersionPublishingProfileArgs();
        }

        public Builder(GalleryImageVersionPublishingProfileArgs defaults) {
            $ = new GalleryImageVersionPublishingProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder endOfLifeDate(@Nullable Output<String> endOfLifeDate) {
            $.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder endOfLifeDate(String endOfLifeDate) {
            return endOfLifeDate(Output.of(endOfLifeDate));
        }

        public Builder excludeFromLatest(@Nullable Output<Boolean> excludeFromLatest) {
            $.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder excludeFromLatest(Boolean excludeFromLatest) {
            return excludeFromLatest(Output.of(excludeFromLatest));
        }

        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            $.replicaCount = replicaCount;
            return this;
        }

        public Builder replicaCount(Integer replicaCount) {
            return replicaCount(Output.of(replicaCount));
        }

        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountType>> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public Builder storageAccountType(Either<String,StorageAccountType> storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Either.ofLeft(storageAccountType));
        }

        public Builder storageAccountType(StorageAccountType storageAccountType) {
            return storageAccountType(Either.ofRight(storageAccountType));
        }

        public Builder targetRegions(@Nullable Output<List<TargetRegionArgs>> targetRegions) {
            $.targetRegions = targetRegions;
            return this;
        }

        public Builder targetRegions(List<TargetRegionArgs> targetRegions) {
            return targetRegions(Output.of(targetRegions));
        }

        public Builder targetRegions(TargetRegionArgs... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }

        public GalleryImageVersionPublishingProfileArgs build() {
            return $;
        }
    }

}
