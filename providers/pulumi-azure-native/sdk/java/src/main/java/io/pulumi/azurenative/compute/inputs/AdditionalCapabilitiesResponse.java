// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdditionalCapabilitiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdditionalCapabilitiesResponse Empty = new AdditionalCapabilitiesResponse();

    @InputImport(name="ultraSSDEnabled")
    private final @Nullable Boolean ultraSSDEnabled;

    public Optional<Boolean> getUltraSSDEnabled() {
        return this.ultraSSDEnabled == null ? Optional.empty() : Optional.ofNullable(this.ultraSSDEnabled);
    }

    public AdditionalCapabilitiesResponse(@Nullable Boolean ultraSSDEnabled) {
        this.ultraSSDEnabled = ultraSSDEnabled;
    }

    private AdditionalCapabilitiesResponse() {
        this.ultraSSDEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalCapabilitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ultraSSDEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalCapabilitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ultraSSDEnabled = defaults.ultraSSDEnabled;
        }

        public Builder setUltraSSDEnabled(@Nullable Boolean ultraSSDEnabled) {
            this.ultraSSDEnabled = ultraSSDEnabled;
            return this;
        }

        public AdditionalCapabilitiesResponse build() {
            return new AdditionalCapabilitiesResponse(ultraSSDEnabled);
        }
    }
}