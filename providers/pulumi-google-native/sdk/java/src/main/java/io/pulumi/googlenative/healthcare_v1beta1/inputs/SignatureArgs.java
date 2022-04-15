// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.ImageArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User signature.
 * 
 */
public final class SignatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignatureArgs Empty = new SignatureArgs();

    /**
     * Optional. An image of the user's signature.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<ImageArgs> image;

    public Output<ImageArgs> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * Optional. Metadata associated with the user's signature. For example, the user's name or the user's title.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Optional. Timestamp of the signature.
     * 
     */
    @Import(name="signatureTime")
      private final @Nullable Output<String> signatureTime;

    public Output<String> signatureTime() {
        return this.signatureTime == null ? Codegen.empty() : this.signatureTime;
    }

    /**
     * User's UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    public SignatureArgs(
        @Nullable Output<ImageArgs> image,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> signatureTime,
        Output<String> userId) {
        this.image = image;
        this.metadata = metadata;
        this.signatureTime = signatureTime;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private SignatureArgs() {
        this.image = Codegen.empty();
        this.metadata = Codegen.empty();
        this.signatureTime = Codegen.empty();
        this.userId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ImageArgs> image;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> signatureTime;
        private Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(SignatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.metadata = defaults.metadata;
    	      this.signatureTime = defaults.signatureTime;
    	      this.userId = defaults.userId;
        }

        public Builder image(@Nullable Output<ImageArgs> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable ImageArgs image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder signatureTime(@Nullable Output<String> signatureTime) {
            this.signatureTime = signatureTime;
            return this;
        }
        public Builder signatureTime(@Nullable String signatureTime) {
            this.signatureTime = Codegen.ofNullable(signatureTime);
            return this;
        }
        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }        public SignatureArgs build() {
            return new SignatureArgs(image, metadata, signatureTime, userId);
        }
    }
}
