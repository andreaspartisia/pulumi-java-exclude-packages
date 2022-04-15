// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An initial split point for a newly created table.
 * 
 */
public final class SplitArgs extends io.pulumi.resources.ResourceArgs {

    public static final SplitArgs Empty = new SplitArgs();

    /**
     * Row key to use as an initial tablet boundary.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    public SplitArgs(@Nullable Output<String> key) {
        this.key = key;
    }

    private SplitArgs() {
        this.key = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SplitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(SplitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }        public SplitArgs build() {
            return new SplitArgs(key);
        }
    }
}
