// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi {
    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
     */
    private final @Nullable List<String> properties;
    /**
     * Required. An rpm package.
     * 
     */
    private final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource source;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi(
        @OutputCustomType.Parameter("properties") @Nullable List<String> properties,
        @OutputCustomType.Parameter("source") OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource source) {
        this.properties = properties;
        this.source = source;
    }

    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
    */
    public List<String> getProperties() {
        return this.properties == null ? List.of() : this.properties;
    }
    /**
     * Required. An rpm package.
     * 
    */
    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> properties;
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource source;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.source = defaults.source;
        }

        public Builder setProperties(@Nullable List<String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setSource(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSource source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi(properties, source);
        }
    }
}
