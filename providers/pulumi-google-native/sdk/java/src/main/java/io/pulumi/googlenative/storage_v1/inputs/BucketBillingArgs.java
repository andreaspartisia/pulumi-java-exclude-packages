// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket's billing configuration.
 * 
 */
public final class BucketBillingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketBillingArgs Empty = new BucketBillingArgs();

    /**
     * When set to true, Requester Pays is enabled for this bucket.
     * 
     */
    @Import(name="requesterPays")
      private final @Nullable Output<Boolean> requesterPays;

    public Output<Boolean> requesterPays() {
        return this.requesterPays == null ? Codegen.empty() : this.requesterPays;
    }

    public BucketBillingArgs(@Nullable Output<Boolean> requesterPays) {
        this.requesterPays = requesterPays;
    }

    private BucketBillingArgs() {
        this.requesterPays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketBillingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> requesterPays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketBillingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requesterPays = defaults.requesterPays;
        }

        public Builder requesterPays(@Nullable Output<Boolean> requesterPays) {
            this.requesterPays = requesterPays;
            return this;
        }
        public Builder requesterPays(@Nullable Boolean requesterPays) {
            this.requesterPays = Codegen.ofNullable(requesterPays);
            return this;
        }        public BucketBillingArgs build() {
            return new BucketBillingArgs(requesterPays);
        }
    }
}
