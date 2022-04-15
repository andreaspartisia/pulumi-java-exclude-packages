// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JWT claims used for the jwt-bearer authorization grant.
 * 
 */
public final class JwtClaimsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtClaimsArgs Empty = new JwtClaimsArgs();

    /**
     * Value for the "aud" claim.
     * 
     */
    @Import(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> audience() {
        return this.audience == null ? Codegen.empty() : this.audience;
    }

    /**
     * Value for the "iss" claim.
     * 
     */
    @Import(name="issuer")
      private final @Nullable Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer == null ? Codegen.empty() : this.issuer;
    }

    /**
     * Value for the "sub" claim.
     * 
     */
    @Import(name="subject")
      private final @Nullable Output<String> subject;

    public Output<String> subject() {
        return this.subject == null ? Codegen.empty() : this.subject;
    }

    public JwtClaimsArgs(
        @Nullable Output<String> audience,
        @Nullable Output<String> issuer,
        @Nullable Output<String> subject) {
        this.audience = audience;
        this.issuer = issuer;
        this.subject = subject;
    }

    private JwtClaimsArgs() {
        this.audience = Codegen.empty();
        this.issuer = Codegen.empty();
        this.subject = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtClaimsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audience;
        private @Nullable Output<String> issuer;
        private @Nullable Output<String> subject;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtClaimsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.issuer = defaults.issuer;
    	      this.subject = defaults.subject;
        }

        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }
        public Builder audience(@Nullable String audience) {
            this.audience = Codegen.ofNullable(audience);
            return this;
        }
        public Builder issuer(@Nullable Output<String> issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = Codegen.ofNullable(issuer);
            return this;
        }
        public Builder subject(@Nullable Output<String> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = Codegen.ofNullable(subject);
            return this;
        }        public JwtClaimsArgs build() {
            return new JwtClaimsArgs(audience, issuer, subject);
        }
    }
}
