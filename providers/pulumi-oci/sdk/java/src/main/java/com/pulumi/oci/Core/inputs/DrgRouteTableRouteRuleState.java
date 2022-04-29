// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DrgRouteTableRouteRuleState extends com.pulumi.resources.ResourceArgs {

    public static final DrgRouteTableRouteRuleState Empty = new DrgRouteTableRouteRuleState();

    /**
     * Additional properties for the route, computed by the service.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<Map<String,Object>> attributes;

    /**
     * @return Additional properties for the route, computed by the service.
     * 
     */
    public Optional<Output<Map<String,Object>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
     * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
     * 
     */
    @Import(name="destinationType")
    private @Nullable Output<String> destinationType;

    /**
     * @return (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
     * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
     * 
     */
    public Optional<Output<String>> destinationType() {
        return Optional.ofNullable(this.destinationType);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
     * 
     */
    @Import(name="drgRouteTableId")
    private @Nullable Output<String> drgRouteTableId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
     * 
     */
    public Optional<Output<String>> drgRouteTableId() {
        return Optional.ofNullable(this.drgRouteTableId);
    }

    /**
     * Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
     * 
     */
    @Import(name="isBlackhole")
    private @Nullable Output<Boolean> isBlackhole;

    /**
     * @return Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
     * 
     */
    public Optional<Output<Boolean>> isBlackhole() {
        return Optional.ofNullable(this.isBlackhole);
    }

    /**
     * Indicates that the route was not imported due to a conflict between route rules.
     * 
     */
    @Import(name="isConflict")
    private @Nullable Output<Boolean> isConflict;

    /**
     * @return Indicates that the route was not imported due to a conflict between route rules.
     * 
     */
    public Optional<Output<Boolean>> isConflict() {
        return Optional.ofNullable(this.isConflict);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
     * 
     */
    @Import(name="nextHopDrgAttachmentId")
    private @Nullable Output<String> nextHopDrgAttachmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
     * 
     */
    public Optional<Output<String>> nextHopDrgAttachmentId() {
        return Optional.ofNullable(this.nextHopDrgAttachmentId);
    }

    /**
     * The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment, and is propagated to peered DRGs via RPC attachments, the route&#39;s provenance in the peered DRGs remains `IPSEC_TUNNEL`, because that is the earliest origin.
     * 
     */
    @Import(name="routeProvenance")
    private @Nullable Output<String> routeProvenance;

    /**
     * @return The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment, and is propagated to peered DRGs via RPC attachments, the route&#39;s provenance in the peered DRGs remains `IPSEC_TUNNEL`, because that is the earliest origin.
     * 
     */
    public Optional<Output<String>> routeProvenance() {
        return Optional.ofNullable(this.routeProvenance);
    }

    /**
     * You can specify static routes for the DRG route table using the API. The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     * 
     */
    @Import(name="routeType")
    private @Nullable Output<String> routeType;

    /**
     * @return You can specify static routes for the DRG route table using the API. The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     * 
     */
    public Optional<Output<String>> routeType() {
        return Optional.ofNullable(this.routeType);
    }

    private DrgRouteTableRouteRuleState() {}

    private DrgRouteTableRouteRuleState(DrgRouteTableRouteRuleState $) {
        this.attributes = $.attributes;
        this.destination = $.destination;
        this.destinationType = $.destinationType;
        this.drgRouteTableId = $.drgRouteTableId;
        this.isBlackhole = $.isBlackhole;
        this.isConflict = $.isConflict;
        this.nextHopDrgAttachmentId = $.nextHopDrgAttachmentId;
        this.routeProvenance = $.routeProvenance;
        this.routeType = $.routeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DrgRouteTableRouteRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DrgRouteTableRouteRuleState $;

        public Builder() {
            $ = new DrgRouteTableRouteRuleState();
        }

        public Builder(DrgRouteTableRouteRuleState defaults) {
            $ = new DrgRouteTableRouteRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes Additional properties for the route, computed by the service.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<Map<String,Object>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Additional properties for the route, computed by the service.
         * 
         * @return builder
         * 
         */
        public Builder attributes(Map<String,Object> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param destination (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param destinationType (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
         * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder destinationType(@Nullable Output<String> destinationType) {
            $.destinationType = destinationType;
            return this;
        }

        /**
         * @param destinationType (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
         * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder destinationType(String destinationType) {
            return destinationType(Output.of(destinationType));
        }

        /**
         * @param drgRouteTableId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteTableId(@Nullable Output<String> drgRouteTableId) {
            $.drgRouteTableId = drgRouteTableId;
            return this;
        }

        /**
         * @param drgRouteTableId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteTableId(String drgRouteTableId) {
            return drgRouteTableId(Output.of(drgRouteTableId));
        }

        /**
         * @param isBlackhole Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
         * 
         * @return builder
         * 
         */
        public Builder isBlackhole(@Nullable Output<Boolean> isBlackhole) {
            $.isBlackhole = isBlackhole;
            return this;
        }

        /**
         * @param isBlackhole Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
         * 
         * @return builder
         * 
         */
        public Builder isBlackhole(Boolean isBlackhole) {
            return isBlackhole(Output.of(isBlackhole));
        }

        /**
         * @param isConflict Indicates that the route was not imported due to a conflict between route rules.
         * 
         * @return builder
         * 
         */
        public Builder isConflict(@Nullable Output<Boolean> isConflict) {
            $.isConflict = isConflict;
            return this;
        }

        /**
         * @param isConflict Indicates that the route was not imported due to a conflict between route rules.
         * 
         * @return builder
         * 
         */
        public Builder isConflict(Boolean isConflict) {
            return isConflict(Output.of(isConflict));
        }

        /**
         * @param nextHopDrgAttachmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
         * 
         * @return builder
         * 
         */
        public Builder nextHopDrgAttachmentId(@Nullable Output<String> nextHopDrgAttachmentId) {
            $.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            return this;
        }

        /**
         * @param nextHopDrgAttachmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
         * 
         * @return builder
         * 
         */
        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            return nextHopDrgAttachmentId(Output.of(nextHopDrgAttachmentId));
        }

        /**
         * @param routeProvenance The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment, and is propagated to peered DRGs via RPC attachments, the route&#39;s provenance in the peered DRGs remains `IPSEC_TUNNEL`, because that is the earliest origin.
         * 
         * @return builder
         * 
         */
        public Builder routeProvenance(@Nullable Output<String> routeProvenance) {
            $.routeProvenance = routeProvenance;
            return this;
        }

        /**
         * @param routeProvenance The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment, and is propagated to peered DRGs via RPC attachments, the route&#39;s provenance in the peered DRGs remains `IPSEC_TUNNEL`, because that is the earliest origin.
         * 
         * @return builder
         * 
         */
        public Builder routeProvenance(String routeProvenance) {
            return routeProvenance(Output.of(routeProvenance));
        }

        /**
         * @param routeType You can specify static routes for the DRG route table using the API. The DRG learns dynamic routes from the DRG attachments using various routing protocols.
         * 
         * @return builder
         * 
         */
        public Builder routeType(@Nullable Output<String> routeType) {
            $.routeType = routeType;
            return this;
        }

        /**
         * @param routeType You can specify static routes for the DRG route table using the API. The DRG learns dynamic routes from the DRG attachments using various routing protocols.
         * 
         * @return builder
         * 
         */
        public Builder routeType(String routeType) {
            return routeType(Output.of(routeType));
        }

        public DrgRouteTableRouteRuleState build() {
            return $;
        }
    }

}
