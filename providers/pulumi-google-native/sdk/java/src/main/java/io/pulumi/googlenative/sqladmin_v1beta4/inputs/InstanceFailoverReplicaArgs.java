// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFailoverReplicaArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFailoverReplicaArgs Empty = new InstanceFailoverReplicaArgs();

    @InputImport(name="available")
    private final @Nullable Input<Boolean> available;

    public Input<Boolean> getAvailable() {
        return this.available == null ? Input.empty() : this.available;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public InstanceFailoverReplicaArgs(
        @Nullable Input<Boolean> available,
        @Nullable Input<String> name) {
        this.available = available;
        this.name = name;
    }

    private InstanceFailoverReplicaArgs() {
        this.available = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> available;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverReplicaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.name = defaults.name;
        }

        public Builder setAvailable(@Nullable Input<Boolean> available) {
            this.available = available;
            return this;
        }

        public Builder setAvailable(@Nullable Boolean available) {
            this.available = Input.ofNullable(available);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public InstanceFailoverReplicaArgs build() {
            return new InstanceFailoverReplicaArgs(available, name);
        }
    }
}