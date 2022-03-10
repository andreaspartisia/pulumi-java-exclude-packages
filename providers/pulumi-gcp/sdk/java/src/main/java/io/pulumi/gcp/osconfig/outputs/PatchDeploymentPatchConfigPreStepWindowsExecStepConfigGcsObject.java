// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObject {
    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    private final String bucket;
    /**
     * Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    private final String generationNumber;
    /**
     * Name of the Cloud Storage object.
     * 
     */
    private final String object;

    @OutputCustomType.Constructor
    private PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObject(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("generationNumber") String generationNumber,
        @OutputCustomType.Parameter("object") String object) {
        this.bucket = bucket;
        this.generationNumber = generationNumber;
        this.object = object;
    }

    /**
     * Bucket of the Cloud Storage object.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
    */
    public String getGenerationNumber() {
        return this.generationNumber;
    }
    /**
     * Name of the Cloud Storage object.
     * 
    */
    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generationNumber;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generationNumber = defaults.generationNumber;
    	      this.object = defaults.object;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGenerationNumber(String generationNumber) {
            this.generationNumber = Objects.requireNonNull(generationNumber);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObject build() {
            return new PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObject(bucket, generationNumber, object);
        }
    }
}
