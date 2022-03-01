// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.docker.outputs.ContainerMountBindOptions;
import io.pulumi.docker.outputs.ContainerMountTmpfsOptions;
import io.pulumi.docker.outputs.ContainerMountVolumeOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerMount {
    private final @Nullable ContainerMountBindOptions bindOptions;
    private final @Nullable Boolean readOnly;
    private final @Nullable String source;
    private final String target;
    private final @Nullable ContainerMountTmpfsOptions tmpfsOptions;
    private final String type;
    private final @Nullable ContainerMountVolumeOptions volumeOptions;

    @OutputCustomType.Constructor({"bindOptions","readOnly","source","target","tmpfsOptions","type","volumeOptions"})
    private ContainerMount(
        @Nullable ContainerMountBindOptions bindOptions,
        @Nullable Boolean readOnly,
        @Nullable String source,
        String target,
        @Nullable ContainerMountTmpfsOptions tmpfsOptions,
        String type,
        @Nullable ContainerMountVolumeOptions volumeOptions) {
        this.bindOptions = bindOptions;
        this.readOnly = readOnly;
        this.source = source;
        this.target = Objects.requireNonNull(target);
        this.tmpfsOptions = tmpfsOptions;
        this.type = Objects.requireNonNull(type);
        this.volumeOptions = volumeOptions;
    }

    public Optional<ContainerMountBindOptions> getBindOptions() {
        return Optional.ofNullable(this.bindOptions);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    public String getTarget() {
        return this.target;
    }
    public Optional<ContainerMountTmpfsOptions> getTmpfsOptions() {
        return Optional.ofNullable(this.tmpfsOptions);
    }
    public String getType() {
        return this.type;
    }
    public Optional<ContainerMountVolumeOptions> getVolumeOptions() {
        return Optional.ofNullable(this.volumeOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerMountBindOptions bindOptions;
        private @Nullable Boolean readOnly;
        private @Nullable String source;
        private String target;
        private @Nullable ContainerMountTmpfsOptions tmpfsOptions;
        private String type;
        private @Nullable ContainerMountVolumeOptions volumeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindOptions = defaults.bindOptions;
    	      this.readOnly = defaults.readOnly;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.tmpfsOptions = defaults.tmpfsOptions;
    	      this.type = defaults.type;
    	      this.volumeOptions = defaults.volumeOptions;
        }

        public Builder setBindOptions(@Nullable ContainerMountBindOptions bindOptions) {
            this.bindOptions = bindOptions;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTmpfsOptions(@Nullable ContainerMountTmpfsOptions tmpfsOptions) {
            this.tmpfsOptions = tmpfsOptions;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumeOptions(@Nullable ContainerMountVolumeOptions volumeOptions) {
            this.volumeOptions = volumeOptions;
            return this;
        }
        public ContainerMount build() {
            return new ContainerMount(bindOptions, readOnly, source, target, tmpfsOptions, type, volumeOptions);
        }
    }
}
