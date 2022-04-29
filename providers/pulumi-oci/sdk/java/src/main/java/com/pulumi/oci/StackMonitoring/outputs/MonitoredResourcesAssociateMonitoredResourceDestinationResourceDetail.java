// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.StackMonitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoredResourcesAssociateMonitoredResourceDestinationResourceDetail {
    /**
     * @return Monitored Resource Name
     * 
     */
    private final @Nullable String name;
    /**
     * @return Monitored Resource Type
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private MonitoredResourcesAssociateMonitoredResourceDestinationResourceDetail(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return Monitored Resource Name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Monitored Resource Type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourcesAssociateMonitoredResourceDestinationResourceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourcesAssociateMonitoredResourceDestinationResourceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public MonitoredResourcesAssociateMonitoredResourceDestinationResourceDetail build() {
            return new MonitoredResourcesAssociateMonitoredResourceDestinationResourceDetail(name, type);
        }
    }
}
