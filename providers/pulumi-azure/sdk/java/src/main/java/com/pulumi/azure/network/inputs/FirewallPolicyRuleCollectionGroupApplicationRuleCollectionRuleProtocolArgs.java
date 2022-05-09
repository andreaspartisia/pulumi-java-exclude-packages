// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs Empty = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs();

    /**
     * Port number of the protocol. Range is 0-64000.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Port number of the protocol. Range is 0-64000.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Protocol type. Possible values are `Http` and `Https`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Protocol type. Possible values are `Http` and `Https`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs() {}

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs $) {
        this.port = $.port;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs();
        }

        public Builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs defaults) {
            $ = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port Port number of the protocol. Range is 0-64000.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number of the protocol. Range is 0-64000.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param type Protocol type. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Protocol type. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
