// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubnetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetArgs Empty = new GetSubnetArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
     * 
     */
    @Import(name="subnetId", required=true)
    private String subnetId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    private GetSubnetArgs() {}

    private GetSubnetArgs(GetSubnetArgs $) {
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetArgs $;

        public Builder() {
            $ = new GetSubnetArgs();
        }

        public Builder(GetSubnetArgs defaults) {
            $ = new GetSubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public GetSubnetArgs build() {
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
