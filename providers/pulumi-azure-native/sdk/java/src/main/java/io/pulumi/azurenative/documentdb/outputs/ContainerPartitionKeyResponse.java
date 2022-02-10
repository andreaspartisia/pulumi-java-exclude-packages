// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerPartitionKeyResponse {
    private final @Nullable String kind;
    private final @Nullable List<String> paths;
    private final Boolean systemKey;
    private final @Nullable Integer version;

    @OutputCustomType.Constructor({"kind","paths","systemKey","version"})
    private ContainerPartitionKeyResponse(
        @Nullable String kind,
        @Nullable List<String> paths,
        Boolean systemKey,
        @Nullable Integer version) {
        this.kind = kind;
        this.paths = paths;
        this.systemKey = Objects.requireNonNull(systemKey);
        this.version = version;
    }

    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }
    public Boolean getSystemKey() {
        return this.systemKey;
    }
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPartitionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kind;
        private @Nullable List<String> paths;
        private Boolean systemKey;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPartitionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.paths = defaults.paths;
    	      this.systemKey = defaults.systemKey;
    	      this.version = defaults.version;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setPaths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }

        public Builder setSystemKey(Boolean systemKey) {
            this.systemKey = Objects.requireNonNull(systemKey);
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }

        public ContainerPartitionKeyResponse build() {
            return new ContainerPartitionKeyResponse(kind, paths, systemKey, version);
        }
    }
}