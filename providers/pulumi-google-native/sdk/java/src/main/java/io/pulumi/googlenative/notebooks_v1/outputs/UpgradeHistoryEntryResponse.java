// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpgradeHistoryEntryResponse {
    /**
     * Action. Rolloback or Upgrade.
     * 
     */
    private final String action;
    /**
     * The container image before this instance upgrade.
     * 
     */
    private final String containerImage;
    /**
     * The time that this instance upgrade history entry is created.
     * 
     */
    private final String createTime;
    /**
     * The framework of this notebook instance.
     * 
     */
    private final String framework;
    /**
     * The snapshot of the boot disk of this notebook instance before upgrade.
     * 
     */
    private final String snapshot;
    /**
     * The state of this instance upgrade history entry.
     * 
     */
    private final String state;
    /**
     * Target VM Image. Format: ainotebooks-vm/project/image-name/name.
     * 
     */
    private final String targetImage;
    /**
     * Target VM Version, like m63.
     * 
     */
    private final String targetVersion;
    /**
     * The version of the notebook instance before this upgrade.
     * 
     */
    private final String version;
    /**
     * The VM image before this instance upgrade.
     * 
     */
    private final String vmImage;

    @CustomType.Constructor
    private UpgradeHistoryEntryResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("containerImage") String containerImage,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("framework") String framework,
        @CustomType.Parameter("snapshot") String snapshot,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("targetImage") String targetImage,
        @CustomType.Parameter("targetVersion") String targetVersion,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("vmImage") String vmImage) {
        this.action = action;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.framework = framework;
        this.snapshot = snapshot;
        this.state = state;
        this.targetImage = targetImage;
        this.targetVersion = targetVersion;
        this.version = version;
        this.vmImage = vmImage;
    }

    /**
     * Action. Rolloback or Upgrade.
     * 
    */
    public String action() {
        return this.action;
    }
    /**
     * The container image before this instance upgrade.
     * 
    */
    public String containerImage() {
        return this.containerImage;
    }
    /**
     * The time that this instance upgrade history entry is created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The framework of this notebook instance.
     * 
    */
    public String framework() {
        return this.framework;
    }
    /**
     * The snapshot of the boot disk of this notebook instance before upgrade.
     * 
    */
    public String snapshot() {
        return this.snapshot;
    }
    /**
     * The state of this instance upgrade history entry.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Target VM Image. Format: ainotebooks-vm/project/image-name/name.
     * 
    */
    public String targetImage() {
        return this.targetImage;
    }
    /**
     * Target VM Version, like m63.
     * 
    */
    public String targetVersion() {
        return this.targetVersion;
    }
    /**
     * The version of the notebook instance before this upgrade.
     * 
    */
    public String version() {
        return this.version;
    }
    /**
     * The VM image before this instance upgrade.
     * 
    */
    public String vmImage() {
        return this.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeHistoryEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String containerImage;
        private String createTime;
        private String framework;
        private String snapshot;
        private String state;
        private String targetImage;
        private String targetVersion;
        private String version;
        private String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeHistoryEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.framework = defaults.framework;
    	      this.snapshot = defaults.snapshot;
    	      this.state = defaults.state;
    	      this.targetImage = defaults.targetImage;
    	      this.targetVersion = defaults.targetVersion;
    	      this.version = defaults.version;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder containerImage(String containerImage) {
            this.containerImage = Objects.requireNonNull(containerImage);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder framework(String framework) {
            this.framework = Objects.requireNonNull(framework);
            return this;
        }
        public Builder snapshot(String snapshot) {
            this.snapshot = Objects.requireNonNull(snapshot);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder targetImage(String targetImage) {
            this.targetImage = Objects.requireNonNull(targetImage);
            return this;
        }
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = Objects.requireNonNull(targetVersion);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder vmImage(String vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }        public UpgradeHistoryEntryResponse build() {
            return new UpgradeHistoryEntryResponse(action, containerImage, createTime, framework, snapshot, state, targetImage, targetVersion, version, vmImage);
        }
    }
}
