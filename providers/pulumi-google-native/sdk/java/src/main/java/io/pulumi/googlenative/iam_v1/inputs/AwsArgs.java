// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an Amazon Web Services identity provider.
 * 
 */
public final class AwsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsArgs Empty = new AwsArgs();

    /**
     * The AWS account ID.
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    public AwsArgs(Output<String> accountId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
    }

    private AwsArgs() {
        this.accountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }        public AwsArgs build() {
            return new AwsArgs(accountId);
        }
    }
}
