// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationRootPolicyType {
    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    private final String status;
    private final String type;

    @OutputCustomType.Constructor
    private GetOrganizationRootPolicyType(
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type) {
        this.status = status;
        this.type = type;
    }

    /**
     * The status of the policy type as it relates to the associated root
     * 
    */
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationRootPolicyType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationRootPolicyType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetOrganizationRootPolicyType build() {
            return new GetOrganizationRootPolicyType(status, type);
        }
    }
}