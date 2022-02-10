// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.EventContentResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventRequestMessageResponse {
    private final @Nullable EventContentResponse content;
    private final @Nullable Map<String,String> headers;
    private final @Nullable String method;
    private final @Nullable String requestUri;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"content","headers","method","requestUri","version"})
    private EventRequestMessageResponse(
        @Nullable EventContentResponse content,
        @Nullable Map<String,String> headers,
        @Nullable String method,
        @Nullable String requestUri,
        @Nullable String version) {
        this.content = content;
        this.headers = headers;
        this.method = method;
        this.requestUri = requestUri;
        this.version = version;
    }

    public Optional<EventContentResponse> getContent() {
        return Optional.ofNullable(this.content);
    }
    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }
    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }
    public Optional<String> getRequestUri() {
        return Optional.ofNullable(this.requestUri);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRequestMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventContentResponse content;
        private @Nullable Map<String,String> headers;
        private @Nullable String method;
        private @Nullable String requestUri;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EventRequestMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.requestUri = defaults.requestUri;
    	      this.version = defaults.version;
        }

        public Builder setContent(@Nullable EventContentResponse content) {
            this.content = content;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setRequestUri(@Nullable String requestUri) {
            this.requestUri = requestUri;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public EventRequestMessageResponse build() {
            return new EventRequestMessageResponse(content, headers, method, requestUri, version);
        }
    }
}