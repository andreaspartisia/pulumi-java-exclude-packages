// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IoTHubNetworkRuleSetIpRule {
    /**
     * @return The desired action for requests captured by this rule. Possible values are `Allow`. Defaults to `Allow`.
     * 
     */
    private final @Nullable String action;
    /**
     * @return The IP address range in CIDR notation for the ip rule.
     * 
     */
    private final String ipMask;
    /**
     * @return The name of the ip rule.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private IoTHubNetworkRuleSetIpRule(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("ipMask") String ipMask,
        @CustomType.Parameter("name") String name) {
        this.action = action;
        this.ipMask = ipMask;
        this.name = name;
    }

    /**
     * @return The desired action for requests captured by this rule. Possible values are `Allow`. Defaults to `Allow`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The IP address range in CIDR notation for the ip rule.
     * 
     */
    public String ipMask() {
        return this.ipMask;
    }
    /**
     * @return The name of the ip rule.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubNetworkRuleSetIpRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String ipMask;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubNetworkRuleSetIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
    	      this.name = defaults.name;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder ipMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public IoTHubNetworkRuleSetIpRule build() {
            return new IoTHubNetworkRuleSetIpRule(action, ipMask, name);
        }
    }
}
