// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScaleSettingsResponse Empty = new ScaleSettingsResponse();

    @InputImport(name="maxNodeCount", required=true)
    private final Integer maxNodeCount;

    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }

    @InputImport(name="minNodeCount")
    private final @Nullable Integer minNodeCount;

    public Optional<Integer> getMinNodeCount() {
        return this.minNodeCount == null ? Optional.empty() : Optional.ofNullable(this.minNodeCount);
    }

    @InputImport(name="nodeIdleTimeBeforeScaleDown")
    private final @Nullable String nodeIdleTimeBeforeScaleDown;

    public Optional<String> getNodeIdleTimeBeforeScaleDown() {
        return this.nodeIdleTimeBeforeScaleDown == null ? Optional.empty() : Optional.ofNullable(this.nodeIdleTimeBeforeScaleDown);
    }

    public ScaleSettingsResponse(
        Integer maxNodeCount,
        @Nullable Integer minNodeCount,
        @Nullable String nodeIdleTimeBeforeScaleDown) {
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
        this.minNodeCount = minNodeCount == null ? 0 : minNodeCount;
        this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
    }

    private ScaleSettingsResponse() {
        this.maxNodeCount = null;
        this.minNodeCount = null;
        this.nodeIdleTimeBeforeScaleDown = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodeCount;
        private @Nullable Integer minNodeCount;
        private @Nullable String nodeIdleTimeBeforeScaleDown;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
    	      this.nodeIdleTimeBeforeScaleDown = defaults.nodeIdleTimeBeforeScaleDown;
        }

        public Builder setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }

        public Builder setMinNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }

        public Builder setNodeIdleTimeBeforeScaleDown(@Nullable String nodeIdleTimeBeforeScaleDown) {
            this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
            return this;
        }

        public ScaleSettingsResponse build() {
            return new ScaleSettingsResponse(maxNodeCount, minNodeCount, nodeIdleTimeBeforeScaleDown);
        }
    }
}