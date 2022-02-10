// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BulkCreationParametersResponse {
    private final @Nullable Integer instanceCount;

    @OutputCustomType.Constructor({"instanceCount"})
    private BulkCreationParametersResponse(@Nullable Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public Optional<Integer> getInstanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BulkCreationParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(BulkCreationParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public BulkCreationParametersResponse build() {
            return new BulkCreationParametersResponse(instanceCount);
        }
    }
}