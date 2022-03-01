// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecSecretGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecSecretGetArgs Empty = new ServiceTaskSpecContainerSpecSecretGetArgs();

    @InputImport(name="fileGid")
      private final @Nullable Input<String> fileGid;

    public Input<String> getFileGid() {
        return this.fileGid == null ? Input.empty() : this.fileGid;
    }

    @InputImport(name="fileMode")
      private final @Nullable Input<Integer> fileMode;

    public Input<Integer> getFileMode() {
        return this.fileMode == null ? Input.empty() : this.fileMode;
    }

    @InputImport(name="fileName", required=true)
      private final Input<String> fileName;

    public Input<String> getFileName() {
        return this.fileName;
    }

    @InputImport(name="fileUid")
      private final @Nullable Input<String> fileUid;

    public Input<String> getFileUid() {
        return this.fileUid == null ? Input.empty() : this.fileUid;
    }

    @InputImport(name="secretId", required=true)
      private final Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId;
    }

    @InputImport(name="secretName")
      private final @Nullable Input<String> secretName;

    public Input<String> getSecretName() {
        return this.secretName == null ? Input.empty() : this.secretName;
    }

    public ServiceTaskSpecContainerSpecSecretGetArgs(
        @Nullable Input<String> fileGid,
        @Nullable Input<Integer> fileMode,
        Input<String> fileName,
        @Nullable Input<String> fileUid,
        Input<String> secretId,
        @Nullable Input<String> secretName) {
        this.fileGid = fileGid;
        this.fileMode = fileMode;
        this.fileName = Objects.requireNonNull(fileName, "expected parameter 'fileName' to be non-null");
        this.fileUid = fileUid;
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
        this.secretName = secretName;
    }

    private ServiceTaskSpecContainerSpecSecretGetArgs() {
        this.fileGid = Input.empty();
        this.fileMode = Input.empty();
        this.fileName = Input.empty();
        this.fileUid = Input.empty();
        this.secretId = Input.empty();
        this.secretName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecSecretGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fileGid;
        private @Nullable Input<Integer> fileMode;
        private Input<String> fileName;
        private @Nullable Input<String> fileUid;
        private Input<String> secretId;
        private @Nullable Input<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecSecretGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileGid = defaults.fileGid;
    	      this.fileMode = defaults.fileMode;
    	      this.fileName = defaults.fileName;
    	      this.fileUid = defaults.fileUid;
    	      this.secretId = defaults.secretId;
    	      this.secretName = defaults.secretName;
        }

        public Builder setFileGid(@Nullable Input<String> fileGid) {
            this.fileGid = fileGid;
            return this;
        }

        public Builder setFileGid(@Nullable String fileGid) {
            this.fileGid = Input.ofNullable(fileGid);
            return this;
        }

        public Builder setFileMode(@Nullable Input<Integer> fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        public Builder setFileMode(@Nullable Integer fileMode) {
            this.fileMode = Input.ofNullable(fileMode);
            return this;
        }

        public Builder setFileName(Input<String> fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder setFileName(String fileName) {
            this.fileName = Input.of(Objects.requireNonNull(fileName));
            return this;
        }

        public Builder setFileUid(@Nullable Input<String> fileUid) {
            this.fileUid = fileUid;
            return this;
        }

        public Builder setFileUid(@Nullable String fileUid) {
            this.fileUid = Input.ofNullable(fileUid);
            return this;
        }

        public Builder setSecretId(Input<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Input.of(Objects.requireNonNull(secretId));
            return this;
        }

        public Builder setSecretName(@Nullable Input<String> secretName) {
            this.secretName = secretName;
            return this;
        }

        public Builder setSecretName(@Nullable String secretName) {
            this.secretName = Input.ofNullable(secretName);
            return this;
        }
        public ServiceTaskSpecContainerSpecSecretGetArgs build() {
            return new ServiceTaskSpecContainerSpecSecretGetArgs(fileGid, fileMode, fileName, fileUid, secretId, secretName);
        }
    }
}
