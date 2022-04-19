// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a time series database connection to Azure Data Explorer with data being sent via an EventHub.
 * 
 */
public final class AzureDataExplorerConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDataExplorerConnectionPropertiesResponse Empty = new AzureDataExplorerConnectionPropertiesResponse();

    /**
     * The name of the Azure Data Explorer database.
     * 
     */
    @Import(name="adxDatabaseName", required=true)
      private final String adxDatabaseName;

    public String adxDatabaseName() {
        return this.adxDatabaseName;
    }

    /**
     * The URI of the Azure Data Explorer endpoint.
     * 
     */
    @Import(name="adxEndpointUri", required=true)
      private final String adxEndpointUri;

    public String adxEndpointUri() {
        return this.adxEndpointUri;
    }

    /**
     * The resource ID of the Azure Data Explorer cluster.
     * 
     */
    @Import(name="adxResourceId", required=true)
      private final String adxResourceId;

    public String adxResourceId() {
        return this.adxResourceId;
    }

    /**
     * The name of the Azure Data Explorer table.
     * 
     */
    @Import(name="adxTableName")
      private final @Nullable String adxTableName;

    public Optional<String> adxTableName() {
        return this.adxTableName == null ? Optional.empty() : Optional.ofNullable(this.adxTableName);
    }

    /**
     * The type of time series connection resource.
     * Expected value is 'AzureDataExplorer'.
     * 
     */
    @Import(name="connectionType", required=true)
      private final String connectionType;

    public String connectionType() {
        return this.connectionType;
    }

    /**
     * The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
     * 
     */
    @Import(name="eventHubConsumerGroup")
      private final @Nullable String eventHubConsumerGroup;

    public Optional<String> eventHubConsumerGroup() {
        return this.eventHubConsumerGroup == null ? Optional.empty() : Optional.ofNullable(this.eventHubConsumerGroup);
    }

    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @Import(name="eventHubEndpointUri", required=true)
      private final String eventHubEndpointUri;

    public String eventHubEndpointUri() {
        return this.eventHubEndpointUri;
    }

    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    @Import(name="eventHubEntityPath", required=true)
      private final String eventHubEntityPath;

    public String eventHubEntityPath() {
        return this.eventHubEntityPath;
    }

    /**
     * The resource ID of the EventHub namespace.
     * 
     */
    @Import(name="eventHubNamespaceResourceId", required=true)
      private final String eventHubNamespaceResourceId;

    public String eventHubNamespaceResourceId() {
        return this.eventHubNamespaceResourceId;
    }

    /**
     * The provisioning state.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public AzureDataExplorerConnectionPropertiesResponse(
        String adxDatabaseName,
        String adxEndpointUri,
        String adxResourceId,
        @Nullable String adxTableName,
        String connectionType,
        @Nullable String eventHubConsumerGroup,
        String eventHubEndpointUri,
        String eventHubEntityPath,
        String eventHubNamespaceResourceId,
        String provisioningState) {
        this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName, "expected parameter 'adxDatabaseName' to be non-null");
        this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri, "expected parameter 'adxEndpointUri' to be non-null");
        this.adxResourceId = Objects.requireNonNull(adxResourceId, "expected parameter 'adxResourceId' to be non-null");
        this.adxTableName = adxTableName;
        this.connectionType = Codegen.stringProp("connectionType").arg(connectionType).require();
        this.eventHubConsumerGroup = eventHubConsumerGroup;
        this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri, "expected parameter 'eventHubEndpointUri' to be non-null");
        this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath, "expected parameter 'eventHubEntityPath' to be non-null");
        this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId, "expected parameter 'eventHubNamespaceResourceId' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private AzureDataExplorerConnectionPropertiesResponse() {
        this.adxDatabaseName = null;
        this.adxEndpointUri = null;
        this.adxResourceId = null;
        this.adxTableName = null;
        this.connectionType = null;
        this.eventHubConsumerGroup = null;
        this.eventHubEndpointUri = null;
        this.eventHubEntityPath = null;
        this.eventHubNamespaceResourceId = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adxDatabaseName;
        private String adxEndpointUri;
        private String adxResourceId;
        private @Nullable String adxTableName;
        private String connectionType;
        private @Nullable String eventHubConsumerGroup;
        private String eventHubEndpointUri;
        private String eventHubEntityPath;
        private String eventHubNamespaceResourceId;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adxDatabaseName = defaults.adxDatabaseName;
    	      this.adxEndpointUri = defaults.adxEndpointUri;
    	      this.adxResourceId = defaults.adxResourceId;
    	      this.adxTableName = defaults.adxTableName;
    	      this.connectionType = defaults.connectionType;
    	      this.eventHubConsumerGroup = defaults.eventHubConsumerGroup;
    	      this.eventHubEndpointUri = defaults.eventHubEndpointUri;
    	      this.eventHubEntityPath = defaults.eventHubEntityPath;
    	      this.eventHubNamespaceResourceId = defaults.eventHubNamespaceResourceId;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder adxDatabaseName(String adxDatabaseName) {
            this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName);
            return this;
        }
        public Builder adxEndpointUri(String adxEndpointUri) {
            this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri);
            return this;
        }
        public Builder adxResourceId(String adxResourceId) {
            this.adxResourceId = Objects.requireNonNull(adxResourceId);
            return this;
        }
        public Builder adxTableName(@Nullable String adxTableName) {
            this.adxTableName = adxTableName;
            return this;
        }
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        public Builder eventHubConsumerGroup(@Nullable String eventHubConsumerGroup) {
            this.eventHubConsumerGroup = eventHubConsumerGroup;
            return this;
        }
        public Builder eventHubEndpointUri(String eventHubEndpointUri) {
            this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri);
            return this;
        }
        public Builder eventHubEntityPath(String eventHubEntityPath) {
            this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath);
            return this;
        }
        public Builder eventHubNamespaceResourceId(String eventHubNamespaceResourceId) {
            this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public AzureDataExplorerConnectionPropertiesResponse build() {
            return new AzureDataExplorerConnectionPropertiesResponse(adxDatabaseName, adxEndpointUri, adxResourceId, adxTableName, connectionType, eventHubConsumerGroup, eventHubEndpointUri, eventHubEntityPath, eventHubNamespaceResourceId, provisioningState);
        }
    }
}
