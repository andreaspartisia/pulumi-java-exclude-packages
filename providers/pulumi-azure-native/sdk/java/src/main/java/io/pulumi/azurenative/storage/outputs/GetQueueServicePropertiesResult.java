// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetQueueServicePropertiesResult {
    private final @Nullable CorsRulesResponse cors;
    private final String id;
    private final String name;
    private final String type;

    @OutputCustomType.Constructor({"cors","id","name","type"})
    private GetQueueServicePropertiesResult(
        @Nullable CorsRulesResponse cors,
        String id,
        String name,
        String type) {
        this.cors = cors;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<CorsRulesResponse> getCors() {
        return Optional.ofNullable(this.cors);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueServicePropertiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CorsRulesResponse cors;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueServicePropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCors(@Nullable CorsRulesResponse cors) {
            this.cors = cors;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetQueueServicePropertiesResult build() {
            return new GetQueueServicePropertiesResult(cors, id, name, type);
        }
    }
}