// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details of the VPC where the source database is located in Google Cloud. We will use this information to set up the VPC peering connection between Cloud SQL and this VPC.
 * 
 */
public final class VpcPeeringConnectivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConnectivityArgs Empty = new VpcPeeringConnectivityArgs();

    /**
     * The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    @Import(name="vpc")
      private final @Nullable Output<String> vpc;

    public Output<String> vpc() {
        return this.vpc == null ? Codegen.empty() : this.vpc;
    }

    public VpcPeeringConnectivityArgs(@Nullable Output<String> vpc) {
        this.vpc = vpc;
    }

    private VpcPeeringConnectivityArgs() {
        this.vpc = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpc = defaults.vpc;
        }

        public Builder vpc(@Nullable Output<String> vpc) {
            this.vpc = vpc;
            return this;
        }
        public Builder vpc(@Nullable String vpc) {
            this.vpc = Codegen.ofNullable(vpc);
            return this;
        }        public VpcPeeringConnectivityArgs build() {
            return new VpcPeeringConnectivityArgs(vpc);
        }
    }
}
