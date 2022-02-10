// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.artifactregistry_v1.outputs.MavenRepositoryConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRepositoryResult {
    private final String createTime;
    private final String description;
    private final String format;
    private final String kmsKeyName;
    private final Map<String,String> labels;
    private final MavenRepositoryConfigResponse mavenConfig;
    private final String name;
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","format","kmsKeyName","labels","mavenConfig","name","updateTime"})
    private GetRepositoryResult(
        String createTime,
        String description,
        String format,
        String kmsKeyName,
        Map<String,String> labels,
        MavenRepositoryConfigResponse mavenConfig,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.format = Objects.requireNonNull(format);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.labels = Objects.requireNonNull(labels);
        this.mavenConfig = Objects.requireNonNull(mavenConfig);
        this.name = Objects.requireNonNull(name);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getDescription() {
        return this.description;
    }
    public String getFormat() {
        return this.format;
    }
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public MavenRepositoryConfigResponse getMavenConfig() {
        return this.mavenConfig;
    }
    public String getName() {
        return this.name;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String format;
        private String kmsKeyName;
        private Map<String,String> labels;
        private MavenRepositoryConfigResponse mavenConfig;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.mavenConfig = defaults.mavenConfig;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMavenConfig(MavenRepositoryConfigResponse mavenConfig) {
            this.mavenConfig = Objects.requireNonNull(mavenConfig);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetRepositoryResult build() {
            return new GetRepositoryResult(createTime, description, format, kmsKeyName, labels, mavenConfig, name, updateTime);
        }
    }
}