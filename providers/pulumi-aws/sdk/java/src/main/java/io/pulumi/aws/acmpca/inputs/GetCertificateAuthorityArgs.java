// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.aws.acmpca.inputs.GetCertificateAuthorityRevocationConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateAuthorityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityArgs Empty = new GetCertificateAuthorityArgs();

    /**
     * Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * 
     */
    @InputImport(name="revocationConfigurations")
      private final @Nullable List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;

    public List<GetCertificateAuthorityRevocationConfiguration> getRevocationConfigurations() {
        return this.revocationConfigurations == null ? List.of() : this.revocationConfigurations;
    }

    /**
     * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetCertificateAuthorityArgs(
        String arn,
        @Nullable List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations,
        @Nullable Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.revocationConfigurations = revocationConfigurations;
        this.tags = tags;
    }

    private GetCertificateAuthorityArgs() {
        this.arn = null;
        this.revocationConfigurations = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.revocationConfigurations = defaults.revocationConfigurations;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setRevocationConfigurations(@Nullable List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations) {
            this.revocationConfigurations = revocationConfigurations;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetCertificateAuthorityArgs build() {
            return new GetCertificateAuthorityArgs(arn, revocationConfigurations, tags);
        }
    }
}