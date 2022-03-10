// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionTrustedSignerItemGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionTrustedSignerItemGetArgs Empty = new DistributionTrustedSignerItemGetArgs();

    /**
     * AWS account ID or `self`
     * 
     */
    @InputImport(name="awsAccountNumber")
      private final @Nullable Input<String> awsAccountNumber;

    public Input<String> getAwsAccountNumber() {
        return this.awsAccountNumber == null ? Input.empty() : this.awsAccountNumber;
    }

    /**
     * Set of active CloudFront key pairs associated with the signer account
     * 
     */
    @InputImport(name="keyPairIds")
      private final @Nullable Input<List<String>> keyPairIds;

    public Input<List<String>> getKeyPairIds() {
        return this.keyPairIds == null ? Input.empty() : this.keyPairIds;
    }

    public DistributionTrustedSignerItemGetArgs(
        @Nullable Input<String> awsAccountNumber,
        @Nullable Input<List<String>> keyPairIds) {
        this.awsAccountNumber = awsAccountNumber;
        this.keyPairIds = keyPairIds;
    }

    private DistributionTrustedSignerItemGetArgs() {
        this.awsAccountNumber = Input.empty();
        this.keyPairIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedSignerItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsAccountNumber;
        private @Nullable Input<List<String>> keyPairIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedSignerItemGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountNumber = defaults.awsAccountNumber;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        public Builder setAwsAccountNumber(@Nullable Input<String> awsAccountNumber) {
            this.awsAccountNumber = awsAccountNumber;
            return this;
        }

        public Builder setAwsAccountNumber(@Nullable String awsAccountNumber) {
            this.awsAccountNumber = Input.ofNullable(awsAccountNumber);
            return this;
        }

        public Builder setKeyPairIds(@Nullable Input<List<String>> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }

        public Builder setKeyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = Input.ofNullable(keyPairIds);
            return this;
        }
        public DistributionTrustedSignerItemGetArgs build() {
            return new DistributionTrustedSignerItemGetArgs(awsAccountNumber, keyPairIds);
        }
    }
}