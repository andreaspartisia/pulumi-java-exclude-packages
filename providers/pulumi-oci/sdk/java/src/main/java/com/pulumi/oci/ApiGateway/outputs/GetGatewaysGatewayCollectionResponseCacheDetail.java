// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetGatewaysGatewayCollectionResponseCacheDetailServer;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewaysGatewayCollectionResponseCacheDetail {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
     * 
     */
    private final String authenticationSecretId;
    /**
     * @return The version number of the authentication secret to use.
     * 
     */
    private final String authenticationSecretVersionNumber;
    /**
     * @return Defines the timeout for establishing a connection with the Response Cache.
     * 
     */
    private final Integer connectTimeoutInMs;
    /**
     * @return Defines if the connection should be over SSL.
     * 
     */
    private final Boolean isSslEnabled;
    /**
     * @return Defines whether or not to uphold SSL verification.
     * 
     */
    private final Boolean isSslVerifyDisabled;
    /**
     * @return Defines the timeout for reading data from the Response Cache.
     * 
     */
    private final Integer readTimeoutInMs;
    /**
     * @return Defines the timeout for transmitting data to the Response Cache.
     * 
     */
    private final Integer sendTimeoutInMs;
    /**
     * @return The set of cache store members to connect to. At present only a single server is supported.
     * 
     */
    private final List<GetGatewaysGatewayCollectionResponseCacheDetailServer> servers;
    /**
     * @return Type of the Response Cache.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGatewaysGatewayCollectionResponseCacheDetail(
        @CustomType.Parameter("authenticationSecretId") String authenticationSecretId,
        @CustomType.Parameter("authenticationSecretVersionNumber") String authenticationSecretVersionNumber,
        @CustomType.Parameter("connectTimeoutInMs") Integer connectTimeoutInMs,
        @CustomType.Parameter("isSslEnabled") Boolean isSslEnabled,
        @CustomType.Parameter("isSslVerifyDisabled") Boolean isSslVerifyDisabled,
        @CustomType.Parameter("readTimeoutInMs") Integer readTimeoutInMs,
        @CustomType.Parameter("sendTimeoutInMs") Integer sendTimeoutInMs,
        @CustomType.Parameter("servers") List<GetGatewaysGatewayCollectionResponseCacheDetailServer> servers,
        @CustomType.Parameter("type") String type) {
        this.authenticationSecretId = authenticationSecretId;
        this.authenticationSecretVersionNumber = authenticationSecretVersionNumber;
        this.connectTimeoutInMs = connectTimeoutInMs;
        this.isSslEnabled = isSslEnabled;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
        this.readTimeoutInMs = readTimeoutInMs;
        this.sendTimeoutInMs = sendTimeoutInMs;
        this.servers = servers;
        this.type = type;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
     * 
     */
    public String authenticationSecretId() {
        return this.authenticationSecretId;
    }
    /**
     * @return The version number of the authentication secret to use.
     * 
     */
    public String authenticationSecretVersionNumber() {
        return this.authenticationSecretVersionNumber;
    }
    /**
     * @return Defines the timeout for establishing a connection with the Response Cache.
     * 
     */
    public Integer connectTimeoutInMs() {
        return this.connectTimeoutInMs;
    }
    /**
     * @return Defines if the connection should be over SSL.
     * 
     */
    public Boolean isSslEnabled() {
        return this.isSslEnabled;
    }
    /**
     * @return Defines whether or not to uphold SSL verification.
     * 
     */
    public Boolean isSslVerifyDisabled() {
        return this.isSslVerifyDisabled;
    }
    /**
     * @return Defines the timeout for reading data from the Response Cache.
     * 
     */
    public Integer readTimeoutInMs() {
        return this.readTimeoutInMs;
    }
    /**
     * @return Defines the timeout for transmitting data to the Response Cache.
     * 
     */
    public Integer sendTimeoutInMs() {
        return this.sendTimeoutInMs;
    }
    /**
     * @return The set of cache store members to connect to. At present only a single server is supported.
     * 
     */
    public List<GetGatewaysGatewayCollectionResponseCacheDetailServer> servers() {
        return this.servers;
    }
    /**
     * @return Type of the Response Cache.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewaysGatewayCollectionResponseCacheDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authenticationSecretId;
        private String authenticationSecretVersionNumber;
        private Integer connectTimeoutInMs;
        private Boolean isSslEnabled;
        private Boolean isSslVerifyDisabled;
        private Integer readTimeoutInMs;
        private Integer sendTimeoutInMs;
        private List<GetGatewaysGatewayCollectionResponseCacheDetailServer> servers;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewaysGatewayCollectionResponseCacheDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationSecretId = defaults.authenticationSecretId;
    	      this.authenticationSecretVersionNumber = defaults.authenticationSecretVersionNumber;
    	      this.connectTimeoutInMs = defaults.connectTimeoutInMs;
    	      this.isSslEnabled = defaults.isSslEnabled;
    	      this.isSslVerifyDisabled = defaults.isSslVerifyDisabled;
    	      this.readTimeoutInMs = defaults.readTimeoutInMs;
    	      this.sendTimeoutInMs = defaults.sendTimeoutInMs;
    	      this.servers = defaults.servers;
    	      this.type = defaults.type;
        }

        public Builder authenticationSecretId(String authenticationSecretId) {
            this.authenticationSecretId = Objects.requireNonNull(authenticationSecretId);
            return this;
        }
        public Builder authenticationSecretVersionNumber(String authenticationSecretVersionNumber) {
            this.authenticationSecretVersionNumber = Objects.requireNonNull(authenticationSecretVersionNumber);
            return this;
        }
        public Builder connectTimeoutInMs(Integer connectTimeoutInMs) {
            this.connectTimeoutInMs = Objects.requireNonNull(connectTimeoutInMs);
            return this;
        }
        public Builder isSslEnabled(Boolean isSslEnabled) {
            this.isSslEnabled = Objects.requireNonNull(isSslEnabled);
            return this;
        }
        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = Objects.requireNonNull(isSslVerifyDisabled);
            return this;
        }
        public Builder readTimeoutInMs(Integer readTimeoutInMs) {
            this.readTimeoutInMs = Objects.requireNonNull(readTimeoutInMs);
            return this;
        }
        public Builder sendTimeoutInMs(Integer sendTimeoutInMs) {
            this.sendTimeoutInMs = Objects.requireNonNull(sendTimeoutInMs);
            return this;
        }
        public Builder servers(List<GetGatewaysGatewayCollectionResponseCacheDetailServer> servers) {
            this.servers = Objects.requireNonNull(servers);
            return this;
        }
        public Builder servers(GetGatewaysGatewayCollectionResponseCacheDetailServer... servers) {
            return servers(List.of(servers));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGatewaysGatewayCollectionResponseCacheDetail build() {
            return new GetGatewaysGatewayCollectionResponseCacheDetail(authenticationSecretId, authenticationSecretVersionNumber, connectTimeoutInMs, isSslEnabled, isSslVerifyDisabled, readTimeoutInMs, sendTimeoutInMs, servers, type);
        }
    }
}
