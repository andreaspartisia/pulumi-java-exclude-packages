// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderRegistryAuthArgs {
    private final Input<String> address;
    private final @Nullable Input<String> configFile;
    private final @Nullable Input<String> configFileContent;
    private final @Nullable Input<String> password;
    private final @Nullable Input<String> username;

    @OutputCustomType.Constructor({"address","configFile","configFileContent","password","username"})
    private ProviderRegistryAuthArgs(
        Input<String> address,
        @Nullable Input<String> configFile,
        @Nullable Input<String> configFileContent,
        @Nullable Input<String> password,
        @Nullable Input<String> username) {
        this.address = Objects.requireNonNull(address);
        this.configFile = configFile;
        this.configFileContent = configFileContent;
        this.password = password;
        this.username = username;
    }

    public Input<String> getAddress() {
        return this.address;
    }
    public @Nullable Input<String> getConfigFile() {
        return this.configFile;
    }
    public @Nullable Input<String> getConfigFileContent() {
        return this.configFileContent;
    }
    public @Nullable Input<String> getPassword() {
        return this.password;
    }
    public @Nullable Input<String> getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistryAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> address;
        private @Nullable Input<String> configFile;
        private @Nullable Input<String> configFileContent;
        private @Nullable Input<String> password;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistryAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.configFile = defaults.configFile;
    	      this.configFileContent = defaults.configFileContent;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setAddress(Input<String> address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setConfigFile(@Nullable Input<String> configFile) {
            this.configFile = configFile;
            return this;
        }

        public Builder setConfigFileContent(@Nullable Input<String> configFileContent) {
            this.configFileContent = configFileContent;
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }
        public ProviderRegistryAuthArgs build() {
            return new ProviderRegistryAuthArgs(address, configFile, configFileContent, password, username);
        }
    }
}
