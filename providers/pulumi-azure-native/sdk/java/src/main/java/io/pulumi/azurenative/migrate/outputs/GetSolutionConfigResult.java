// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSolutionConfigResult {
    private final @Nullable String publisherSasUri;

    @OutputCustomType.Constructor({"publisherSasUri"})
    private GetSolutionConfigResult(@Nullable String publisherSasUri) {
        this.publisherSasUri = publisherSasUri;
    }

    public Optional<String> getPublisherSasUri() {
        return Optional.ofNullable(this.publisherSasUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publisherSasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publisherSasUri = defaults.publisherSasUri;
        }

        public Builder setPublisherSasUri(@Nullable String publisherSasUri) {
            this.publisherSasUri = publisherSasUri;
            return this;
        }

        public GetSolutionConfigResult build() {
            return new GetSolutionConfigResult(publisherSasUri);
        }
    }
}