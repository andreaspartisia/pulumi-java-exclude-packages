// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class InventoryDestinationBucketEncryptionSseS3 {
    @OutputCustomType.Constructor
    private InventoryDestinationBucketEncryptionSseS3() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryptionSseS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationBucketEncryptionSseS3 defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public InventoryDestinationBucketEncryptionSseS3 build() {
            return new InventoryDestinationBucketEncryptionSseS3();
        }
    }
}