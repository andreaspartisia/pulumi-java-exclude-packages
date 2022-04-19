// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.PersistentDiskArgs;
import com.pulumi.azurenative.appplatform.inputs.TemporaryDiskArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * App resource properties payload
 * 
 */
public final class AppResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppResourcePropertiesArgs Empty = new AppResourcePropertiesArgs();

    /**
     * Name of the active deployment of the App
     * 
     */
    @Import(name="activeDeploymentName")
      private final @Nullable Output<String> activeDeploymentName;

    public Output<String> activeDeploymentName() {
        return this.activeDeploymentName == null ? Codegen.empty() : this.activeDeploymentName;
    }

    /**
     * Fully qualified dns Name.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> fqdn() {
        return this.fqdn == null ? Codegen.empty() : this.fqdn;
    }

    /**
     * Indicate if only https is allowed.
     * 
     */
    @Import(name="httpsOnly")
      private final @Nullable Output<Boolean> httpsOnly;

    public Output<Boolean> httpsOnly() {
        return this.httpsOnly == null ? Codegen.empty() : this.httpsOnly;
    }

    /**
     * Persistent disk settings
     * 
     */
    @Import(name="persistentDisk")
      private final @Nullable Output<PersistentDiskArgs> persistentDisk;

    public Output<PersistentDiskArgs> persistentDisk() {
        return this.persistentDisk == null ? Codegen.empty() : this.persistentDisk;
    }

    /**
     * Indicates whether the App exposes public endpoint
     * 
     */
    @Import(name="public")
      private final @Nullable Output<Boolean> public_;

    public Output<Boolean> public_() {
        return this.public_ == null ? Codegen.empty() : this.public_;
    }

    /**
     * Temporary disk settings
     * 
     */
    @Import(name="temporaryDisk")
      private final @Nullable Output<TemporaryDiskArgs> temporaryDisk;

    public Output<TemporaryDiskArgs> temporaryDisk() {
        return this.temporaryDisk == null ? Codegen.empty() : this.temporaryDisk;
    }

    public AppResourcePropertiesArgs(
        @Nullable Output<String> activeDeploymentName,
        @Nullable Output<String> fqdn,
        @Nullable Output<Boolean> httpsOnly,
        @Nullable Output<PersistentDiskArgs> persistentDisk,
        @Nullable Output<Boolean> public_,
        @Nullable Output<TemporaryDiskArgs> temporaryDisk) {
        this.activeDeploymentName = activeDeploymentName;
        this.fqdn = fqdn;
        this.httpsOnly = Codegen.booleanProp("httpsOnly").output().arg(httpsOnly).def(false).getNullable();
        this.persistentDisk = persistentDisk;
        this.public_ = public_;
        this.temporaryDisk = temporaryDisk;
    }

    private AppResourcePropertiesArgs() {
        this.activeDeploymentName = Codegen.empty();
        this.fqdn = Codegen.empty();
        this.httpsOnly = Codegen.empty();
        this.persistentDisk = Codegen.empty();
        this.public_ = Codegen.empty();
        this.temporaryDisk = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDeploymentName;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<Boolean> httpsOnly;
        private @Nullable Output<PersistentDiskArgs> persistentDisk;
        private @Nullable Output<Boolean> public_;
        private @Nullable Output<TemporaryDiskArgs> temporaryDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(AppResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeploymentName = defaults.activeDeploymentName;
    	      this.fqdn = defaults.fqdn;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.persistentDisk = defaults.persistentDisk;
    	      this.public_ = defaults.public_;
    	      this.temporaryDisk = defaults.temporaryDisk;
        }

        public Builder activeDeploymentName(@Nullable Output<String> activeDeploymentName) {
            this.activeDeploymentName = activeDeploymentName;
            return this;
        }
        public Builder activeDeploymentName(@Nullable String activeDeploymentName) {
            this.activeDeploymentName = Codegen.ofNullable(activeDeploymentName);
            return this;
        }
        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Codegen.ofNullable(fqdn);
            return this;
        }
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = Codegen.ofNullable(httpsOnly);
            return this;
        }
        public Builder persistentDisk(@Nullable Output<PersistentDiskArgs> persistentDisk) {
            this.persistentDisk = persistentDisk;
            return this;
        }
        public Builder persistentDisk(@Nullable PersistentDiskArgs persistentDisk) {
            this.persistentDisk = Codegen.ofNullable(persistentDisk);
            return this;
        }
        public Builder public_(@Nullable Output<Boolean> public_) {
            this.public_ = public_;
            return this;
        }
        public Builder public_(@Nullable Boolean public_) {
            this.public_ = Codegen.ofNullable(public_);
            return this;
        }
        public Builder temporaryDisk(@Nullable Output<TemporaryDiskArgs> temporaryDisk) {
            this.temporaryDisk = temporaryDisk;
            return this;
        }
        public Builder temporaryDisk(@Nullable TemporaryDiskArgs temporaryDisk) {
            this.temporaryDisk = Codegen.ofNullable(temporaryDisk);
            return this;
        }        public AppResourcePropertiesArgs build() {
            return new AppResourcePropertiesArgs(activeDeploymentName, fqdn, httpsOnly, persistentDisk, public_, temporaryDisk);
        }
    }
}
