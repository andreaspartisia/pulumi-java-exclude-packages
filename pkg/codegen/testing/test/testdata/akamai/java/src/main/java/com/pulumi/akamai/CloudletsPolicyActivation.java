// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CloudletsPolicyActivationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CloudletsPolicyActivationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/cloudletsPolicyActivation:CloudletsPolicyActivation")
public class CloudletsPolicyActivation extends com.pulumi.resources.CustomResource {
    /**
     * Set of property IDs to link to this Cloudlets policy
     * 
     */
    @Export(name="associatedProperties", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> associatedProperties;

    /**
     * @return Set of property IDs to link to this Cloudlets policy
     * 
     */
    public Output<List<String>> associatedProperties() {
        return this.associatedProperties;
    }
    /**
     * The network you want to activate the policy version on (options are Staging and Production)
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return The network you want to activate the policy version on (options are Staging and Production)
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * ID of the Cloudlets policy you want to activate
     * 
     */
    @Export(name="policyId", refs={Integer.class}, tree="[0]")
    private Output<Integer> policyId;

    /**
     * @return ID of the Cloudlets policy you want to activate
     * 
     */
    public Output<Integer> policyId() {
        return this.policyId;
    }
    /**
     * Activation status for this Cloudlets policy
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Activation status for this Cloudlets policy
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Cloudlets policy version you want to activate
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return Cloudlets policy version you want to activate
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudletsPolicyActivation(java.lang.String name) {
        this(name, CloudletsPolicyActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudletsPolicyActivation(String name, CloudletsPolicyActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudletsPolicyActivation(java.lang.String name, CloudletsPolicyActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudletsPolicyActivation:CloudletsPolicyActivation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private CloudletsPolicyActivation(java.lang.String name, Output<java.lang.String> id, @Nullable CloudletsPolicyActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudletsPolicyActivation:CloudletsPolicyActivation", name, state, makeResourceOptions(options, id));
    }

    private static CloudletsPolicyActivationArgs makeArgs(CloudletsPolicyActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloudletsPolicyActivationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static CloudletsPolicyActivation get(java.lang.String name, Output<java.lang.String> id, @Nullable CloudletsPolicyActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudletsPolicyActivation(name, id, state, options);
    }
}
