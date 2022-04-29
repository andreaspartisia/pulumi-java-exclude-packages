// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ResourceManager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStackConfigSource {
    private final String configSourceType;
    private final String workingDirectory;
    private final String zipFileBase64encoded;

    @CustomType.Constructor
    private GetStackConfigSource(
        @CustomType.Parameter("configSourceType") String configSourceType,
        @CustomType.Parameter("workingDirectory") String workingDirectory,
        @CustomType.Parameter("zipFileBase64encoded") String zipFileBase64encoded) {
        this.configSourceType = configSourceType;
        this.workingDirectory = workingDirectory;
        this.zipFileBase64encoded = zipFileBase64encoded;
    }

    public String configSourceType() {
        return this.configSourceType;
    }
    public String workingDirectory() {
        return this.workingDirectory;
    }
    public String zipFileBase64encoded() {
        return this.zipFileBase64encoded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStackConfigSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configSourceType;
        private String workingDirectory;
        private String zipFileBase64encoded;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStackConfigSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configSourceType = defaults.configSourceType;
    	      this.workingDirectory = defaults.workingDirectory;
    	      this.zipFileBase64encoded = defaults.zipFileBase64encoded;
        }

        public Builder configSourceType(String configSourceType) {
            this.configSourceType = Objects.requireNonNull(configSourceType);
            return this;
        }
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = Objects.requireNonNull(workingDirectory);
            return this;
        }
        public Builder zipFileBase64encoded(String zipFileBase64encoded) {
            this.zipFileBase64encoded = Objects.requireNonNull(zipFileBase64encoded);
            return this;
        }        public GetStackConfigSource build() {
            return new GetStackConfigSource(configSourceType, workingDirectory, zipFileBase64encoded);
        }
    }
}
