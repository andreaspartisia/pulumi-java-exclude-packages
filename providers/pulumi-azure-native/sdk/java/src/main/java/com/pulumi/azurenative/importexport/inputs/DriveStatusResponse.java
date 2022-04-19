// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides information about the drive's status
 * 
 */
public final class DriveStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final DriveStatusResponse Empty = new DriveStatusResponse();

    /**
     * The BitLocker key used to encrypt the drive.
     * 
     */
    @Import(name="bitLockerKey")
      private final @Nullable String bitLockerKey;

    public Optional<String> bitLockerKey() {
        return this.bitLockerKey == null ? Optional.empty() : Optional.ofNullable(this.bitLockerKey);
    }

    /**
     * Bytes successfully transferred for the drive.
     * 
     */
    @Import(name="bytesSucceeded")
      private final @Nullable Double bytesSucceeded;

    public Optional<Double> bytesSucceeded() {
        return this.bytesSucceeded == null ? Optional.empty() : Optional.ofNullable(this.bytesSucceeded);
    }

    /**
     * Detailed status about the data transfer process. This field is not returned in the response until the drive is in the Transferring state.
     * 
     */
    @Import(name="copyStatus")
      private final @Nullable String copyStatus;

    public Optional<String> copyStatus() {
        return this.copyStatus == null ? Optional.empty() : Optional.ofNullable(this.copyStatus);
    }

    /**
     * The drive header hash value.
     * 
     */
    @Import(name="driveHeaderHash")
      private final @Nullable String driveHeaderHash;

    public Optional<String> driveHeaderHash() {
        return this.driveHeaderHash == null ? Optional.empty() : Optional.ofNullable(this.driveHeaderHash);
    }

    /**
     * The drive's hardware serial number, without spaces.
     * 
     */
    @Import(name="driveId")
      private final @Nullable String driveId;

    public Optional<String> driveId() {
        return this.driveId == null ? Optional.empty() : Optional.ofNullable(this.driveId);
    }

    /**
     * A URI that points to the blob containing the error log for the data transfer operation.
     * 
     */
    @Import(name="errorLogUri")
      private final @Nullable String errorLogUri;

    public Optional<String> errorLogUri() {
        return this.errorLogUri == null ? Optional.empty() : Optional.ofNullable(this.errorLogUri);
    }

    /**
     * The relative path of the manifest file on the drive.
     * 
     */
    @Import(name="manifestFile")
      private final @Nullable String manifestFile;

    public Optional<String> manifestFile() {
        return this.manifestFile == null ? Optional.empty() : Optional.ofNullable(this.manifestFile);
    }

    /**
     * The Base16-encoded MD5 hash of the manifest file on the drive.
     * 
     */
    @Import(name="manifestHash")
      private final @Nullable String manifestHash;

    public Optional<String> manifestHash() {
        return this.manifestHash == null ? Optional.empty() : Optional.ofNullable(this.manifestHash);
    }

    /**
     * A URI that points to the blob containing the drive manifest file.
     * 
     */
    @Import(name="manifestUri")
      private final @Nullable String manifestUri;

    public Optional<String> manifestUri() {
        return this.manifestUri == null ? Optional.empty() : Optional.ofNullable(this.manifestUri);
    }

    /**
     * Percentage completed for the drive.
     * 
     */
    @Import(name="percentComplete")
      private final @Nullable Integer percentComplete;

    public Optional<Integer> percentComplete() {
        return this.percentComplete == null ? Optional.empty() : Optional.ofNullable(this.percentComplete);
    }

    /**
     * The drive's current state.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * A URI that points to the blob containing the verbose log for the data transfer operation.
     * 
     */
    @Import(name="verboseLogUri")
      private final @Nullable String verboseLogUri;

    public Optional<String> verboseLogUri() {
        return this.verboseLogUri == null ? Optional.empty() : Optional.ofNullable(this.verboseLogUri);
    }

    public DriveStatusResponse(
        @Nullable String bitLockerKey,
        @Nullable Double bytesSucceeded,
        @Nullable String copyStatus,
        @Nullable String driveHeaderHash,
        @Nullable String driveId,
        @Nullable String errorLogUri,
        @Nullable String manifestFile,
        @Nullable String manifestHash,
        @Nullable String manifestUri,
        @Nullable Integer percentComplete,
        @Nullable String state,
        @Nullable String verboseLogUri) {
        this.bitLockerKey = bitLockerKey;
        this.bytesSucceeded = bytesSucceeded;
        this.copyStatus = copyStatus;
        this.driveHeaderHash = driveHeaderHash;
        this.driveId = driveId;
        this.errorLogUri = errorLogUri;
        this.manifestFile = manifestFile;
        this.manifestHash = manifestHash;
        this.manifestUri = manifestUri;
        this.percentComplete = percentComplete;
        this.state = Codegen.stringProp("state").arg(state).def("Specified").getNullable();
        this.verboseLogUri = verboseLogUri;
    }

    private DriveStatusResponse() {
        this.bitLockerKey = null;
        this.bytesSucceeded = null;
        this.copyStatus = null;
        this.driveHeaderHash = null;
        this.driveId = null;
        this.errorLogUri = null;
        this.manifestFile = null;
        this.manifestHash = null;
        this.manifestUri = null;
        this.percentComplete = null;
        this.state = null;
        this.verboseLogUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DriveStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitLockerKey;
        private @Nullable Double bytesSucceeded;
        private @Nullable String copyStatus;
        private @Nullable String driveHeaderHash;
        private @Nullable String driveId;
        private @Nullable String errorLogUri;
        private @Nullable String manifestFile;
        private @Nullable String manifestHash;
        private @Nullable String manifestUri;
        private @Nullable Integer percentComplete;
        private @Nullable String state;
        private @Nullable String verboseLogUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DriveStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitLockerKey = defaults.bitLockerKey;
    	      this.bytesSucceeded = defaults.bytesSucceeded;
    	      this.copyStatus = defaults.copyStatus;
    	      this.driveHeaderHash = defaults.driveHeaderHash;
    	      this.driveId = defaults.driveId;
    	      this.errorLogUri = defaults.errorLogUri;
    	      this.manifestFile = defaults.manifestFile;
    	      this.manifestHash = defaults.manifestHash;
    	      this.manifestUri = defaults.manifestUri;
    	      this.percentComplete = defaults.percentComplete;
    	      this.state = defaults.state;
    	      this.verboseLogUri = defaults.verboseLogUri;
        }

        public Builder bitLockerKey(@Nullable String bitLockerKey) {
            this.bitLockerKey = bitLockerKey;
            return this;
        }
        public Builder bytesSucceeded(@Nullable Double bytesSucceeded) {
            this.bytesSucceeded = bytesSucceeded;
            return this;
        }
        public Builder copyStatus(@Nullable String copyStatus) {
            this.copyStatus = copyStatus;
            return this;
        }
        public Builder driveHeaderHash(@Nullable String driveHeaderHash) {
            this.driveHeaderHash = driveHeaderHash;
            return this;
        }
        public Builder driveId(@Nullable String driveId) {
            this.driveId = driveId;
            return this;
        }
        public Builder errorLogUri(@Nullable String errorLogUri) {
            this.errorLogUri = errorLogUri;
            return this;
        }
        public Builder manifestFile(@Nullable String manifestFile) {
            this.manifestFile = manifestFile;
            return this;
        }
        public Builder manifestHash(@Nullable String manifestHash) {
            this.manifestHash = manifestHash;
            return this;
        }
        public Builder manifestUri(@Nullable String manifestUri) {
            this.manifestUri = manifestUri;
            return this;
        }
        public Builder percentComplete(@Nullable Integer percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder verboseLogUri(@Nullable String verboseLogUri) {
            this.verboseLogUri = verboseLogUri;
            return this;
        }        public DriveStatusResponse build() {
            return new DriveStatusResponse(bitLockerKey, bytesSucceeded, copyStatus, driveHeaderHash, driveId, errorLogUri, manifestFile, manifestHash, manifestUri, percentComplete, state, verboseLogUri);
        }
    }
}
