// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Jms.outputs.GetInstallationSiteItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstallationSiteResult {
    private final @Nullable String applicationId;
    private final String fleetId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String installationPath;
    /**
     * @return A list of Java installation sites.
     * 
     */
    private final List<GetInstallationSiteItem> items;
    private final @Nullable String jreDistribution;
    private final @Nullable String jreSecurityStatus;
    private final @Nullable String jreVendor;
    private final @Nullable String jreVersion;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the related managed instance.
     * 
     */
    private final @Nullable String managedInstanceId;
    private final @Nullable List<String> osFamilies;

    @CustomType.Constructor
    private GetInstallationSiteResult(
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("fleetId") String fleetId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("installationPath") @Nullable String installationPath,
        @CustomType.Parameter("items") List<GetInstallationSiteItem> items,
        @CustomType.Parameter("jreDistribution") @Nullable String jreDistribution,
        @CustomType.Parameter("jreSecurityStatus") @Nullable String jreSecurityStatus,
        @CustomType.Parameter("jreVendor") @Nullable String jreVendor,
        @CustomType.Parameter("jreVersion") @Nullable String jreVersion,
        @CustomType.Parameter("managedInstanceId") @Nullable String managedInstanceId,
        @CustomType.Parameter("osFamilies") @Nullable List<String> osFamilies) {
        this.applicationId = applicationId;
        this.fleetId = fleetId;
        this.id = id;
        this.installationPath = installationPath;
        this.items = items;
        this.jreDistribution = jreDistribution;
        this.jreSecurityStatus = jreSecurityStatus;
        this.jreVendor = jreVendor;
        this.jreVersion = jreVersion;
        this.managedInstanceId = managedInstanceId;
        this.osFamilies = osFamilies;
    }

    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    public String fleetId() {
        return this.fleetId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> installationPath() {
        return Optional.ofNullable(this.installationPath);
    }
    /**
     * @return A list of Java installation sites.
     * 
     */
    public List<GetInstallationSiteItem> items() {
        return this.items;
    }
    public Optional<String> jreDistribution() {
        return Optional.ofNullable(this.jreDistribution);
    }
    public Optional<String> jreSecurityStatus() {
        return Optional.ofNullable(this.jreSecurityStatus);
    }
    public Optional<String> jreVendor() {
        return Optional.ofNullable(this.jreVendor);
    }
    public Optional<String> jreVersion() {
        return Optional.ofNullable(this.jreVersion);
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the related managed instance.
     * 
     */
    public Optional<String> managedInstanceId() {
        return Optional.ofNullable(this.managedInstanceId);
    }
    public List<String> osFamilies() {
        return this.osFamilies == null ? List.of() : this.osFamilies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstallationSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private String fleetId;
        private String id;
        private @Nullable String installationPath;
        private List<GetInstallationSiteItem> items;
        private @Nullable String jreDistribution;
        private @Nullable String jreSecurityStatus;
        private @Nullable String jreVendor;
        private @Nullable String jreVersion;
        private @Nullable String managedInstanceId;
        private @Nullable List<String> osFamilies;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstallationSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.fleetId = defaults.fleetId;
    	      this.id = defaults.id;
    	      this.installationPath = defaults.installationPath;
    	      this.items = defaults.items;
    	      this.jreDistribution = defaults.jreDistribution;
    	      this.jreSecurityStatus = defaults.jreSecurityStatus;
    	      this.jreVendor = defaults.jreVendor;
    	      this.jreVersion = defaults.jreVersion;
    	      this.managedInstanceId = defaults.managedInstanceId;
    	      this.osFamilies = defaults.osFamilies;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder fleetId(String fleetId) {
            this.fleetId = Objects.requireNonNull(fleetId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder installationPath(@Nullable String installationPath) {
            this.installationPath = installationPath;
            return this;
        }
        public Builder items(List<GetInstallationSiteItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetInstallationSiteItem... items) {
            return items(List.of(items));
        }
        public Builder jreDistribution(@Nullable String jreDistribution) {
            this.jreDistribution = jreDistribution;
            return this;
        }
        public Builder jreSecurityStatus(@Nullable String jreSecurityStatus) {
            this.jreSecurityStatus = jreSecurityStatus;
            return this;
        }
        public Builder jreVendor(@Nullable String jreVendor) {
            this.jreVendor = jreVendor;
            return this;
        }
        public Builder jreVersion(@Nullable String jreVersion) {
            this.jreVersion = jreVersion;
            return this;
        }
        public Builder managedInstanceId(@Nullable String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }
        public Builder osFamilies(@Nullable List<String> osFamilies) {
            this.osFamilies = osFamilies;
            return this;
        }
        public Builder osFamilies(String... osFamilies) {
            return osFamilies(List.of(osFamilies));
        }        public GetInstallationSiteResult build() {
            return new GetInstallationSiteResult(applicationId, fleetId, id, installationPath, items, jreDistribution, jreSecurityStatus, jreVendor, jreVersion, managedInstanceId, osFamilies);
        }
    }
}
