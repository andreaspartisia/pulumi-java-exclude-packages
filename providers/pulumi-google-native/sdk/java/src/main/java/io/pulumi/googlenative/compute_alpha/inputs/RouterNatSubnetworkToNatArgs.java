// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.RouterNatSubnetworkToNatSourceIpRangesToNatItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the IP ranges that want to use NAT for a subnetwork.
 * 
 */
public final class RouterNatSubnetworkToNatArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatSubnetworkToNatArgs Empty = new RouterNatSubnetworkToNatArgs();

    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
     * 
     */
    @Import(name="secondaryIpRangeNames")
      private final @Nullable Output<List<String>> secondaryIpRangeNames;

    public Output<List<String>> secondaryIpRangeNames() {
        return this.secondaryIpRangeNames == null ? Codegen.empty() : this.secondaryIpRangeNames;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     * 
     */
    @Import(name="sourceIpRangesToNat")
      private final @Nullable Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat;

    public Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat() {
        return this.sourceIpRangesToNat == null ? Codegen.empty() : this.sourceIpRangesToNat;
    }

    public RouterNatSubnetworkToNatArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<String>> secondaryIpRangeNames,
        @Nullable Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat) {
        this.name = name;
        this.secondaryIpRangeNames = secondaryIpRangeNames;
        this.sourceIpRangesToNat = sourceIpRangesToNat;
    }

    private RouterNatSubnetworkToNatArgs() {
        this.name = Codegen.empty();
        this.secondaryIpRangeNames = Codegen.empty();
        this.sourceIpRangesToNat = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatSubnetworkToNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> secondaryIpRangeNames;
        private @Nullable Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatSubnetworkToNatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNat = defaults.sourceIpRangesToNat;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder secondaryIpRangeNames(@Nullable Output<List<String>> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }
        public Builder secondaryIpRangeNames(@Nullable List<String> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = Codegen.ofNullable(secondaryIpRangeNames);
            return this;
        }
        public Builder secondaryIpRangeNames(String... secondaryIpRangeNames) {
            return secondaryIpRangeNames(List.of(secondaryIpRangeNames));
        }
        public Builder sourceIpRangesToNat(@Nullable Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat) {
            this.sourceIpRangesToNat = sourceIpRangesToNat;
            return this;
        }
        public Builder sourceIpRangesToNat(@Nullable List<RouterNatSubnetworkToNatSourceIpRangesToNatItem> sourceIpRangesToNat) {
            this.sourceIpRangesToNat = Codegen.ofNullable(sourceIpRangesToNat);
            return this;
        }
        public Builder sourceIpRangesToNat(RouterNatSubnetworkToNatSourceIpRangesToNatItem... sourceIpRangesToNat) {
            return sourceIpRangesToNat(List.of(sourceIpRangesToNat));
        }        public RouterNatSubnetworkToNatArgs build() {
            return new RouterNatSubnetworkToNatArgs(name, secondaryIpRangeNames, sourceIpRangesToNat);
        }
    }
}
