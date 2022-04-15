// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.privateca_v1.outputs.IssuancePolicyResponse;
import io.pulumi.googlenative.privateca_v1.outputs.PublishingOptionsResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCaPoolResult {
    /**
     * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * 
     */
    private final IssuancePolicyResponse issuancePolicy;
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name for this CaPool in the format `projects/*{@literal /}locations/*{@literal /}caPools/*`.
     * 
     */
    private final String name;
    /**
     * Optional. The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * 
     */
    private final PublishingOptionsResponse publishingOptions;
    /**
     * Immutable. The Tier of this CaPool.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private GetCaPoolResult(
        @CustomType.Parameter("issuancePolicy") IssuancePolicyResponse issuancePolicy,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publishingOptions") PublishingOptionsResponse publishingOptions,
        @CustomType.Parameter("tier") String tier) {
        this.issuancePolicy = issuancePolicy;
        this.labels = labels;
        this.name = name;
        this.publishingOptions = publishingOptions;
        this.tier = tier;
    }

    /**
     * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * 
    */
    public IssuancePolicyResponse issuancePolicy() {
        return this.issuancePolicy;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The resource name for this CaPool in the format `projects/*{@literal /}locations/*{@literal /}caPools/*`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * 
    */
    public PublishingOptionsResponse publishingOptions() {
        return this.publishingOptions;
    }
    /**
     * Immutable. The Tier of this CaPool.
     * 
    */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCaPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IssuancePolicyResponse issuancePolicy;
        private Map<String,String> labels;
        private String name;
        private PublishingOptionsResponse publishingOptions;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCaPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuancePolicy = defaults.issuancePolicy;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.publishingOptions = defaults.publishingOptions;
    	      this.tier = defaults.tier;
        }

        public Builder issuancePolicy(IssuancePolicyResponse issuancePolicy) {
            this.issuancePolicy = Objects.requireNonNull(issuancePolicy);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publishingOptions(PublishingOptionsResponse publishingOptions) {
            this.publishingOptions = Objects.requireNonNull(publishingOptions);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public GetCaPoolResult build() {
            return new GetCaPoolResult(issuancePolicy, labels, name, publishingOptions, tier);
        }
    }
}
