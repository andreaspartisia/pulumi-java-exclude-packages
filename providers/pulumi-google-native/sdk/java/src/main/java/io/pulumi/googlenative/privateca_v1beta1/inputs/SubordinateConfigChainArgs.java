// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This message describes a subordinate CA's issuer certificate chain. This wrapper exists for compatibility reasons.
 * 
 */
public final class SubordinateConfigChainArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubordinateConfigChainArgs Empty = new SubordinateConfigChainArgs();

    /**
     * Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    @Import(name="pemCertificates", required=true)
      private final Output<List<String>> pemCertificates;

    public Output<List<String>> pemCertificates() {
        return this.pemCertificates;
    }

    public SubordinateConfigChainArgs(Output<List<String>> pemCertificates) {
        this.pemCertificates = Objects.requireNonNull(pemCertificates, "expected parameter 'pemCertificates' to be non-null");
    }

    private SubordinateConfigChainArgs() {
        this.pemCertificates = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubordinateConfigChainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> pemCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(SubordinateConfigChainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pemCertificates = defaults.pemCertificates;
        }

        public Builder pemCertificates(Output<List<String>> pemCertificates) {
            this.pemCertificates = Objects.requireNonNull(pemCertificates);
            return this;
        }
        public Builder pemCertificates(List<String> pemCertificates) {
            this.pemCertificates = Output.of(Objects.requireNonNull(pemCertificates));
            return this;
        }
        public Builder pemCertificates(String... pemCertificates) {
            return pemCertificates(List.of(pemCertificates));
        }        public SubordinateConfigChainArgs build() {
            return new SubordinateConfigChainArgs(pemCertificates);
        }
    }
}
