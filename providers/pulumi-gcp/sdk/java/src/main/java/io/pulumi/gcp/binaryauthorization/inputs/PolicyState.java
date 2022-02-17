// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternGetArgs;
import io.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleGetArgs;
import io.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * A whitelist of image patterns to exclude from admission rules. If an
     * image's name matches a whitelist pattern, the image's admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="admissionWhitelistPatterns")
    private final @Nullable Input<List<PolicyAdmissionWhitelistPatternGetArgs>> admissionWhitelistPatterns;

    public Input<List<PolicyAdmissionWhitelistPatternGetArgs>> getAdmissionWhitelistPatterns() {
        return this.admissionWhitelistPatterns == null ? Input.empty() : this.admissionWhitelistPatterns;
    }

    /**
     * Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * 
     */
    @InputImport(name="clusterAdmissionRules")
    private final @Nullable Input<List<PolicyClusterAdmissionRuleGetArgs>> clusterAdmissionRules;

    public Input<List<PolicyClusterAdmissionRuleGetArgs>> getClusterAdmissionRules() {
        return this.clusterAdmissionRules == null ? Input.empty() : this.clusterAdmissionRules;
    }

    /**
     * Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultAdmissionRule")
    private final @Nullable Input<PolicyDefaultAdmissionRuleGetArgs> defaultAdmissionRule;

    public Input<PolicyDefaultAdmissionRuleGetArgs> getDefaultAdmissionRule() {
        return this.defaultAdmissionRule == null ? Input.empty() : this.defaultAdmissionRule;
    }

    /**
     * A descriptive comment.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Controls the evaluation of a Google-maintained global admission policy
     * for common system-level images. Images not covered by the global
     * policy will be subject to the project admission policy.
     * Possible values are `ENABLE` and `DISABLE`.
     * 
     */
    @InputImport(name="globalPolicyEvaluationMode")
    private final @Nullable Input<String> globalPolicyEvaluationMode;

    public Input<String> getGlobalPolicyEvaluationMode() {
        return this.globalPolicyEvaluationMode == null ? Input.empty() : this.globalPolicyEvaluationMode;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public PolicyState(
        @Nullable Input<List<PolicyAdmissionWhitelistPatternGetArgs>> admissionWhitelistPatterns,
        @Nullable Input<List<PolicyClusterAdmissionRuleGetArgs>> clusterAdmissionRules,
        @Nullable Input<PolicyDefaultAdmissionRuleGetArgs> defaultAdmissionRule,
        @Nullable Input<String> description,
        @Nullable Input<String> globalPolicyEvaluationMode,
        @Nullable Input<String> project) {
        this.admissionWhitelistPatterns = admissionWhitelistPatterns;
        this.clusterAdmissionRules = clusterAdmissionRules;
        this.defaultAdmissionRule = defaultAdmissionRule;
        this.description = description;
        this.globalPolicyEvaluationMode = globalPolicyEvaluationMode;
        this.project = project;
    }

    private PolicyState() {
        this.admissionWhitelistPatterns = Input.empty();
        this.clusterAdmissionRules = Input.empty();
        this.defaultAdmissionRule = Input.empty();
        this.description = Input.empty();
        this.globalPolicyEvaluationMode = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PolicyAdmissionWhitelistPatternGetArgs>> admissionWhitelistPatterns;
        private @Nullable Input<List<PolicyClusterAdmissionRuleGetArgs>> clusterAdmissionRules;
        private @Nullable Input<PolicyDefaultAdmissionRuleGetArgs> defaultAdmissionRule;
        private @Nullable Input<String> description;
        private @Nullable Input<String> globalPolicyEvaluationMode;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionWhitelistPatterns = defaults.admissionWhitelistPatterns;
    	      this.clusterAdmissionRules = defaults.clusterAdmissionRules;
    	      this.defaultAdmissionRule = defaults.defaultAdmissionRule;
    	      this.description = defaults.description;
    	      this.globalPolicyEvaluationMode = defaults.globalPolicyEvaluationMode;
    	      this.project = defaults.project;
        }

        public Builder setAdmissionWhitelistPatterns(@Nullable Input<List<PolicyAdmissionWhitelistPatternGetArgs>> admissionWhitelistPatterns) {
            this.admissionWhitelistPatterns = admissionWhitelistPatterns;
            return this;
        }

        public Builder setAdmissionWhitelistPatterns(@Nullable List<PolicyAdmissionWhitelistPatternGetArgs> admissionWhitelistPatterns) {
            this.admissionWhitelistPatterns = Input.ofNullable(admissionWhitelistPatterns);
            return this;
        }

        public Builder setClusterAdmissionRules(@Nullable Input<List<PolicyClusterAdmissionRuleGetArgs>> clusterAdmissionRules) {
            this.clusterAdmissionRules = clusterAdmissionRules;
            return this;
        }

        public Builder setClusterAdmissionRules(@Nullable List<PolicyClusterAdmissionRuleGetArgs> clusterAdmissionRules) {
            this.clusterAdmissionRules = Input.ofNullable(clusterAdmissionRules);
            return this;
        }

        public Builder setDefaultAdmissionRule(@Nullable Input<PolicyDefaultAdmissionRuleGetArgs> defaultAdmissionRule) {
            this.defaultAdmissionRule = defaultAdmissionRule;
            return this;
        }

        public Builder setDefaultAdmissionRule(@Nullable PolicyDefaultAdmissionRuleGetArgs defaultAdmissionRule) {
            this.defaultAdmissionRule = Input.ofNullable(defaultAdmissionRule);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGlobalPolicyEvaluationMode(@Nullable Input<String> globalPolicyEvaluationMode) {
            this.globalPolicyEvaluationMode = globalPolicyEvaluationMode;
            return this;
        }

        public Builder setGlobalPolicyEvaluationMode(@Nullable String globalPolicyEvaluationMode) {
            this.globalPolicyEvaluationMode = Input.ofNullable(globalPolicyEvaluationMode);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public PolicyState build() {
            return new PolicyState(admissionWhitelistPatterns, clusterAdmissionRules, defaultAdmissionRule, description, globalPolicyEvaluationMode, project);
        }
    }
}