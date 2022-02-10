// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RedisCommonPropertiesRedisConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedisCommonPropertiesRedisConfigurationArgs Empty = new RedisCommonPropertiesRedisConfigurationArgs();

    @InputImport(name="aofStorageConnectionString0")
    private final @Nullable Input<String> aofStorageConnectionString0;

    public Input<String> getAofStorageConnectionString0() {
        return this.aofStorageConnectionString0 == null ? Input.empty() : this.aofStorageConnectionString0;
    }

    @InputImport(name="aofStorageConnectionString1")
    private final @Nullable Input<String> aofStorageConnectionString1;

    public Input<String> getAofStorageConnectionString1() {
        return this.aofStorageConnectionString1 == null ? Input.empty() : this.aofStorageConnectionString1;
    }

    @InputImport(name="maxfragmentationmemoryReserved")
    private final @Nullable Input<String> maxfragmentationmemoryReserved;

    public Input<String> getMaxfragmentationmemoryReserved() {
        return this.maxfragmentationmemoryReserved == null ? Input.empty() : this.maxfragmentationmemoryReserved;
    }

    @InputImport(name="maxmemoryDelta")
    private final @Nullable Input<String> maxmemoryDelta;

    public Input<String> getMaxmemoryDelta() {
        return this.maxmemoryDelta == null ? Input.empty() : this.maxmemoryDelta;
    }

    @InputImport(name="maxmemoryPolicy")
    private final @Nullable Input<String> maxmemoryPolicy;

    public Input<String> getMaxmemoryPolicy() {
        return this.maxmemoryPolicy == null ? Input.empty() : this.maxmemoryPolicy;
    }

    @InputImport(name="maxmemoryReserved")
    private final @Nullable Input<String> maxmemoryReserved;

    public Input<String> getMaxmemoryReserved() {
        return this.maxmemoryReserved == null ? Input.empty() : this.maxmemoryReserved;
    }

    @InputImport(name="rdbBackupEnabled")
    private final @Nullable Input<String> rdbBackupEnabled;

    public Input<String> getRdbBackupEnabled() {
        return this.rdbBackupEnabled == null ? Input.empty() : this.rdbBackupEnabled;
    }

    @InputImport(name="rdbBackupFrequency")
    private final @Nullable Input<String> rdbBackupFrequency;

    public Input<String> getRdbBackupFrequency() {
        return this.rdbBackupFrequency == null ? Input.empty() : this.rdbBackupFrequency;
    }

    @InputImport(name="rdbBackupMaxSnapshotCount")
    private final @Nullable Input<String> rdbBackupMaxSnapshotCount;

    public Input<String> getRdbBackupMaxSnapshotCount() {
        return this.rdbBackupMaxSnapshotCount == null ? Input.empty() : this.rdbBackupMaxSnapshotCount;
    }

    @InputImport(name="rdbStorageConnectionString")
    private final @Nullable Input<String> rdbStorageConnectionString;

    public Input<String> getRdbStorageConnectionString() {
        return this.rdbStorageConnectionString == null ? Input.empty() : this.rdbStorageConnectionString;
    }

    public RedisCommonPropertiesRedisConfigurationArgs(
        @Nullable Input<String> aofStorageConnectionString0,
        @Nullable Input<String> aofStorageConnectionString1,
        @Nullable Input<String> maxfragmentationmemoryReserved,
        @Nullable Input<String> maxmemoryDelta,
        @Nullable Input<String> maxmemoryPolicy,
        @Nullable Input<String> maxmemoryReserved,
        @Nullable Input<String> rdbBackupEnabled,
        @Nullable Input<String> rdbBackupFrequency,
        @Nullable Input<String> rdbBackupMaxSnapshotCount,
        @Nullable Input<String> rdbStorageConnectionString) {
        this.aofStorageConnectionString0 = aofStorageConnectionString0;
        this.aofStorageConnectionString1 = aofStorageConnectionString1;
        this.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
        this.maxmemoryDelta = maxmemoryDelta;
        this.maxmemoryPolicy = maxmemoryPolicy;
        this.maxmemoryReserved = maxmemoryReserved;
        this.rdbBackupEnabled = rdbBackupEnabled;
        this.rdbBackupFrequency = rdbBackupFrequency;
        this.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
        this.rdbStorageConnectionString = rdbStorageConnectionString;
    }

    private RedisCommonPropertiesRedisConfigurationArgs() {
        this.aofStorageConnectionString0 = Input.empty();
        this.aofStorageConnectionString1 = Input.empty();
        this.maxfragmentationmemoryReserved = Input.empty();
        this.maxmemoryDelta = Input.empty();
        this.maxmemoryPolicy = Input.empty();
        this.maxmemoryReserved = Input.empty();
        this.rdbBackupEnabled = Input.empty();
        this.rdbBackupFrequency = Input.empty();
        this.rdbBackupMaxSnapshotCount = Input.empty();
        this.rdbStorageConnectionString = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisCommonPropertiesRedisConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aofStorageConnectionString0;
        private @Nullable Input<String> aofStorageConnectionString1;
        private @Nullable Input<String> maxfragmentationmemoryReserved;
        private @Nullable Input<String> maxmemoryDelta;
        private @Nullable Input<String> maxmemoryPolicy;
        private @Nullable Input<String> maxmemoryReserved;
        private @Nullable Input<String> rdbBackupEnabled;
        private @Nullable Input<String> rdbBackupFrequency;
        private @Nullable Input<String> rdbBackupMaxSnapshotCount;
        private @Nullable Input<String> rdbStorageConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisCommonPropertiesRedisConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aofStorageConnectionString0 = defaults.aofStorageConnectionString0;
    	      this.aofStorageConnectionString1 = defaults.aofStorageConnectionString1;
    	      this.maxfragmentationmemoryReserved = defaults.maxfragmentationmemoryReserved;
    	      this.maxmemoryDelta = defaults.maxmemoryDelta;
    	      this.maxmemoryPolicy = defaults.maxmemoryPolicy;
    	      this.maxmemoryReserved = defaults.maxmemoryReserved;
    	      this.rdbBackupEnabled = defaults.rdbBackupEnabled;
    	      this.rdbBackupFrequency = defaults.rdbBackupFrequency;
    	      this.rdbBackupMaxSnapshotCount = defaults.rdbBackupMaxSnapshotCount;
    	      this.rdbStorageConnectionString = defaults.rdbStorageConnectionString;
        }

        public Builder setAofStorageConnectionString0(@Nullable Input<String> aofStorageConnectionString0) {
            this.aofStorageConnectionString0 = aofStorageConnectionString0;
            return this;
        }

        public Builder setAofStorageConnectionString0(@Nullable String aofStorageConnectionString0) {
            this.aofStorageConnectionString0 = Input.ofNullable(aofStorageConnectionString0);
            return this;
        }

        public Builder setAofStorageConnectionString1(@Nullable Input<String> aofStorageConnectionString1) {
            this.aofStorageConnectionString1 = aofStorageConnectionString1;
            return this;
        }

        public Builder setAofStorageConnectionString1(@Nullable String aofStorageConnectionString1) {
            this.aofStorageConnectionString1 = Input.ofNullable(aofStorageConnectionString1);
            return this;
        }

        public Builder setMaxfragmentationmemoryReserved(@Nullable Input<String> maxfragmentationmemoryReserved) {
            this.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
            return this;
        }

        public Builder setMaxfragmentationmemoryReserved(@Nullable String maxfragmentationmemoryReserved) {
            this.maxfragmentationmemoryReserved = Input.ofNullable(maxfragmentationmemoryReserved);
            return this;
        }

        public Builder setMaxmemoryDelta(@Nullable Input<String> maxmemoryDelta) {
            this.maxmemoryDelta = maxmemoryDelta;
            return this;
        }

        public Builder setMaxmemoryDelta(@Nullable String maxmemoryDelta) {
            this.maxmemoryDelta = Input.ofNullable(maxmemoryDelta);
            return this;
        }

        public Builder setMaxmemoryPolicy(@Nullable Input<String> maxmemoryPolicy) {
            this.maxmemoryPolicy = maxmemoryPolicy;
            return this;
        }

        public Builder setMaxmemoryPolicy(@Nullable String maxmemoryPolicy) {
            this.maxmemoryPolicy = Input.ofNullable(maxmemoryPolicy);
            return this;
        }

        public Builder setMaxmemoryReserved(@Nullable Input<String> maxmemoryReserved) {
            this.maxmemoryReserved = maxmemoryReserved;
            return this;
        }

        public Builder setMaxmemoryReserved(@Nullable String maxmemoryReserved) {
            this.maxmemoryReserved = Input.ofNullable(maxmemoryReserved);
            return this;
        }

        public Builder setRdbBackupEnabled(@Nullable Input<String> rdbBackupEnabled) {
            this.rdbBackupEnabled = rdbBackupEnabled;
            return this;
        }

        public Builder setRdbBackupEnabled(@Nullable String rdbBackupEnabled) {
            this.rdbBackupEnabled = Input.ofNullable(rdbBackupEnabled);
            return this;
        }

        public Builder setRdbBackupFrequency(@Nullable Input<String> rdbBackupFrequency) {
            this.rdbBackupFrequency = rdbBackupFrequency;
            return this;
        }

        public Builder setRdbBackupFrequency(@Nullable String rdbBackupFrequency) {
            this.rdbBackupFrequency = Input.ofNullable(rdbBackupFrequency);
            return this;
        }

        public Builder setRdbBackupMaxSnapshotCount(@Nullable Input<String> rdbBackupMaxSnapshotCount) {
            this.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
            return this;
        }

        public Builder setRdbBackupMaxSnapshotCount(@Nullable String rdbBackupMaxSnapshotCount) {
            this.rdbBackupMaxSnapshotCount = Input.ofNullable(rdbBackupMaxSnapshotCount);
            return this;
        }

        public Builder setRdbStorageConnectionString(@Nullable Input<String> rdbStorageConnectionString) {
            this.rdbStorageConnectionString = rdbStorageConnectionString;
            return this;
        }

        public Builder setRdbStorageConnectionString(@Nullable String rdbStorageConnectionString) {
            this.rdbStorageConnectionString = Input.ofNullable(rdbStorageConnectionString);
            return this;
        }

        public RedisCommonPropertiesRedisConfigurationArgs build() {
            return new RedisCommonPropertiesRedisConfigurationArgs(aofStorageConnectionString0, aofStorageConnectionString1, maxfragmentationmemoryReserved, maxmemoryDelta, maxmemoryPolicy, maxmemoryReserved, rdbBackupEnabled, rdbBackupFrequency, rdbBackupMaxSnapshotCount, rdbStorageConnectionString);
        }
    }
}