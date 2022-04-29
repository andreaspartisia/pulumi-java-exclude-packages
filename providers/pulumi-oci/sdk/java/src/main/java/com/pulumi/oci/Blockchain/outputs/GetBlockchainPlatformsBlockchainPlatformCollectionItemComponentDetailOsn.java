// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Blockchain.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Blockchain.outputs.GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsn {
    /**
     * @return Availability Domain of peer
     * 
     */
    private final String ad;
    /**
     * @return OCPU allocation parameter
     * 
     */
    private final List<GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam> ocpuAllocationParams;
    /**
     * @return OSN identifier
     * 
     */
    private final String osnKey;
    /**
     * @return A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsn(
        @CustomType.Parameter("ad") String ad,
        @CustomType.Parameter("ocpuAllocationParams") List<GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam> ocpuAllocationParams,
        @CustomType.Parameter("osnKey") String osnKey,
        @CustomType.Parameter("state") String state) {
        this.ad = ad;
        this.ocpuAllocationParams = ocpuAllocationParams;
        this.osnKey = osnKey;
        this.state = state;
    }

    /**
     * @return Availability Domain of peer
     * 
     */
    public String ad() {
        return this.ad;
    }
    /**
     * @return OCPU allocation parameter
     * 
     */
    public List<GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam> ocpuAllocationParams() {
        return this.ocpuAllocationParams;
    }
    /**
     * @return OSN identifier
     * 
     */
    public String osnKey() {
        return this.osnKey;
    }
    /**
     * @return A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ad;
        private List<GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam> ocpuAllocationParams;
        private String osnKey;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ad = defaults.ad;
    	      this.ocpuAllocationParams = defaults.ocpuAllocationParams;
    	      this.osnKey = defaults.osnKey;
    	      this.state = defaults.state;
        }

        public Builder ad(String ad) {
            this.ad = Objects.requireNonNull(ad);
            return this;
        }
        public Builder ocpuAllocationParams(List<GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam> ocpuAllocationParams) {
            this.ocpuAllocationParams = Objects.requireNonNull(ocpuAllocationParams);
            return this;
        }
        public Builder ocpuAllocationParams(GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsnOcpuAllocationParam... ocpuAllocationParams) {
            return ocpuAllocationParams(List.of(ocpuAllocationParams));
        }
        public Builder osnKey(String osnKey) {
            this.osnKey = Objects.requireNonNull(osnKey);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsn build() {
            return new GetBlockchainPlatformsBlockchainPlatformCollectionItemComponentDetailOsn(ad, ocpuAllocationParams, osnKey, state);
        }
    }
}
