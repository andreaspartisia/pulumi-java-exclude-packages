// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginRequestPolicyHeadersConfigHeaders {
    private final @Nullable List<String> items;

    @OutputCustomType.Constructor
    private OriginRequestPolicyHeadersConfigHeaders(@OutputCustomType.Parameter("items") @Nullable List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyHeadersConfigHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyHeadersConfigHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable List<String> items) {
            this.items = items;
            return this;
        }
        public OriginRequestPolicyHeadersConfigHeaders build() {
            return new OriginRequestPolicyHeadersConfigHeaders(items);
        }
    }
}