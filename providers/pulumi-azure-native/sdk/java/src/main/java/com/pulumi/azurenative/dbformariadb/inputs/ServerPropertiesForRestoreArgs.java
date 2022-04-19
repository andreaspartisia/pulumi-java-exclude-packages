// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.inputs;

import com.pulumi.azurenative.dbformariadb.enums.MinimalTlsVersionEnum;
import com.pulumi.azurenative.dbformariadb.enums.PublicNetworkAccessEnum;
import com.pulumi.azurenative.dbformariadb.enums.ServerVersion;
import com.pulumi.azurenative.dbformariadb.enums.SslEnforcementEnum;
import com.pulumi.azurenative.dbformariadb.inputs.StorageProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties used to create a new server by restoring from a backup.
 * 
 */
public final class ServerPropertiesForRestoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForRestoreArgs Empty = new ServerPropertiesForRestoreArgs();

    /**
     * The mode to create a new server.
     * Expected value is 'PointInTimeRestore'.
     * 
     */
    @Import(name="createMode", required=true)
      private final Output<String> createMode;

    public Output<String> createMode() {
        return this.createMode;
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Import(name="minimalTlsVersion")
      private final @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    public Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion() {
        return this.minimalTlsVersion == null ? Codegen.empty() : this.minimalTlsVersion;
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * Restore point creation time (ISO8601 format), specifying the time to restore from.
     * 
     */
    @Import(name="restorePointInTime", required=true)
      private final Output<String> restorePointInTime;

    public Output<String> restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * The source server id to restore from.
     * 
     */
    @Import(name="sourceServerId", required=true)
      private final Output<String> sourceServerId;

    public Output<String> sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Import(name="sslEnforcement")
      private final @Nullable Output<SslEnforcementEnum> sslEnforcement;

    public Output<SslEnforcementEnum> sslEnforcement() {
        return this.sslEnforcement == null ? Codegen.empty() : this.sslEnforcement;
    }

    /**
     * Storage profile of a server.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> storageProfile() {
        return this.storageProfile == null ? Codegen.empty() : this.storageProfile;
    }

    /**
     * Server version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Either<String,ServerVersion>> version;

    public Output<Either<String,ServerVersion>> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ServerPropertiesForRestoreArgs(
        Output<String> createMode,
        @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion,
        @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess,
        Output<String> restorePointInTime,
        Output<String> sourceServerId,
        @Nullable Output<SslEnforcementEnum> sslEnforcement,
        @Nullable Output<StorageProfileArgs> storageProfile,
        @Nullable Output<Either<String,ServerVersion>> version) {
        this.createMode = Codegen.stringProp("createMode").output().arg(createMode).require();
        this.minimalTlsVersion = minimalTlsVersion;
        this.publicNetworkAccess = publicNetworkAccess;
        this.restorePointInTime = Objects.requireNonNull(restorePointInTime, "expected parameter 'restorePointInTime' to be non-null");
        this.sourceServerId = Objects.requireNonNull(sourceServerId, "expected parameter 'sourceServerId' to be non-null");
        this.sslEnforcement = sslEnforcement;
        this.storageProfile = storageProfile;
        this.version = version;
    }

    private ServerPropertiesForRestoreArgs() {
        this.createMode = Codegen.empty();
        this.minimalTlsVersion = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.restorePointInTime = Codegen.empty();
        this.sourceServerId = Codegen.empty();
        this.sslEnforcement = Codegen.empty();
        this.storageProfile = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPropertiesForRestoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> createMode;
        private @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;
        private @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;
        private Output<String> restorePointInTime;
        private Output<String> sourceServerId;
        private @Nullable Output<SslEnforcementEnum> sslEnforcement;
        private @Nullable Output<StorageProfileArgs> storageProfile;
        private @Nullable Output<Either<String,ServerVersion>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPropertiesForRestoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMode = defaults.createMode;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sourceServerId = defaults.sourceServerId;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfile = defaults.storageProfile;
    	      this.version = defaults.version;
        }

        public Builder createMode(Output<String> createMode) {
            this.createMode = Objects.requireNonNull(createMode);
            return this;
        }
        public Builder createMode(String createMode) {
            this.createMode = Output.of(Objects.requireNonNull(createMode));
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            this.minimalTlsVersion = Codegen.ofNullable(minimalTlsVersion);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder restorePointInTime(Output<String> restorePointInTime) {
            this.restorePointInTime = Objects.requireNonNull(restorePointInTime);
            return this;
        }
        public Builder restorePointInTime(String restorePointInTime) {
            this.restorePointInTime = Output.of(Objects.requireNonNull(restorePointInTime));
            return this;
        }
        public Builder sourceServerId(Output<String> sourceServerId) {
            this.sourceServerId = Objects.requireNonNull(sourceServerId);
            return this;
        }
        public Builder sourceServerId(String sourceServerId) {
            this.sourceServerId = Output.of(Objects.requireNonNull(sourceServerId));
            return this;
        }
        public Builder sslEnforcement(@Nullable Output<SslEnforcementEnum> sslEnforcement) {
            this.sslEnforcement = sslEnforcement;
            return this;
        }
        public Builder sslEnforcement(@Nullable SslEnforcementEnum sslEnforcement) {
            this.sslEnforcement = Codegen.ofNullable(sslEnforcement);
            return this;
        }
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Codegen.ofNullable(storageProfile);
            return this;
        }
        public Builder version(@Nullable Output<Either<String,ServerVersion>> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Either<String,ServerVersion> version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ServerPropertiesForRestoreArgs build() {
            return new ServerPropertiesForRestoreArgs(createMode, minimalTlsVersion, publicNetworkAccess, restorePointInTime, sourceServerId, sslEnforcement, storageProfile, version);
        }
    }
}
