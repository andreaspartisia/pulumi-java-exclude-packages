// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption settings for the cluster.
 * 
 */
public final class EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    @Import(name="gcePdKmsKeyName")
      private final @Nullable Output<String> gcePdKmsKeyName;

    public Output<String> gcePdKmsKeyName() {
        return this.gcePdKmsKeyName == null ? Codegen.empty() : this.gcePdKmsKeyName;
    }

    public EncryptionConfigArgs(@Nullable Output<String> gcePdKmsKeyName) {
        this.gcePdKmsKeyName = gcePdKmsKeyName;
    }

    private EncryptionConfigArgs() {
        this.gcePdKmsKeyName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gcePdKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcePdKmsKeyName = defaults.gcePdKmsKeyName;
        }

        public Builder gcePdKmsKeyName(@Nullable Output<String> gcePdKmsKeyName) {
            this.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }
        public Builder gcePdKmsKeyName(@Nullable String gcePdKmsKeyName) {
            this.gcePdKmsKeyName = Codegen.ofNullable(gcePdKmsKeyName);
            return this;
        }        public EncryptionConfigArgs build() {
            return new EncryptionConfigArgs(gcePdKmsKeyName);
        }
    }
}
