// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CardinalityResponse {
    /**
     * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
     * 
     */
    private final Integer number;
    /**
     * The root of the variable subtree to monitor. For example, `/foo`.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private CardinalityResponse(
        @CustomType.Parameter("number") Integer number,
        @CustomType.Parameter("path") String path) {
        this.number = number;
        this.path = path;
    }

    /**
     * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
     * 
    */
    public Integer number() {
        return this.number;
    }
    /**
     * The root of the variable subtree to monitor. For example, `/foo`.
     * 
    */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CardinalityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer number;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(CardinalityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
    	      this.path = defaults.path;
        }

        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public CardinalityResponse build() {
            return new CardinalityResponse(number, path);
        }
    }
}
