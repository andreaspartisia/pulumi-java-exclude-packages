// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkSecurityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkSecurityGroupArgs Empty = new GetNetworkSecurityGroupArgs();

    /**
     * Specifies the Name of the Network Security Group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the Name of the Network Security Group.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the Name of the Resource Group within which the Network Security Group exists
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the Name of the Resource Group within which the Network Security Group exists
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNetworkSecurityGroupArgs() {}

    private GetNetworkSecurityGroupArgs(GetNetworkSecurityGroupArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkSecurityGroupArgs $;

        public Builder() {
            $ = new GetNetworkSecurityGroupArgs();
        }

        public Builder(GetNetworkSecurityGroupArgs defaults) {
            $ = new GetNetworkSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the Name of the Network Security Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the Name of the Resource Group within which the Network Security Group exists
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNetworkSecurityGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
