// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentsDeploymentCollectionSpecificationRouteBackend {
    /**
     * @return The body of the stock response from the mock backend.
     * 
     */
    private final String body;
    /**
     * @return Defines a timeout for establishing a connection with a proxied server.
     * 
     */
    private final Double connectTimeoutInSeconds;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Functions function resource.
     * 
     */
    private final String functionId;
    private final List<GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader> headers;
    /**
     * @return Defines whether or not to uphold SSL verification.
     * 
     */
    private final Boolean isSslVerifyDisabled;
    /**
     * @return Defines a timeout for reading a response from the proxied server.
     * 
     */
    private final Double readTimeoutInSeconds;
    /**
     * @return Defines a timeout for transmitting a request to the proxied server.
     * 
     */
    private final Double sendTimeoutInSeconds;
    /**
     * @return The status code of the stock response from the mock backend.
     * 
     */
    private final Integer status;
    /**
     * @return Type of the Response Cache Store Policy.
     * 
     */
    private final String type;
    private final String url;

    @CustomType.Constructor
    private GetDeploymentsDeploymentCollectionSpecificationRouteBackend(
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("connectTimeoutInSeconds") Double connectTimeoutInSeconds,
        @CustomType.Parameter("functionId") String functionId,
        @CustomType.Parameter("headers") List<GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader> headers,
        @CustomType.Parameter("isSslVerifyDisabled") Boolean isSslVerifyDisabled,
        @CustomType.Parameter("readTimeoutInSeconds") Double readTimeoutInSeconds,
        @CustomType.Parameter("sendTimeoutInSeconds") Double sendTimeoutInSeconds,
        @CustomType.Parameter("status") Integer status,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") String url) {
        this.body = body;
        this.connectTimeoutInSeconds = connectTimeoutInSeconds;
        this.functionId = functionId;
        this.headers = headers;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
        this.readTimeoutInSeconds = readTimeoutInSeconds;
        this.sendTimeoutInSeconds = sendTimeoutInSeconds;
        this.status = status;
        this.type = type;
        this.url = url;
    }

    /**
     * @return The body of the stock response from the mock backend.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return Defines a timeout for establishing a connection with a proxied server.
     * 
     */
    public Double connectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Functions function resource.
     * 
     */
    public String functionId() {
        return this.functionId;
    }
    public List<GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader> headers() {
        return this.headers;
    }
    /**
     * @return Defines whether or not to uphold SSL verification.
     * 
     */
    public Boolean isSslVerifyDisabled() {
        return this.isSslVerifyDisabled;
    }
    /**
     * @return Defines a timeout for reading a response from the proxied server.
     * 
     */
    public Double readTimeoutInSeconds() {
        return this.readTimeoutInSeconds;
    }
    /**
     * @return Defines a timeout for transmitting a request to the proxied server.
     * 
     */
    public Double sendTimeoutInSeconds() {
        return this.sendTimeoutInSeconds;
    }
    /**
     * @return The status code of the stock response from the mock backend.
     * 
     */
    public Integer status() {
        return this.status;
    }
    /**
     * @return Type of the Response Cache Store Policy.
     * 
     */
    public String type() {
        return this.type;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsDeploymentCollectionSpecificationRouteBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private Double connectTimeoutInSeconds;
        private String functionId;
        private List<GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader> headers;
        private Boolean isSslVerifyDisabled;
        private Double readTimeoutInSeconds;
        private Double sendTimeoutInSeconds;
        private Integer status;
        private String type;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentsDeploymentCollectionSpecificationRouteBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.connectTimeoutInSeconds = defaults.connectTimeoutInSeconds;
    	      this.functionId = defaults.functionId;
    	      this.headers = defaults.headers;
    	      this.isSslVerifyDisabled = defaults.isSslVerifyDisabled;
    	      this.readTimeoutInSeconds = defaults.readTimeoutInSeconds;
    	      this.sendTimeoutInSeconds = defaults.sendTimeoutInSeconds;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder connectTimeoutInSeconds(Double connectTimeoutInSeconds) {
            this.connectTimeoutInSeconds = Objects.requireNonNull(connectTimeoutInSeconds);
            return this;
        }
        public Builder functionId(String functionId) {
            this.functionId = Objects.requireNonNull(functionId);
            return this;
        }
        public Builder headers(List<GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(GetDeploymentsDeploymentCollectionSpecificationRouteBackendHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = Objects.requireNonNull(isSslVerifyDisabled);
            return this;
        }
        public Builder readTimeoutInSeconds(Double readTimeoutInSeconds) {
            this.readTimeoutInSeconds = Objects.requireNonNull(readTimeoutInSeconds);
            return this;
        }
        public Builder sendTimeoutInSeconds(Double sendTimeoutInSeconds) {
            this.sendTimeoutInSeconds = Objects.requireNonNull(sendTimeoutInSeconds);
            return this;
        }
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetDeploymentsDeploymentCollectionSpecificationRouteBackend build() {
            return new GetDeploymentsDeploymentCollectionSpecificationRouteBackend(body, connectTimeoutInSeconds, functionId, headers, isSslVerifyDisabled, readTimeoutInSeconds, sendTimeoutInSeconds, status, type, url);
        }
    }
}
