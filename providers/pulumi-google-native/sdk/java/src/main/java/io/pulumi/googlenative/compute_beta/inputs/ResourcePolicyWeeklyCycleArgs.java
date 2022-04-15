// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyWeeklyCycleDayOfWeekArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time window specified for weekly operations.
 * 
 */
public final class ResourcePolicyWeeklyCycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyWeeklyCycleArgs Empty = new ResourcePolicyWeeklyCycleArgs();

    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    @Import(name="dayOfWeeks")
      private final @Nullable Output<List<ResourcePolicyWeeklyCycleDayOfWeekArgs>> dayOfWeeks;

    public Output<List<ResourcePolicyWeeklyCycleDayOfWeekArgs>> dayOfWeeks() {
        return this.dayOfWeeks == null ? Codegen.empty() : this.dayOfWeeks;
    }

    public ResourcePolicyWeeklyCycleArgs(@Nullable Output<List<ResourcePolicyWeeklyCycleDayOfWeekArgs>> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    private ResourcePolicyWeeklyCycleArgs() {
        this.dayOfWeeks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ResourcePolicyWeeklyCycleDayOfWeekArgs>> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder dayOfWeeks(@Nullable Output<List<ResourcePolicyWeeklyCycleDayOfWeekArgs>> dayOfWeeks) {
            this.dayOfWeeks = dayOfWeeks;
            return this;
        }
        public Builder dayOfWeeks(@Nullable List<ResourcePolicyWeeklyCycleDayOfWeekArgs> dayOfWeeks) {
            this.dayOfWeeks = Codegen.ofNullable(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(ResourcePolicyWeeklyCycleDayOfWeekArgs... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }        public ResourcePolicyWeeklyCycleArgs build() {
            return new ResourcePolicyWeeklyCycleArgs(dayOfWeeks);
        }
    }
}
