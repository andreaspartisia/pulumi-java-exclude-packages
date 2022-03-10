// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTemplateDiskDiskEncryptionKey {
    /**
     * The self link of the encryption key that is stored in Google Cloud KMS
     * 
     */
    private final String kmsKeySelfLink;

    @OutputCustomType.Constructor
    private GetInstanceTemplateDiskDiskEncryptionKey(@OutputCustomType.Parameter("kmsKeySelfLink") String kmsKeySelfLink) {
        this.kmsKeySelfLink = kmsKeySelfLink;
    }

    /**
     * The self link of the encryption key that is stored in Google Cloud KMS
     * 
    */
    public String getKmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateDiskDiskEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeySelfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateDiskDiskEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
        }

        public Builder setKmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }
        public GetInstanceTemplateDiskDiskEncryptionKey build() {
            return new GetInstanceTemplateDiskDiskEncryptionKey(kmsKeySelfLink);
        }
    }
}
