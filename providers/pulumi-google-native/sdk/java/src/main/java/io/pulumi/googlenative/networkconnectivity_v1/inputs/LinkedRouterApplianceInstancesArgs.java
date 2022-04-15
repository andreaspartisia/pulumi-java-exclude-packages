// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.RouterApplianceInstanceArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of router appliance instances. If you have multiple router appliance instances connected to the same site, they should all be attached to the same spoke.
 * 
 */
public final class LinkedRouterApplianceInstancesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedRouterApplianceInstancesArgs Empty = new LinkedRouterApplianceInstancesArgs();

    /**
     * The list of router appliance instances.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<RouterApplianceInstanceArgs>> instances;

    public Output<List<RouterApplianceInstanceArgs>> instances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    @Import(name="siteToSiteDataTransfer")
      private final @Nullable Output<Boolean> siteToSiteDataTransfer;

    public Output<Boolean> siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer == null ? Codegen.empty() : this.siteToSiteDataTransfer;
    }

    public LinkedRouterApplianceInstancesArgs(
        @Nullable Output<List<RouterApplianceInstanceArgs>> instances,
        @Nullable Output<Boolean> siteToSiteDataTransfer) {
        this.instances = instances;
        this.siteToSiteDataTransfer = siteToSiteDataTransfer;
    }

    private LinkedRouterApplianceInstancesArgs() {
        this.instances = Codegen.empty();
        this.siteToSiteDataTransfer = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedRouterApplianceInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RouterApplianceInstanceArgs>> instances;
        private @Nullable Output<Boolean> siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedRouterApplianceInstancesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder instances(@Nullable Output<List<RouterApplianceInstanceArgs>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<RouterApplianceInstanceArgs> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(RouterApplianceInstanceArgs... instances) {
            return instances(List.of(instances));
        }
        public Builder siteToSiteDataTransfer(@Nullable Output<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = siteToSiteDataTransfer;
            return this;
        }
        public Builder siteToSiteDataTransfer(@Nullable Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Codegen.ofNullable(siteToSiteDataTransfer);
            return this;
        }        public LinkedRouterApplianceInstancesArgs build() {
            return new LinkedRouterApplianceInstancesArgs(instances, siteToSiteDataTransfer);
        }
    }
}
