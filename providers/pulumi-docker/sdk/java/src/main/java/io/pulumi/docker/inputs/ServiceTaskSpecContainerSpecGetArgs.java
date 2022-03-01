// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecConfigGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecDnsConfigGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecHealthcheckGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecHostGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecLabelGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecMountGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecPrivilegesGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecContainerSpecSecretGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecGetArgs Empty = new ServiceTaskSpecContainerSpecGetArgs();

    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    @InputImport(name="commands")
      private final @Nullable Input<List<String>> commands;

    public Input<List<String>> getCommands() {
        return this.commands == null ? Input.empty() : this.commands;
    }

    @InputImport(name="configs")
      private final @Nullable Input<List<ServiceTaskSpecContainerSpecConfigGetArgs>> configs;

    public Input<List<ServiceTaskSpecContainerSpecConfigGetArgs>> getConfigs() {
        return this.configs == null ? Input.empty() : this.configs;
    }

    @InputImport(name="dir")
      private final @Nullable Input<String> dir;

    public Input<String> getDir() {
        return this.dir == null ? Input.empty() : this.dir;
    }

    @InputImport(name="dnsConfig")
      private final @Nullable Input<ServiceTaskSpecContainerSpecDnsConfigGetArgs> dnsConfig;

    public Input<ServiceTaskSpecContainerSpecDnsConfigGetArgs> getDnsConfig() {
        return this.dnsConfig == null ? Input.empty() : this.dnsConfig;
    }

    @InputImport(name="env")
      private final @Nullable Input<Map<String,String>> env;

    public Input<Map<String,String>> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    @InputImport(name="groups")
      private final @Nullable Input<List<String>> groups;

    public Input<List<String>> getGroups() {
        return this.groups == null ? Input.empty() : this.groups;
    }

    @InputImport(name="healthcheck")
      private final @Nullable Input<ServiceTaskSpecContainerSpecHealthcheckGetArgs> healthcheck;

    public Input<ServiceTaskSpecContainerSpecHealthcheckGetArgs> getHealthcheck() {
        return this.healthcheck == null ? Input.empty() : this.healthcheck;
    }

    @InputImport(name="hostname")
      private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    @InputImport(name="hosts")
      private final @Nullable Input<List<ServiceTaskSpecContainerSpecHostGetArgs>> hosts;

    public Input<List<ServiceTaskSpecContainerSpecHostGetArgs>> getHosts() {
        return this.hosts == null ? Input.empty() : this.hosts;
    }

    @InputImport(name="image", required=true)
      private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    @InputImport(name="isolation")
      private final @Nullable Input<String> isolation;

    public Input<String> getIsolation() {
        return this.isolation == null ? Input.empty() : this.isolation;
    }

    @InputImport(name="labels")
      private final @Nullable Input<List<ServiceTaskSpecContainerSpecLabelGetArgs>> labels;

    public Input<List<ServiceTaskSpecContainerSpecLabelGetArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="mounts")
      private final @Nullable Input<List<ServiceTaskSpecContainerSpecMountGetArgs>> mounts;

    public Input<List<ServiceTaskSpecContainerSpecMountGetArgs>> getMounts() {
        return this.mounts == null ? Input.empty() : this.mounts;
    }

    @InputImport(name="privileges")
      private final @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesGetArgs> privileges;

    public Input<ServiceTaskSpecContainerSpecPrivilegesGetArgs> getPrivileges() {
        return this.privileges == null ? Input.empty() : this.privileges;
    }

    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    @InputImport(name="secrets")
      private final @Nullable Input<List<ServiceTaskSpecContainerSpecSecretGetArgs>> secrets;

    public Input<List<ServiceTaskSpecContainerSpecSecretGetArgs>> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    @InputImport(name="stopGracePeriod")
      private final @Nullable Input<String> stopGracePeriod;

    public Input<String> getStopGracePeriod() {
        return this.stopGracePeriod == null ? Input.empty() : this.stopGracePeriod;
    }

    @InputImport(name="stopSignal")
      private final @Nullable Input<String> stopSignal;

    public Input<String> getStopSignal() {
        return this.stopSignal == null ? Input.empty() : this.stopSignal;
    }

    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public ServiceTaskSpecContainerSpecGetArgs(
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> commands,
        @Nullable Input<List<ServiceTaskSpecContainerSpecConfigGetArgs>> configs,
        @Nullable Input<String> dir,
        @Nullable Input<ServiceTaskSpecContainerSpecDnsConfigGetArgs> dnsConfig,
        @Nullable Input<Map<String,String>> env,
        @Nullable Input<List<String>> groups,
        @Nullable Input<ServiceTaskSpecContainerSpecHealthcheckGetArgs> healthcheck,
        @Nullable Input<String> hostname,
        @Nullable Input<List<ServiceTaskSpecContainerSpecHostGetArgs>> hosts,
        Input<String> image,
        @Nullable Input<String> isolation,
        @Nullable Input<List<ServiceTaskSpecContainerSpecLabelGetArgs>> labels,
        @Nullable Input<List<ServiceTaskSpecContainerSpecMountGetArgs>> mounts,
        @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesGetArgs> privileges,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<List<ServiceTaskSpecContainerSpecSecretGetArgs>> secrets,
        @Nullable Input<String> stopGracePeriod,
        @Nullable Input<String> stopSignal,
        @Nullable Input<String> user) {
        this.args = args;
        this.commands = commands;
        this.configs = configs;
        this.dir = dir;
        this.dnsConfig = dnsConfig;
        this.env = env;
        this.groups = groups;
        this.healthcheck = healthcheck;
        this.hostname = hostname;
        this.hosts = hosts;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.isolation = isolation;
        this.labels = labels;
        this.mounts = mounts;
        this.privileges = privileges;
        this.readOnly = readOnly;
        this.secrets = secrets;
        this.stopGracePeriod = stopGracePeriod;
        this.stopSignal = stopSignal;
        this.user = user;
    }

    private ServiceTaskSpecContainerSpecGetArgs() {
        this.args = Input.empty();
        this.commands = Input.empty();
        this.configs = Input.empty();
        this.dir = Input.empty();
        this.dnsConfig = Input.empty();
        this.env = Input.empty();
        this.groups = Input.empty();
        this.healthcheck = Input.empty();
        this.hostname = Input.empty();
        this.hosts = Input.empty();
        this.image = Input.empty();
        this.isolation = Input.empty();
        this.labels = Input.empty();
        this.mounts = Input.empty();
        this.privileges = Input.empty();
        this.readOnly = Input.empty();
        this.secrets = Input.empty();
        this.stopGracePeriod = Input.empty();
        this.stopSignal = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> commands;
        private @Nullable Input<List<ServiceTaskSpecContainerSpecConfigGetArgs>> configs;
        private @Nullable Input<String> dir;
        private @Nullable Input<ServiceTaskSpecContainerSpecDnsConfigGetArgs> dnsConfig;
        private @Nullable Input<Map<String,String>> env;
        private @Nullable Input<List<String>> groups;
        private @Nullable Input<ServiceTaskSpecContainerSpecHealthcheckGetArgs> healthcheck;
        private @Nullable Input<String> hostname;
        private @Nullable Input<List<ServiceTaskSpecContainerSpecHostGetArgs>> hosts;
        private Input<String> image;
        private @Nullable Input<String> isolation;
        private @Nullable Input<List<ServiceTaskSpecContainerSpecLabelGetArgs>> labels;
        private @Nullable Input<List<ServiceTaskSpecContainerSpecMountGetArgs>> mounts;
        private @Nullable Input<ServiceTaskSpecContainerSpecPrivilegesGetArgs> privileges;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<List<ServiceTaskSpecContainerSpecSecretGetArgs>> secrets;
        private @Nullable Input<String> stopGracePeriod;
        private @Nullable Input<String> stopSignal;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.configs = defaults.configs;
    	      this.dir = defaults.dir;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.env = defaults.env;
    	      this.groups = defaults.groups;
    	      this.healthcheck = defaults.healthcheck;
    	      this.hostname = defaults.hostname;
    	      this.hosts = defaults.hosts;
    	      this.image = defaults.image;
    	      this.isolation = defaults.isolation;
    	      this.labels = defaults.labels;
    	      this.mounts = defaults.mounts;
    	      this.privileges = defaults.privileges;
    	      this.readOnly = defaults.readOnly;
    	      this.secrets = defaults.secrets;
    	      this.stopGracePeriod = defaults.stopGracePeriod;
    	      this.stopSignal = defaults.stopSignal;
    	      this.user = defaults.user;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setCommands(@Nullable Input<List<String>> commands) {
            this.commands = commands;
            return this;
        }

        public Builder setCommands(@Nullable List<String> commands) {
            this.commands = Input.ofNullable(commands);
            return this;
        }

        public Builder setConfigs(@Nullable Input<List<ServiceTaskSpecContainerSpecConfigGetArgs>> configs) {
            this.configs = configs;
            return this;
        }

        public Builder setConfigs(@Nullable List<ServiceTaskSpecContainerSpecConfigGetArgs> configs) {
            this.configs = Input.ofNullable(configs);
            return this;
        }

        public Builder setDir(@Nullable Input<String> dir) {
            this.dir = dir;
            return this;
        }

        public Builder setDir(@Nullable String dir) {
            this.dir = Input.ofNullable(dir);
            return this;
        }

        public Builder setDnsConfig(@Nullable Input<ServiceTaskSpecContainerSpecDnsConfigGetArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setDnsConfig(@Nullable ServiceTaskSpecContainerSpecDnsConfigGetArgs dnsConfig) {
            this.dnsConfig = Input.ofNullable(dnsConfig);
            return this;
        }

        public Builder setEnv(@Nullable Input<Map<String,String>> env) {
            this.env = env;
            return this;
        }

        public Builder setEnv(@Nullable Map<String,String> env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder setGroups(@Nullable Input<List<String>> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = Input.ofNullable(groups);
            return this;
        }

        public Builder setHealthcheck(@Nullable Input<ServiceTaskSpecContainerSpecHealthcheckGetArgs> healthcheck) {
            this.healthcheck = healthcheck;
            return this;
        }

        public Builder setHealthcheck(@Nullable ServiceTaskSpecContainerSpecHealthcheckGetArgs healthcheck) {
            this.healthcheck = Input.ofNullable(healthcheck);
            return this;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setHosts(@Nullable Input<List<ServiceTaskSpecContainerSpecHostGetArgs>> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder setHosts(@Nullable List<ServiceTaskSpecContainerSpecHostGetArgs> hosts) {
            this.hosts = Input.ofNullable(hosts);
            return this;
        }

        public Builder setImage(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder setIsolation(@Nullable Input<String> isolation) {
            this.isolation = isolation;
            return this;
        }

        public Builder setIsolation(@Nullable String isolation) {
            this.isolation = Input.ofNullable(isolation);
            return this;
        }

        public Builder setLabels(@Nullable Input<List<ServiceTaskSpecContainerSpecLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<ServiceTaskSpecContainerSpecLabelGetArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMounts(@Nullable Input<List<ServiceTaskSpecContainerSpecMountGetArgs>> mounts) {
            this.mounts = mounts;
            return this;
        }

        public Builder setMounts(@Nullable List<ServiceTaskSpecContainerSpecMountGetArgs> mounts) {
            this.mounts = Input.ofNullable(mounts);
            return this;
        }

        public Builder setPrivileges(@Nullable Input<ServiceTaskSpecContainerSpecPrivilegesGetArgs> privileges) {
            this.privileges = privileges;
            return this;
        }

        public Builder setPrivileges(@Nullable ServiceTaskSpecContainerSpecPrivilegesGetArgs privileges) {
            this.privileges = Input.ofNullable(privileges);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSecrets(@Nullable Input<List<ServiceTaskSpecContainerSpecSecretGetArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setSecrets(@Nullable List<ServiceTaskSpecContainerSpecSecretGetArgs> secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }

        public Builder setStopGracePeriod(@Nullable Input<String> stopGracePeriod) {
            this.stopGracePeriod = stopGracePeriod;
            return this;
        }

        public Builder setStopGracePeriod(@Nullable String stopGracePeriod) {
            this.stopGracePeriod = Input.ofNullable(stopGracePeriod);
            return this;
        }

        public Builder setStopSignal(@Nullable Input<String> stopSignal) {
            this.stopSignal = stopSignal;
            return this;
        }

        public Builder setStopSignal(@Nullable String stopSignal) {
            this.stopSignal = Input.ofNullable(stopSignal);
            return this;
        }

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public ServiceTaskSpecContainerSpecGetArgs build() {
            return new ServiceTaskSpecContainerSpecGetArgs(args, commands, configs, dir, dnsConfig, env, groups, healthcheck, hostname, hosts, image, isolation, labels, mounts, privileges, readOnly, secrets, stopGracePeriod, stopSignal, user);
        }
    }
}
