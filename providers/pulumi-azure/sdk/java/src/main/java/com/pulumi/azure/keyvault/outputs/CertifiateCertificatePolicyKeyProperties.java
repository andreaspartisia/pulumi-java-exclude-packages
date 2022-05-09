// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificatePolicyKeyProperties {
    /**
     * @return Specifies the curve to use when creating an `EC` key. Possible values are `P-256`, `P-256K`, `P-384`, and `P-521`. This field will be required in a future release if `key_type` is `EC` or `EC-HSM`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String curve;
    /**
     * @return Is this certificate exportable? Changing this forces a new resource to be created.
     * 
     */
    private final Boolean exportable;
    /**
     * @return The size of the key used in the certificate. Possible values include `2048`, `3072`, and `4096` for `RSA` keys, or `256`, `384`, and `521` for `EC` keys. This property is required when using RSA keys. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer keySize;
    /**
     * @return Specifies the type of key, such as `RSA` or `EC`. Changing this forces a new resource to be created.
     * 
     */
    private final String keyType;
    /**
     * @return Is the key reusable? Changing this forces a new resource to be created.
     * 
     */
    private final Boolean reuseKey;

    @CustomType.Constructor
    private CertifiateCertificatePolicyKeyProperties(
        @CustomType.Parameter("curve") @Nullable String curve,
        @CustomType.Parameter("exportable") Boolean exportable,
        @CustomType.Parameter("keySize") @Nullable Integer keySize,
        @CustomType.Parameter("keyType") String keyType,
        @CustomType.Parameter("reuseKey") Boolean reuseKey) {
        this.curve = curve;
        this.exportable = exportable;
        this.keySize = keySize;
        this.keyType = keyType;
        this.reuseKey = reuseKey;
    }

    /**
     * @return Specifies the curve to use when creating an `EC` key. Possible values are `P-256`, `P-256K`, `P-384`, and `P-521`. This field will be required in a future release if `key_type` is `EC` or `EC-HSM`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> curve() {
        return Optional.ofNullable(this.curve);
    }
    /**
     * @return Is this certificate exportable? Changing this forces a new resource to be created.
     * 
     */
    public Boolean exportable() {
        return this.exportable;
    }
    /**
     * @return The size of the key used in the certificate. Possible values include `2048`, `3072`, and `4096` for `RSA` keys, or `256`, `384`, and `521` for `EC` keys. This property is required when using RSA keys. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> keySize() {
        return Optional.ofNullable(this.keySize);
    }
    /**
     * @return Specifies the type of key, such as `RSA` or `EC`. Changing this forces a new resource to be created.
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    /**
     * @return Is the key reusable? Changing this forces a new resource to be created.
     * 
     */
    public Boolean reuseKey() {
        return this.reuseKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificatePolicyKeyProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String curve;
        private Boolean exportable;
        private @Nullable Integer keySize;
        private String keyType;
        private Boolean reuseKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CertifiateCertificatePolicyKeyProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.curve = defaults.curve;
    	      this.exportable = defaults.exportable;
    	      this.keySize = defaults.keySize;
    	      this.keyType = defaults.keyType;
    	      this.reuseKey = defaults.reuseKey;
        }

        public Builder curve(@Nullable String curve) {
            this.curve = curve;
            return this;
        }
        public Builder exportable(Boolean exportable) {
            this.exportable = Objects.requireNonNull(exportable);
            return this;
        }
        public Builder keySize(@Nullable Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder reuseKey(Boolean reuseKey) {
            this.reuseKey = Objects.requireNonNull(reuseKey);
            return this;
        }        public CertifiateCertificatePolicyKeyProperties build() {
            return new CertifiateCertificatePolicyKeyProperties(curve, exportable, keySize, keyType, reuseKey);
        }
    }
}
