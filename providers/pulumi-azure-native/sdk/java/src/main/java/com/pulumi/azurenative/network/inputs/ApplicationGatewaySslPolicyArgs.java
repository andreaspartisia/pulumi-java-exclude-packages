// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ApplicationGatewaySslCipherSuite;
import com.pulumi.azurenative.network.enums.ApplicationGatewaySslPolicyName;
import com.pulumi.azurenative.network.enums.ApplicationGatewaySslPolicyType;
import com.pulumi.azurenative.network.enums.ApplicationGatewaySslProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application Gateway Ssl policy.
 * 
 */
public final class ApplicationGatewaySslPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewaySslPolicyArgs Empty = new ApplicationGatewaySslPolicyArgs();

    /**
     * Ssl cipher suites to be enabled in the specified order to application gateway.
     * 
     */
    @Import(name="cipherSuites")
    private @Nullable Output<List<Either<String,ApplicationGatewaySslCipherSuite>>> cipherSuites;

    public Optional<Output<List<Either<String,ApplicationGatewaySslCipherSuite>>>> cipherSuites() {
        return Optional.ofNullable(this.cipherSuites);
    }

    /**
     * Ssl protocols to be disabled on application gateway.
     * 
     */
    @Import(name="disabledSslProtocols")
    private @Nullable Output<List<Either<String,ApplicationGatewaySslProtocol>>> disabledSslProtocols;

    public Optional<Output<List<Either<String,ApplicationGatewaySslProtocol>>>> disabledSslProtocols() {
        return Optional.ofNullable(this.disabledSslProtocols);
    }

    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    @Import(name="minProtocolVersion")
    private @Nullable Output<Either<String,ApplicationGatewaySslProtocol>> minProtocolVersion;

    public Optional<Output<Either<String,ApplicationGatewaySslProtocol>>> minProtocolVersion() {
        return Optional.ofNullable(this.minProtocolVersion);
    }

    /**
     * Name of Ssl predefined policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<Either<String,ApplicationGatewaySslPolicyName>> policyName;

    public Optional<Output<Either<String,ApplicationGatewaySslPolicyName>>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Type of Ssl Policy.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<Either<String,ApplicationGatewaySslPolicyType>> policyType;

    public Optional<Output<Either<String,ApplicationGatewaySslPolicyType>>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private ApplicationGatewaySslPolicyArgs() {}

    private ApplicationGatewaySslPolicyArgs(ApplicationGatewaySslPolicyArgs $) {
        this.cipherSuites = $.cipherSuites;
        this.disabledSslProtocols = $.disabledSslProtocols;
        this.minProtocolVersion = $.minProtocolVersion;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewaySslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewaySslPolicyArgs $;

        public Builder() {
            $ = new ApplicationGatewaySslPolicyArgs();
        }

        public Builder(ApplicationGatewaySslPolicyArgs defaults) {
            $ = new ApplicationGatewaySslPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder cipherSuites(@Nullable Output<List<Either<String,ApplicationGatewaySslCipherSuite>>> cipherSuites) {
            $.cipherSuites = cipherSuites;
            return this;
        }

        public Builder cipherSuites(List<Either<String,ApplicationGatewaySslCipherSuite>> cipherSuites) {
            return cipherSuites(Output.of(cipherSuites));
        }

        public Builder cipherSuites(Either<String,ApplicationGatewaySslCipherSuite>... cipherSuites) {
            return cipherSuites(List.of(cipherSuites));
        }

        public Builder disabledSslProtocols(@Nullable Output<List<Either<String,ApplicationGatewaySslProtocol>>> disabledSslProtocols) {
            $.disabledSslProtocols = disabledSslProtocols;
            return this;
        }

        public Builder disabledSslProtocols(List<Either<String,ApplicationGatewaySslProtocol>> disabledSslProtocols) {
            return disabledSslProtocols(Output.of(disabledSslProtocols));
        }

        public Builder disabledSslProtocols(Either<String,ApplicationGatewaySslProtocol>... disabledSslProtocols) {
            return disabledSslProtocols(List.of(disabledSslProtocols));
        }

        public Builder minProtocolVersion(@Nullable Output<Either<String,ApplicationGatewaySslProtocol>> minProtocolVersion) {
            $.minProtocolVersion = minProtocolVersion;
            return this;
        }

        public Builder minProtocolVersion(Either<String,ApplicationGatewaySslProtocol> minProtocolVersion) {
            return minProtocolVersion(Output.of(minProtocolVersion));
        }

        public Builder minProtocolVersion(String minProtocolVersion) {
            return minProtocolVersion(Either.ofLeft(minProtocolVersion));
        }

        public Builder minProtocolVersion(ApplicationGatewaySslProtocol minProtocolVersion) {
            return minProtocolVersion(Either.ofRight(minProtocolVersion));
        }

        public Builder policyName(@Nullable Output<Either<String,ApplicationGatewaySslPolicyName>> policyName) {
            $.policyName = policyName;
            return this;
        }

        public Builder policyName(Either<String,ApplicationGatewaySslPolicyName> policyName) {
            return policyName(Output.of(policyName));
        }

        public Builder policyName(String policyName) {
            return policyName(Either.ofLeft(policyName));
        }

        public Builder policyName(ApplicationGatewaySslPolicyName policyName) {
            return policyName(Either.ofRight(policyName));
        }

        public Builder policyType(@Nullable Output<Either<String,ApplicationGatewaySslPolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        public Builder policyType(Either<String,ApplicationGatewaySslPolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        public Builder policyType(String policyType) {
            return policyType(Either.ofLeft(policyType));
        }

        public Builder policyType(ApplicationGatewaySslPolicyType policyType) {
            return policyType(Either.ofRight(policyType));
        }

        public ApplicationGatewaySslPolicyArgs build() {
            return $;
        }
    }

}
