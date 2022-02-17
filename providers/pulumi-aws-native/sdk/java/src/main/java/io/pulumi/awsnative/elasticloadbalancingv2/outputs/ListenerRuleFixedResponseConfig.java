// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleFixedResponseConfig {
    private final @Nullable String contentType;
    private final @Nullable String messageBody;
    private final String statusCode;

    @OutputCustomType.Constructor({"contentType","messageBody","statusCode"})
    private ListenerRuleFixedResponseConfig(
        @Nullable String contentType,
        @Nullable String messageBody,
        String statusCode) {
        this.contentType = contentType;
        this.messageBody = messageBody;
        this.statusCode = Objects.requireNonNull(statusCode);
    }

    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> getMessageBody() {
        return Optional.ofNullable(this.messageBody);
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleFixedResponseConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String messageBody;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleFixedResponseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setMessageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public ListenerRuleFixedResponseConfig build() {
            return new ListenerRuleFixedResponseConfig(contentType, messageBody, statusCode);
        }
    }
}