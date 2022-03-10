// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetCoipPoolFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCoipPoolResult {
    /**
     * ARN of the COIP pool
     * 
     */
    private final String arn;
    private final @Nullable List<GetCoipPoolFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String localGatewayRouteTableId;
    /**
     * Set of CIDR blocks in pool
     * 
     */
    private final List<String> poolCidrs;
    private final String poolId;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetCoipPoolResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("filters") @Nullable List<GetCoipPoolFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("localGatewayRouteTableId") String localGatewayRouteTableId,
        @OutputCustomType.Parameter("poolCidrs") List<String> poolCidrs,
        @OutputCustomType.Parameter("poolId") String poolId,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.filters = filters;
        this.id = id;
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        this.poolCidrs = poolCidrs;
        this.poolId = poolId;
        this.tags = tags;
    }

    /**
     * ARN of the COIP pool
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public List<GetCoipPoolFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }
    /**
     * Set of CIDR blocks in pool
     * 
    */
    public List<String> getPoolCidrs() {
        return this.poolCidrs;
    }
    public String getPoolId() {
        return this.poolId;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoipPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable List<GetCoipPoolFilter> filters;
        private String id;
        private String localGatewayRouteTableId;
        private List<String> poolCidrs;
        private String poolId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoipPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.poolCidrs = defaults.poolCidrs;
    	      this.poolId = defaults.poolId;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFilters(@Nullable List<GetCoipPoolFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId);
            return this;
        }

        public Builder setPoolCidrs(List<String> poolCidrs) {
            this.poolCidrs = Objects.requireNonNull(poolCidrs);
            return this;
        }

        public Builder setPoolId(String poolId) {
            this.poolId = Objects.requireNonNull(poolId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetCoipPoolResult build() {
            return new GetCoipPoolResult(arn, filters, id, localGatewayRouteTableId, poolCidrs, poolId, tags);
        }
    }
}