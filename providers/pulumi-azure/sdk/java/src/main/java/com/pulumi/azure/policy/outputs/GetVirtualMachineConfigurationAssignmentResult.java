// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVirtualMachineConfigurationAssignmentResult {
    /**
     * @return Combined hash of the configuration package and parameters.
     * 
     */
    private final String assignmentHash;
    /**
     * @return A value indicating compliance status of the machine for the assigned guest configuration. Possible return values are `Compliant`, `NonCompliant` and `Pending`.
     * 
     */
    private final String complianceStatus;
    /**
     * @return The content hash for the Guest Configuration package.
     * 
     */
    private final String contentHash;
    /**
     * @return The content URI where the Guest Configuration package is stored.
     * 
     */
    private final String contentUri;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Date and time, in RFC3339 format, when the machines compliance status was last checked.
     * 
     */
    private final String lastComplianceStatusChecked;
    /**
     * @return The ID of the latest report for the guest configuration assignment.
     * 
     */
    private final String latestReportId;
    private final String name;
    private final String resourceGroupName;
    private final String virtualMachineName;

    @CustomType.Constructor
    private GetVirtualMachineConfigurationAssignmentResult(
        @CustomType.Parameter("assignmentHash") String assignmentHash,
        @CustomType.Parameter("complianceStatus") String complianceStatus,
        @CustomType.Parameter("contentHash") String contentHash,
        @CustomType.Parameter("contentUri") String contentUri,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastComplianceStatusChecked") String lastComplianceStatusChecked,
        @CustomType.Parameter("latestReportId") String latestReportId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("virtualMachineName") String virtualMachineName) {
        this.assignmentHash = assignmentHash;
        this.complianceStatus = complianceStatus;
        this.contentHash = contentHash;
        this.contentUri = contentUri;
        this.id = id;
        this.lastComplianceStatusChecked = lastComplianceStatusChecked;
        this.latestReportId = latestReportId;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.virtualMachineName = virtualMachineName;
    }

    /**
     * @return Combined hash of the configuration package and parameters.
     * 
     */
    public String assignmentHash() {
        return this.assignmentHash;
    }
    /**
     * @return A value indicating compliance status of the machine for the assigned guest configuration. Possible return values are `Compliant`, `NonCompliant` and `Pending`.
     * 
     */
    public String complianceStatus() {
        return this.complianceStatus;
    }
    /**
     * @return The content hash for the Guest Configuration package.
     * 
     */
    public String contentHash() {
        return this.contentHash;
    }
    /**
     * @return The content URI where the Guest Configuration package is stored.
     * 
     */
    public String contentUri() {
        return this.contentUri;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Date and time, in RFC3339 format, when the machines compliance status was last checked.
     * 
     */
    public String lastComplianceStatusChecked() {
        return this.lastComplianceStatusChecked;
    }
    /**
     * @return The ID of the latest report for the guest configuration assignment.
     * 
     */
    public String latestReportId() {
        return this.latestReportId;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String virtualMachineName() {
        return this.virtualMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineConfigurationAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentHash;
        private String complianceStatus;
        private String contentHash;
        private String contentUri;
        private String id;
        private String lastComplianceStatusChecked;
        private String latestReportId;
        private String name;
        private String resourceGroupName;
        private String virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineConfigurationAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentHash = defaults.assignmentHash;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.contentHash = defaults.contentHash;
    	      this.contentUri = defaults.contentUri;
    	      this.id = defaults.id;
    	      this.lastComplianceStatusChecked = defaults.lastComplianceStatusChecked;
    	      this.latestReportId = defaults.latestReportId;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder assignmentHash(String assignmentHash) {
            this.assignmentHash = Objects.requireNonNull(assignmentHash);
            return this;
        }
        public Builder complianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }
        public Builder contentHash(String contentHash) {
            this.contentHash = Objects.requireNonNull(contentHash);
            return this;
        }
        public Builder contentUri(String contentUri) {
            this.contentUri = Objects.requireNonNull(contentUri);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastComplianceStatusChecked(String lastComplianceStatusChecked) {
            this.lastComplianceStatusChecked = Objects.requireNonNull(lastComplianceStatusChecked);
            return this;
        }
        public Builder latestReportId(String latestReportId) {
            this.latestReportId = Objects.requireNonNull(latestReportId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder virtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }        public GetVirtualMachineConfigurationAssignmentResult build() {
            return new GetVirtualMachineConfigurationAssignmentResult(assignmentHash, complianceStatus, contentHash, contentUri, id, lastComplianceStatusChecked, latestReportId, name, resourceGroupName, virtualMachineName);
        }
    }
}
