// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudVmClusterIormConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudVmClusterIormConfigArgs Empty = new GetCloudVmClusterIormConfigArgs();

    /**
     * The cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="cloudVmClusterId", required=true)
    private String cloudVmClusterId;

    /**
     * @return The cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String cloudVmClusterId() {
        return this.cloudVmClusterId;
    }

    private GetCloudVmClusterIormConfigArgs() {}

    private GetCloudVmClusterIormConfigArgs(GetCloudVmClusterIormConfigArgs $) {
        this.cloudVmClusterId = $.cloudVmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudVmClusterIormConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudVmClusterIormConfigArgs $;

        public Builder() {
            $ = new GetCloudVmClusterIormConfigArgs();
        }

        public Builder(GetCloudVmClusterIormConfigArgs defaults) {
            $ = new GetCloudVmClusterIormConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudVmClusterId The cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            $.cloudVmClusterId = cloudVmClusterId;
            return this;
        }

        public GetCloudVmClusterIormConfigArgs build() {
            $.cloudVmClusterId = Objects.requireNonNull($.cloudVmClusterId, "expected parameter 'cloudVmClusterId' to be non-null");
            return $;
        }
    }

}
