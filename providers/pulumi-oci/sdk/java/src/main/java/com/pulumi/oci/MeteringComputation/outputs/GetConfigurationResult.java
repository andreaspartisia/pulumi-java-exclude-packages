// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.MeteringComputation.outputs.GetConfigurationItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConfigurationResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of available configurations.
     * 
     */
    private final List<GetConfigurationItem> items;
    private final String tenantId;

    @CustomType.Constructor
    private GetConfigurationResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("items") List<GetConfigurationItem> items,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.id = id;
        this.items = items;
        this.tenantId = tenantId;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of available configurations.
     * 
     */
    public List<GetConfigurationItem> items() {
        return this.items;
    }
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetConfigurationItem> items;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder items(List<GetConfigurationItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetConfigurationItem... items) {
            return items(List.of(items));
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public GetConfigurationResult build() {
            return new GetConfigurationResult(id, items, tenantId);
        }
    }
}
