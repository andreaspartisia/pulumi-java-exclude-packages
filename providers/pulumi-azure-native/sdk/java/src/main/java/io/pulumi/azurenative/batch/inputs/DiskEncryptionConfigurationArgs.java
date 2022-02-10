// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.DiskEncryptionTarget;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionConfigurationArgs Empty = new DiskEncryptionConfigurationArgs();

    @InputImport(name="targets")
    private final @Nullable Input<List<DiskEncryptionTarget>> targets;

    public Input<List<DiskEncryptionTarget>> getTargets() {
        return this.targets == null ? Input.empty() : this.targets;
    }

    public DiskEncryptionConfigurationArgs(@Nullable Input<List<DiskEncryptionTarget>> targets) {
        this.targets = targets;
    }

    private DiskEncryptionConfigurationArgs() {
        this.targets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DiskEncryptionTarget>> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targets = defaults.targets;
        }

        public Builder setTargets(@Nullable Input<List<DiskEncryptionTarget>> targets) {
            this.targets = targets;
            return this;
        }

        public Builder setTargets(@Nullable List<DiskEncryptionTarget> targets) {
            this.targets = Input.ofNullable(targets);
            return this;
        }

        public DiskEncryptionConfigurationArgs build() {
            return new DiskEncryptionConfigurationArgs(targets);
        }
    }
}