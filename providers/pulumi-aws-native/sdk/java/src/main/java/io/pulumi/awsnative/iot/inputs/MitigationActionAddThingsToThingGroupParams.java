// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters to define a mitigation action that moves devices associated with a certificate to one or more specified thing groups, typically for quarantine.
 * 
 */
public final class MitigationActionAddThingsToThingGroupParams extends io.pulumi.resources.InvokeArgs {

    public static final MitigationActionAddThingsToThingGroupParams Empty = new MitigationActionAddThingsToThingGroupParams();

    /**
     * Specifies if this mitigation action can move the things that triggered the mitigation action out of one or more dynamic thing groups.
     * 
     */
    @InputImport(name="overrideDynamicGroups")
    private final @Nullable Boolean overrideDynamicGroups;

    public Optional<Boolean> getOverrideDynamicGroups() {
        return this.overrideDynamicGroups == null ? Optional.empty() : Optional.ofNullable(this.overrideDynamicGroups);
    }

    /**
     * The list of groups to which you want to add the things that triggered the mitigation action.
     * 
     */
    @InputImport(name="thingGroupNames", required=true)
    private final List<String> thingGroupNames;

    public List<String> getThingGroupNames() {
        return this.thingGroupNames;
    }

    public MitigationActionAddThingsToThingGroupParams(
        @Nullable Boolean overrideDynamicGroups,
        List<String> thingGroupNames) {
        this.overrideDynamicGroups = overrideDynamicGroups;
        this.thingGroupNames = Objects.requireNonNull(thingGroupNames, "expected parameter 'thingGroupNames' to be non-null");
    }

    private MitigationActionAddThingsToThingGroupParams() {
        this.overrideDynamicGroups = null;
        this.thingGroupNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionAddThingsToThingGroupParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean overrideDynamicGroups;
        private List<String> thingGroupNames;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionAddThingsToThingGroupParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideDynamicGroups = defaults.overrideDynamicGroups;
    	      this.thingGroupNames = defaults.thingGroupNames;
        }

        public Builder setOverrideDynamicGroups(@Nullable Boolean overrideDynamicGroups) {
            this.overrideDynamicGroups = overrideDynamicGroups;
            return this;
        }

        public Builder setThingGroupNames(List<String> thingGroupNames) {
            this.thingGroupNames = Objects.requireNonNull(thingGroupNames);
            return this;
        }

        public MitigationActionAddThingsToThingGroupParams build() {
            return new MitigationActionAddThingsToThingGroupParams(overrideDynamicGroups, thingGroupNames);
        }
    }
}