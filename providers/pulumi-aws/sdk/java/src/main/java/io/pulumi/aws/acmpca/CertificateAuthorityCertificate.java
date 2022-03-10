// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs;
import io.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Associates a certificate with an AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). An ACM PCA Certificate Authority is unable to issue certificates until it has a certificate associated with it. A root level ACM PCA Certificate Authority is able to self-sign its own root certificate.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:acmpca/certificateAuthorityCertificate:CertificateAuthorityCertificate")
public class CertificateAuthorityCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The PEM-encoded certificate for the Certificate Authority.
     * 
     */
    @OutputExport(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return The PEM-encoded certificate for the Certificate Authority.
     * 
     */
    public Output<String> getCertificate() {
        return this.certificate;
    }
    /**
     * Amazon Resource Name (ARN) of the Certificate Authority.
     * 
     */
    @OutputExport(name="certificateAuthorityArn", type=String.class, parameters={})
    private Output<String> certificateAuthorityArn;

    /**
     * @return Amazon Resource Name (ARN) of the Certificate Authority.
     * 
     */
    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    @OutputExport(name="certificateChain", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    public Output</* @Nullable */ String> getCertificateChain() {
        return this.certificateChain;
    }

    public interface BuilderApplicator {
        public void apply(CertificateAuthorityCertificateArgs.Builder a);
    }
    private static io.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CertificateAuthorityCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateAuthorityCertificate(String name) {
        this(name, CertificateAuthorityCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateAuthorityCertificate(String name, CertificateAuthorityCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateAuthorityCertificate(String name, CertificateAuthorityCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthorityCertificate:CertificateAuthorityCertificate", name, args == null ? CertificateAuthorityCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CertificateAuthorityCertificate(String name, Input<String> id, @Nullable CertificateAuthorityCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthorityCertificate:CertificateAuthorityCertificate", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static CertificateAuthorityCertificate get(String name, Input<String> id, @Nullable CertificateAuthorityCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthorityCertificate(name, id, state, options);
    }
}