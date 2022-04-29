// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PublicIpPoolCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicIpPoolCapacityArgs Empty = new PublicIpPoolCapacityArgs();

    /**
     * The OCID of the Byoip Range Id object to which the cidr block belongs.
     * 
     */
    @Import(name="byoipId", required=true)
    private Output<String> byoipId;

    /**
     * @return The OCID of the Byoip Range Id object to which the cidr block belongs.
     * 
     */
    public Output<String> byoipId() {
        return this.byoipId;
    }

    /**
     * The CIDR IP address range to be added to the Public Ip Pool. Example: `10.0.1.0/24`
     * 
     */
    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    /**
     * @return The CIDR IP address range to be added to the Public Ip Pool. Example: `10.0.1.0/24`
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The OCID of the pool object created by the current tenancy
     * 
     */
    @Import(name="publicIpPoolId", required=true)
    private Output<String> publicIpPoolId;

    /**
     * @return The OCID of the pool object created by the current tenancy
     * 
     */
    public Output<String> publicIpPoolId() {
        return this.publicIpPoolId;
    }

    private PublicIpPoolCapacityArgs() {}

    private PublicIpPoolCapacityArgs(PublicIpPoolCapacityArgs $) {
        this.byoipId = $.byoipId;
        this.cidrBlock = $.cidrBlock;
        this.publicIpPoolId = $.publicIpPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicIpPoolCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicIpPoolCapacityArgs $;

        public Builder() {
            $ = new PublicIpPoolCapacityArgs();
        }

        public Builder(PublicIpPoolCapacityArgs defaults) {
            $ = new PublicIpPoolCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byoipId The OCID of the Byoip Range Id object to which the cidr block belongs.
         * 
         * @return builder
         * 
         */
        public Builder byoipId(Output<String> byoipId) {
            $.byoipId = byoipId;
            return this;
        }

        /**
         * @param byoipId The OCID of the Byoip Range Id object to which the cidr block belongs.
         * 
         * @return builder
         * 
         */
        public Builder byoipId(String byoipId) {
            return byoipId(Output.of(byoipId));
        }

        /**
         * @param cidrBlock The CIDR IP address range to be added to the Public Ip Pool. Example: `10.0.1.0/24`
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR IP address range to be added to the Public Ip Pool. Example: `10.0.1.0/24`
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param publicIpPoolId The OCID of the pool object created by the current tenancy
         * 
         * @return builder
         * 
         */
        public Builder publicIpPoolId(Output<String> publicIpPoolId) {
            $.publicIpPoolId = publicIpPoolId;
            return this;
        }

        /**
         * @param publicIpPoolId The OCID of the pool object created by the current tenancy
         * 
         * @return builder
         * 
         */
        public Builder publicIpPoolId(String publicIpPoolId) {
            return publicIpPoolId(Output.of(publicIpPoolId));
        }

        public PublicIpPoolCapacityArgs build() {
            $.byoipId = Objects.requireNonNull($.byoipId, "expected parameter 'byoipId' to be non-null");
            $.cidrBlock = Objects.requireNonNull($.cidrBlock, "expected parameter 'cidrBlock' to be non-null");
            $.publicIpPoolId = Objects.requireNonNull($.publicIpPoolId, "expected parameter 'publicIpPoolId' to be non-null");
            return $;
        }
    }

}
