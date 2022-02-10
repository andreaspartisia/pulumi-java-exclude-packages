// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FileReferenceResponse {
    private final String gcsPath;

    @OutputCustomType.Constructor({"gcsPath"})
    private FileReferenceResponse(String gcsPath) {
        this.gcsPath = Objects.requireNonNull(gcsPath);
    }

    public String getGcsPath() {
        return this.gcsPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
        }

        public Builder setGcsPath(String gcsPath) {
            this.gcsPath = Objects.requireNonNull(gcsPath);
            return this;
        }

        public FileReferenceResponse build() {
            return new FileReferenceResponse(gcsPath);
        }
    }
}