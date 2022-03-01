// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.docker.outputs.RegistryImageBuildAuthConfig;
import io.pulumi.docker.outputs.RegistryImageBuildUlimit;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegistryImageBuild {
    private final @Nullable List<RegistryImageBuildAuthConfig> authConfigs;
    private final @Nullable Map<String,String> buildArgs;
    private final @Nullable String buildId;
    private final @Nullable List<String> cacheFroms;
    private final @Nullable String cgroupParent;
    private final String context;
    private final @Nullable Integer cpuPeriod;
    private final @Nullable Integer cpuQuota;
    private final @Nullable String cpuSetCpus;
    private final @Nullable String cpuSetMems;
    private final @Nullable Integer cpuShares;
    private final @Nullable String dockerfile;
    private final @Nullable List<String> extraHosts;
    private final @Nullable Boolean forceRemove;
    private final @Nullable String isolation;
    private final @Nullable Map<String,String> labels;
    private final @Nullable Integer memory;
    private final @Nullable Integer memorySwap;
    private final @Nullable String networkMode;
    private final @Nullable Boolean noCache;
    private final @Nullable String platform;
    private final @Nullable Boolean pullParent;
    private final @Nullable String remoteContext;
    private final @Nullable Boolean remove;
    private final @Nullable List<String> securityOpts;
    private final @Nullable String sessionId;
    private final @Nullable Integer shmSize;
    private final @Nullable Boolean squash;
    private final @Nullable Boolean suppressOutput;
    private final @Nullable String target;
    private final @Nullable List<RegistryImageBuildUlimit> ulimits;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"authConfigs","buildArgs","buildId","cacheFroms","cgroupParent","context","cpuPeriod","cpuQuota","cpuSetCpus","cpuSetMems","cpuShares","dockerfile","extraHosts","forceRemove","isolation","labels","memory","memorySwap","networkMode","noCache","platform","pullParent","remoteContext","remove","securityOpts","sessionId","shmSize","squash","suppressOutput","target","ulimits","version"})
    private RegistryImageBuild(
        @Nullable List<RegistryImageBuildAuthConfig> authConfigs,
        @Nullable Map<String,String> buildArgs,
        @Nullable String buildId,
        @Nullable List<String> cacheFroms,
        @Nullable String cgroupParent,
        String context,
        @Nullable Integer cpuPeriod,
        @Nullable Integer cpuQuota,
        @Nullable String cpuSetCpus,
        @Nullable String cpuSetMems,
        @Nullable Integer cpuShares,
        @Nullable String dockerfile,
        @Nullable List<String> extraHosts,
        @Nullable Boolean forceRemove,
        @Nullable String isolation,
        @Nullable Map<String,String> labels,
        @Nullable Integer memory,
        @Nullable Integer memorySwap,
        @Nullable String networkMode,
        @Nullable Boolean noCache,
        @Nullable String platform,
        @Nullable Boolean pullParent,
        @Nullable String remoteContext,
        @Nullable Boolean remove,
        @Nullable List<String> securityOpts,
        @Nullable String sessionId,
        @Nullable Integer shmSize,
        @Nullable Boolean squash,
        @Nullable Boolean suppressOutput,
        @Nullable String target,
        @Nullable List<RegistryImageBuildUlimit> ulimits,
        @Nullable String version) {
        this.authConfigs = authConfigs;
        this.buildArgs = buildArgs;
        this.buildId = buildId;
        this.cacheFroms = cacheFroms;
        this.cgroupParent = cgroupParent;
        this.context = Objects.requireNonNull(context);
        this.cpuPeriod = cpuPeriod;
        this.cpuQuota = cpuQuota;
        this.cpuSetCpus = cpuSetCpus;
        this.cpuSetMems = cpuSetMems;
        this.cpuShares = cpuShares;
        this.dockerfile = dockerfile;
        this.extraHosts = extraHosts;
        this.forceRemove = forceRemove;
        this.isolation = isolation;
        this.labels = labels;
        this.memory = memory;
        this.memorySwap = memorySwap;
        this.networkMode = networkMode;
        this.noCache = noCache;
        this.platform = platform;
        this.pullParent = pullParent;
        this.remoteContext = remoteContext;
        this.remove = remove;
        this.securityOpts = securityOpts;
        this.sessionId = sessionId;
        this.shmSize = shmSize;
        this.squash = squash;
        this.suppressOutput = suppressOutput;
        this.target = target;
        this.ulimits = ulimits;
        this.version = version;
    }

    public List<RegistryImageBuildAuthConfig> getAuthConfigs() {
        return this.authConfigs == null ? List.of() : this.authConfigs;
    }
    public Map<String,String> getBuildArgs() {
        return this.buildArgs == null ? Map.of() : this.buildArgs;
    }
    public Optional<String> getBuildId() {
        return Optional.ofNullable(this.buildId);
    }
    public List<String> getCacheFroms() {
        return this.cacheFroms == null ? List.of() : this.cacheFroms;
    }
    public Optional<String> getCgroupParent() {
        return Optional.ofNullable(this.cgroupParent);
    }
    public String getContext() {
        return this.context;
    }
    public Optional<Integer> getCpuPeriod() {
        return Optional.ofNullable(this.cpuPeriod);
    }
    public Optional<Integer> getCpuQuota() {
        return Optional.ofNullable(this.cpuQuota);
    }
    public Optional<String> getCpuSetCpus() {
        return Optional.ofNullable(this.cpuSetCpus);
    }
    public Optional<String> getCpuSetMems() {
        return Optional.ofNullable(this.cpuSetMems);
    }
    public Optional<Integer> getCpuShares() {
        return Optional.ofNullable(this.cpuShares);
    }
    public Optional<String> getDockerfile() {
        return Optional.ofNullable(this.dockerfile);
    }
    public List<String> getExtraHosts() {
        return this.extraHosts == null ? List.of() : this.extraHosts;
    }
    public Optional<Boolean> getForceRemove() {
        return Optional.ofNullable(this.forceRemove);
    }
    public Optional<String> getIsolation() {
        return Optional.ofNullable(this.isolation);
    }
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<Integer> getMemory() {
        return Optional.ofNullable(this.memory);
    }
    public Optional<Integer> getMemorySwap() {
        return Optional.ofNullable(this.memorySwap);
    }
    public Optional<String> getNetworkMode() {
        return Optional.ofNullable(this.networkMode);
    }
    public Optional<Boolean> getNoCache() {
        return Optional.ofNullable(this.noCache);
    }
    public Optional<String> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    public Optional<Boolean> getPullParent() {
        return Optional.ofNullable(this.pullParent);
    }
    public Optional<String> getRemoteContext() {
        return Optional.ofNullable(this.remoteContext);
    }
    public Optional<Boolean> getRemove() {
        return Optional.ofNullable(this.remove);
    }
    public List<String> getSecurityOpts() {
        return this.securityOpts == null ? List.of() : this.securityOpts;
    }
    public Optional<String> getSessionId() {
        return Optional.ofNullable(this.sessionId);
    }
    public Optional<Integer> getShmSize() {
        return Optional.ofNullable(this.shmSize);
    }
    public Optional<Boolean> getSquash() {
        return Optional.ofNullable(this.squash);
    }
    public Optional<Boolean> getSuppressOutput() {
        return Optional.ofNullable(this.suppressOutput);
    }
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    public List<RegistryImageBuildUlimit> getUlimits() {
        return this.ulimits == null ? List.of() : this.ulimits;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryImageBuild defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RegistryImageBuildAuthConfig> authConfigs;
        private @Nullable Map<String,String> buildArgs;
        private @Nullable String buildId;
        private @Nullable List<String> cacheFroms;
        private @Nullable String cgroupParent;
        private String context;
        private @Nullable Integer cpuPeriod;
        private @Nullable Integer cpuQuota;
        private @Nullable String cpuSetCpus;
        private @Nullable String cpuSetMems;
        private @Nullable Integer cpuShares;
        private @Nullable String dockerfile;
        private @Nullable List<String> extraHosts;
        private @Nullable Boolean forceRemove;
        private @Nullable String isolation;
        private @Nullable Map<String,String> labels;
        private @Nullable Integer memory;
        private @Nullable Integer memorySwap;
        private @Nullable String networkMode;
        private @Nullable Boolean noCache;
        private @Nullable String platform;
        private @Nullable Boolean pullParent;
        private @Nullable String remoteContext;
        private @Nullable Boolean remove;
        private @Nullable List<String> securityOpts;
        private @Nullable String sessionId;
        private @Nullable Integer shmSize;
        private @Nullable Boolean squash;
        private @Nullable Boolean suppressOutput;
        private @Nullable String target;
        private @Nullable List<RegistryImageBuildUlimit> ulimits;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryImageBuild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authConfigs = defaults.authConfigs;
    	      this.buildArgs = defaults.buildArgs;
    	      this.buildId = defaults.buildId;
    	      this.cacheFroms = defaults.cacheFroms;
    	      this.cgroupParent = defaults.cgroupParent;
    	      this.context = defaults.context;
    	      this.cpuPeriod = defaults.cpuPeriod;
    	      this.cpuQuota = defaults.cpuQuota;
    	      this.cpuSetCpus = defaults.cpuSetCpus;
    	      this.cpuSetMems = defaults.cpuSetMems;
    	      this.cpuShares = defaults.cpuShares;
    	      this.dockerfile = defaults.dockerfile;
    	      this.extraHosts = defaults.extraHosts;
    	      this.forceRemove = defaults.forceRemove;
    	      this.isolation = defaults.isolation;
    	      this.labels = defaults.labels;
    	      this.memory = defaults.memory;
    	      this.memorySwap = defaults.memorySwap;
    	      this.networkMode = defaults.networkMode;
    	      this.noCache = defaults.noCache;
    	      this.platform = defaults.platform;
    	      this.pullParent = defaults.pullParent;
    	      this.remoteContext = defaults.remoteContext;
    	      this.remove = defaults.remove;
    	      this.securityOpts = defaults.securityOpts;
    	      this.sessionId = defaults.sessionId;
    	      this.shmSize = defaults.shmSize;
    	      this.squash = defaults.squash;
    	      this.suppressOutput = defaults.suppressOutput;
    	      this.target = defaults.target;
    	      this.ulimits = defaults.ulimits;
    	      this.version = defaults.version;
        }

        public Builder setAuthConfigs(@Nullable List<RegistryImageBuildAuthConfig> authConfigs) {
            this.authConfigs = authConfigs;
            return this;
        }

        public Builder setBuildArgs(@Nullable Map<String,String> buildArgs) {
            this.buildArgs = buildArgs;
            return this;
        }

        public Builder setBuildId(@Nullable String buildId) {
            this.buildId = buildId;
            return this;
        }

        public Builder setCacheFroms(@Nullable List<String> cacheFroms) {
            this.cacheFroms = cacheFroms;
            return this;
        }

        public Builder setCgroupParent(@Nullable String cgroupParent) {
            this.cgroupParent = cgroupParent;
            return this;
        }

        public Builder setContext(String context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder setCpuPeriod(@Nullable Integer cpuPeriod) {
            this.cpuPeriod = cpuPeriod;
            return this;
        }

        public Builder setCpuQuota(@Nullable Integer cpuQuota) {
            this.cpuQuota = cpuQuota;
            return this;
        }

        public Builder setCpuSetCpus(@Nullable String cpuSetCpus) {
            this.cpuSetCpus = cpuSetCpus;
            return this;
        }

        public Builder setCpuSetMems(@Nullable String cpuSetMems) {
            this.cpuSetMems = cpuSetMems;
            return this;
        }

        public Builder setCpuShares(@Nullable Integer cpuShares) {
            this.cpuShares = cpuShares;
            return this;
        }

        public Builder setDockerfile(@Nullable String dockerfile) {
            this.dockerfile = dockerfile;
            return this;
        }

        public Builder setExtraHosts(@Nullable List<String> extraHosts) {
            this.extraHosts = extraHosts;
            return this;
        }

        public Builder setForceRemove(@Nullable Boolean forceRemove) {
            this.forceRemove = forceRemove;
            return this;
        }

        public Builder setIsolation(@Nullable String isolation) {
            this.isolation = isolation;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setMemory(@Nullable Integer memory) {
            this.memory = memory;
            return this;
        }

        public Builder setMemorySwap(@Nullable Integer memorySwap) {
            this.memorySwap = memorySwap;
            return this;
        }

        public Builder setNetworkMode(@Nullable String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        public Builder setNoCache(@Nullable Boolean noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder setPlatform(@Nullable String platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPullParent(@Nullable Boolean pullParent) {
            this.pullParent = pullParent;
            return this;
        }

        public Builder setRemoteContext(@Nullable String remoteContext) {
            this.remoteContext = remoteContext;
            return this;
        }

        public Builder setRemove(@Nullable Boolean remove) {
            this.remove = remove;
            return this;
        }

        public Builder setSecurityOpts(@Nullable List<String> securityOpts) {
            this.securityOpts = securityOpts;
            return this;
        }

        public Builder setSessionId(@Nullable String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder setShmSize(@Nullable Integer shmSize) {
            this.shmSize = shmSize;
            return this;
        }

        public Builder setSquash(@Nullable Boolean squash) {
            this.squash = squash;
            return this;
        }

        public Builder setSuppressOutput(@Nullable Boolean suppressOutput) {
            this.suppressOutput = suppressOutput;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setUlimits(@Nullable List<RegistryImageBuildUlimit> ulimits) {
            this.ulimits = ulimits;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public RegistryImageBuild build() {
            return new RegistryImageBuild(authConfigs, buildArgs, buildId, cacheFroms, cgroupParent, context, cpuPeriod, cpuQuota, cpuSetCpus, cpuSetMems, cpuShares, dockerfile, extraHosts, forceRemove, isolation, labels, memory, memorySwap, networkMode, noCache, platform, pullParent, remoteContext, remove, securityOpts, sessionId, shmSize, squash, suppressOutput, target, ulimits, version);
        }
    }
}
