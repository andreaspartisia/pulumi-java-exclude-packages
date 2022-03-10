// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiConfigIamBindingCondition {
    private final @Nullable String description;
    private final String expression;
    private final String title;

    @OutputCustomType.Constructor
    private ApiConfigIamBindingCondition(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("expression") String expression,
        @OutputCustomType.Parameter("title") String title) {
        this.description = description;
        this.expression = expression;
        this.title = title;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getExpression() {
        return this.expression;
    }
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigIamBindingCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigIamBindingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public ApiConfigIamBindingCondition build() {
            return new ApiConfigIamBindingCondition(description, expression, title);
        }
    }
}
