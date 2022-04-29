// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.BigDataService.AutoScalingConfigurationArgs;
import com.pulumi.oci.BigDataService.inputs.AutoScalingConfigurationState;
import com.pulumi.oci.BigDataService.outputs.AutoScalingConfigurationPolicy;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the Auto Scaling Configuration resource in Oracle Cloud Infrastructure Big Data Service service.
 * 
 * Add an autoscale configuration to the cluster.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutoScalingConfiguration can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:BigDataService/autoScalingConfiguration:AutoScalingConfiguration test_auto_scaling_configuration &#34;bdsInstances/{bdsInstanceId}/autoScalingConfiguration/{autoScalingConfigurationId}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:BigDataService/autoScalingConfiguration:AutoScalingConfiguration")
public class AutoScalingConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the cluster.
     * 
     */
    @Export(name="bdsInstanceId", type=String.class, parameters={})
    private Output<String> bdsInstanceId;

    /**
     * @return The OCID of the cluster.
     * 
     */
    public Output<String> bdsInstanceId() {
        return this.bdsInstanceId;
    }
    /**
     * (Updatable) Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * 
     */
    @Export(name="clusterAdminPassword", type=String.class, parameters={})
    private Output<String> clusterAdminPassword;

    /**
     * @return (Updatable) Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * 
     */
    public Output<String> clusterAdminPassword() {
        return this.clusterAdminPassword;
    }
    /**
     * (Updatable) A user-friendly name. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Whether the autoscale configuration is enabled.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    /**
     * @return (Updatable) Whether the autoscale configuration is enabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * A node type that is managed by an autoscale configuration. The only supported type is WORKER.
     * 
     */
    @Export(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return A node type that is managed by an autoscale configuration. The only supported type is WORKER.
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }
    /**
     * (Updatable) Policy definitions for the autoscale configuration.
     * 
     */
    @Export(name="policy", type=AutoScalingConfigurationPolicy.class, parameters={})
    private Output<AutoScalingConfigurationPolicy> policy;

    /**
     * @return (Updatable) Policy definitions for the autoscale configuration.
     * 
     */
    public Output<AutoScalingConfigurationPolicy> policy() {
        return this.policy;
    }
    /**
     * The state of the autoscale configuration.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the autoscale configuration.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The time the autoscale configuration was updated, shown as an RFC 3339 formatted datetime string.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the autoscale configuration was updated, shown as an RFC 3339 formatted datetime string.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoScalingConfiguration(String name) {
        this(name, AutoScalingConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoScalingConfiguration(String name, AutoScalingConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoScalingConfiguration(String name, AutoScalingConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:BigDataService/autoScalingConfiguration:AutoScalingConfiguration", name, args == null ? AutoScalingConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoScalingConfiguration(String name, Output<String> id, @Nullable AutoScalingConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:BigDataService/autoScalingConfiguration:AutoScalingConfiguration", name, state, makeResourceOptions(options, id));
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
    public static AutoScalingConfiguration get(String name, Output<String> id, @Nullable AutoScalingConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoScalingConfiguration(name, id, state, options);
    }
}
