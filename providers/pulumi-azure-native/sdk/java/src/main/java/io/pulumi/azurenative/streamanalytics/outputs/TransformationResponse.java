// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransformationResponse {
    private final String etag;
    private final String id;
    private final @Nullable String name;
    private final @Nullable String query;
    private final @Nullable Integer streamingUnits;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","query","streamingUnits","type"})
    private TransformationResponse(
        String etag,
        String id,
        @Nullable String name,
        @Nullable String query,
        @Nullable Integer streamingUnits,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.query = query;
        this.streamingUnits = streamingUnits;
        this.type = Objects.requireNonNull(type);
    }

    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getQuery() {
        return Optional.ofNullable(this.query);
    }
    public Optional<Integer> getStreamingUnits() {
        return Optional.ofNullable(this.streamingUnits);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable String name;
        private @Nullable String query;
        private @Nullable Integer streamingUnits;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.streamingUnits = defaults.streamingUnits;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = query;
            return this;
        }

        public Builder setStreamingUnits(@Nullable Integer streamingUnits) {
            this.streamingUnits = streamingUnits;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TransformationResponse build() {
            return new TransformationResponse(etag, id, name, query, streamingUnits, type);
        }
    }
}