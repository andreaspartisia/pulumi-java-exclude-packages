// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A custom pattern is used for defining custom HTTP verb.
 * 
 */
public final class CustomHttpPatternResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomHttpPatternResponse Empty = new CustomHttpPatternResponse();

    /**
     * The name of this custom HTTP verb.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The path matched by this custom verb.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    public CustomHttpPatternResponse(
        String kind,
        String path) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private CustomHttpPatternResponse() {
        this.kind = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHttpPatternResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomHttpPatternResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.path = defaults.path;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public CustomHttpPatternResponse build() {
            return new CustomHttpPatternResponse(kind, path);
        }
    }
}
