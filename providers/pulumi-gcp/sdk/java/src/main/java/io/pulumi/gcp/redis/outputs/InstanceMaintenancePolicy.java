// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.redis.outputs.InstanceMaintenancePolicyWeeklyMaintenanceWindow;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceMaintenancePolicy {
    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    private final @Nullable String createTime;
    /**
     * Optional. Description of what this policy is for.
     * Create/Update methods return INVALID_ARGUMENT if the
     * length is greater than 512.
     * 
     */
    private final @Nullable String description;
    /**
     * - 
     * Output only. The time when the policy was last updated.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    private final @Nullable String updateTime;
    /**
     * Optional. Maintenance window that is applied to resources covered by this policy.
     * Minimum 1. For the current version, the maximum number
     * of weekly_window is expected to be one.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows;

    @OutputCustomType.Constructor
    private InstanceMaintenancePolicy(
        @OutputCustomType.Parameter("createTime") @Nullable String createTime,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("updateTime") @Nullable String updateTime,
        @OutputCustomType.Parameter("weeklyMaintenanceWindows") @Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows) {
        this.createTime = createTime;
        this.description = description;
        this.updateTime = updateTime;
        this.weeklyMaintenanceWindows = weeklyMaintenanceWindows;
    }

    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
    */
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    /**
     * Optional. Description of what this policy is for.
     * Create/Update methods return INVALID_ARGUMENT if the
     * length is greater than 512.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * - 
     * Output only. The time when the policy was last updated.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
    */
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }
    /**
     * Optional. Maintenance window that is applied to resources covered by this policy.
     * Minimum 1. For the current version, the maximum number
     * of weekly_window is expected to be one.
     * Structure is documented below.
     * 
    */
    public List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> getWeeklyMaintenanceWindows() {
        return this.weeklyMaintenanceWindows == null ? List.of() : this.weeklyMaintenanceWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createTime;
        private @Nullable String description;
        private @Nullable String updateTime;
        private @Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
    	      this.weeklyMaintenanceWindows = defaults.weeklyMaintenanceWindows;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setWeeklyMaintenanceWindows(@Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows) {
            this.weeklyMaintenanceWindows = weeklyMaintenanceWindows;
            return this;
        }
        public InstanceMaintenancePolicy build() {
            return new InstanceMaintenancePolicy(createTime, description, updateTime, weeklyMaintenanceWindows);
        }
    }
}
