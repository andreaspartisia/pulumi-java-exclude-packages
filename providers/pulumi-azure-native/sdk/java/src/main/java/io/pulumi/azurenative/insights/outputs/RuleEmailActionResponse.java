// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleEmailActionResponse {
    private final @Nullable List<String> customEmails;
    private final String odataType;
    private final @Nullable Boolean sendToServiceOwners;

    @OutputCustomType.Constructor({"customEmails","odataType","sendToServiceOwners"})
    private RuleEmailActionResponse(
        @Nullable List<String> customEmails,
        String odataType,
        @Nullable Boolean sendToServiceOwners) {
        this.customEmails = customEmails;
        this.odataType = Objects.requireNonNull(odataType);
        this.sendToServiceOwners = sendToServiceOwners;
    }

    public List<String> getCustomEmails() {
        return this.customEmails == null ? List.of() : this.customEmails;
    }
    public String getOdataType() {
        return this.odataType;
    }
    public Optional<Boolean> getSendToServiceOwners() {
        return Optional.ofNullable(this.sendToServiceOwners);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleEmailActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customEmails;
        private String odataType;
        private @Nullable Boolean sendToServiceOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleEmailActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmails = defaults.customEmails;
    	      this.odataType = defaults.odataType;
    	      this.sendToServiceOwners = defaults.sendToServiceOwners;
        }

        public Builder setCustomEmails(@Nullable List<String> customEmails) {
            this.customEmails = customEmails;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setSendToServiceOwners(@Nullable Boolean sendToServiceOwners) {
            this.sendToServiceOwners = sendToServiceOwners;
            return this;
        }

        public RuleEmailActionResponse build() {
            return new RuleEmailActionResponse(customEmails, odataType, sendToServiceOwners);
        }
    }
}