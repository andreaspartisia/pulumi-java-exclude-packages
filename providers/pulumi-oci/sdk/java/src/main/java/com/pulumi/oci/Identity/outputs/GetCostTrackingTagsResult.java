// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Identity.outputs.GetCostTrackingTagsFilter;
import com.pulumi.oci.Identity.outputs.GetCostTrackingTagsTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCostTrackingTagsResult {
    /**
     * @return The OCID of the compartment that contains the tag definition.
     * 
     */
    private final String compartmentId;
    private final @Nullable List<GetCostTrackingTagsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of tags.
     * 
     */
    private final List<GetCostTrackingTagsTag> tags;

    @CustomType.Constructor
    private GetCostTrackingTagsResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetCostTrackingTagsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tags") List<GetCostTrackingTagsTag> tags) {
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.tags = tags;
    }

    /**
     * @return The OCID of the compartment that contains the tag definition.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetCostTrackingTagsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of tags.
     * 
     */
    public List<GetCostTrackingTagsTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostTrackingTagsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable List<GetCostTrackingTagsFilter> filters;
        private String id;
        private List<GetCostTrackingTagsTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCostTrackingTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetCostTrackingTagsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCostTrackingTagsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder tags(List<GetCostTrackingTagsTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetCostTrackingTagsTag... tags) {
            return tags(List.of(tags));
        }        public GetCostTrackingTagsResult build() {
            return new GetCostTrackingTagsResult(compartmentId, filters, id, tags);
        }
    }
}
