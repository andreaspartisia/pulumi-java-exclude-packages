// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * iOS app information
 * 
 */
public final class IosAppInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IosAppInfoResponse Empty = new IosAppInfoResponse();

    /**
     * The name of the app. Required
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public IosAppInfoResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private IosAppInfoResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosAppInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IosAppInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public IosAppInfoResponse build() {
            return new IosAppInfoResponse(name);
        }
    }
}
