// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesAssignmentGroupLabel;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesAssignmentOsType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesAssignment {
    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     * for example "env=prod or env=staging".
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GuestPoliciesAssignmentGroupLabel> groupLabels;
    /**
     * Targets VM instances whose name starts with one of these prefixes.
     * Like labels, this is another way to group VM instances when targeting configs,
     * for example prefix="prod-".
     * Only supported for project-level policies.
     * 
     */
    private final @Nullable List<String> instanceNamePrefixes;
    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form
     * zones/[ZONE]/instances/[INSTANCE_NAME].
     * Instance targeting is uncommon and is supported to facilitate the management of changes
     * by the instance or to target specific VM instances for development and testing.
     * Only supported for project-level policies and must reference instances within this project.
     * 
     */
    private final @Nullable List<String> instances;
    /**
     * Targets VM instances matching at least one of the following OS types.
     * VM instances must match all supplied criteria for a given OsType to be included.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GuestPoliciesAssignmentOsType> osTypes;
    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone.
     * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor
    private GuestPoliciesAssignment(
        @OutputCustomType.Parameter("groupLabels") @Nullable List<GuestPoliciesAssignmentGroupLabel> groupLabels,
        @OutputCustomType.Parameter("instanceNamePrefixes") @Nullable List<String> instanceNamePrefixes,
        @OutputCustomType.Parameter("instances") @Nullable List<String> instances,
        @OutputCustomType.Parameter("osTypes") @Nullable List<GuestPoliciesAssignmentOsType> osTypes,
        @OutputCustomType.Parameter("zones") @Nullable List<String> zones) {
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.osTypes = osTypes;
        this.zones = zones;
    }

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     * for example "env=prod or env=staging".
     * Structure is documented below.
     * 
    */
    public List<GuestPoliciesAssignmentGroupLabel> getGroupLabels() {
        return this.groupLabels == null ? List.of() : this.groupLabels;
    }
    /**
     * Targets VM instances whose name starts with one of these prefixes.
     * Like labels, this is another way to group VM instances when targeting configs,
     * for example prefix="prod-".
     * Only supported for project-level policies.
     * 
    */
    public List<String> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? List.of() : this.instanceNamePrefixes;
    }
    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form
     * zones/[ZONE]/instances/[INSTANCE_NAME].
     * Instance targeting is uncommon and is supported to facilitate the management of changes
     * by the instance or to target specific VM instances for development and testing.
     * Only supported for project-level policies and must reference instances within this project.
     * 
    */
    public List<String> getInstances() {
        return this.instances == null ? List.of() : this.instances;
    }
    /**
     * Targets VM instances matching at least one of the following OS types.
     * VM instances must match all supplied criteria for a given OsType to be included.
     * Structure is documented below.
     * 
    */
    public List<GuestPoliciesAssignmentOsType> getOsTypes() {
        return this.osTypes == null ? List.of() : this.osTypes;
    }
    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone.
     * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GuestPoliciesAssignmentGroupLabel> groupLabels;
        private @Nullable List<String> instanceNamePrefixes;
        private @Nullable List<String> instances;
        private @Nullable List<GuestPoliciesAssignmentOsType> osTypes;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.osTypes = defaults.osTypes;
    	      this.zones = defaults.zones;
        }

        public Builder setGroupLabels(@Nullable List<GuestPoliciesAssignmentGroupLabel> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }

        public Builder setInstanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setOsTypes(@Nullable List<GuestPoliciesAssignmentOsType> osTypes) {
            this.osTypes = osTypes;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GuestPoliciesAssignment build() {
            return new GuestPoliciesAssignment(groupLabels, instanceNamePrefixes, instances, osTypes, zones);
        }
    }
}
