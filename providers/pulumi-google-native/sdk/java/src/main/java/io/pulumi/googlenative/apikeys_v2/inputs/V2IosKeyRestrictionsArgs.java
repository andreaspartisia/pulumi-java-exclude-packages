// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The iOS apps that are allowed to use the key.
 * 
 */
public final class V2IosKeyRestrictionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final V2IosKeyRestrictionsArgs Empty = new V2IosKeyRestrictionsArgs();

    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    @Import(name="allowedBundleIds")
      private final @Nullable Output<List<String>> allowedBundleIds;

    public Output<List<String>> allowedBundleIds() {
        return this.allowedBundleIds == null ? Codegen.empty() : this.allowedBundleIds;
    }

    public V2IosKeyRestrictionsArgs(@Nullable Output<List<String>> allowedBundleIds) {
        this.allowedBundleIds = allowedBundleIds;
    }

    private V2IosKeyRestrictionsArgs() {
        this.allowedBundleIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2IosKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(V2IosKeyRestrictionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder allowedBundleIds(@Nullable Output<List<String>> allowedBundleIds) {
            this.allowedBundleIds = allowedBundleIds;
            return this;
        }
        public Builder allowedBundleIds(@Nullable List<String> allowedBundleIds) {
            this.allowedBundleIds = Codegen.ofNullable(allowedBundleIds);
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }        public V2IosKeyRestrictionsArgs build() {
            return new V2IosKeyRestrictionsArgs(allowedBundleIds);
        }
    }
}
