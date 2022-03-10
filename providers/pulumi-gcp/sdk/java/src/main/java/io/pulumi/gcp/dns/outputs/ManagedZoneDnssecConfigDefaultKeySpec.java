// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedZoneDnssecConfigDefaultKeySpec {
    /**
     * String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    private final @Nullable String algorithm;
    /**
     * Length of the keys in bits
     * 
     */
    private final @Nullable Integer keyLength;
    /**
     * Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are `keySigning` and `zoneSigning`.
     * 
     */
    private final @Nullable String keyType;
    /**
     * Identifies what kind of resource this is
     * 
     */
    private final @Nullable String kind;

    @OutputCustomType.Constructor
    private ManagedZoneDnssecConfigDefaultKeySpec(
        @OutputCustomType.Parameter("algorithm") @Nullable String algorithm,
        @OutputCustomType.Parameter("keyLength") @Nullable Integer keyLength,
        @OutputCustomType.Parameter("keyType") @Nullable String keyType,
        @OutputCustomType.Parameter("kind") @Nullable String kind) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.keyType = keyType;
        this.kind = kind;
    }

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
    */
    public Optional<String> getAlgorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * Length of the keys in bits
     * 
    */
    public Optional<Integer> getKeyLength() {
        return Optional.ofNullable(this.keyLength);
    }
    /**
     * Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are `keySigning` and `zoneSigning`.
     * 
    */
    public Optional<String> getKeyType() {
        return Optional.ofNullable(this.keyType);
    }
    /**
     * Identifies what kind of resource this is
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnssecConfigDefaultKeySpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable Integer keyLength;
        private @Nullable String keyType;
        private @Nullable String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnssecConfigDefaultKeySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder setAlgorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setKeyLength(@Nullable Integer keyLength) {
            this.keyLength = keyLength;
            return this;
        }

        public Builder setKeyType(@Nullable String keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public ManagedZoneDnssecConfigDefaultKeySpec build() {
            return new ManagedZoneDnssecConfigDefaultKeySpec(algorithm, keyLength, keyType, kind);
        }
    }
}
