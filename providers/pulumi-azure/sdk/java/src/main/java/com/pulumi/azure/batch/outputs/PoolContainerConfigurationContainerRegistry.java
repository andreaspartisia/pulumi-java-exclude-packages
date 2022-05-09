// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PoolContainerConfigurationContainerRegistry {
    /**
     * @return The password to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    private final String password;
    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
     * 
     */
    private final String registryServer;
    /**
     * @return The user name to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private PoolContainerConfigurationContainerRegistry(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("registryServer") String registryServer,
        @CustomType.Parameter("userName") String userName) {
        this.password = password;
        this.registryServer = registryServer;
        this.userName = userName;
    }

    /**
     * @return The password to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;. Changing this forces a new resource to be created.
     * 
     */
    public String registryServer() {
        return this.registryServer;
    }
    /**
     * @return The user name to log into the registry server. Changing this forces a new resource to be created.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolContainerConfigurationContainerRegistry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String registryServer;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolContainerConfigurationContainerRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.registryServer = defaults.registryServer;
    	      this.userName = defaults.userName;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder registryServer(String registryServer) {
            this.registryServer = Objects.requireNonNull(registryServer);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public PoolContainerConfigurationContainerRegistry build() {
            return new PoolContainerConfigurationContainerRegistry(password, registryServer, userName);
        }
    }
}
