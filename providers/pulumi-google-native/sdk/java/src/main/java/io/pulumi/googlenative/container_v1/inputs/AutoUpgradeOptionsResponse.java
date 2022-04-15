// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * AutoUpgradeOptions defines the set of options for the user to control how the Auto Upgrades will proceed.
 * 
 */
public final class AutoUpgradeOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoUpgradeOptionsResponse Empty = new AutoUpgradeOptionsResponse();

    /**
     * [Output only] This field is set when upgrades are about to commence with the approximate start time for the upgrades, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    @Import(name="autoUpgradeStartTime", required=true)
      private final String autoUpgradeStartTime;

    public String autoUpgradeStartTime() {
        return this.autoUpgradeStartTime;
    }

    /**
     * [Output only] This field is set when upgrades are about to commence with the description of the upgrade.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    public AutoUpgradeOptionsResponse(
        String autoUpgradeStartTime,
        String description) {
        this.autoUpgradeStartTime = Objects.requireNonNull(autoUpgradeStartTime, "expected parameter 'autoUpgradeStartTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
    }

    private AutoUpgradeOptionsResponse() {
        this.autoUpgradeStartTime = null;
        this.description = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoUpgradeOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoUpgradeStartTime;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoUpgradeOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeStartTime = defaults.autoUpgradeStartTime;
    	      this.description = defaults.description;
        }

        public Builder autoUpgradeStartTime(String autoUpgradeStartTime) {
            this.autoUpgradeStartTime = Objects.requireNonNull(autoUpgradeStartTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }        public AutoUpgradeOptionsResponse build() {
            return new AutoUpgradeOptionsResponse(autoUpgradeStartTime, description);
        }
    }
}
