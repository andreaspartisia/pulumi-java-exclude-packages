// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.example.Resource;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ArgFunctionResult {
    private @Nullable Resource result;

    private ArgFunctionResult() {}
    public Optional<Resource> result() {
        return Optional.ofNullable(this.result);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArgFunctionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Resource result;
        public Builder() {}
        public Builder(ArgFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.result = defaults.result;
        }

        @CustomType.Setter
        public Builder result(@Nullable Resource result) {
            this.result = result;
            return this;
        }
        public ArgFunctionResult build() {
            final var o = new ArgFunctionResult();
            o.result = result;
            return o;
        }
    }
}
