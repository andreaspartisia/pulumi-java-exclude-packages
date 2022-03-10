// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidate;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExec {
    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce enforce;
    /**
     * Required. What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
     * 
     */
    private final OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidate validate;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceExec(
        @OutputCustomType.Parameter("enforce") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce enforce,
        @OutputCustomType.Parameter("validate") OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidate validate) {
        this.enforce = enforce;
        this.validate = validate;
    }

    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce> getEnforce() {
        return Optional.ofNullable(this.enforce);
    }
    /**
     * Required. What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
     * 
    */
    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidate getValidate() {
        return this.validate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce enforce;
        private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidate validate;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforce = defaults.enforce;
    	      this.validate = defaults.validate;
        }

        public Builder setEnforce(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder setValidate(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidate validate) {
            this.validate = Objects.requireNonNull(validate);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceExec build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExec(enforce, validate);
        }
    }
}
