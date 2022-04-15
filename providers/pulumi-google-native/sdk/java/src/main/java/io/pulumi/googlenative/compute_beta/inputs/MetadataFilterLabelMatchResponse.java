// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * MetadataFilter label name value pairs that are expected to match corresponding labels presented as metadata to the load balancer.
 * 
 */
public final class MetadataFilterLabelMatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataFilterLabelMatchResponse Empty = new MetadataFilterLabelMatchResponse();

    /**
     * Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The value of the label must match the specified value. value can have a maximum length of 1024 characters.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public MetadataFilterLabelMatchResponse(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private MetadataFilterLabelMatchResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterLabelMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterLabelMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public MetadataFilterLabelMatchResponse build() {
            return new MetadataFilterLabelMatchResponse(name, value);
        }
    }
}
