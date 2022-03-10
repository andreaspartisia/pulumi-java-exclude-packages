// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetHealthCheckTcpHealthCheck {
    private final Integer port;
    private final String portName;
    private final String portSpecification;
    private final String proxyHeader;
    private final String request;
    private final String response;

    @OutputCustomType.Constructor
    private GetHealthCheckTcpHealthCheck(
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("portName") String portName,
        @OutputCustomType.Parameter("portSpecification") String portSpecification,
        @OutputCustomType.Parameter("proxyHeader") String proxyHeader,
        @OutputCustomType.Parameter("request") String request,
        @OutputCustomType.Parameter("response") String response) {
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.request = request;
        this.response = response;
    }

    public Integer getPort() {
        return this.port;
    }
    public String getPortName() {
        return this.portName;
    }
    public String getPortSpecification() {
        return this.portSpecification;
    }
    public String getProxyHeader() {
        return this.proxyHeader;
    }
    public String getRequest() {
        return this.request;
    }
    public String getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckTcpHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckTcpHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPortName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }

        public Builder setPortSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }

        public Builder setProxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }

        public Builder setRequest(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setResponse(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }
        public GetHealthCheckTcpHealthCheck build() {
            return new GetHealthCheckTcpHealthCheck(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}
