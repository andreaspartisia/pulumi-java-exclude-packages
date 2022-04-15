// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an RSA key that may be used in a Certificate issued from a CaPool.
 * 
 */
public final class RsaKeyTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final RsaKeyTypeResponse Empty = new RsaKeyTypeResponse();

    /**
     * Optional. The maximum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    @Import(name="maxModulusSize", required=true)
      private final String maxModulusSize;

    public String maxModulusSize() {
        return this.maxModulusSize;
    }

    /**
     * Optional. The minimum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service-level min RSA modulus size will continue to apply.
     * 
     */
    @Import(name="minModulusSize", required=true)
      private final String minModulusSize;

    public String minModulusSize() {
        return this.minModulusSize;
    }

    public RsaKeyTypeResponse(
        String maxModulusSize,
        String minModulusSize) {
        this.maxModulusSize = Objects.requireNonNull(maxModulusSize, "expected parameter 'maxModulusSize' to be non-null");
        this.minModulusSize = Objects.requireNonNull(minModulusSize, "expected parameter 'minModulusSize' to be non-null");
    }

    private RsaKeyTypeResponse() {
        this.maxModulusSize = null;
        this.minModulusSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaKeyTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxModulusSize;
        private String minModulusSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RsaKeyTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxModulusSize = defaults.maxModulusSize;
    	      this.minModulusSize = defaults.minModulusSize;
        }

        public Builder maxModulusSize(String maxModulusSize) {
            this.maxModulusSize = Objects.requireNonNull(maxModulusSize);
            return this;
        }
        public Builder minModulusSize(String minModulusSize) {
            this.minModulusSize = Objects.requireNonNull(minModulusSize);
            return this;
        }        public RsaKeyTypeResponse build() {
            return new RsaKeyTypeResponse(maxModulusSize, minModulusSize);
        }
    }
}
