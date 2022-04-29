// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDedicatedVmHostArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedVmHostArgs Empty = new GetDedicatedVmHostArgs();

    /**
     * The OCID of the dedicated VM host.
     * 
     */
    @Import(name="dedicatedVmHostId", required=true)
    private String dedicatedVmHostId;

    /**
     * @return The OCID of the dedicated VM host.
     * 
     */
    public String dedicatedVmHostId() {
        return this.dedicatedVmHostId;
    }

    private GetDedicatedVmHostArgs() {}

    private GetDedicatedVmHostArgs(GetDedicatedVmHostArgs $) {
        this.dedicatedVmHostId = $.dedicatedVmHostId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedVmHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedVmHostArgs $;

        public Builder() {
            $ = new GetDedicatedVmHostArgs();
        }

        public Builder(GetDedicatedVmHostArgs defaults) {
            $ = new GetDedicatedVmHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicatedVmHostId The OCID of the dedicated VM host.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedVmHostId(String dedicatedVmHostId) {
            $.dedicatedVmHostId = dedicatedVmHostId;
            return this;
        }

        public GetDedicatedVmHostArgs build() {
            $.dedicatedVmHostId = Objects.requireNonNull($.dedicatedVmHostId, "expected parameter 'dedicatedVmHostId' to be non-null");
            return $;
        }
    }

}
