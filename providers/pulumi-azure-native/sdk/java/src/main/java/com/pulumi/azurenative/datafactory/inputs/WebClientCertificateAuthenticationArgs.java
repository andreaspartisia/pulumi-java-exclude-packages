// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * A WebLinkedService that uses client certificate based authentication to communicate with an HTTP endpoint. This scheme follows mutual authentication; the server must also provide valid credentials to the client.
 * 
 */
public final class WebClientCertificateAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebClientCertificateAuthenticationArgs Empty = new WebClientCertificateAuthenticationArgs();

    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is &#39;ClientCertificate&#39;.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Password for the PFX file.
     * 
     */
    @Import(name="password", required=true)
    private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password;
    }

    /**
     * Base64-encoded contents of a PFX file.
     * 
     */
    @Import(name="pfx", required=true)
    private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx() {
        return this.pfx;
    }

    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private Output<Object> url;

    public Output<Object> url() {
        return this.url;
    }

    private WebClientCertificateAuthenticationArgs() {}

    private WebClientCertificateAuthenticationArgs(WebClientCertificateAuthenticationArgs $) {
        this.authenticationType = $.authenticationType;
        this.password = $.password;
        this.pfx = $.pfx;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebClientCertificateAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebClientCertificateAuthenticationArgs $;

        public Builder() {
            $ = new WebClientCertificateAuthenticationArgs();
        }

        public Builder(WebClientCertificateAuthenticationArgs defaults) {
            $ = new WebClientCertificateAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder password(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        public Builder pfx(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx) {
            $.pfx = pfx;
            return this;
        }

        public Builder pfx(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> pfx) {
            return pfx(Output.of(pfx));
        }

        public Builder pfx(AzureKeyVaultSecretReferenceArgs pfx) {
            return pfx(Either.ofLeft(pfx));
        }

        public Builder pfx(SecureStringArgs pfx) {
            return pfx(Either.ofRight(pfx));
        }

        public Builder url(Output<Object> url) {
            $.url = url;
            return this;
        }

        public Builder url(Object url) {
            return url(Output.of(url));
        }

        public WebClientCertificateAuthenticationArgs build() {
            $.authenticationType = Codegen.stringProp("authenticationType").output().arg($.authenticationType).require();
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.pfx = Objects.requireNonNull($.pfx, "expected parameter 'pfx' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
