// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationSaslGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationSaslGetArgs Empty = new ClusterClientAuthenticationSaslGetArgs();

    /**
     * Enables IAM client authentication. Defaults to `false`.
     * 
     */
    @InputImport(name="iam")
      private final @Nullable Input<Boolean> iam;

    public Input<Boolean> getIam() {
        return this.iam == null ? Input.empty() : this.iam;
    }

    /**
     * Enables SCRAM client authentication via AWS Secrets Manager. Defaults to `false`.
     * 
     */
    @InputImport(name="scram")
      private final @Nullable Input<Boolean> scram;

    public Input<Boolean> getScram() {
        return this.scram == null ? Input.empty() : this.scram;
    }

    public ClusterClientAuthenticationSaslGetArgs(
        @Nullable Input<Boolean> iam,
        @Nullable Input<Boolean> scram) {
        this.iam = iam;
        this.scram = scram;
    }

    private ClusterClientAuthenticationSaslGetArgs() {
        this.iam = Input.empty();
        this.scram = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationSaslGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> iam;
        private @Nullable Input<Boolean> scram;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthenticationSaslGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.scram = defaults.scram;
        }

        public Builder setIam(@Nullable Input<Boolean> iam) {
            this.iam = iam;
            return this;
        }

        public Builder setIam(@Nullable Boolean iam) {
            this.iam = Input.ofNullable(iam);
            return this;
        }

        public Builder setScram(@Nullable Input<Boolean> scram) {
            this.scram = scram;
            return this;
        }

        public Builder setScram(@Nullable Boolean scram) {
            this.scram = Input.ofNullable(scram);
            return this;
        }
        public ClusterClientAuthenticationSaslGetArgs build() {
            return new ClusterClientAuthenticationSaslGetArgs(iam, scram);
        }
    }
}