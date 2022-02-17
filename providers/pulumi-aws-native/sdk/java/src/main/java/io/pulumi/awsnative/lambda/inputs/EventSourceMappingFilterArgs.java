// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The filter object that defines parameters for ESM filtering.
 * 
 */
public final class EventSourceMappingFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingFilterArgs Empty = new EventSourceMappingFilterArgs();

    /**
     * The filter pattern that defines which events should be passed for invocations.
     * 
     */
    @InputImport(name="pattern")
    private final @Nullable Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern == null ? Input.empty() : this.pattern;
    }

    public EventSourceMappingFilterArgs(@Nullable Input<String> pattern) {
        this.pattern = pattern;
    }

    private EventSourceMappingFilterArgs() {
        this.pattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder setPattern(@Nullable Input<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = Input.ofNullable(pattern);
            return this;
        }

        public EventSourceMappingFilterArgs build() {
            return new EventSourceMappingFilterArgs(pattern);
        }
    }
}