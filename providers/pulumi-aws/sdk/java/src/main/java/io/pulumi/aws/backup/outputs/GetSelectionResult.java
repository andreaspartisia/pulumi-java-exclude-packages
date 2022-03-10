// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSelectionResult {
    /**
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    private final String iamRoleArn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The display name of a resource selection document.
     * 
     */
    private final String name;
    private final String planId;
    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
     * 
     */
    private final List<String> resources;
    private final String selectionId;

    @OutputCustomType.Constructor
    private GetSelectionResult(
        @OutputCustomType.Parameter("iamRoleArn") String iamRoleArn,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("planId") String planId,
        @OutputCustomType.Parameter("resources") List<String> resources,
        @OutputCustomType.Parameter("selectionId") String selectionId) {
        this.iamRoleArn = iamRoleArn;
        this.id = id;
        this.name = name;
        this.planId = planId;
        this.resources = resources;
        this.selectionId = selectionId;
    }

    /**
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
    */
    public String getIamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The display name of a resource selection document.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getPlanId() {
        return this.planId;
    }
    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
     * 
    */
    public List<String> getResources() {
        return this.resources;
    }
    public String getSelectionId() {
        return this.selectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSelectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iamRoleArn;
        private String id;
        private String name;
        private String planId;
        private List<String> resources;
        private String selectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSelectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.planId = defaults.planId;
    	      this.resources = defaults.resources;
    	      this.selectionId = defaults.selectionId;
        }

        public Builder setIamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlanId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setSelectionId(String selectionId) {
            this.selectionId = Objects.requireNonNull(selectionId);
            return this;
        }
        public GetSelectionResult build() {
            return new GetSelectionResult(iamRoleArn, id, name, planId, resources, selectionId);
        }
    }
}