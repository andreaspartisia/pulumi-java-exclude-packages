// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AmlComputeNodeInformationResponse {
    private final String nodeId;
    private final String nodeState;
    private final Double port;
    private final String privateIpAddress;
    private final String publicIpAddress;
    private final String runId;

    @OutputCustomType.Constructor({"nodeId","nodeState","port","privateIpAddress","publicIpAddress","runId"})
    private AmlComputeNodeInformationResponse(
        String nodeId,
        String nodeState,
        Double port,
        String privateIpAddress,
        String publicIpAddress,
        String runId) {
        this.nodeId = Objects.requireNonNull(nodeId);
        this.nodeState = Objects.requireNonNull(nodeState);
        this.port = Objects.requireNonNull(port);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
        this.runId = Objects.requireNonNull(runId);
    }

    public String getNodeId() {
        return this.nodeId;
    }
    public String getNodeState() {
        return this.nodeState;
    }
    public Double getPort() {
        return this.port;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }
    public String getRunId() {
        return this.runId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmlComputeNodeInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeId;
        private String nodeState;
        private Double port;
        private String privateIpAddress;
        private String publicIpAddress;
        private String runId;

        public Builder() {
    	      // Empty
        }

        public Builder(AmlComputeNodeInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeId = defaults.nodeId;
    	      this.nodeState = defaults.nodeState;
    	      this.port = defaults.port;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.runId = defaults.runId;
        }

        public Builder setNodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder setNodeState(String nodeState) {
            this.nodeState = Objects.requireNonNull(nodeState);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }

        public Builder setRunId(String runId) {
            this.runId = Objects.requireNonNull(runId);
            return this;
        }

        public AmlComputeNodeInformationResponse build() {
            return new AmlComputeNodeInformationResponse(nodeId, nodeState, port, privateIpAddress, publicIpAddress, runId);
        }
    }
}