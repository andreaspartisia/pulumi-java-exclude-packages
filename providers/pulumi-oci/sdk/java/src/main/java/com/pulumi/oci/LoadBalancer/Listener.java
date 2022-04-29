// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.LoadBalancer.ListenerArgs;
import com.pulumi.oci.LoadBalancer.inputs.ListenerState;
import com.pulumi.oci.LoadBalancer.outputs.ListenerConnectionConfiguration;
import com.pulumi.oci.LoadBalancer.outputs.ListenerSslConfiguration;
import com.pulumi.oci.Utilities;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Listener resource in Oracle Cloud Infrastructure Load Balancer service.
 * 
 * Adds a listener to a load balancer.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Listeners can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:LoadBalancer/listener:Listener test_listener &#34;loadBalancers/{loadBalancerId}/listeners/{listenerName}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:LoadBalancer/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Configuration details for the connection between the client and backend servers.
     * 
     */
    @Export(name="connectionConfiguration", type=ListenerConnectionConfiguration.class, parameters={})
    private Output<ListenerConnectionConfiguration> connectionConfiguration;

    /**
     * @return (Updatable) Configuration details for the connection between the client and backend servers.
     * 
     */
    public Output<ListenerConnectionConfiguration> connectionConfiguration() {
        return this.connectionConfiguration;
    }
    /**
     * (Updatable) The name of the associated backend set.  Example: `example_backend_set`
     * 
     */
    @Export(name="defaultBackendSetName", type=String.class, parameters={})
    private Output<String> defaultBackendSetName;

    /**
     * @return (Updatable) The name of the associated backend set.  Example: `example_backend_set`
     * 
     */
    public Output<String> defaultBackendSetName() {
        return this.defaultBackendSetName;
    }
    /**
     * (Updatable) An array of hostname resource names.
     * 
     */
    @Export(name="hostnameNames", type=List.class, parameters={String.class})
    private Output<List<String>> hostnameNames;

    /**
     * @return (Updatable) An array of hostname resource names.
     * 
     */
    public Output<List<String>> hostnameNames() {
        return this.hostnameNames;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer on which to add a listener.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer on which to add a listener.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * A friendly name for the listener. It must be unique and it cannot be changed. Avoid entering confidential information.  Example: `example_listener`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name for the listener. It must be unique and it cannot be changed. Avoid entering confidential information.  Example: `example_listener`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (Updatable) Deprecated. Please use `routingPolicies` instead.
     * 
     */
    @Export(name="pathRouteSetName", type=String.class, parameters={})
    private Output<String> pathRouteSetName;

    /**
     * @return (Updatable) Deprecated. Please use `routingPolicies` instead.
     * 
     */
    public Output<String> pathRouteSetName() {
        return this.pathRouteSetName;
    }
    /**
     * (Updatable) The communication port for the listener.  Example: `80`
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return (Updatable) The communication port for the listener.  Example: `80`
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * (Updatable) The protocol on which the listener accepts connection requests. To get a list of valid protocols, use the [ListProtocols](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerProtocol/ListProtocols) operation.  Example: `HTTP`
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return (Updatable) The protocol on which the listener accepts connection requests. To get a list of valid protocols, use the [ListProtocols](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerProtocol/ListProtocols) operation.  Example: `HTTP`
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * (Updatable) The name of the routing policy applied to this listener&#39;s traffic.  Example: `example_routing_policy`
     * 
     */
    @Export(name="routingPolicyName", type=String.class, parameters={})
    private Output<String> routingPolicyName;

    /**
     * @return (Updatable) The name of the routing policy applied to this listener&#39;s traffic.  Example: `example_routing_policy`
     * 
     */
    public Output<String> routingPolicyName() {
        return this.routingPolicyName;
    }
    /**
     * (Updatable) The names of the [rule sets](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/RuleSet/) to apply to the listener.  Example: [&#34;example_rule_set&#34;]
     * 
     */
    @Export(name="ruleSetNames", type=List.class, parameters={String.class})
    private Output<List<String>> ruleSetNames;

    /**
     * @return (Updatable) The names of the [rule sets](https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/RuleSet/) to apply to the listener.  Example: [&#34;example_rule_set&#34;]
     * 
     */
    public Output<List<String>> ruleSetNames() {
        return this.ruleSetNames;
    }
    /**
     * (Updatable) The load balancer&#39;s SSL handling configuration details.
     * 
     */
    @Export(name="sslConfiguration", type=ListenerSslConfiguration.class, parameters={})
    private Output</* @Nullable */ ListenerSslConfiguration> sslConfiguration;

    /**
     * @return (Updatable) The load balancer&#39;s SSL handling configuration details.
     * 
     */
    public Output<Optional<ListenerSslConfiguration>> sslConfiguration() {
        return Codegen.optional(this.sslConfiguration);
    }
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:LoadBalancer/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:LoadBalancer/listener:Listener", name, state, makeResourceOptions(options, id));
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
