// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostnameState extends com.pulumi.resources.ResourceArgs {

    public static final HostnameState Empty = new HostnameState();

    /**
     * (Updatable) A virtual hostname. For more information about virtual hostname string construction, see [Managing Request Routing](https://docs.cloud.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).  Example: `app.example.com`
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return (Updatable) A virtual hostname. For more information about virtual hostname string construction, see [Managing Request Routing](https://docs.cloud.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).  Example: `app.example.com`
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to add the hostname to.
     * 
     */
    @Import(name="loadBalancerId")
    private @Nullable Output<String> loadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to add the hostname to.
     * 
     */
    public Optional<Output<String>> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential information.  Example: `example_hostname_001`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential information.  Example: `example_hostname_001`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private HostnameState() {}

    private HostnameState(HostnameState $) {
        this.hostname = $.hostname;
        this.loadBalancerId = $.loadBalancerId;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostnameState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostnameState $;

        public Builder() {
            $ = new HostnameState();
        }

        public Builder(HostnameState defaults) {
            $ = new HostnameState(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname (Updatable) A virtual hostname. For more information about virtual hostname string construction, see [Managing Request Routing](https://docs.cloud.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).  Example: `app.example.com`
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname (Updatable) A virtual hostname. For more information about virtual hostname string construction, see [Managing Request Routing](https://docs.cloud.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).  Example: `app.example.com`
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to add the hostname to.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(@Nullable Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to add the hostname to.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param name A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential information.  Example: `example_hostname_001`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential information.  Example: `example_hostname_001`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public HostnameState build() {
            return $;
        }
    }

}
