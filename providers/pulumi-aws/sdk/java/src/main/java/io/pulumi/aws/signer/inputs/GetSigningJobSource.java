// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.GetSigningJobSourceS3;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetSigningJobSource extends io.pulumi.resources.InvokeArgs {

    public static final GetSigningJobSource Empty = new GetSigningJobSource();

    @InputImport(name="s3s", required=true)
      private final List<GetSigningJobSourceS3> s3s;

    public List<GetSigningJobSourceS3> getS3s() {
        return this.s3s;
    }

    public GetSigningJobSource(List<GetSigningJobSourceS3> s3s) {
        this.s3s = Objects.requireNonNull(s3s, "expected parameter 's3s' to be non-null");
    }

    private GetSigningJobSource() {
        this.s3s = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSigningJobSourceS3> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder setS3s(List<GetSigningJobSourceS3> s3s) {
            this.s3s = Objects.requireNonNull(s3s);
            return this;
        }
        public GetSigningJobSource build() {
            return new GetSigningJobSource(s3s);
        }
    }
}