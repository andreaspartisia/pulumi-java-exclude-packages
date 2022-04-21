// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyRuleApplicationProtocolType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the application rule protocol.
 * 
 */
public final class FirewallPolicyRuleApplicationProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleApplicationProtocolArgs Empty = new FirewallPolicyRuleApplicationProtocolArgs();

    /**
     * Port number for the protocol, cannot be greater than 64000.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol type.
     * 
     */
    @Import(name="protocolType")
    private @Nullable Output<Either<String,FirewallPolicyRuleApplicationProtocolType>> protocolType;

    public Optional<Output<Either<String,FirewallPolicyRuleApplicationProtocolType>>> protocolType() {
        return Optional.ofNullable(this.protocolType);
    }

    private FirewallPolicyRuleApplicationProtocolArgs() {}

    private FirewallPolicyRuleApplicationProtocolArgs(FirewallPolicyRuleApplicationProtocolArgs $) {
        this.port = $.port;
        this.protocolType = $.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleApplicationProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleApplicationProtocolArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleApplicationProtocolArgs();
        }

        public Builder(FirewallPolicyRuleApplicationProtocolArgs defaults) {
            $ = new FirewallPolicyRuleApplicationProtocolArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocolType(@Nullable Output<Either<String,FirewallPolicyRuleApplicationProtocolType>> protocolType) {
            $.protocolType = protocolType;
            return this;
        }

        public Builder protocolType(Either<String,FirewallPolicyRuleApplicationProtocolType> protocolType) {
            return protocolType(Output.of(protocolType));
        }

        public Builder protocolType(String protocolType) {
            return protocolType(Either.ofLeft(protocolType));
        }

        public Builder protocolType(FirewallPolicyRuleApplicationProtocolType protocolType) {
            return protocolType(Either.ofRight(protocolType));
        }

        public FirewallPolicyRuleApplicationProtocolArgs build() {
            return $;
        }
    }

}
