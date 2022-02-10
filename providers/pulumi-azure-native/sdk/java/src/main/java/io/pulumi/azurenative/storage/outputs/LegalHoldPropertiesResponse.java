// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.TagPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class LegalHoldPropertiesResponse {
    private final Boolean hasLegalHold;
    private final @Nullable List<TagPropertyResponse> tags;

    @OutputCustomType.Constructor({"hasLegalHold","tags"})
    private LegalHoldPropertiesResponse(
        Boolean hasLegalHold,
        @Nullable List<TagPropertyResponse> tags) {
        this.hasLegalHold = Objects.requireNonNull(hasLegalHold);
        this.tags = tags;
    }

    public Boolean getHasLegalHold() {
        return this.hasLegalHold;
    }
    public List<TagPropertyResponse> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LegalHoldPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean hasLegalHold;
        private @Nullable List<TagPropertyResponse> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LegalHoldPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasLegalHold = defaults.hasLegalHold;
    	      this.tags = defaults.tags;
        }

        public Builder setHasLegalHold(Boolean hasLegalHold) {
            this.hasLegalHold = Objects.requireNonNull(hasLegalHold);
            return this;
        }

        public Builder setTags(@Nullable List<TagPropertyResponse> tags) {
            this.tags = tags;
            return this;
        }

        public LegalHoldPropertiesResponse build() {
            return new LegalHoldPropertiesResponse(hasLegalHold, tags);
        }
    }
}