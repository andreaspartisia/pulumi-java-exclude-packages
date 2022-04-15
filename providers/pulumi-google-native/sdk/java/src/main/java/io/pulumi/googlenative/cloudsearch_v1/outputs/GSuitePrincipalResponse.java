// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GSuitePrincipalResponse {
    /**
     * This principal represents all users of the G Suite domain of the customer.
     * 
     */
    private final Boolean gsuiteDomain;
    /**
     * This principal references a G Suite group account
     * 
     */
    private final String gsuiteGroupEmail;
    /**
     * This principal references a G Suite user account
     * 
     */
    private final String gsuiteUserEmail;

    @CustomType.Constructor
    private GSuitePrincipalResponse(
        @CustomType.Parameter("gsuiteDomain") Boolean gsuiteDomain,
        @CustomType.Parameter("gsuiteGroupEmail") String gsuiteGroupEmail,
        @CustomType.Parameter("gsuiteUserEmail") String gsuiteUserEmail) {
        this.gsuiteDomain = gsuiteDomain;
        this.gsuiteGroupEmail = gsuiteGroupEmail;
        this.gsuiteUserEmail = gsuiteUserEmail;
    }

    /**
     * This principal represents all users of the G Suite domain of the customer.
     * 
    */
    public Boolean gsuiteDomain() {
        return this.gsuiteDomain;
    }
    /**
     * This principal references a G Suite group account
     * 
    */
    public String gsuiteGroupEmail() {
        return this.gsuiteGroupEmail;
    }
    /**
     * This principal references a G Suite user account
     * 
    */
    public String gsuiteUserEmail() {
        return this.gsuiteUserEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GSuitePrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean gsuiteDomain;
        private String gsuiteGroupEmail;
        private String gsuiteUserEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(GSuitePrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gsuiteDomain = defaults.gsuiteDomain;
    	      this.gsuiteGroupEmail = defaults.gsuiteGroupEmail;
    	      this.gsuiteUserEmail = defaults.gsuiteUserEmail;
        }

        public Builder gsuiteDomain(Boolean gsuiteDomain) {
            this.gsuiteDomain = Objects.requireNonNull(gsuiteDomain);
            return this;
        }
        public Builder gsuiteGroupEmail(String gsuiteGroupEmail) {
            this.gsuiteGroupEmail = Objects.requireNonNull(gsuiteGroupEmail);
            return this;
        }
        public Builder gsuiteUserEmail(String gsuiteUserEmail) {
            this.gsuiteUserEmail = Objects.requireNonNull(gsuiteUserEmail);
            return this;
        }        public GSuitePrincipalResponse build() {
            return new GSuitePrincipalResponse(gsuiteDomain, gsuiteGroupEmail, gsuiteUserEmail);
        }
    }
}
