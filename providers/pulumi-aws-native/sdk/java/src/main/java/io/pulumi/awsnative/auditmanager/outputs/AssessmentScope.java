// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.outputs;

import io.pulumi.awsnative.auditmanager.outputs.AssessmentAWSAccount;
import io.pulumi.awsnative.auditmanager.outputs.AssessmentAWSService;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssessmentScope {
    /**
     * The AWS accounts included in scope.
     * 
     */
    private final @Nullable List<AssessmentAWSAccount> awsAccounts;
    /**
     * The AWS services included in scope.
     * 
     */
    private final @Nullable List<AssessmentAWSService> awsServices;

    @OutputCustomType.Constructor({"awsAccounts","awsServices"})
    private AssessmentScope(
        @Nullable List<AssessmentAWSAccount> awsAccounts,
        @Nullable List<AssessmentAWSService> awsServices) {
        this.awsAccounts = awsAccounts;
        this.awsServices = awsServices;
    }

    /**
     * The AWS accounts included in scope.
     * 
     */
    public List<AssessmentAWSAccount> getAwsAccounts() {
        return this.awsAccounts == null ? List.of() : this.awsAccounts;
    }
    /**
     * The AWS services included in scope.
     * 
     */
    public List<AssessmentAWSService> getAwsServices() {
        return this.awsServices == null ? List.of() : this.awsServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AssessmentAWSAccount> awsAccounts;
        private @Nullable List<AssessmentAWSService> awsServices;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccounts = defaults.awsAccounts;
    	      this.awsServices = defaults.awsServices;
        }

        public Builder setAwsAccounts(@Nullable List<AssessmentAWSAccount> awsAccounts) {
            this.awsAccounts = awsAccounts;
            return this;
        }

        public Builder setAwsServices(@Nullable List<AssessmentAWSService> awsServices) {
            this.awsServices = awsServices;
            return this;
        }

        public AssessmentScope build() {
            return new AssessmentScope(awsAccounts, awsServices);
        }
    }
}