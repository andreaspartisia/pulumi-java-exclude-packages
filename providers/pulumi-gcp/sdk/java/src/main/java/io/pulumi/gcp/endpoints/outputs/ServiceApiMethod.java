// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceApiMethod {
    private final @Nullable String name;
    private final @Nullable String requestType;
    private final @Nullable String responseType;
    private final @Nullable String syntax;

    @OutputCustomType.Constructor
    private ServiceApiMethod(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("requestType") @Nullable String requestType,
        @OutputCustomType.Parameter("responseType") @Nullable String responseType,
        @OutputCustomType.Parameter("syntax") @Nullable String syntax) {
        this.name = name;
        this.requestType = requestType;
        this.responseType = responseType;
        this.syntax = syntax;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getRequestType() {
        return Optional.ofNullable(this.requestType);
    }
    public Optional<String> getResponseType() {
        return Optional.ofNullable(this.responseType);
    }
    public Optional<String> getSyntax() {
        return Optional.ofNullable(this.syntax);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceApiMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String requestType;
        private @Nullable String responseType;
        private @Nullable String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceApiMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.requestType = defaults.requestType;
    	      this.responseType = defaults.responseType;
    	      this.syntax = defaults.syntax;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRequestType(@Nullable String requestType) {
            this.requestType = requestType;
            return this;
        }

        public Builder setResponseType(@Nullable String responseType) {
            this.responseType = responseType;
            return this;
        }

        public Builder setSyntax(@Nullable String syntax) {
            this.syntax = syntax;
            return this;
        }
        public ServiceApiMethod build() {
            return new ServiceApiMethod(name, requestType, responseType, syntax);
        }
    }
}
