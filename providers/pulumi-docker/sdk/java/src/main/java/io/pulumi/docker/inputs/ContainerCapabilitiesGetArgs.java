// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerCapabilitiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerCapabilitiesGetArgs Empty = new ContainerCapabilitiesGetArgs();

    @Import(name="adds")
      private final @Nullable Output<List<String>> adds;

    public Output<List<String>> adds() {
        return this.adds == null ? Codegen.empty() : this.adds;
    }

    @Import(name="drops")
      private final @Nullable Output<List<String>> drops;

    public Output<List<String>> drops() {
        return this.drops == null ? Codegen.empty() : this.drops;
    }

    public ContainerCapabilitiesGetArgs(
        @Nullable Output<List<String>> adds,
        @Nullable Output<List<String>> drops) {
        this.adds = adds;
        this.drops = drops;
    }

    private ContainerCapabilitiesGetArgs() {
        this.adds = Codegen.empty();
        this.drops = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerCapabilitiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> adds;
        private @Nullable Output<List<String>> drops;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerCapabilitiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adds = defaults.adds;
    	      this.drops = defaults.drops;
        }

        public Builder adds(@Nullable Output<List<String>> adds) {
            this.adds = adds;
            return this;
        }
        public Builder adds(@Nullable List<String> adds) {
            this.adds = Codegen.ofNullable(adds);
            return this;
        }
        public Builder adds(String... adds) {
            return adds(List.of(adds));
        }
        public Builder drops(@Nullable Output<List<String>> drops) {
            this.drops = drops;
            return this;
        }
        public Builder drops(@Nullable List<String> drops) {
            this.drops = Codegen.ofNullable(drops);
            return this;
        }
        public Builder drops(String... drops) {
            return drops(List.of(drops));
        }        public ContainerCapabilitiesGetArgs build() {
            return new ContainerCapabilitiesGetArgs(adds, drops);
        }
    }
}
