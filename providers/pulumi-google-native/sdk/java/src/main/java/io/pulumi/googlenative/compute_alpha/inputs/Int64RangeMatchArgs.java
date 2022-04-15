// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HttpRouteRuleMatch criteria for field values that must stay within the specified integer range.
 * 
 */
public final class Int64RangeMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final Int64RangeMatchArgs Empty = new Int64RangeMatchArgs();

    /**
     * The end of the range (exclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeEnd")
      private final @Nullable Output<String> rangeEnd;

    public Output<String> rangeEnd() {
        return this.rangeEnd == null ? Codegen.empty() : this.rangeEnd;
    }

    /**
     * The start of the range (inclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeStart")
      private final @Nullable Output<String> rangeStart;

    public Output<String> rangeStart() {
        return this.rangeStart == null ? Codegen.empty() : this.rangeStart;
    }

    public Int64RangeMatchArgs(
        @Nullable Output<String> rangeEnd,
        @Nullable Output<String> rangeStart) {
        this.rangeEnd = rangeEnd;
        this.rangeStart = rangeStart;
    }

    private Int64RangeMatchArgs() {
        this.rangeEnd = Codegen.empty();
        this.rangeStart = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Int64RangeMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> rangeEnd;
        private @Nullable Output<String> rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(Int64RangeMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder rangeEnd(@Nullable Output<String> rangeEnd) {
            this.rangeEnd = rangeEnd;
            return this;
        }
        public Builder rangeEnd(@Nullable String rangeEnd) {
            this.rangeEnd = Codegen.ofNullable(rangeEnd);
            return this;
        }
        public Builder rangeStart(@Nullable Output<String> rangeStart) {
            this.rangeStart = rangeStart;
            return this;
        }
        public Builder rangeStart(@Nullable String rangeStart) {
            this.rangeStart = Codegen.ofNullable(rangeStart);
            return this;
        }        public Int64RangeMatchArgs build() {
            return new Int64RangeMatchArgs(rangeEnd, rangeStart);
        }
    }
}
