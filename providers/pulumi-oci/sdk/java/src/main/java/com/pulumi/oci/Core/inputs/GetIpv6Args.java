// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIpv6Args extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6Args Empty = new GetIpv6Args();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
     * 
     */
    @Import(name="ipv6id", required=true)
    private String ipv6id;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
     * 
     */
    public String ipv6id() {
        return this.ipv6id;
    }

    private GetIpv6Args() {}

    private GetIpv6Args(GetIpv6Args $) {
        this.ipv6id = $.ipv6id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6Args $;

        public Builder() {
            $ = new GetIpv6Args();
        }

        public Builder(GetIpv6Args defaults) {
            $ = new GetIpv6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv6id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6.
         * 
         * @return builder
         * 
         */
        public Builder ipv6id(String ipv6id) {
            $.ipv6id = ipv6id;
            return this;
        }

        public GetIpv6Args build() {
            $.ipv6id = Objects.requireNonNull($.ipv6id, "expected parameter 'ipv6id' to be non-null");
            return $;
        }
    }

}
