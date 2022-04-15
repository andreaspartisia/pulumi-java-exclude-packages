// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1.enums.PatchConfigRebootConfig;
import io.pulumi.googlenative.osconfig_v1.inputs.AptSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.ExecStepArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.GooSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.WindowsUpdateSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.YumSettingsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.ZypperSettingsArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Patch configuration specifications. Contains details on how to apply the patch(es) to a VM instance.
 * 
 */
public final class PatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchConfigArgs Empty = new PatchConfigArgs();

    /**
     * Apt update settings. Use this setting to override the default `apt` patch rules.
     * 
     */
    @Import(name="apt")
      private final @Nullable Output<AptSettingsArgs> apt;

    public Output<AptSettingsArgs> apt() {
        return this.apt == null ? Codegen.empty() : this.apt;
    }

    /**
     * Goo update settings. Use this setting to override the default `goo` patch rules.
     * 
     */
    @Import(name="goo")
      private final @Nullable Output<GooSettingsArgs> goo;

    public Output<GooSettingsArgs> goo() {
        return this.goo == null ? Codegen.empty() : this.goo;
    }

    /**
     * Allows the patch job to run on Managed instance groups (MIGs).
     * 
     */
    @Import(name="migInstancesAllowed")
      private final @Nullable Output<Boolean> migInstancesAllowed;

    public Output<Boolean> migInstancesAllowed() {
        return this.migInstancesAllowed == null ? Codegen.empty() : this.migInstancesAllowed;
    }

    /**
     * The `ExecStep` to run after the patch update.
     * 
     */
    @Import(name="postStep")
      private final @Nullable Output<ExecStepArgs> postStep;

    public Output<ExecStepArgs> postStep() {
        return this.postStep == null ? Codegen.empty() : this.postStep;
    }

    /**
     * The `ExecStep` to run before the patch update.
     * 
     */
    @Import(name="preStep")
      private final @Nullable Output<ExecStepArgs> preStep;

    public Output<ExecStepArgs> preStep() {
        return this.preStep == null ? Codegen.empty() : this.preStep;
    }

    /**
     * Post-patch reboot settings.
     * 
     */
    @Import(name="rebootConfig")
      private final @Nullable Output<PatchConfigRebootConfig> rebootConfig;

    public Output<PatchConfigRebootConfig> rebootConfig() {
        return this.rebootConfig == null ? Codegen.empty() : this.rebootConfig;
    }

    /**
     * Windows update settings. Use this override the default windows patch rules.
     * 
     */
    @Import(name="windowsUpdate")
      private final @Nullable Output<WindowsUpdateSettingsArgs> windowsUpdate;

    public Output<WindowsUpdateSettingsArgs> windowsUpdate() {
        return this.windowsUpdate == null ? Codegen.empty() : this.windowsUpdate;
    }

    /**
     * Yum update settings. Use this setting to override the default `yum` patch rules.
     * 
     */
    @Import(name="yum")
      private final @Nullable Output<YumSettingsArgs> yum;

    public Output<YumSettingsArgs> yum() {
        return this.yum == null ? Codegen.empty() : this.yum;
    }

    /**
     * Zypper update settings. Use this setting to override the default `zypper` patch rules.
     * 
     */
    @Import(name="zypper")
      private final @Nullable Output<ZypperSettingsArgs> zypper;

    public Output<ZypperSettingsArgs> zypper() {
        return this.zypper == null ? Codegen.empty() : this.zypper;
    }

    public PatchConfigArgs(
        @Nullable Output<AptSettingsArgs> apt,
        @Nullable Output<GooSettingsArgs> goo,
        @Nullable Output<Boolean> migInstancesAllowed,
        @Nullable Output<ExecStepArgs> postStep,
        @Nullable Output<ExecStepArgs> preStep,
        @Nullable Output<PatchConfigRebootConfig> rebootConfig,
        @Nullable Output<WindowsUpdateSettingsArgs> windowsUpdate,
        @Nullable Output<YumSettingsArgs> yum,
        @Nullable Output<ZypperSettingsArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.migInstancesAllowed = migInstancesAllowed;
        this.postStep = postStep;
        this.preStep = preStep;
        this.rebootConfig = rebootConfig;
        this.windowsUpdate = windowsUpdate;
        this.yum = yum;
        this.zypper = zypper;
    }

    private PatchConfigArgs() {
        this.apt = Codegen.empty();
        this.goo = Codegen.empty();
        this.migInstancesAllowed = Codegen.empty();
        this.postStep = Codegen.empty();
        this.preStep = Codegen.empty();
        this.rebootConfig = Codegen.empty();
        this.windowsUpdate = Codegen.empty();
        this.yum = Codegen.empty();
        this.zypper = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AptSettingsArgs> apt;
        private @Nullable Output<GooSettingsArgs> goo;
        private @Nullable Output<Boolean> migInstancesAllowed;
        private @Nullable Output<ExecStepArgs> postStep;
        private @Nullable Output<ExecStepArgs> preStep;
        private @Nullable Output<PatchConfigRebootConfig> rebootConfig;
        private @Nullable Output<WindowsUpdateSettingsArgs> windowsUpdate;
        private @Nullable Output<YumSettingsArgs> yum;
        private @Nullable Output<ZypperSettingsArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.migInstancesAllowed = defaults.migInstancesAllowed;
    	      this.postStep = defaults.postStep;
    	      this.preStep = defaults.preStep;
    	      this.rebootConfig = defaults.rebootConfig;
    	      this.windowsUpdate = defaults.windowsUpdate;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable Output<AptSettingsArgs> apt) {
            this.apt = apt;
            return this;
        }
        public Builder apt(@Nullable AptSettingsArgs apt) {
            this.apt = Codegen.ofNullable(apt);
            return this;
        }
        public Builder goo(@Nullable Output<GooSettingsArgs> goo) {
            this.goo = goo;
            return this;
        }
        public Builder goo(@Nullable GooSettingsArgs goo) {
            this.goo = Codegen.ofNullable(goo);
            return this;
        }
        public Builder migInstancesAllowed(@Nullable Output<Boolean> migInstancesAllowed) {
            this.migInstancesAllowed = migInstancesAllowed;
            return this;
        }
        public Builder migInstancesAllowed(@Nullable Boolean migInstancesAllowed) {
            this.migInstancesAllowed = Codegen.ofNullable(migInstancesAllowed);
            return this;
        }
        public Builder postStep(@Nullable Output<ExecStepArgs> postStep) {
            this.postStep = postStep;
            return this;
        }
        public Builder postStep(@Nullable ExecStepArgs postStep) {
            this.postStep = Codegen.ofNullable(postStep);
            return this;
        }
        public Builder preStep(@Nullable Output<ExecStepArgs> preStep) {
            this.preStep = preStep;
            return this;
        }
        public Builder preStep(@Nullable ExecStepArgs preStep) {
            this.preStep = Codegen.ofNullable(preStep);
            return this;
        }
        public Builder rebootConfig(@Nullable Output<PatchConfigRebootConfig> rebootConfig) {
            this.rebootConfig = rebootConfig;
            return this;
        }
        public Builder rebootConfig(@Nullable PatchConfigRebootConfig rebootConfig) {
            this.rebootConfig = Codegen.ofNullable(rebootConfig);
            return this;
        }
        public Builder windowsUpdate(@Nullable Output<WindowsUpdateSettingsArgs> windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }
        public Builder windowsUpdate(@Nullable WindowsUpdateSettingsArgs windowsUpdate) {
            this.windowsUpdate = Codegen.ofNullable(windowsUpdate);
            return this;
        }
        public Builder yum(@Nullable Output<YumSettingsArgs> yum) {
            this.yum = yum;
            return this;
        }
        public Builder yum(@Nullable YumSettingsArgs yum) {
            this.yum = Codegen.ofNullable(yum);
            return this;
        }
        public Builder zypper(@Nullable Output<ZypperSettingsArgs> zypper) {
            this.zypper = zypper;
            return this;
        }
        public Builder zypper(@Nullable ZypperSettingsArgs zypper) {
            this.zypper = Codegen.ofNullable(zypper);
            return this;
        }        public PatchConfigArgs build() {
            return new PatchConfigArgs(apt, goo, migInstancesAllowed, postStep, preStep, rebootConfig, windowsUpdate, yum, zypper);
        }
    }
}
