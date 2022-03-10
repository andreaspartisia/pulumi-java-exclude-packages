// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTaskSpecContainerSpecSecret {
    private final @Nullable String fileGid;
    private final @Nullable Integer fileMode;
    private final String fileName;
    private final @Nullable String fileUid;
    private final String secretId;
    private final @Nullable String secretName;

    @OutputCustomType.Constructor
    private ServiceTaskSpecContainerSpecSecret(
        @OutputCustomType.Parameter("fileGid") @Nullable String fileGid,
        @OutputCustomType.Parameter("fileMode") @Nullable Integer fileMode,
        @OutputCustomType.Parameter("fileName") String fileName,
        @OutputCustomType.Parameter("fileUid") @Nullable String fileUid,
        @OutputCustomType.Parameter("secretId") String secretId,
        @OutputCustomType.Parameter("secretName") @Nullable String secretName) {
        this.fileGid = fileGid;
        this.fileMode = fileMode;
        this.fileName = fileName;
        this.fileUid = fileUid;
        this.secretId = secretId;
        this.secretName = secretName;
    }

    public Optional<String> getFileGid() {
        return Optional.ofNullable(this.fileGid);
    }
    public Optional<Integer> getFileMode() {
        return Optional.ofNullable(this.fileMode);
    }
    public String getFileName() {
        return this.fileName;
    }
    public Optional<String> getFileUid() {
        return Optional.ofNullable(this.fileUid);
    }
    public String getSecretId() {
        return this.secretId;
    }
    public Optional<String> getSecretName() {
        return Optional.ofNullable(this.secretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fileGid;
        private @Nullable Integer fileMode;
        private String fileName;
        private @Nullable String fileUid;
        private String secretId;
        private @Nullable String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileGid = defaults.fileGid;
    	      this.fileMode = defaults.fileMode;
    	      this.fileName = defaults.fileName;
    	      this.fileUid = defaults.fileUid;
    	      this.secretId = defaults.secretId;
    	      this.secretName = defaults.secretName;
        }

        public Builder setFileGid(@Nullable String fileGid) {
            this.fileGid = fileGid;
            return this;
        }

        public Builder setFileMode(@Nullable Integer fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        public Builder setFileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder setFileUid(@Nullable String fileUid) {
            this.fileUid = fileUid;
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder setSecretName(@Nullable String secretName) {
            this.secretName = secretName;
            return this;
        }
        public ServiceTaskSpecContainerSpecSecret build() {
            return new ServiceTaskSpecContainerSpecSecret(fileGid, fileMode, fileName, fileUid, secretId, secretName);
        }
    }
}