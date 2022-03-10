// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetLBIPRangesResult {
    /**
     * The IP ranges used for health checks when **HTTP(S), SSL proxy, TCP proxy, and Internal load balancing** is used
     * 
     */
    private final List<String> httpSslTcpInternals;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The IP ranges used for health checks when **Network load balancing** is used
     * 
     */
    private final List<String> networks;

    @OutputCustomType.Constructor
    private GetLBIPRangesResult(
        @OutputCustomType.Parameter("httpSslTcpInternals") List<String> httpSslTcpInternals,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("networks") List<String> networks) {
        this.httpSslTcpInternals = httpSslTcpInternals;
        this.id = id;
        this.networks = networks;
    }

    /**
     * The IP ranges used for health checks when **HTTP(S), SSL proxy, TCP proxy, and Internal load balancing** is used
     * 
    */
    public List<String> getHttpSslTcpInternals() {
        return this.httpSslTcpInternals;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The IP ranges used for health checks when **Network load balancing** is used
     * 
    */
    public List<String> getNetworks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLBIPRangesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> httpSslTcpInternals;
        private String id;
        private List<String> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLBIPRangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpSslTcpInternals = defaults.httpSslTcpInternals;
    	      this.id = defaults.id;
    	      this.networks = defaults.networks;
        }

        public Builder setHttpSslTcpInternals(List<String> httpSslTcpInternals) {
            this.httpSslTcpInternals = Objects.requireNonNull(httpSslTcpInternals);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNetworks(List<String> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public GetLBIPRangesResult build() {
            return new GetLBIPRangesResult(httpSslTcpInternals, id, networks);
        }
    }
}
