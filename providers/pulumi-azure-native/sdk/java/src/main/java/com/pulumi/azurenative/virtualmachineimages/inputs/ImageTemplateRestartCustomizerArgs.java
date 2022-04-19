// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Reboots a VM and waits for it to come back online (Windows). Corresponds to Packer windows-restart provisioner
 * 
 */
public final class ImageTemplateRestartCustomizerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageTemplateRestartCustomizerArgs Empty = new ImageTemplateRestartCustomizerArgs();

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Command to check if restart succeeded [Default: '']
     * 
     */
    @Import(name="restartCheckCommand")
      private final @Nullable Output<String> restartCheckCommand;

    public Output<String> restartCheckCommand() {
        return this.restartCheckCommand == null ? Codegen.empty() : this.restartCheckCommand;
    }

    /**
     * Command to execute the restart [Default: 'shutdown /r /f /t 0 /c "packer restart"']
     * 
     */
    @Import(name="restartCommand")
      private final @Nullable Output<String> restartCommand;

    public Output<String> restartCommand() {
        return this.restartCommand == null ? Codegen.empty() : this.restartCommand;
    }

    /**
     * Restart timeout specified as a string of magnitude and unit, e.g. '5m' (5 minutes) or '2h' (2 hours) [Default: '5m']
     * 
     */
    @Import(name="restartTimeout")
      private final @Nullable Output<String> restartTimeout;

    public Output<String> restartTimeout() {
        return this.restartTimeout == null ? Codegen.empty() : this.restartTimeout;
    }

    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'WindowsRestart'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ImageTemplateRestartCustomizerArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> restartCheckCommand,
        @Nullable Output<String> restartCommand,
        @Nullable Output<String> restartTimeout,
        Output<String> type) {
        this.name = name;
        this.restartCheckCommand = restartCheckCommand;
        this.restartCommand = restartCommand;
        this.restartTimeout = restartTimeout;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private ImageTemplateRestartCustomizerArgs() {
        this.name = Codegen.empty();
        this.restartCheckCommand = Codegen.empty();
        this.restartCommand = Codegen.empty();
        this.restartTimeout = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateRestartCustomizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> restartCheckCommand;
        private @Nullable Output<String> restartCommand;
        private @Nullable Output<String> restartTimeout;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateRestartCustomizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restartCheckCommand = defaults.restartCheckCommand;
    	      this.restartCommand = defaults.restartCommand;
    	      this.restartTimeout = defaults.restartTimeout;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder restartCheckCommand(@Nullable Output<String> restartCheckCommand) {
            this.restartCheckCommand = restartCheckCommand;
            return this;
        }
        public Builder restartCheckCommand(@Nullable String restartCheckCommand) {
            this.restartCheckCommand = Codegen.ofNullable(restartCheckCommand);
            return this;
        }
        public Builder restartCommand(@Nullable Output<String> restartCommand) {
            this.restartCommand = restartCommand;
            return this;
        }
        public Builder restartCommand(@Nullable String restartCommand) {
            this.restartCommand = Codegen.ofNullable(restartCommand);
            return this;
        }
        public Builder restartTimeout(@Nullable Output<String> restartTimeout) {
            this.restartTimeout = restartTimeout;
            return this;
        }
        public Builder restartTimeout(@Nullable String restartTimeout) {
            this.restartTimeout = Codegen.ofNullable(restartTimeout);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ImageTemplateRestartCustomizerArgs build() {
            return new ImageTemplateRestartCustomizerArgs(name, restartCheckCommand, restartCommand, restartTimeout, type);
        }
    }
}
