// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneReverseLookupConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneReverseLookupConfigArgs Empty = new ManagedZoneReverseLookupConfigArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    public ManagedZoneReverseLookupConfigArgs(@Nullable Output<String> kind) {
        this.kind = kind;
    }

    private ManagedZoneReverseLookupConfigArgs() {
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneReverseLookupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneReverseLookupConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }        public ManagedZoneReverseLookupConfigArgs build() {
            return new ManagedZoneReverseLookupConfigArgs(kind);
        }
    }
}
