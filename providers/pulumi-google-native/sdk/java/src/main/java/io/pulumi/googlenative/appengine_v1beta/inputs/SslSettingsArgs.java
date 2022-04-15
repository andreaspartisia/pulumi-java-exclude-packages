// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.appengine_v1beta.enums.SslSettingsSslManagementType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSL configuration for a DomainMapping resource.
 * 
 */
public final class SslSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslSettingsArgs Empty = new SslSettingsArgs();

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    @Import(name="certificateId")
      private final @Nullable Output<String> certificateId;

    public Output<String> certificateId() {
        return this.certificateId == null ? Codegen.empty() : this.certificateId;
    }

    /**
     * SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    @Import(name="sslManagementType")
      private final @Nullable Output<SslSettingsSslManagementType> sslManagementType;

    public Output<SslSettingsSslManagementType> sslManagementType() {
        return this.sslManagementType == null ? Codegen.empty() : this.sslManagementType;
    }

    public SslSettingsArgs(
        @Nullable Output<String> certificateId,
        @Nullable Output<SslSettingsSslManagementType> sslManagementType) {
        this.certificateId = certificateId;
        this.sslManagementType = sslManagementType;
    }

    private SslSettingsArgs() {
        this.certificateId = Codegen.empty();
        this.sslManagementType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateId;
        private @Nullable Output<SslSettingsSslManagementType> sslManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(SslSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.sslManagementType = defaults.sslManagementType;
        }

        public Builder certificateId(@Nullable Output<String> certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Builder certificateId(@Nullable String certificateId) {
            this.certificateId = Codegen.ofNullable(certificateId);
            return this;
        }
        public Builder sslManagementType(@Nullable Output<SslSettingsSslManagementType> sslManagementType) {
            this.sslManagementType = sslManagementType;
            return this;
        }
        public Builder sslManagementType(@Nullable SslSettingsSslManagementType sslManagementType) {
            this.sslManagementType = Codegen.ofNullable(sslManagementType);
            return this;
        }        public SslSettingsArgs build() {
            return new SslSettingsArgs(certificateId, sslManagementType);
        }
    }
}
