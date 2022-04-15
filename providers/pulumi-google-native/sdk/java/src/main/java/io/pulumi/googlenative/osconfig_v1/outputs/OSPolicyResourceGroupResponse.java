// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyInventoryFilterResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceGroupResponse {
    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    private final List<OSPolicyInventoryFilterResponse> inventoryFilters;
    /**
     * List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    private final List<OSPolicyResourceResponse> resources;

    @CustomType.Constructor
    private OSPolicyResourceGroupResponse(
        @CustomType.Parameter("inventoryFilters") List<OSPolicyInventoryFilterResponse> inventoryFilters,
        @CustomType.Parameter("resources") List<OSPolicyResourceResponse> resources) {
        this.inventoryFilters = inventoryFilters;
        this.resources = resources;
    }

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
    */
    public List<OSPolicyInventoryFilterResponse> inventoryFilters() {
        return this.inventoryFilters;
    }
    /**
     * List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
    */
    public List<OSPolicyResourceResponse> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OSPolicyInventoryFilterResponse> inventoryFilters;
        private List<OSPolicyResourceResponse> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder inventoryFilters(List<OSPolicyInventoryFilterResponse> inventoryFilters) {
            this.inventoryFilters = Objects.requireNonNull(inventoryFilters);
            return this;
        }
        public Builder inventoryFilters(OSPolicyInventoryFilterResponse... inventoryFilters) {
            return inventoryFilters(List.of(inventoryFilters));
        }
        public Builder resources(List<OSPolicyResourceResponse> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(OSPolicyResourceResponse... resources) {
            return resources(List.of(resources));
        }        public OSPolicyResourceGroupResponse build() {
            return new OSPolicyResourceGroupResponse(inventoryFilters, resources);
        }
    }
}
