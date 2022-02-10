// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    @InputImport(name="type")
    private final @Nullable Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IdentityArgs(@Nullable Input<ResourceIdentityType> type) {
        this.type = type;
    }

    private IdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ResourceIdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public IdentityArgs build() {
            return new IdentityArgs(type);
        }
    }
}