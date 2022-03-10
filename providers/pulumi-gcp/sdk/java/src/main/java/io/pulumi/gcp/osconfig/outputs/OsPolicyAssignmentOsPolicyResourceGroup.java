// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilter;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResource;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroup {
    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    private final @Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilter> inventoryFilters;
    /**
     * Required. List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    private final List<OsPolicyAssignmentOsPolicyResourceGroupResource> resources;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroup(
        @OutputCustomType.Parameter("inventoryFilters") @Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilter> inventoryFilters,
        @OutputCustomType.Parameter("resources") List<OsPolicyAssignmentOsPolicyResourceGroupResource> resources) {
        this.inventoryFilters = inventoryFilters;
        this.resources = resources;
    }

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
    */
    public List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilter> getInventoryFilters() {
        return this.inventoryFilters == null ? List.of() : this.inventoryFilters;
    }
    /**
     * Required. List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
    */
    public List<OsPolicyAssignmentOsPolicyResourceGroupResource> getResources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilter> inventoryFilters;
        private List<OsPolicyAssignmentOsPolicyResourceGroupResource> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder setInventoryFilters(@Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilter> inventoryFilters) {
            this.inventoryFilters = inventoryFilters;
            return this;
        }

        public Builder setResources(List<OsPolicyAssignmentOsPolicyResourceGroupResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroup build() {
            return new OsPolicyAssignmentOsPolicyResourceGroup(inventoryFilters, resources);
        }
    }
}
