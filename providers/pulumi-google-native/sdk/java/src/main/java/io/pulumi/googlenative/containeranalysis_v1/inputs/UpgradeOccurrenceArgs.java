// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeDistributionArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.WindowsUpdateArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Upgrade Occurrence represents that a specific resource_url could install a specific upgrade. This presence is supplied via local sources (i.e. it is present in the mirror and the running system has noticed its availability). For Windows, both distribution and windows_update contain information for the Windows update.
 * 
 */
public final class UpgradeOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpgradeOccurrenceArgs Empty = new UpgradeOccurrenceArgs();

    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
     */
    @Import(name="distribution")
      private final @Nullable Output<UpgradeDistributionArgs> distribution;

    public Output<UpgradeDistributionArgs> distribution() {
        return this.distribution == null ? Codegen.empty() : this.distribution;
    }

    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    @Import(name="package")
      private final @Nullable Output<String> package_;

    public Output<String> package_() {
        return this.package_ == null ? Codegen.empty() : this.package_;
    }

    /**
     * Required for non-Windows OS. The version of the package in a machine + human readable form.
     * 
     */
    @Import(name="parsedVersion")
      private final @Nullable Output<VersionArgs> parsedVersion;

    public Output<VersionArgs> parsedVersion() {
        return this.parsedVersion == null ? Codegen.empty() : this.parsedVersion;
    }

    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    @Import(name="windowsUpdate")
      private final @Nullable Output<WindowsUpdateArgs> windowsUpdate;

    public Output<WindowsUpdateArgs> windowsUpdate() {
        return this.windowsUpdate == null ? Codegen.empty() : this.windowsUpdate;
    }

    public UpgradeOccurrenceArgs(
        @Nullable Output<UpgradeDistributionArgs> distribution,
        @Nullable Output<String> package_,
        @Nullable Output<VersionArgs> parsedVersion,
        @Nullable Output<WindowsUpdateArgs> windowsUpdate) {
        this.distribution = distribution;
        this.package_ = package_;
        this.parsedVersion = parsedVersion;
        this.windowsUpdate = windowsUpdate;
    }

    private UpgradeOccurrenceArgs() {
        this.distribution = Codegen.empty();
        this.package_ = Codegen.empty();
        this.parsedVersion = Codegen.empty();
        this.windowsUpdate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<UpgradeDistributionArgs> distribution;
        private @Nullable Output<String> package_;
        private @Nullable Output<VersionArgs> parsedVersion;
        private @Nullable Output<WindowsUpdateArgs> windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.package_ = defaults.package_;
    	      this.parsedVersion = defaults.parsedVersion;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder distribution(@Nullable Output<UpgradeDistributionArgs> distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder distribution(@Nullable UpgradeDistributionArgs distribution) {
            this.distribution = Codegen.ofNullable(distribution);
            return this;
        }
        public Builder package_(@Nullable Output<String> package_) {
            this.package_ = package_;
            return this;
        }
        public Builder package_(@Nullable String package_) {
            this.package_ = Codegen.ofNullable(package_);
            return this;
        }
        public Builder parsedVersion(@Nullable Output<VersionArgs> parsedVersion) {
            this.parsedVersion = parsedVersion;
            return this;
        }
        public Builder parsedVersion(@Nullable VersionArgs parsedVersion) {
            this.parsedVersion = Codegen.ofNullable(parsedVersion);
            return this;
        }
        public Builder windowsUpdate(@Nullable Output<WindowsUpdateArgs> windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }
        public Builder windowsUpdate(@Nullable WindowsUpdateArgs windowsUpdate) {
            this.windowsUpdate = Codegen.ofNullable(windowsUpdate);
            return this;
        }        public UpgradeOccurrenceArgs build() {
            return new UpgradeOccurrenceArgs(distribution, package_, parsedVersion, windowsUpdate);
        }
    }
}
