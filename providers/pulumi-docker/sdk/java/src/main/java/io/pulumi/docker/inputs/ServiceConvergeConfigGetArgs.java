// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceConvergeConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceConvergeConfigGetArgs Empty = new ServiceConvergeConfigGetArgs();

    @Import(name="delay")
      private final @Nullable Output<String> delay;

    public Output<String> delay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    public ServiceConvergeConfigGetArgs(
        @Nullable Output<String> delay,
        @Nullable Output<String> timeout) {
        this.delay = delay;
        this.timeout = timeout;
    }

    private ServiceConvergeConfigGetArgs() {
        this.delay = Codegen.empty();
        this.timeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceConvergeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> delay;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceConvergeConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delay = defaults.delay;
    	      this.timeout = defaults.timeout;
        }

        public Builder delay(@Nullable Output<String> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable String delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }        public ServiceConvergeConfigGetArgs build() {
            return new ServiceConvergeConfigGetArgs(delay, timeout);
        }
    }
}
