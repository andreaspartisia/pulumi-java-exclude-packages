// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about amount of some resource in the cluster. For memory, value should be in GB.
 * 
 */
public final class ResourceLimitResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceLimitResponse Empty = new ResourceLimitResponse();

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    @Import(name="maximum", required=true)
      private final String maximum;

    public String maximum() {
        return this.maximum;
    }

    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    @Import(name="minimum", required=true)
      private final String minimum;

    public String minimum() {
        return this.minimum;
    }

    /**
     * Resource name "cpu", "memory" or gpu-specific string.
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String resourceType() {
        return this.resourceType;
    }

    public ResourceLimitResponse(
        String maximum,
        String minimum,
        String resourceType) {
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ResourceLimitResponse() {
        this.maximum = null;
        this.minimum = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maximum;
        private String minimum;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder maximum(String maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        public Builder minimum(String minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public ResourceLimitResponse build() {
            return new ResourceLimitResponse(maximum, minimum, resourceType);
        }
    }
}
