// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.MetadataLabelMatcherResponse;
import java.util.Objects;


/**
 * A definition of a matcher that selects endpoints to which the policies should be applied.
 * 
 */
public final class EndpointMatcherResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointMatcherResponse Empty = new EndpointMatcherResponse();

    /**
     * The matcher is based on node metadata presented by xDS clients.
     * 
     */
    @Import(name="metadataLabelMatcher", required=true)
      private final MetadataLabelMatcherResponse metadataLabelMatcher;

    public MetadataLabelMatcherResponse metadataLabelMatcher() {
        return this.metadataLabelMatcher;
    }

    public EndpointMatcherResponse(MetadataLabelMatcherResponse metadataLabelMatcher) {
        this.metadataLabelMatcher = Objects.requireNonNull(metadataLabelMatcher, "expected parameter 'metadataLabelMatcher' to be non-null");
    }

    private EndpointMatcherResponse() {
        this.metadataLabelMatcher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataLabelMatcherResponse metadataLabelMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatcher = defaults.metadataLabelMatcher;
        }

        public Builder metadataLabelMatcher(MetadataLabelMatcherResponse metadataLabelMatcher) {
            this.metadataLabelMatcher = Objects.requireNonNull(metadataLabelMatcher);
            return this;
        }        public EndpointMatcherResponse build() {
            return new EndpointMatcherResponse(metadataLabelMatcher);
        }
    }
}
