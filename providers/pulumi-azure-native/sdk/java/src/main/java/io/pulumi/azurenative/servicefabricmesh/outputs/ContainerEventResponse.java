// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerEventResponse {
    private final @Nullable Integer count;
    private final @Nullable String firstTimestamp;
    private final @Nullable String lastTimestamp;
    private final @Nullable String message;
    private final @Nullable String name;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"count","firstTimestamp","lastTimestamp","message","name","type"})
    private ContainerEventResponse(
        @Nullable Integer count,
        @Nullable String firstTimestamp,
        @Nullable String lastTimestamp,
        @Nullable String message,
        @Nullable String name,
        @Nullable String type) {
        this.count = count;
        this.firstTimestamp = firstTimestamp;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.name = name;
        this.type = type;
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    public Optional<String> getFirstTimestamp() {
        return Optional.ofNullable(this.firstTimestamp);
    }
    public Optional<String> getLastTimestamp() {
        return Optional.ofNullable(this.lastTimestamp);
    }
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String firstTimestamp;
        private @Nullable String lastTimestamp;
        private @Nullable String message;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setFirstTimestamp(@Nullable String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }

        public Builder setLastTimestamp(@Nullable String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ContainerEventResponse build() {
            return new ContainerEventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}