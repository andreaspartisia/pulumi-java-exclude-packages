// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ComplianceVersionResponse {
    /**
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is applicable to.
     * 
     */
    private final String cpeUri;
    /**
     * The version of the benchmark. This is set to the version of the OS-specific CIS document the benchmark is defined in.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ComplianceVersionResponse(
        @CustomType.Parameter("cpeUri") String cpeUri,
        @CustomType.Parameter("version") String version) {
        this.cpeUri = cpeUri;
        this.version = version;
    }

    /**
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is applicable to.
     * 
    */
    public String cpeUri() {
        return this.cpeUri;
    }
    /**
     * The version of the benchmark. This is set to the version of the OS-specific CIS document the benchmark is defined in.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.version = defaults.version;
        }

        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ComplianceVersionResponse build() {
            return new ComplianceVersionResponse(cpeUri, version);
        }
    }
}
