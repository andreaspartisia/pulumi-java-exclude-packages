// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetMaskingAnalyticItem;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMaskingAnalyticResult {
    private final String compartmentId;
    private final @Nullable Boolean compartmentIdInSubtree;
    private final @Nullable String groupBy;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return An array of masking analytics summary objects.
     * 
     */
    private final List<GetMaskingAnalyticItem> items;
    private final @Nullable String maskingPolicyId;
    /**
     * @return The OCID of the target database.
     * 
     */
    private final @Nullable String targetId;

    @CustomType.Constructor
    private GetMaskingAnalyticResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("compartmentIdInSubtree") @Nullable Boolean compartmentIdInSubtree,
        @CustomType.Parameter("groupBy") @Nullable String groupBy,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("items") List<GetMaskingAnalyticItem> items,
        @CustomType.Parameter("maskingPolicyId") @Nullable String maskingPolicyId,
        @CustomType.Parameter("targetId") @Nullable String targetId) {
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.groupBy = groupBy;
        this.id = id;
        this.items = items;
        this.maskingPolicyId = maskingPolicyId;
        this.targetId = targetId;
    }

    public String compartmentId() {
        return this.compartmentId;
    }
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }
    public Optional<String> groupBy() {
        return Optional.ofNullable(this.groupBy);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An array of masking analytics summary objects.
     * 
     */
    public List<GetMaskingAnalyticItem> items() {
        return this.items;
    }
    public Optional<String> maskingPolicyId() {
        return Optional.ofNullable(this.maskingPolicyId);
    }
    /**
     * @return The OCID of the target database.
     * 
     */
    public Optional<String> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingAnalyticResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable Boolean compartmentIdInSubtree;
        private @Nullable String groupBy;
        private String id;
        private List<GetMaskingAnalyticItem> items;
        private @Nullable String maskingPolicyId;
        private @Nullable String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaskingAnalyticResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.compartmentIdInSubtree = defaults.compartmentIdInSubtree;
    	      this.groupBy = defaults.groupBy;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.maskingPolicyId = defaults.maskingPolicyId;
    	      this.targetId = defaults.targetId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }
        public Builder groupBy(@Nullable String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder items(List<GetMaskingAnalyticItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetMaskingAnalyticItem... items) {
            return items(List.of(items));
        }
        public Builder maskingPolicyId(@Nullable String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }
        public Builder targetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }        public GetMaskingAnalyticResult build() {
            return new GetMaskingAnalyticResult(compartmentId, compartmentIdInSubtree, groupBy, id, items, maskingPolicyId, targetId);
        }
    }
}
