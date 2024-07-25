// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CpsThirdPartyEnrollmentArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CpsThirdPartyEnrollmentState;
import com.pulumi.akamai.outputs.CpsThirdPartyEnrollmentAdminContact;
import com.pulumi.akamai.outputs.CpsThirdPartyEnrollmentCsr;
import com.pulumi.akamai.outputs.CpsThirdPartyEnrollmentNetworkConfiguration;
import com.pulumi.akamai.outputs.CpsThirdPartyEnrollmentOrganization;
import com.pulumi.akamai.outputs.CpsThirdPartyEnrollmentTechContact;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/cpsThirdPartyEnrollment:CpsThirdPartyEnrollment")
public class CpsThirdPartyEnrollment extends com.pulumi.resources.CustomResource {
    /**
     * Whether acknowledge warnings before certificate verification
     * 
     */
    @Export(name="acknowledgePreVerificationWarnings", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> acknowledgePreVerificationWarnings;

    /**
     * @return Whether acknowledge warnings before certificate verification
     * 
     */
    public Output<Optional<Boolean>> acknowledgePreVerificationWarnings() {
        return Codegen.optional(this.acknowledgePreVerificationWarnings);
    }
    /**
     * Contact information for the certificate administrator to use at organization
     * 
     */
    @Export(name="adminContact", refs={CpsThirdPartyEnrollmentAdminContact.class}, tree="[0]")
    private Output<CpsThirdPartyEnrollmentAdminContact> adminContact;

    /**
     * @return Contact information for the certificate administrator to use at organization
     * 
     */
    public Output<CpsThirdPartyEnrollmentAdminContact> adminContact() {
        return this.adminContact;
    }
    /**
     * Allow to duplicate common name
     * 
     */
    @Export(name="allowDuplicateCommonName", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowDuplicateCommonName;

    /**
     * @return Allow to duplicate common name
     * 
     */
    public Output<Optional<Boolean>> allowDuplicateCommonName() {
        return Codegen.optional(this.allowDuplicateCommonName);
    }
    /**
     * List of warnings to be automatically approved
     * 
     */
    @Export(name="autoApproveWarnings", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> autoApproveWarnings;

    /**
     * @return List of warnings to be automatically approved
     * 
     */
    public Output<Optional<List<String>>> autoApproveWarnings() {
        return Codegen.optional(this.autoApproveWarnings);
    }
    /**
     * Certificate trust chain type
     * 
     */
    @Export(name="certificateChainType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateChainType;

    /**
     * @return Certificate trust chain type
     * 
     */
    public Output<Optional<String>> certificateChainType() {
        return Codegen.optional(this.certificateChainType);
    }
    /**
     * When set to false, the certificate will be deployed to both staging and production networks
     * 
     */
    @Export(name="changeManagement", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> changeManagement;

    /**
     * @return When set to false, the certificate will be deployed to both staging and production networks
     * 
     */
    public Output<Optional<Boolean>> changeManagement() {
        return Codegen.optional(this.changeManagement);
    }
    /**
     * Common name used for enrollment
     * 
     */
    @Export(name="commonName", refs={String.class}, tree="[0]")
    private Output<String> commonName;

    /**
     * @return Common name used for enrollment
     * 
     */
    public Output<String> commonName() {
        return this.commonName;
    }
    /**
     * Contract ID for which enrollment is retrieved
     * 
     */
    @Export(name="contractId", refs={String.class}, tree="[0]")
    private Output<String> contractId;

    /**
     * @return Contract ID for which enrollment is retrieved
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }
    /**
     * Data used for generation of Certificate Signing Request
     * 
     */
    @Export(name="csr", refs={CpsThirdPartyEnrollmentCsr.class}, tree="[0]")
    private Output<CpsThirdPartyEnrollmentCsr> csr;

    /**
     * @return Data used for generation of Certificate Signing Request
     * 
     */
    public Output<CpsThirdPartyEnrollmentCsr> csr() {
        return this.csr;
    }
    /**
     * When true, SANs are excluded from the CSR
     * 
     */
    @Export(name="excludeSans", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> excludeSans;

    /**
     * @return When true, SANs are excluded from the CSR
     * 
     */
    public Output<Optional<Boolean>> excludeSans() {
        return Codegen.optional(this.excludeSans);
    }
    /**
     * Settings containing network information and TLS metadata used by CPS
     * 
     */
    @Export(name="networkConfiguration", refs={CpsThirdPartyEnrollmentNetworkConfiguration.class}, tree="[0]")
    private Output<CpsThirdPartyEnrollmentNetworkConfiguration> networkConfiguration;

    /**
     * @return Settings containing network information and TLS metadata used by CPS
     * 
     */
    public Output<CpsThirdPartyEnrollmentNetworkConfiguration> networkConfiguration() {
        return this.networkConfiguration;
    }
    /**
     * Organization information
     * 
     */
    @Export(name="organization", refs={CpsThirdPartyEnrollmentOrganization.class}, tree="[0]")
    private Output<CpsThirdPartyEnrollmentOrganization> organization;

    /**
     * @return Organization information
     * 
     */
    public Output<CpsThirdPartyEnrollmentOrganization> organization() {
        return this.organization;
    }
    /**
     * List of SANs
     * 
     */
    @Export(name="sans", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sans;

    /**
     * @return List of SANs
     * 
     */
    public Output<Optional<List<String>>> sans() {
        return Codegen.optional(this.sans);
    }
    /**
     * Type of TLS deployment network
     * 
     */
    @Export(name="secureNetwork", refs={String.class}, tree="[0]")
    private Output<String> secureNetwork;

    /**
     * @return Type of TLS deployment network
     * 
     */
    public Output<String> secureNetwork() {
        return this.secureNetwork;
    }
    /**
     * The SHA function. Changing this value may require running terraform destroy, terraform apply
     * 
     */
    @Export(name="signatureAlgorithm", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> signatureAlgorithm;

    /**
     * @return The SHA function. Changing this value may require running terraform destroy, terraform apply
     * 
     */
    public Output<Optional<String>> signatureAlgorithm() {
        return Codegen.optional(this.signatureAlgorithm);
    }
    /**
     * Whether Server Name Indication is used for enrollment
     * 
     */
    @Export(name="sniOnly", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> sniOnly;

    /**
     * @return Whether Server Name Indication is used for enrollment
     * 
     */
    public Output<Boolean> sniOnly() {
        return this.sniOnly;
    }
    /**
     * Contact information for an administrator at Akamai
     * 
     */
    @Export(name="techContact", refs={CpsThirdPartyEnrollmentTechContact.class}, tree="[0]")
    private Output<CpsThirdPartyEnrollmentTechContact> techContact;

    /**
     * @return Contact information for an administrator at Akamai
     * 
     */
    public Output<CpsThirdPartyEnrollmentTechContact> techContact() {
        return this.techContact;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CpsThirdPartyEnrollment(String name) {
        this(name, CpsThirdPartyEnrollmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CpsThirdPartyEnrollment(String name, CpsThirdPartyEnrollmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CpsThirdPartyEnrollment(String name, CpsThirdPartyEnrollmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cpsThirdPartyEnrollment:CpsThirdPartyEnrollment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private CpsThirdPartyEnrollment(String name, Output<String> id, @Nullable CpsThirdPartyEnrollmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cpsThirdPartyEnrollment:CpsThirdPartyEnrollment", name, state, makeResourceOptions(options, id));
    }

    private static CpsThirdPartyEnrollmentArgs makeArgs(CpsThirdPartyEnrollmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CpsThirdPartyEnrollmentArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CpsThirdPartyEnrollment get(String name, Output<String> id, @Nullable CpsThirdPartyEnrollmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CpsThirdPartyEnrollment(name, id, state, options);
    }
}
