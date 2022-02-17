// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs();

    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
     * 
     */
    @InputImport(name="enforce")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs> enforce;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs> getEnforce() {
        return this.enforce == null ? Input.empty() : this.enforce;
    }

    /**
     * Required. What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
     * 
     */
    @InputImport(name="validate", required=true)
    private final Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs> validate;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs> getValidate() {
        return this.validate;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs(
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs> enforce,
        Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs> validate) {
        this.enforce = enforce;
        this.validate = Objects.requireNonNull(validate, "expected parameter 'validate' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs() {
        this.enforce = Input.empty();
        this.validate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs> enforce;
        private Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs> validate;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforce = defaults.enforce;
    	      this.validate = defaults.validate;
        }

        public Builder setEnforce(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder setEnforce(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceGetArgs enforce) {
            this.enforce = Input.ofNullable(enforce);
            return this;
        }

        public Builder setValidate(Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs> validate) {
            this.validate = Objects.requireNonNull(validate);
            return this;
        }

        public Builder setValidate(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs validate) {
            this.validate = Input.of(Objects.requireNonNull(validate));
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs(enforce, validate);
        }
    }
}