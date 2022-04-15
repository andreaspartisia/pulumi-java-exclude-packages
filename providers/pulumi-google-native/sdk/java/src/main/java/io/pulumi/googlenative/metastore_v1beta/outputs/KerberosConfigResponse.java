// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.metastore_v1beta.outputs.SecretResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KerberosConfigResponse {
    /**
     * A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    private final SecretResponse keytab;
    /**
     * A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    private final String krb5ConfigGcsUri;
    /**
     * A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    private final String principal;

    @CustomType.Constructor
    private KerberosConfigResponse(
        @CustomType.Parameter("keytab") SecretResponse keytab,
        @CustomType.Parameter("krb5ConfigGcsUri") String krb5ConfigGcsUri,
        @CustomType.Parameter("principal") String principal) {
        this.keytab = keytab;
        this.krb5ConfigGcsUri = krb5ConfigGcsUri;
        this.principal = principal;
    }

    /**
     * A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
    */
    public SecretResponse keytab() {
        return this.keytab;
    }
    /**
     * A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
    */
    public String krb5ConfigGcsUri() {
        return this.krb5ConfigGcsUri;
    }
    /**
     * A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
    */
    public String principal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KerberosConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretResponse keytab;
        private String krb5ConfigGcsUri;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(KerberosConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keytab = defaults.keytab;
    	      this.krb5ConfigGcsUri = defaults.krb5ConfigGcsUri;
    	      this.principal = defaults.principal;
        }

        public Builder keytab(SecretResponse keytab) {
            this.keytab = Objects.requireNonNull(keytab);
            return this;
        }
        public Builder krb5ConfigGcsUri(String krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = Objects.requireNonNull(krb5ConfigGcsUri);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }        public KerberosConfigResponse build() {
            return new KerberosConfigResponse(keytab, krb5ConfigGcsUri, principal);
        }
    }
}
