// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events;

import io.pulumi.awsnative.events.enums.ApiDestinationHttpMethod;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiDestinationArgs Empty = new ApiDestinationArgs();

    /**
     * The arn of the connection.
     * 
     */
    @InputImport(name="connectionArn", required=true)
    private final Input<String> connectionArn;

    public Input<String> getConnectionArn() {
        return this.connectionArn;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="httpMethod", required=true)
    private final Input<ApiDestinationHttpMethod> httpMethod;

    public Input<ApiDestinationHttpMethod> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * Url endpoint to invoke.
     * 
     */
    @InputImport(name="invocationEndpoint", required=true)
    private final Input<String> invocationEndpoint;

    public Input<String> getInvocationEndpoint() {
        return this.invocationEndpoint;
    }

    @InputImport(name="invocationRateLimitPerSecond")
    private final @Nullable Input<Integer> invocationRateLimitPerSecond;

    public Input<Integer> getInvocationRateLimitPerSecond() {
        return this.invocationRateLimitPerSecond == null ? Input.empty() : this.invocationRateLimitPerSecond;
    }

    /**
     * Name of the apiDestination.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ApiDestinationArgs(
        Input<String> connectionArn,
        @Nullable Input<String> description,
        Input<ApiDestinationHttpMethod> httpMethod,
        Input<String> invocationEndpoint,
        @Nullable Input<Integer> invocationRateLimitPerSecond,
        @Nullable Input<String> name) {
        this.connectionArn = Objects.requireNonNull(connectionArn, "expected parameter 'connectionArn' to be non-null");
        this.description = description;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.invocationEndpoint = Objects.requireNonNull(invocationEndpoint, "expected parameter 'invocationEndpoint' to be non-null");
        this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
        this.name = name;
    }

    private ApiDestinationArgs() {
        this.connectionArn = Input.empty();
        this.description = Input.empty();
        this.httpMethod = Input.empty();
        this.invocationEndpoint = Input.empty();
        this.invocationRateLimitPerSecond = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> connectionArn;
        private @Nullable Input<String> description;
        private Input<ApiDestinationHttpMethod> httpMethod;
        private Input<String> invocationEndpoint;
        private @Nullable Input<Integer> invocationRateLimitPerSecond;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionArn = defaults.connectionArn;
    	      this.description = defaults.description;
    	      this.httpMethod = defaults.httpMethod;
    	      this.invocationEndpoint = defaults.invocationEndpoint;
    	      this.invocationRateLimitPerSecond = defaults.invocationRateLimitPerSecond;
    	      this.name = defaults.name;
        }

        public Builder setConnectionArn(Input<String> connectionArn) {
            this.connectionArn = Objects.requireNonNull(connectionArn);
            return this;
        }

        public Builder setConnectionArn(String connectionArn) {
            this.connectionArn = Input.of(Objects.requireNonNull(connectionArn));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHttpMethod(Input<ApiDestinationHttpMethod> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setHttpMethod(ApiDestinationHttpMethod httpMethod) {
            this.httpMethod = Input.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder setInvocationEndpoint(Input<String> invocationEndpoint) {
            this.invocationEndpoint = Objects.requireNonNull(invocationEndpoint);
            return this;
        }

        public Builder setInvocationEndpoint(String invocationEndpoint) {
            this.invocationEndpoint = Input.of(Objects.requireNonNull(invocationEndpoint));
            return this;
        }

        public Builder setInvocationRateLimitPerSecond(@Nullable Input<Integer> invocationRateLimitPerSecond) {
            this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
            return this;
        }

        public Builder setInvocationRateLimitPerSecond(@Nullable Integer invocationRateLimitPerSecond) {
            this.invocationRateLimitPerSecond = Input.ofNullable(invocationRateLimitPerSecond);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ApiDestinationArgs build() {
            return new ApiDestinationArgs(connectionArn, description, httpMethod, invocationEndpoint, invocationRateLimitPerSecond, name);
        }
    }
}