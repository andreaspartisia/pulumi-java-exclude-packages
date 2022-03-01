// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.PluginGrantPermissionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PluginArgs extends io.pulumi.resources.ResourceArgs {

    public static final PluginArgs Empty = new PluginArgs();

    /**
     * Docker Plugin alias
     * 
     */
    @InputImport(name="alias")
      private final @Nullable Input<String> alias;

    public Input<String> getAlias() {
        return this.alias == null ? Input.empty() : this.alias;
    }

    /**
     * HTTP client timeout to enable the plugin
     * 
     */
    @InputImport(name="enableTimeout")
      private final @Nullable Input<Integer> enableTimeout;

    public Input<Integer> getEnableTimeout() {
        return this.enableTimeout == null ? Input.empty() : this.enableTimeout;
    }

    /**
     * If `true` the plugin is enabled. Defaults to `true`
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The environment variables in the form of `KEY=VALUE`, e.g. `DEBUG=0`
     * 
     */
    @InputImport(name="envs")
      private final @Nullable Input<List<String>> envs;

    public Input<List<String>> getEnvs() {
        return this.envs == null ? Input.empty() : this.envs;
    }

    /**
     * If true, then the plugin is destroyed forcibly
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * If true, then the plugin is disabled forcibly
     * 
     */
    @InputImport(name="forceDisable")
      private final @Nullable Input<Boolean> forceDisable;

    public Input<Boolean> getForceDisable() {
        return this.forceDisable == null ? Input.empty() : this.forceDisable;
    }

    /**
     * If true, grant all permissions necessary to run the plugin
     * 
     */
    @InputImport(name="grantAllPermissions")
      private final @Nullable Input<Boolean> grantAllPermissions;

    public Input<Boolean> getGrantAllPermissions() {
        return this.grantAllPermissions == null ? Input.empty() : this.grantAllPermissions;
    }

    /**
     * Grant specific permissions only
     * 
     */
    @InputImport(name="grantPermissions")
      private final @Nullable Input<List<PluginGrantPermissionArgs>> grantPermissions;

    public Input<List<PluginGrantPermissionArgs>> getGrantPermissions() {
        return this.grantPermissions == null ? Input.empty() : this.grantPermissions;
    }

    /**
     * Docker Plugin name
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public PluginArgs(
        @Nullable Input<String> alias,
        @Nullable Input<Integer> enableTimeout,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<String>> envs,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<Boolean> forceDisable,
        @Nullable Input<Boolean> grantAllPermissions,
        @Nullable Input<List<PluginGrantPermissionArgs>> grantPermissions,
        @Nullable Input<String> name) {
        this.alias = alias;
        this.enableTimeout = enableTimeout;
        this.enabled = enabled;
        this.envs = envs;
        this.forceDestroy = forceDestroy;
        this.forceDisable = forceDisable;
        this.grantAllPermissions = grantAllPermissions;
        this.grantPermissions = grantPermissions;
        this.name = name;
    }

    private PluginArgs() {
        this.alias = Input.empty();
        this.enableTimeout = Input.empty();
        this.enabled = Input.empty();
        this.envs = Input.empty();
        this.forceDestroy = Input.empty();
        this.forceDisable = Input.empty();
        this.grantAllPermissions = Input.empty();
        this.grantPermissions = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alias;
        private @Nullable Input<Integer> enableTimeout;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<String>> envs;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<Boolean> forceDisable;
        private @Nullable Input<Boolean> grantAllPermissions;
        private @Nullable Input<List<PluginGrantPermissionArgs>> grantPermissions;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PluginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.enableTimeout = defaults.enableTimeout;
    	      this.enabled = defaults.enabled;
    	      this.envs = defaults.envs;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.forceDisable = defaults.forceDisable;
    	      this.grantAllPermissions = defaults.grantAllPermissions;
    	      this.grantPermissions = defaults.grantPermissions;
    	      this.name = defaults.name;
        }

        public Builder setAlias(@Nullable Input<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = Input.ofNullable(alias);
            return this;
        }

        public Builder setEnableTimeout(@Nullable Input<Integer> enableTimeout) {
            this.enableTimeout = enableTimeout;
            return this;
        }

        public Builder setEnableTimeout(@Nullable Integer enableTimeout) {
            this.enableTimeout = Input.ofNullable(enableTimeout);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEnvs(@Nullable Input<List<String>> envs) {
            this.envs = envs;
            return this;
        }

        public Builder setEnvs(@Nullable List<String> envs) {
            this.envs = Input.ofNullable(envs);
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setForceDisable(@Nullable Input<Boolean> forceDisable) {
            this.forceDisable = forceDisable;
            return this;
        }

        public Builder setForceDisable(@Nullable Boolean forceDisable) {
            this.forceDisable = Input.ofNullable(forceDisable);
            return this;
        }

        public Builder setGrantAllPermissions(@Nullable Input<Boolean> grantAllPermissions) {
            this.grantAllPermissions = grantAllPermissions;
            return this;
        }

        public Builder setGrantAllPermissions(@Nullable Boolean grantAllPermissions) {
            this.grantAllPermissions = Input.ofNullable(grantAllPermissions);
            return this;
        }

        public Builder setGrantPermissions(@Nullable Input<List<PluginGrantPermissionArgs>> grantPermissions) {
            this.grantPermissions = grantPermissions;
            return this;
        }

        public Builder setGrantPermissions(@Nullable List<PluginGrantPermissionArgs> grantPermissions) {
            this.grantPermissions = Input.ofNullable(grantPermissions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public PluginArgs build() {
            return new PluginArgs(alias, enableTimeout, enabled, envs, forceDestroy, forceDisable, grantAllPermissions, grantPermissions, name);
        }
    }
}
