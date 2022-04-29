// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolLoadBalancerArgs Empty = new InstancePoolLoadBalancerArgs();

    /**
     * The name of the backend set on the load balancer to add instances to.
     * 
     */
    @Import(name="backendSetName", required=true)
    private Output<String> backendSetName;

    /**
     * @return The name of the backend set on the load balancer to add instances to.
     * 
     */
    public Output<String> backendSetName() {
        return this.backendSetName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer attachment.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer attachment.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool of the load balancer attachment.
     * 
     */
    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool of the load balancer attachment.
     * 
     */
    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private Output<String> loadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * The port value to use when creating the backend set.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port value to use when creating the backend set.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Indicates which VNIC on each instance in the pool should be used to associate with the load balancer. Possible values are &#34;PrimaryVnic&#34; or the displayName of one of the secondary VNICs on the instance configuration that is associated with the instance pool.
     * 
     */
    @Import(name="vnicSelection", required=true)
    private Output<String> vnicSelection;

    /**
     * @return Indicates which VNIC on each instance in the pool should be used to associate with the load balancer. Possible values are &#34;PrimaryVnic&#34; or the displayName of one of the secondary VNICs on the instance configuration that is associated with the instance pool.
     * 
     */
    public Output<String> vnicSelection() {
        return this.vnicSelection;
    }

    private InstancePoolLoadBalancerArgs() {}

    private InstancePoolLoadBalancerArgs(InstancePoolLoadBalancerArgs $) {
        this.backendSetName = $.backendSetName;
        this.id = $.id;
        this.instancePoolId = $.instancePoolId;
        this.loadBalancerId = $.loadBalancerId;
        this.port = $.port;
        this.state = $.state;
        this.vnicSelection = $.vnicSelection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolLoadBalancerArgs $;

        public Builder() {
            $ = new InstancePoolLoadBalancerArgs();
        }

        public Builder(InstancePoolLoadBalancerArgs defaults) {
            $ = new InstancePoolLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendSetName The name of the backend set on the load balancer to add instances to.
         * 
         * @return builder
         * 
         */
        public Builder backendSetName(Output<String> backendSetName) {
            $.backendSetName = backendSetName;
            return this;
        }

        /**
         * @param backendSetName The name of the backend set on the load balancer to add instances to.
         * 
         * @return builder
         * 
         */
        public Builder backendSetName(String backendSetName) {
            return backendSetName(Output.of(backendSetName));
        }

        /**
         * @param id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer attachment.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer attachment.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param instancePoolId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool of the load balancer attachment.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        /**
         * @param instancePoolId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool of the load balancer attachment.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param port The port value to use when creating the backend set.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port value to use when creating the backend set.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param state (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Updatable) The target state for the instance pool update operation (ignored at create time and should not be set). Could be set to RUNNING or STOPPED.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vnicSelection Indicates which VNIC on each instance in the pool should be used to associate with the load balancer. Possible values are &#34;PrimaryVnic&#34; or the displayName of one of the secondary VNICs on the instance configuration that is associated with the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder vnicSelection(Output<String> vnicSelection) {
            $.vnicSelection = vnicSelection;
            return this;
        }

        /**
         * @param vnicSelection Indicates which VNIC on each instance in the pool should be used to associate with the load balancer. Possible values are &#34;PrimaryVnic&#34; or the displayName of one of the secondary VNICs on the instance configuration that is associated with the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder vnicSelection(String vnicSelection) {
            return vnicSelection(Output.of(vnicSelection));
        }

        public InstancePoolLoadBalancerArgs build() {
            $.backendSetName = Objects.requireNonNull($.backendSetName, "expected parameter 'backendSetName' to be non-null");
            $.loadBalancerId = Objects.requireNonNull($.loadBalancerId, "expected parameter 'loadBalancerId' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.vnicSelection = Objects.requireNonNull($.vnicSelection, "expected parameter 'vnicSelection' to be non-null");
            return $;
        }
    }

}
