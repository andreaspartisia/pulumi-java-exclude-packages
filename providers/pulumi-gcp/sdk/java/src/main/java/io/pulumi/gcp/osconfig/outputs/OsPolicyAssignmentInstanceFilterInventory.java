// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentInstanceFilterInventory {
    /**
     * Required. The OS short name
     * 
     */
    private final String osShortName;
    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    private final @Nullable String osVersion;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentInstanceFilterInventory(
        @OutputCustomType.Parameter("osShortName") String osShortName,
        @OutputCustomType.Parameter("osVersion") @Nullable String osVersion) {
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    /**
     * Required. The OS short name
     * 
    */
    public String getOsShortName() {
        return this.osShortName;
    }
    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
    */
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterInventory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osShortName;
        private @Nullable String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterInventory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public OsPolicyAssignmentInstanceFilterInventory build() {
            return new OsPolicyAssignmentInstanceFilterInventory(osShortName, osVersion);
        }
    }
}
