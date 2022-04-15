// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrandResult {
    /**
     * Application name displayed on OAuth consent screen.
     * 
     */
    private final String applicationTitle;
    /**
     * Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created.
     * 
     */
    private final String name;
    /**
     * Whether the brand is only intended for usage inside the G Suite organization only.
     * 
     */
    private final Boolean orgInternalOnly;
    /**
     * Support email displayed on the OAuth consent screen.
     * 
     */
    private final String supportEmail;

    @CustomType.Constructor
    private GetBrandResult(
        @CustomType.Parameter("applicationTitle") String applicationTitle,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("orgInternalOnly") Boolean orgInternalOnly,
        @CustomType.Parameter("supportEmail") String supportEmail) {
        this.applicationTitle = applicationTitle;
        this.name = name;
        this.orgInternalOnly = orgInternalOnly;
        this.supportEmail = supportEmail;
    }

    /**
     * Application name displayed on OAuth consent screen.
     * 
    */
    public String applicationTitle() {
        return this.applicationTitle;
    }
    /**
     * Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Whether the brand is only intended for usage inside the G Suite organization only.
     * 
    */
    public Boolean orgInternalOnly() {
        return this.orgInternalOnly;
    }
    /**
     * Support email displayed on the OAuth consent screen.
     * 
    */
    public String supportEmail() {
        return this.supportEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrandResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationTitle;
        private String name;
        private Boolean orgInternalOnly;
        private String supportEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrandResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationTitle = defaults.applicationTitle;
    	      this.name = defaults.name;
    	      this.orgInternalOnly = defaults.orgInternalOnly;
    	      this.supportEmail = defaults.supportEmail;
        }

        public Builder applicationTitle(String applicationTitle) {
            this.applicationTitle = Objects.requireNonNull(applicationTitle);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder orgInternalOnly(Boolean orgInternalOnly) {
            this.orgInternalOnly = Objects.requireNonNull(orgInternalOnly);
            return this;
        }
        public Builder supportEmail(String supportEmail) {
            this.supportEmail = Objects.requireNonNull(supportEmail);
            return this;
        }        public GetBrandResult build() {
            return new GetBrandResult(applicationTitle, name, orgInternalOnly, supportEmail);
        }
    }
}
