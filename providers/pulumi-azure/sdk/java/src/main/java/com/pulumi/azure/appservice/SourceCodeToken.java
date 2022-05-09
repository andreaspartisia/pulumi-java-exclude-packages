// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.SourceCodeTokenArgs;
import com.pulumi.azure.appservice.inputs.SourceCodeTokenState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new SourceCodeToken(&#34;example&#34;, SourceCodeTokenArgs.builder()        
 *             .token(&#34;7e57735e77e577e57&#34;)
 *             .type(&#34;GitHub&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Service Source Control Token&#39;s can be imported using the `type`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/sourceCodeToken:SourceCodeToken example GitHub
 * ```
 * 
 */
@ResourceType(type="azure:appservice/sourceCodeToken:SourceCodeToken")
public class SourceCodeToken extends com.pulumi.resources.CustomResource {
    /**
     * The OAuth access token.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output<String> token;

    /**
     * @return The OAuth access token.
     * 
     */
    public Output<String> token() {
        return this.token;
    }
    /**
     * The OAuth access token secret.
     * 
     */
    @Export(name="tokenSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenSecret;

    /**
     * @return The OAuth access token secret.
     * 
     */
    public Output<Optional<String>> tokenSecret() {
        return Codegen.optional(this.tokenSecret);
    }
    /**
     * The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The source control type. Possible values are `BitBucket`, `Dropbox`, `GitHub` and `OneDrive`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SourceCodeToken(String name) {
        this(name, SourceCodeTokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceCodeToken(String name, SourceCodeTokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceCodeToken(String name, SourceCodeTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/sourceCodeToken:SourceCodeToken", name, args == null ? SourceCodeTokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SourceCodeToken(String name, Output<String> id, @Nullable SourceCodeTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/sourceCodeToken:SourceCodeToken", name, state, makeResourceOptions(options, id));
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
    public static SourceCodeToken get(String name, Output<String> id, @Nullable SourceCodeTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SourceCodeToken(name, id, state, options);
    }
}
