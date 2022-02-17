// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketAccessControlTranslation {
    private final String owner;

    @OutputCustomType.Constructor({"owner"})
    private BucketAccessControlTranslation(String owner) {
        this.owner = Objects.requireNonNull(owner);
    }

    public String getOwner() {
        return this.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlTranslation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlTranslation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
        }

        public Builder setOwner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public BucketAccessControlTranslation build() {
            return new BucketAccessControlTranslation(owner);
        }
    }
}