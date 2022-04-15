// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A starting intent specified by an action, uri, and categories.
 * 
 */
public final class StartActivityIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final StartActivityIntentArgs Empty = new StartActivityIntentArgs();

    /**
     * Action name. Required for START_ACTIVITY.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Intent categories to set on the intent.
     * 
     */
    @Import(name="categories")
      private final @Nullable Output<List<String>> categories;

    public Output<List<String>> categories() {
        return this.categories == null ? Codegen.empty() : this.categories;
    }

    /**
     * URI for the action.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> uri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public StartActivityIntentArgs(
        @Nullable Output<String> action,
        @Nullable Output<List<String>> categories,
        @Nullable Output<String> uri) {
        this.action = action;
        this.categories = categories;
        this.uri = uri;
    }

    private StartActivityIntentArgs() {
        this.action = Codegen.empty();
        this.categories = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartActivityIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<List<String>> categories;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(StartActivityIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.categories = defaults.categories;
    	      this.uri = defaults.uri;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder categories(@Nullable Output<List<String>> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(@Nullable List<String> categories) {
            this.categories = Codegen.ofNullable(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public StartActivityIntentArgs build() {
            return new StartActivityIntentArgs(action, categories, uri);
        }
    }
}
