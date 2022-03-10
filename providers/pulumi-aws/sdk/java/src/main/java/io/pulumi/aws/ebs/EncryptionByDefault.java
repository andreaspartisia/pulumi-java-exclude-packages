// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ebs.EncryptionByDefaultArgs;
import io.pulumi.aws.ebs.inputs.EncryptionByDefaultState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage whether default EBS encryption is enabled for your AWS account in the current AWS region. To manage the default KMS key for the region, see the `aws.ebs.DefaultKmsKey` resource.
 * 
 * > **NOTE:** Removing this resource disables default EBS encryption.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Default EBS encryption state can be imported, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ebs/encryptionByDefault:EncryptionByDefault example default
 * ```
 * 
 */
@ResourceType(type="aws:ebs/encryptionByDefault:EncryptionByDefault")
public class EncryptionByDefault extends io.pulumi.resources.CustomResource {
    /**
     * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable EncryptionByDefaultArgs.Builder a);
    }
    private static io.pulumi.aws.ebs.EncryptionByDefaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ebs.EncryptionByDefaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EncryptionByDefault(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptionByDefault(String name) {
        this(name, EncryptionByDefaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionByDefault(String name, @Nullable EncryptionByDefaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionByDefault(String name, @Nullable EncryptionByDefaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/encryptionByDefault:EncryptionByDefault", name, args == null ? EncryptionByDefaultArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EncryptionByDefault(String name, Input<String> id, @Nullable EncryptionByDefaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/encryptionByDefault:EncryptionByDefault", name, state, makeResourceOptions(options, id));
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
    public static EncryptionByDefault get(String name, Input<String> id, @Nullable EncryptionByDefaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionByDefault(name, id, state, options);
    }
}