// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.example.Resource;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FooResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FooResourceArgs Empty = new FooResourceArgs();

    @Import(name="foo")
      private final @Nullable Output<Resource> foo;

    public Output<Resource> foo() {
        return this.foo == null ? Codegen.empty() : this.foo;
    }

    public FooResourceArgs(@Nullable Output<Resource> foo) {
        this.foo = foo;
    }

    private FooResourceArgs() {
        this.foo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FooResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Resource> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(FooResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.foo = defaults.foo;
        }

        public Builder foo(@Nullable Output<Resource> foo) {
            this.foo = foo;
            return this;
        }
        public Builder foo(@Nullable Resource foo) {
            this.foo = Codegen.ofNullable(foo);
            return this;
        }        public FooResourceArgs build() {
            return new FooResourceArgs(foo);
        }
    }
}
