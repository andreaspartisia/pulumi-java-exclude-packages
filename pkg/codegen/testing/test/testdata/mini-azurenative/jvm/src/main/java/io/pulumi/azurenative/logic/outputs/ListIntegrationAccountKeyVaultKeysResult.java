// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListIntegrationAccountKeyVaultKeysResult {
    /**
     * The skip token.
     * 
     */
    private final @Nullable String skipToken;

    @CustomType.Constructor
    private ListIntegrationAccountKeyVaultKeysResult(@CustomType.Parameter("skipToken") @Nullable String skipToken) {
        this.skipToken = skipToken;
    }

    /**
     * The skip token.
     * 
    */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountKeyVaultKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountKeyVaultKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skipToken = defaults.skipToken;
        }

        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }        public ListIntegrationAccountKeyVaultKeysResult build() {
            return new ListIntegrationAccountKeyVaultKeysResult(skipToken);
        }
    }
}
