// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class AS2AcknowledgementConnectionSettingsResponse {
    private final Boolean ignoreCertificateNameMismatch;
    private final Boolean keepHttpConnectionAlive;
    private final Boolean supportHttpStatusCodeContinue;
    private final Boolean unfoldHttpHeaders;

    @OutputCustomType.Constructor({"ignoreCertificateNameMismatch","keepHttpConnectionAlive","supportHttpStatusCodeContinue","unfoldHttpHeaders"})
    private AS2AcknowledgementConnectionSettingsResponse(
        Boolean ignoreCertificateNameMismatch,
        Boolean keepHttpConnectionAlive,
        Boolean supportHttpStatusCodeContinue,
        Boolean unfoldHttpHeaders) {
        this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch);
        this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive);
        this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue);
        this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders);
    }

    public Boolean getIgnoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }
    public Boolean getKeepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }
    public Boolean getSupportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }
    public Boolean getUnfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2AcknowledgementConnectionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreCertificateNameMismatch;
        private Boolean keepHttpConnectionAlive;
        private Boolean supportHttpStatusCodeContinue;
        private Boolean unfoldHttpHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2AcknowledgementConnectionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCertificateNameMismatch = defaults.ignoreCertificateNameMismatch;
    	      this.keepHttpConnectionAlive = defaults.keepHttpConnectionAlive;
    	      this.supportHttpStatusCodeContinue = defaults.supportHttpStatusCodeContinue;
    	      this.unfoldHttpHeaders = defaults.unfoldHttpHeaders;
        }

        public Builder setIgnoreCertificateNameMismatch(Boolean ignoreCertificateNameMismatch) {
            this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch);
            return this;
        }

        public Builder setKeepHttpConnectionAlive(Boolean keepHttpConnectionAlive) {
            this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive);
            return this;
        }

        public Builder setSupportHttpStatusCodeContinue(Boolean supportHttpStatusCodeContinue) {
            this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue);
            return this;
        }

        public Builder setUnfoldHttpHeaders(Boolean unfoldHttpHeaders) {
            this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders);
            return this;
        }

        public AS2AcknowledgementConnectionSettingsResponse build() {
            return new AS2AcknowledgementConnectionSettingsResponse(ignoreCertificateNameMismatch, keepHttpConnectionAlive, supportHttpStatusCodeContinue, unfoldHttpHeaders);
        }
    }
}