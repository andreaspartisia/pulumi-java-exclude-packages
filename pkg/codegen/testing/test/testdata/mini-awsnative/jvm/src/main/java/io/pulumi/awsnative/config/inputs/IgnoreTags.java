// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.config.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration with resource tag settings to ignore across all resources handled by this provider (except any individual service tag resources such as `ec2.Tag`) for situations where external systems are managing certain resource tags.
 * 
 */
public final class IgnoreTags extends io.pulumi.resources.InvokeArgs {

    public static final IgnoreTags Empty = new IgnoreTags();

    /**
     * List of exact resource tag keys to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning the tag in any `tags` attributes and displaying any configuration difference for the tag value. If any resource configuration still has this tag key configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    @Import(name="keyPrefixes")
      private final @Nullable List<String> keyPrefixes;

    public List<String> keyPrefixes() {
        return this.keyPrefixes == null ? List.of() : this.keyPrefixes;
    }

    /**
     * List of resource tag key prefixes to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning any tag key matching the prefixes in any `tags` attributes and displaying any configuration difference for those tag values. If any resource configuration still has a tag matching one of the prefixes configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    @Import(name="keys")
      private final @Nullable List<String> keys;

    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public IgnoreTags(
        @Nullable List<String> keyPrefixes,
        @Nullable List<String> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    private IgnoreTags() {
        this.keyPrefixes = List.of();
        this.keys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IgnoreTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> keyPrefixes;
        private @Nullable List<String> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(IgnoreTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder keyPrefixes(@Nullable List<String> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public Builder keyPrefixes(String... keyPrefixes) {
            return keyPrefixes(List.of(keyPrefixes));
        }
        public Builder keys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }        public IgnoreTags build() {
            return new IgnoreTags(keyPrefixes, keys);
        }
    }
}
