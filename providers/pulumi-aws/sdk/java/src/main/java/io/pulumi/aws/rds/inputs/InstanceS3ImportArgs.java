// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceS3ImportArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceS3ImportArgs Empty = new InstanceS3ImportArgs();

    /**
     * The bucket name where your backup is stored
     * 
     */
    @InputImport(name="bucketName", required=true)
      private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * Can be blank, but is the path to your backup
     * 
     */
    @InputImport(name="bucketPrefix")
      private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    /**
     * Role applied to load the data.
     * 
     */
    @InputImport(name="ingestionRole", required=true)
      private final Input<String> ingestionRole;

    public Input<String> getIngestionRole() {
        return this.ingestionRole;
    }

    /**
     * Source engine for the backup
     * 
     */
    @InputImport(name="sourceEngine", required=true)
      private final Input<String> sourceEngine;

    public Input<String> getSourceEngine() {
        return this.sourceEngine;
    }

    /**
     * Version of the source engine used to make the backup
     * 
     */
    @InputImport(name="sourceEngineVersion", required=true)
      private final Input<String> sourceEngineVersion;

    public Input<String> getSourceEngineVersion() {
        return this.sourceEngineVersion;
    }

    public InstanceS3ImportArgs(
        Input<String> bucketName,
        @Nullable Input<String> bucketPrefix,
        Input<String> ingestionRole,
        Input<String> sourceEngine,
        Input<String> sourceEngineVersion) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.ingestionRole = Objects.requireNonNull(ingestionRole, "expected parameter 'ingestionRole' to be non-null");
        this.sourceEngine = Objects.requireNonNull(sourceEngine, "expected parameter 'sourceEngine' to be non-null");
        this.sourceEngineVersion = Objects.requireNonNull(sourceEngineVersion, "expected parameter 'sourceEngineVersion' to be non-null");
    }

    private InstanceS3ImportArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.ingestionRole = Input.empty();
        this.sourceEngine = Input.empty();
        this.sourceEngineVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceS3ImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private @Nullable Input<String> bucketPrefix;
        private Input<String> ingestionRole;
        private Input<String> sourceEngine;
        private Input<String> sourceEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceS3ImportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.ingestionRole = defaults.ingestionRole;
    	      this.sourceEngine = defaults.sourceEngine;
    	      this.sourceEngineVersion = defaults.sourceEngineVersion;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setIngestionRole(Input<String> ingestionRole) {
            this.ingestionRole = Objects.requireNonNull(ingestionRole);
            return this;
        }

        public Builder setIngestionRole(String ingestionRole) {
            this.ingestionRole = Input.of(Objects.requireNonNull(ingestionRole));
            return this;
        }

        public Builder setSourceEngine(Input<String> sourceEngine) {
            this.sourceEngine = Objects.requireNonNull(sourceEngine);
            return this;
        }

        public Builder setSourceEngine(String sourceEngine) {
            this.sourceEngine = Input.of(Objects.requireNonNull(sourceEngine));
            return this;
        }

        public Builder setSourceEngineVersion(Input<String> sourceEngineVersion) {
            this.sourceEngineVersion = Objects.requireNonNull(sourceEngineVersion);
            return this;
        }

        public Builder setSourceEngineVersion(String sourceEngineVersion) {
            this.sourceEngineVersion = Input.of(Objects.requireNonNull(sourceEngineVersion));
            return this;
        }
        public InstanceS3ImportArgs build() {
            return new InstanceS3ImportArgs(bucketName, bucketPrefix, ingestionRole, sourceEngine, sourceEngineVersion);
        }
    }
}