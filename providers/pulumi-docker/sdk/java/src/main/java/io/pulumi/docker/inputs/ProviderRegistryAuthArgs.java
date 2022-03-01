// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderRegistryAuthArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderRegistryAuthArgs Empty = new ProviderRegistryAuthArgs();

    @InputImport(name="address", required=true)
      private final Input<String> address;

    public Input<String> getAddress() {
        return this.address;
    }

    @InputImport(name="configFile")
      private final @Nullable Input<String> configFile;

    public Input<String> getConfigFile() {
        return this.configFile == null ? Input.empty() : this.configFile;
    }

    @InputImport(name="configFileContent")
      private final @Nullable Input<String> configFileContent;

    public Input<String> getConfigFileContent() {
        return this.configFileContent == null ? Input.empty() : this.configFileContent;
    }

    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public ProviderRegistryAuthArgs(
        Input<String> address,
        @Nullable Input<String> configFile,
        @Nullable Input<String> configFileContent,
        @Nullable Input<String> password,
        @Nullable Input<String> username) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.configFile = configFile;
        this.configFileContent = configFileContent;
        this.password = password;
        this.username = username;
    }

    private ProviderRegistryAuthArgs() {
        this.address = Input.empty();
        this.configFile = Input.empty();
        this.configFileContent = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
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

        public Builder setAddress(String address) {
            this.address = Input.of(Objects.requireNonNull(address));
            return this;
        }

        public Builder setConfigFile(@Nullable Input<String> configFile) {
            this.configFile = configFile;
            return this;
        }

        public Builder setConfigFile(@Nullable String configFile) {
            this.configFile = Input.ofNullable(configFile);
            return this;
        }

        public Builder setConfigFileContent(@Nullable Input<String> configFileContent) {
            this.configFileContent = configFileContent;
            return this;
        }

        public Builder setConfigFileContent(@Nullable String configFileContent) {
            this.configFileContent = Input.ofNullable(configFileContent);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public ProviderRegistryAuthArgs build() {
            return new ProviderRegistryAuthArgs(address, configFile, configFileContent, password, username);
        }
    }
}
