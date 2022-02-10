// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.CustomRegistryCredentialsResponse;
import io.pulumi.azurenative.containerregistry.inputs.SourceRegistryCredentialsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CredentialsResponse Empty = new CredentialsResponse();

    @InputImport(name="customRegistries")
    private final @Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries;

    public Map<String,CustomRegistryCredentialsResponse> getCustomRegistries() {
        return this.customRegistries == null ? Map.of() : this.customRegistries;
    }

    @InputImport(name="sourceRegistry")
    private final @Nullable SourceRegistryCredentialsResponse sourceRegistry;

    public Optional<SourceRegistryCredentialsResponse> getSourceRegistry() {
        return this.sourceRegistry == null ? Optional.empty() : Optional.ofNullable(this.sourceRegistry);
    }

    public CredentialsResponse(
        @Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries,
        @Nullable SourceRegistryCredentialsResponse sourceRegistry) {
        this.customRegistries = customRegistries;
        this.sourceRegistry = sourceRegistry;
    }

    private CredentialsResponse() {
        this.customRegistries = Map.of();
        this.sourceRegistry = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries;
        private @Nullable SourceRegistryCredentialsResponse sourceRegistry;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRegistries = defaults.customRegistries;
    	      this.sourceRegistry = defaults.sourceRegistry;
        }

        public Builder setCustomRegistries(@Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries) {
            this.customRegistries = customRegistries;
            return this;
        }

        public Builder setSourceRegistry(@Nullable SourceRegistryCredentialsResponse sourceRegistry) {
            this.sourceRegistry = sourceRegistry;
            return this;
        }

        public CredentialsResponse build() {
            return new CredentialsResponse(customRegistries, sourceRegistry);
        }
    }
}