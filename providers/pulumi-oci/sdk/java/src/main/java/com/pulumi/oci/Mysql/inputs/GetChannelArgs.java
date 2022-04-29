// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelArgs Empty = new GetChannelArgs();

    /**
     * The Channel [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="channelId", required=true)
    private String channelId;

    /**
     * @return The Channel [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String channelId() {
        return this.channelId;
    }

    private GetChannelArgs() {}

    private GetChannelArgs(GetChannelArgs $) {
        this.channelId = $.channelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelArgs $;

        public Builder() {
            $ = new GetChannelArgs();
        }

        public Builder(GetChannelArgs defaults) {
            $ = new GetChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId The Channel [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            $.channelId = channelId;
            return this;
        }

        public GetChannelArgs build() {
            $.channelId = Objects.requireNonNull($.channelId, "expected parameter 'channelId' to be non-null");
            return $;
        }
    }

}
