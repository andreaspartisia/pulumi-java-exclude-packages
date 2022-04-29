// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceManagerProxy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceEnvironmentsServiceEnvironmentCollectionItemServiceDefinition {
    /**
     * @return The display name of the resource.
     * 
     */
    private final String displayName;
    /**
     * @return Short display name of the service. For example, &#34;Retail Order Management&#34;.
     * 
     */
    private final String shortDisplayName;
    /**
     * @return The service definition type. For example, a service definition type &#34;RGBUOROMS&#34;  would be for the service &#34;Oracle Retail Order Management Cloud Service&#34;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServiceEnvironmentsServiceEnvironmentCollectionItemServiceDefinition(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("shortDisplayName") String shortDisplayName,
        @CustomType.Parameter("type") String type) {
        this.displayName = displayName;
        this.shortDisplayName = shortDisplayName;
        this.type = type;
    }

    /**
     * @return The display name of the resource.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Short display name of the service. For example, &#34;Retail Order Management&#34;.
     * 
     */
    public String shortDisplayName() {
        return this.shortDisplayName;
    }
    /**
     * @return The service definition type. For example, a service definition type &#34;RGBUOROMS&#34;  would be for the service &#34;Oracle Retail Order Management Cloud Service&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceEnvironmentsServiceEnvironmentCollectionItemServiceDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String shortDisplayName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceEnvironmentsServiceEnvironmentCollectionItemServiceDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.shortDisplayName = defaults.shortDisplayName;
    	      this.type = defaults.type;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder shortDisplayName(String shortDisplayName) {
            this.shortDisplayName = Objects.requireNonNull(shortDisplayName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServiceEnvironmentsServiceEnvironmentCollectionItemServiceDefinition build() {
            return new GetServiceEnvironmentsServiceEnvironmentCollectionItemServiceDefinition(displayName, shortDisplayName, type);
        }
    }
}
