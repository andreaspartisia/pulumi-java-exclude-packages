// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerTumblingWindowTriggerDependency {
    /**
     * @return The offset of the dependency trigger. Must be in Timespan format (±hh:mm:ss) and must be a negative offset for a self dependency.
     * 
     */
    private final @Nullable String offset;
    /**
     * @return The size of the dependency tumbling window. Must be in Timespan format (hh:mm:ss).
     * 
     */
    private final @Nullable String size;
    /**
     * @return The dependency trigger name. If not specified, it will use self dependency.
     * 
     */
    private final @Nullable String triggerName;

    @CustomType.Constructor
    private TriggerTumblingWindowTriggerDependency(
        @CustomType.Parameter("offset") @Nullable String offset,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("triggerName") @Nullable String triggerName) {
        this.offset = offset;
        this.size = size;
        this.triggerName = triggerName;
    }

    /**
     * @return The offset of the dependency trigger. Must be in Timespan format (±hh:mm:ss) and must be a negative offset for a self dependency.
     * 
     */
    public Optional<String> offset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * @return The size of the dependency tumbling window. Must be in Timespan format (hh:mm:ss).
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The dependency trigger name. If not specified, it will use self dependency.
     * 
     */
    public Optional<String> triggerName() {
        return Optional.ofNullable(this.triggerName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTumblingWindowTriggerDependency defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offset;
        private @Nullable String size;
        private @Nullable String triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTumblingWindowTriggerDependency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offset = defaults.offset;
    	      this.size = defaults.size;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder offset(@Nullable String offset) {
            this.offset = offset;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder triggerName(@Nullable String triggerName) {
            this.triggerName = triggerName;
            return this;
        }        public TriggerTumblingWindowTriggerDependency build() {
            return new TriggerTumblingWindowTriggerDependency(offset, size, triggerName);
        }
    }
}
