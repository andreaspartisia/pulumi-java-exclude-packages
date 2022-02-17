// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.PipelineAddAttributes;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineChannel;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineDatastore;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineDeviceRegistryEnrich;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineDeviceShadowEnrich;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineFilter;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineLambda;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineMath;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineRemoveAttributes;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineSelectAttributes;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineActivity extends io.pulumi.resources.InvokeArgs {

    public static final PipelineActivity Empty = new PipelineActivity();

    @InputImport(name="addAttributes")
    private final @Nullable PipelineAddAttributes addAttributes;

    public Optional<PipelineAddAttributes> getAddAttributes() {
        return this.addAttributes == null ? Optional.empty() : Optional.ofNullable(this.addAttributes);
    }

    @InputImport(name="channel")
    private final @Nullable PipelineChannel channel;

    public Optional<PipelineChannel> getChannel() {
        return this.channel == null ? Optional.empty() : Optional.ofNullable(this.channel);
    }

    @InputImport(name="datastore")
    private final @Nullable PipelineDatastore datastore;

    public Optional<PipelineDatastore> getDatastore() {
        return this.datastore == null ? Optional.empty() : Optional.ofNullable(this.datastore);
    }

    @InputImport(name="deviceRegistryEnrich")
    private final @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich;

    public Optional<PipelineDeviceRegistryEnrich> getDeviceRegistryEnrich() {
        return this.deviceRegistryEnrich == null ? Optional.empty() : Optional.ofNullable(this.deviceRegistryEnrich);
    }

    @InputImport(name="deviceShadowEnrich")
    private final @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich;

    public Optional<PipelineDeviceShadowEnrich> getDeviceShadowEnrich() {
        return this.deviceShadowEnrich == null ? Optional.empty() : Optional.ofNullable(this.deviceShadowEnrich);
    }

    @InputImport(name="filter")
    private final @Nullable PipelineFilter filter;

    public Optional<PipelineFilter> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    @InputImport(name="lambda")
    private final @Nullable PipelineLambda lambda;

    public Optional<PipelineLambda> getLambda() {
        return this.lambda == null ? Optional.empty() : Optional.ofNullable(this.lambda);
    }

    @InputImport(name="math")
    private final @Nullable PipelineMath math;

    public Optional<PipelineMath> getMath() {
        return this.math == null ? Optional.empty() : Optional.ofNullable(this.math);
    }

    @InputImport(name="removeAttributes")
    private final @Nullable PipelineRemoveAttributes removeAttributes;

    public Optional<PipelineRemoveAttributes> getRemoveAttributes() {
        return this.removeAttributes == null ? Optional.empty() : Optional.ofNullable(this.removeAttributes);
    }

    @InputImport(name="selectAttributes")
    private final @Nullable PipelineSelectAttributes selectAttributes;

    public Optional<PipelineSelectAttributes> getSelectAttributes() {
        return this.selectAttributes == null ? Optional.empty() : Optional.ofNullable(this.selectAttributes);
    }

    public PipelineActivity(
        @Nullable PipelineAddAttributes addAttributes,
        @Nullable PipelineChannel channel,
        @Nullable PipelineDatastore datastore,
        @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich,
        @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich,
        @Nullable PipelineFilter filter,
        @Nullable PipelineLambda lambda,
        @Nullable PipelineMath math,
        @Nullable PipelineRemoveAttributes removeAttributes,
        @Nullable PipelineSelectAttributes selectAttributes) {
        this.addAttributes = addAttributes;
        this.channel = channel;
        this.datastore = datastore;
        this.deviceRegistryEnrich = deviceRegistryEnrich;
        this.deviceShadowEnrich = deviceShadowEnrich;
        this.filter = filter;
        this.lambda = lambda;
        this.math = math;
        this.removeAttributes = removeAttributes;
        this.selectAttributes = selectAttributes;
    }

    private PipelineActivity() {
        this.addAttributes = null;
        this.channel = null;
        this.datastore = null;
        this.deviceRegistryEnrich = null;
        this.deviceShadowEnrich = null;
        this.filter = null;
        this.lambda = null;
        this.math = null;
        this.removeAttributes = null;
        this.selectAttributes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineActivity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineAddAttributes addAttributes;
        private @Nullable PipelineChannel channel;
        private @Nullable PipelineDatastore datastore;
        private @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich;
        private @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich;
        private @Nullable PipelineFilter filter;
        private @Nullable PipelineLambda lambda;
        private @Nullable PipelineMath math;
        private @Nullable PipelineRemoveAttributes removeAttributes;
        private @Nullable PipelineSelectAttributes selectAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineActivity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addAttributes = defaults.addAttributes;
    	      this.channel = defaults.channel;
    	      this.datastore = defaults.datastore;
    	      this.deviceRegistryEnrich = defaults.deviceRegistryEnrich;
    	      this.deviceShadowEnrich = defaults.deviceShadowEnrich;
    	      this.filter = defaults.filter;
    	      this.lambda = defaults.lambda;
    	      this.math = defaults.math;
    	      this.removeAttributes = defaults.removeAttributes;
    	      this.selectAttributes = defaults.selectAttributes;
        }

        public Builder setAddAttributes(@Nullable PipelineAddAttributes addAttributes) {
            this.addAttributes = addAttributes;
            return this;
        }

        public Builder setChannel(@Nullable PipelineChannel channel) {
            this.channel = channel;
            return this;
        }

        public Builder setDatastore(@Nullable PipelineDatastore datastore) {
            this.datastore = datastore;
            return this;
        }

        public Builder setDeviceRegistryEnrich(@Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich) {
            this.deviceRegistryEnrich = deviceRegistryEnrich;
            return this;
        }

        public Builder setDeviceShadowEnrich(@Nullable PipelineDeviceShadowEnrich deviceShadowEnrich) {
            this.deviceShadowEnrich = deviceShadowEnrich;
            return this;
        }

        public Builder setFilter(@Nullable PipelineFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setLambda(@Nullable PipelineLambda lambda) {
            this.lambda = lambda;
            return this;
        }

        public Builder setMath(@Nullable PipelineMath math) {
            this.math = math;
            return this;
        }

        public Builder setRemoveAttributes(@Nullable PipelineRemoveAttributes removeAttributes) {
            this.removeAttributes = removeAttributes;
            return this;
        }

        public Builder setSelectAttributes(@Nullable PipelineSelectAttributes selectAttributes) {
            this.selectAttributes = selectAttributes;
            return this;
        }

        public PipelineActivity build() {
            return new PipelineActivity(addAttributes, channel, datastore, deviceRegistryEnrich, deviceShadowEnrich, filter, lambda, math, removeAttributes, selectAttributes);
        }
    }
}