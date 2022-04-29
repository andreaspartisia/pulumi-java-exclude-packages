// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.AutonomousExadataInfrastructureMaintenanceWindowDetailsArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutonomousExadataInfrastructureArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutonomousExadataInfrastructureArgs Empty = new AutonomousExadataInfrastructureArgs();

    /**
     * The availability domain where the Autonomous Exadata Infrastructure is located.
     * 
     * @deprecated
     * Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead.
     * 
     */
    @Deprecated /* Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead. */
    @Import(name="availabilityDomain", required=true)
    private Output<String> availabilityDomain;

    /**
     * @return The availability domain where the Autonomous Exadata Infrastructure is located.
     * 
     * @deprecated
     * Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead.
     * 
     */
    @Deprecated /* Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead. */
    public Output<String> availabilityDomain() {
        return this.availabilityDomain;
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment the Autonomous Exadata Infrastructure belongs in.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment the Autonomous Exadata Infrastructure belongs in.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="createAsync")
    private @Nullable Output<Boolean> createAsync;

    public Optional<Output<Boolean>> createAsync() {
        return Optional.ofNullable(this.createAsync);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) The user-friendly name for the Autonomous Exadata Infrastructure. It does not have to be unique.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) The user-friendly name for the Autonomous Exadata Infrastructure. It does not have to be unique.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A domain name used for the Autonomous Exadata Infrastructure. If the Oracle-provided Internet and VCN Resolver is enabled for the specified subnet, the domain name for the subnet is used (don&#39;t provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return A domain name used for the Autonomous Exadata Infrastructure. If the Oracle-provided Internet and VCN Resolver is enabled for the specified subnet, the domain name for the subnet is used (don&#39;t provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The Oracle license model that applies to all the databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     * 
     */
    @Import(name="licenseModel")
    private @Nullable Output<String> licenseModel;

    /**
     * @return The Oracle license model that applies to all the databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
     * 
     */
    public Optional<Output<String>> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    /**
     * (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    @Import(name="maintenanceWindowDetails")
    private @Nullable Output<AutonomousExadataInfrastructureMaintenanceWindowDetailsArgs> maintenanceWindowDetails;

    /**
     * @return (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public Optional<Output<AutonomousExadataInfrastructureMaintenanceWindowDetailsArgs>> maintenanceWindowDetails() {
        return Optional.ofNullable(this.maintenanceWindowDetails);
    }

    /**
     * (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
     * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     * 
     */
    @Import(name="nsgIds")
    private @Nullable Output<List<String>> nsgIds;

    /**
     * @return (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
     * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     * 
     */
    public Optional<Output<List<String>>> nsgIds() {
        return Optional.ofNullable(this.nsgIds);
    }

    /**
     * The shape of the Autonomous Exadata Infrastructure. The shape determines resources allocated to the Autonomous Exadata Infrastructure (CPU cores, memory and storage). To get a list of shapes, use the ListDbSystemShapes operation.
     * 
     */
    @Import(name="shape", required=true)
    private Output<String> shape;

    /**
     * @return The shape of the Autonomous Exadata Infrastructure. The shape determines resources allocated to the Autonomous Exadata Infrastructure (CPU cores, memory and storage). To get a list of shapes, use the ListDbSystemShapes operation.
     * 
     */
    public Output<String> shape() {
        return this.shape;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the Autonomous Exadata Infrastructure is associated with.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the Autonomous Exadata Infrastructure is associated with.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private AutonomousExadataInfrastructureArgs() {}

    private AutonomousExadataInfrastructureArgs(AutonomousExadataInfrastructureArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.createAsync = $.createAsync;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.domain = $.domain;
        this.freeformTags = $.freeformTags;
        this.licenseModel = $.licenseModel;
        this.maintenanceWindowDetails = $.maintenanceWindowDetails;
        this.nsgIds = $.nsgIds;
        this.shape = $.shape;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutonomousExadataInfrastructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutonomousExadataInfrastructureArgs $;

        public Builder() {
            $ = new AutonomousExadataInfrastructureArgs();
        }

        public Builder(AutonomousExadataInfrastructureArgs defaults) {
            $ = new AutonomousExadataInfrastructureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The availability domain where the Autonomous Exadata Infrastructure is located.
         * 
         * @return builder
         * 
         * @deprecated
         * Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead.
         * 
         */
        @Deprecated /* Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead. */
        public Builder availabilityDomain(Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain The availability domain where the Autonomous Exadata Infrastructure is located.
         * 
         * @return builder
         * 
         * @deprecated
         * Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead.
         * 
         */
        @Deprecated /* Autonomous Exadata Infrastructure resource is now end-of-life.Please provision cloud autonomous vm cluster instead. */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment the Autonomous Exadata Infrastructure belongs in.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment the Autonomous Exadata Infrastructure belongs in.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder createAsync(@Nullable Output<Boolean> createAsync) {
            $.createAsync = createAsync;
            return this;
        }

        public Builder createAsync(Boolean createAsync) {
            return createAsync(Output.of(createAsync));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) The user-friendly name for the Autonomous Exadata Infrastructure. It does not have to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) The user-friendly name for the Autonomous Exadata Infrastructure. It does not have to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param domain A domain name used for the Autonomous Exadata Infrastructure. If the Oracle-provided Internet and VCN Resolver is enabled for the specified subnet, the domain name for the subnet is used (don&#39;t provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain A domain name used for the Autonomous Exadata Infrastructure. If the Oracle-provided Internet and VCN Resolver is enabled for the specified subnet, the domain name for the subnet is used (don&#39;t provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param licenseModel The Oracle license model that applies to all the databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        /**
         * @param licenseModel The Oracle license model that applies to all the databases in the Autonomous Exadata Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(String licenseModel) {
            return licenseModel(Output.of(licenseModel));
        }

        /**
         * @param maintenanceWindowDetails (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDetails(@Nullable Output<AutonomousExadataInfrastructureMaintenanceWindowDetailsArgs> maintenanceWindowDetails) {
            $.maintenanceWindowDetails = maintenanceWindowDetails;
            return this;
        }

        /**
         * @param maintenanceWindowDetails (Updatable) The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDetails(AutonomousExadataInfrastructureMaintenanceWindowDetailsArgs maintenanceWindowDetails) {
            return maintenanceWindowDetails(Output.of(maintenanceWindowDetails));
        }

        /**
         * @param nsgIds (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
         * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder nsgIds(@Nullable Output<List<String>> nsgIds) {
            $.nsgIds = nsgIds;
            return this;
        }

        /**
         * @param nsgIds (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
         * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder nsgIds(List<String> nsgIds) {
            return nsgIds(Output.of(nsgIds));
        }

        /**
         * @param nsgIds (Updatable) A list of the [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds restrictions:**
         * * Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }

        /**
         * @param shape The shape of the Autonomous Exadata Infrastructure. The shape determines resources allocated to the Autonomous Exadata Infrastructure (CPU cores, memory and storage). To get a list of shapes, use the ListDbSystemShapes operation.
         * 
         * @return builder
         * 
         */
        public Builder shape(Output<String> shape) {
            $.shape = shape;
            return this;
        }

        /**
         * @param shape The shape of the Autonomous Exadata Infrastructure. The shape determines resources allocated to the Autonomous Exadata Infrastructure (CPU cores, memory and storage). To get a list of shapes, use the ListDbSystemShapes operation.
         * 
         * @return builder
         * 
         */
        public Builder shape(String shape) {
            return shape(Output.of(shape));
        }

        /**
         * @param subnetId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the Autonomous Exadata Infrastructure is associated with.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the Autonomous Exadata Infrastructure is associated with.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public AutonomousExadataInfrastructureArgs build() {
            $.availabilityDomain = Objects.requireNonNull($.availabilityDomain, "expected parameter 'availabilityDomain' to be non-null");
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.shape = Objects.requireNonNull($.shape, "expected parameter 'shape' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
