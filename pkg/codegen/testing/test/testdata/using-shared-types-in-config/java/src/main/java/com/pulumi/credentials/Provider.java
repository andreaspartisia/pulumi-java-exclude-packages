// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.credentials;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.credentials.ProviderArgs;
import com.pulumi.credentials.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="pulumi:providers:credentials")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The password. It is very secret.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The password. It is very secret.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The username. Its important but not secret.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return The username. Its important but not secret.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("credentials", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private static ProviderArgs makeArgs(ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
