// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterInterfaceArgs Empty = new RouterInterfaceArgs();

    /**
     * The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel` and `interconnect_attachment` can be
     * specified.
     * 
     */
    @InputImport(name="interconnectAttachment")
    private final @Nullable Input<String> interconnectAttachment;

    public Input<String> getInterconnectAttachment() {
        return this.interconnectAttachment == null ? Input.empty() : this.interconnectAttachment;
    }

    /**
     * IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    @InputImport(name="ipRange")
    private final @Nullable Input<String> ipRange;

    public Input<String> getIpRange() {
        return this.ipRange == null ? Input.empty() : this.ipRange;
    }

    /**
     * A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which this interface's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region this interface's router sits in. If not specified,
     * the project region will be used. Changing this forces a new interface to be
     * created.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     */
    @InputImport(name="router", required=true)
    private final Input<String> router;

    public Input<String> getRouter() {
        return this.router;
    }

    /**
     * The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel` and `interconnect_attachment` can be specified.
     * 
     */
    @InputImport(name="vpnTunnel")
    private final @Nullable Input<String> vpnTunnel;

    public Input<String> getVpnTunnel() {
        return this.vpnTunnel == null ? Input.empty() : this.vpnTunnel;
    }

    public RouterInterfaceArgs(
        @Nullable Input<String> interconnectAttachment,
        @Nullable Input<String> ipRange,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> router,
        @Nullable Input<String> vpnTunnel) {
        this.interconnectAttachment = interconnectAttachment;
        this.ipRange = ipRange;
        this.name = name;
        this.project = project;
        this.region = region;
        this.router = Objects.requireNonNull(router, "expected parameter 'router' to be non-null");
        this.vpnTunnel = vpnTunnel;
    }

    private RouterInterfaceArgs() {
        this.interconnectAttachment = Input.empty();
        this.ipRange = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.router = Input.empty();
        this.vpnTunnel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> interconnectAttachment;
        private @Nullable Input<String> ipRange;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> router;
        private @Nullable Input<String> vpnTunnel;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipRange = defaults.ipRange;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.router = defaults.router;
    	      this.vpnTunnel = defaults.vpnTunnel;
        }

        public Builder setInterconnectAttachment(@Nullable Input<String> interconnectAttachment) {
            this.interconnectAttachment = interconnectAttachment;
            return this;
        }

        public Builder setInterconnectAttachment(@Nullable String interconnectAttachment) {
            this.interconnectAttachment = Input.ofNullable(interconnectAttachment);
            return this;
        }

        public Builder setIpRange(@Nullable Input<String> ipRange) {
            this.ipRange = ipRange;
            return this;
        }

        public Builder setIpRange(@Nullable String ipRange) {
            this.ipRange = Input.ofNullable(ipRange);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRouter(Input<String> router) {
            this.router = Objects.requireNonNull(router);
            return this;
        }

        public Builder setRouter(String router) {
            this.router = Input.of(Objects.requireNonNull(router));
            return this;
        }

        public Builder setVpnTunnel(@Nullable Input<String> vpnTunnel) {
            this.vpnTunnel = vpnTunnel;
            return this;
        }

        public Builder setVpnTunnel(@Nullable String vpnTunnel) {
            this.vpnTunnel = Input.ofNullable(vpnTunnel);
            return this;
        }

        public RouterInterfaceArgs build() {
            return new RouterInterfaceArgs(interconnectAttachment, ipRange, name, project, region, router, vpnTunnel);
        }
    }
}