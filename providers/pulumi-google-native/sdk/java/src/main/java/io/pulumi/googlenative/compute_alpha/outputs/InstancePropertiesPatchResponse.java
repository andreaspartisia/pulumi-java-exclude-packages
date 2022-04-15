// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class InstancePropertiesPatchResponse {
    /**
     * The label key-value pairs that you want to patch onto the instance.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * 
     */
    private final Map<String,String> metadata;

    @CustomType.Constructor
    private InstancePropertiesPatchResponse(
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("metadata") Map<String,String> metadata) {
        this.labels = labels;
        this.metadata = metadata;
    }

    /**
     * The label key-value pairs that you want to patch onto the instance.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * 
    */
    public Map<String,String> metadata() {
        return this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePropertiesPatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePropertiesPatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.metadata = defaults.metadata;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }        public InstancePropertiesPatchResponse build() {
            return new InstancePropertiesPatchResponse(labels, metadata);
        }
    }
}
