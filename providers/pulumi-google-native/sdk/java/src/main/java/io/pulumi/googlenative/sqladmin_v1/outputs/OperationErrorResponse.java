// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OperationErrorResponse {
    private final String code;
    private final String kind;
    private final String message;

    @OutputCustomType.Constructor({"code","kind","message"})
    private OperationErrorResponse(
        String code,
        String kind,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.kind = Objects.requireNonNull(kind);
        this.message = Objects.requireNonNull(message);
    }

    public String getCode() {
        return this.code;
    }
    public String getKind() {
        return this.kind;
    }
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String kind;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public OperationErrorResponse build() {
            return new OperationErrorResponse(code, kind, message);
        }
    }
}