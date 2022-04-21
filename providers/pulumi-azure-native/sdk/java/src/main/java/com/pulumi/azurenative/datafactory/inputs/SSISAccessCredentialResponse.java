// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * SSIS access credential.
 * 
 */
public final class SSISAccessCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final SSISAccessCredentialResponse Empty = new SSISAccessCredentialResponse();

    /**
     * Domain for windows authentication.
     * 
     */
    @Import(name="domain", required=true)
    private Object domain;

    public Object domain() {
        return this.domain;
    }

    /**
     * Password for windows authentication.
     * 
     */
    @Import(name="password", required=true)
    private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password() {
        return this.password;
    }

    /**
     * UseName for windows authentication.
     * 
     */
    @Import(name="userName", required=true)
    private Object userName;

    public Object userName() {
        return this.userName;
    }

    private SSISAccessCredentialResponse() {}

    private SSISAccessCredentialResponse(SSISAccessCredentialResponse $) {
        this.domain = $.domain;
        this.password = $.password;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SSISAccessCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SSISAccessCredentialResponse $;

        public Builder() {
            $ = new SSISAccessCredentialResponse();
        }

        public Builder(SSISAccessCredentialResponse defaults) {
            $ = new SSISAccessCredentialResponse(Objects.requireNonNull(defaults));
        }

        public Builder domain(Object domain) {
            $.domain = domain;
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        public Builder password(AzureKeyVaultSecretReferenceResponse password) {
            return password(Either.ofLeft(password));
        }

        public Builder password(SecureStringResponse password) {
            return password(Either.ofRight(password));
        }

        public Builder userName(Object userName) {
            $.userName = userName;
            return this;
        }

        public SSISAccessCredentialResponse build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
