// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetBlockVolumeReplicasBlockVolumeReplica;
import com.pulumi.oci.Core.outputs.GetBlockVolumeReplicasFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBlockVolumeReplicasResult {
    /**
     * @return The availability domain of the block volume replica.  Example: `Uocm:PHX-AD-1`
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The list of block_volume_replicas.
     * 
     */
    private final List<GetBlockVolumeReplicasBlockVolumeReplica> blockVolumeReplicas;
    /**
     * @return The OCID of the compartment that contains the block volume replica.
     * 
     */
    private final String compartmentId;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetBlockVolumeReplicasFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current state of a block volume replica.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetBlockVolumeReplicasResult(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("blockVolumeReplicas") List<GetBlockVolumeReplicasBlockVolumeReplica> blockVolumeReplicas,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetBlockVolumeReplicasFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") @Nullable String state) {
        this.availabilityDomain = availabilityDomain;
        this.blockVolumeReplicas = blockVolumeReplicas;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.state = state;
    }

    /**
     * @return The availability domain of the block volume replica.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The list of block_volume_replicas.
     * 
     */
    public List<GetBlockVolumeReplicasBlockVolumeReplica> blockVolumeReplicas() {
        return this.blockVolumeReplicas;
    }
    /**
     * @return The OCID of the compartment that contains the block volume replica.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetBlockVolumeReplicasFilter> filters() {
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
     * @return The current state of a block volume replica.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlockVolumeReplicasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private List<GetBlockVolumeReplicasBlockVolumeReplica> blockVolumeReplicas;
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable List<GetBlockVolumeReplicasFilter> filters;
        private String id;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlockVolumeReplicasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.blockVolumeReplicas = defaults.blockVolumeReplicas;
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder blockVolumeReplicas(List<GetBlockVolumeReplicasBlockVolumeReplica> blockVolumeReplicas) {
            this.blockVolumeReplicas = Objects.requireNonNull(blockVolumeReplicas);
            return this;
        }
        public Builder blockVolumeReplicas(GetBlockVolumeReplicasBlockVolumeReplica... blockVolumeReplicas) {
            return blockVolumeReplicas(List.of(blockVolumeReplicas));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetBlockVolumeReplicasFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetBlockVolumeReplicasFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetBlockVolumeReplicasResult build() {
            return new GetBlockVolumeReplicasResult(availabilityDomain, blockVolumeReplicas, compartmentId, displayName, filters, id, state);
        }
    }
}
