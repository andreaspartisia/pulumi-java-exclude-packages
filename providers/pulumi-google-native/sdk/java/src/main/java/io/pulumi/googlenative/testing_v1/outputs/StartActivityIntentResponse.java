// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StartActivityIntentResponse {
    /**
     * Action name. Required for START_ACTIVITY.
     * 
     */
    private final String action;
    /**
     * Intent categories to set on the intent.
     * 
     */
    private final List<String> categories;
    /**
     * URI for the action.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private StartActivityIntentResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("categories") List<String> categories,
        @CustomType.Parameter("uri") String uri) {
        this.action = action;
        this.categories = categories;
        this.uri = uri;
    }

    /**
     * Action name. Required for START_ACTIVITY.
     * 
    */
    public String action() {
        return this.action;
    }
    /**
     * Intent categories to set on the intent.
     * 
    */
    public List<String> categories() {
        return this.categories;
    }
    /**
     * URI for the action.
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartActivityIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<String> categories;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(StartActivityIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.categories = defaults.categories;
    	      this.uri = defaults.uri;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public StartActivityIntentResponse build() {
            return new StartActivityIntentResponse(action, categories, uri);
        }
    }
}
