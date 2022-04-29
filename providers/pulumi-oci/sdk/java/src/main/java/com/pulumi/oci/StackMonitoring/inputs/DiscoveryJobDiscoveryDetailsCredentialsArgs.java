// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.StackMonitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.StackMonitoring.inputs.DiscoveryJobDiscoveryDetailsCredentialsItemArgs;
import java.util.List;
import java.util.Objects;


public final class DiscoveryJobDiscoveryDetailsCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiscoveryJobDiscoveryDetailsCredentialsArgs Empty = new DiscoveryJobDiscoveryDetailsCredentialsArgs();

    /**
     * List of DiscoveryJob credentials.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<DiscoveryJobDiscoveryDetailsCredentialsItemArgs>> items;

    /**
     * @return List of DiscoveryJob credentials.
     * 
     */
    public Output<List<DiscoveryJobDiscoveryDetailsCredentialsItemArgs>> items() {
        return this.items;
    }

    private DiscoveryJobDiscoveryDetailsCredentialsArgs() {}

    private DiscoveryJobDiscoveryDetailsCredentialsArgs(DiscoveryJobDiscoveryDetailsCredentialsArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiscoveryJobDiscoveryDetailsCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveryJobDiscoveryDetailsCredentialsArgs $;

        public Builder() {
            $ = new DiscoveryJobDiscoveryDetailsCredentialsArgs();
        }

        public Builder(DiscoveryJobDiscoveryDetailsCredentialsArgs defaults) {
            $ = new DiscoveryJobDiscoveryDetailsCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items List of DiscoveryJob credentials.
         * 
         * @return builder
         * 
         */
        public Builder items(Output<List<DiscoveryJobDiscoveryDetailsCredentialsItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items List of DiscoveryJob credentials.
         * 
         * @return builder
         * 
         */
        public Builder items(List<DiscoveryJobDiscoveryDetailsCredentialsItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items List of DiscoveryJob credentials.
         * 
         * @return builder
         * 
         */
        public Builder items(DiscoveryJobDiscoveryDetailsCredentialsItemArgs... items) {
            return items(List.of(items));
        }

        public DiscoveryJobDiscoveryDetailsCredentialsArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
