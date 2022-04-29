// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMaskingPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaskingPolicyArgs Empty = new GetMaskingPolicyArgs();

    /**
     * The OCID of the masking policy.
     * 
     */
    @Import(name="maskingPolicyId", required=true)
    private String maskingPolicyId;

    /**
     * @return The OCID of the masking policy.
     * 
     */
    public String maskingPolicyId() {
        return this.maskingPolicyId;
    }

    private GetMaskingPolicyArgs() {}

    private GetMaskingPolicyArgs(GetMaskingPolicyArgs $) {
        this.maskingPolicyId = $.maskingPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaskingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaskingPolicyArgs $;

        public Builder() {
            $ = new GetMaskingPolicyArgs();
        }

        public Builder(GetMaskingPolicyArgs defaults) {
            $ = new GetMaskingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maskingPolicyId The OCID of the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            $.maskingPolicyId = maskingPolicyId;
            return this;
        }

        public GetMaskingPolicyArgs build() {
            $.maskingPolicyId = Objects.requireNonNull($.maskingPolicyId, "expected parameter 'maskingPolicyId' to be non-null");
            return $;
        }
    }

}
