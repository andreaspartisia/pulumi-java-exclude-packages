// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FallbackRoutePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final FallbackRoutePropertiesResponse Empty = new FallbackRoutePropertiesResponse();

    @InputImport(name="condition")
    private final @Nullable String condition;

    public Optional<String> getCondition() {
        return this.condition == null ? Optional.empty() : Optional.ofNullable(this.condition);
    }

    @InputImport(name="endpointNames", required=true)
    private final List<String> endpointNames;

    public List<String> getEndpointNames() {
        return this.endpointNames;
    }

    @InputImport(name="isEnabled", required=true)
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="source", required=true)
    private final String source;

    public String getSource() {
        return this.source;
    }

    public FallbackRoutePropertiesResponse(
        @Nullable String condition,
        List<String> endpointNames,
        Boolean isEnabled,
        @Nullable String name,
        String source) {
        this.condition = condition;
        this.endpointNames = Objects.requireNonNull(endpointNames, "expected parameter 'endpointNames' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.name = name;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private FallbackRoutePropertiesResponse() {
        this.condition = null;
        this.endpointNames = List.of();
        this.isEnabled = null;
        this.name = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FallbackRoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private List<String> endpointNames;
        private Boolean isEnabled;
        private @Nullable String name;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(FallbackRoutePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public FallbackRoutePropertiesResponse build() {
            return new FallbackRoutePropertiesResponse(condition, endpointNames, isEnabled, name, source);
        }
    }
}