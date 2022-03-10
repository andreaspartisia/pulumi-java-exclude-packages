// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InboundSamlConfigSpConfigSpCertificate {
    /**
     * - 
     * The x509 certificate
     * 
     */
    private final @Nullable String x509Certificate;

    @OutputCustomType.Constructor
    private InboundSamlConfigSpConfigSpCertificate(@OutputCustomType.Parameter("x509Certificate") @Nullable String x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    /**
     * - 
     * The x509 certificate
     * 
    */
    public Optional<String> getX509Certificate() {
        return Optional.ofNullable(this.x509Certificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigSpConfigSpCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String x509Certificate;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigSpConfigSpCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x509Certificate = defaults.x509Certificate;
        }

        public Builder setX509Certificate(@Nullable String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public InboundSamlConfigSpConfigSpCertificate build() {
            return new InboundSamlConfigSpConfigSpCertificate(x509Certificate);
        }
    }
}
