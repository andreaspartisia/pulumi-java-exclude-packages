// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NetworkConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkConfigResponse Empty = new NetworkConfigResponse();

    @InputImport(name="egressOption", required=true)
    private final String egressOption;

    public String getEgressOption() {
        return this.egressOption;
    }

    @InputImport(name="peeredNetwork", required=true)
    private final String peeredNetwork;

    public String getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public NetworkConfigResponse(
        String egressOption,
        String peeredNetwork) {
        this.egressOption = Objects.requireNonNull(egressOption, "expected parameter 'egressOption' to be non-null");
        this.peeredNetwork = Objects.requireNonNull(peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
    }

    private NetworkConfigResponse() {
        this.egressOption = null;
        this.peeredNetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String egressOption;
        private String peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressOption = defaults.egressOption;
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder setEgressOption(String egressOption) {
            this.egressOption = Objects.requireNonNull(egressOption);
            return this;
        }

        public Builder setPeeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }

        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(egressOption, peeredNetwork);
        }
    }
}