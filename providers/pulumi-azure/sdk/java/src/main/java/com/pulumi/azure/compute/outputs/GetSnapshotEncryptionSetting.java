// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetSnapshotEncryptionSettingDiskEncryptionKey;
import com.pulumi.azure.compute.outputs.GetSnapshotEncryptionSettingKeyEncryptionKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSnapshotEncryptionSetting {
    private final List<GetSnapshotEncryptionSettingDiskEncryptionKey> diskEncryptionKeys;
    private final Boolean enabled;
    private final List<GetSnapshotEncryptionSettingKeyEncryptionKey> keyEncryptionKeys;

    @CustomType.Constructor
    private GetSnapshotEncryptionSetting(
        @CustomType.Parameter("diskEncryptionKeys") List<GetSnapshotEncryptionSettingDiskEncryptionKey> diskEncryptionKeys,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("keyEncryptionKeys") List<GetSnapshotEncryptionSettingKeyEncryptionKey> keyEncryptionKeys) {
        this.diskEncryptionKeys = diskEncryptionKeys;
        this.enabled = enabled;
        this.keyEncryptionKeys = keyEncryptionKeys;
    }

    public List<GetSnapshotEncryptionSettingDiskEncryptionKey> diskEncryptionKeys() {
        return this.diskEncryptionKeys;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public List<GetSnapshotEncryptionSettingKeyEncryptionKey> keyEncryptionKeys() {
        return this.keyEncryptionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotEncryptionSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSnapshotEncryptionSettingDiskEncryptionKey> diskEncryptionKeys;
        private Boolean enabled;
        private List<GetSnapshotEncryptionSettingKeyEncryptionKey> keyEncryptionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotEncryptionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKeys = defaults.diskEncryptionKeys;
    	      this.enabled = defaults.enabled;
    	      this.keyEncryptionKeys = defaults.keyEncryptionKeys;
        }

        public Builder diskEncryptionKeys(List<GetSnapshotEncryptionSettingDiskEncryptionKey> diskEncryptionKeys) {
            this.diskEncryptionKeys = Objects.requireNonNull(diskEncryptionKeys);
            return this;
        }
        public Builder diskEncryptionKeys(GetSnapshotEncryptionSettingDiskEncryptionKey... diskEncryptionKeys) {
            return diskEncryptionKeys(List.of(diskEncryptionKeys));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder keyEncryptionKeys(List<GetSnapshotEncryptionSettingKeyEncryptionKey> keyEncryptionKeys) {
            this.keyEncryptionKeys = Objects.requireNonNull(keyEncryptionKeys);
            return this;
        }
        public Builder keyEncryptionKeys(GetSnapshotEncryptionSettingKeyEncryptionKey... keyEncryptionKeys) {
            return keyEncryptionKeys(List.of(keyEncryptionKeys));
        }        public GetSnapshotEncryptionSetting build() {
            return new GetSnapshotEncryptionSetting(diskEncryptionKeys, enabled, keyEncryptionKeys);
        }
    }
}
