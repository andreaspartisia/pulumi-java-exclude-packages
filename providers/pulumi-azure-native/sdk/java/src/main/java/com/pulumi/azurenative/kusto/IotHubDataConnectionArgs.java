// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.kusto.enums.IotHubDataFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotHubDataConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubDataConnectionArgs Empty = new IotHubDataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The iot hub consumer group.
     * 
     */
    @Import(name="consumerGroup", required=true)
    private Output<String> consumerGroup;

    public Output<String> consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName")
    private @Nullable Output<String> dataConnectionName;

    public Optional<Output<String>> dataConnectionName() {
        return Optional.ofNullable(this.dataConnectionName);
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Import(name="dataFormat")
    private @Nullable Output<Either<String,IotHubDataFormat>> dataFormat;

    public Optional<Output<Either<String,IotHubDataFormat>>> dataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * System properties of the iot hub
     * 
     */
    @Import(name="eventSystemProperties")
    private @Nullable Output<List<String>> eventSystemProperties;

    public Optional<Output<List<String>>> eventSystemProperties() {
        return Optional.ofNullable(this.eventSystemProperties);
    }

    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    @Import(name="iotHubResourceId", required=true)
    private Output<String> iotHubResourceId;

    public Output<String> iotHubResourceId() {
        return this.iotHubResourceId;
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is &#39;IotHub&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Import(name="mappingRuleName")
    private @Nullable Output<String> mappingRuleName;

    public Optional<Output<String>> mappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share access policy
     * 
     */
    @Import(name="sharedAccessPolicyName", required=true)
    private Output<String> sharedAccessPolicyName;

    public Output<String> sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    private IotHubDataConnectionArgs() {}

    private IotHubDataConnectionArgs(IotHubDataConnectionArgs $) {
        this.clusterName = $.clusterName;
        this.consumerGroup = $.consumerGroup;
        this.dataConnectionName = $.dataConnectionName;
        this.dataFormat = $.dataFormat;
        this.databaseName = $.databaseName;
        this.eventSystemProperties = $.eventSystemProperties;
        this.iotHubResourceId = $.iotHubResourceId;
        this.kind = $.kind;
        this.location = $.location;
        this.mappingRuleName = $.mappingRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubDataConnectionArgs $;

        public Builder() {
            $ = new IotHubDataConnectionArgs();
        }

        public Builder(IotHubDataConnectionArgs defaults) {
            $ = new IotHubDataConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder consumerGroup(Output<String> consumerGroup) {
            $.consumerGroup = consumerGroup;
            return this;
        }

        public Builder consumerGroup(String consumerGroup) {
            return consumerGroup(Output.of(consumerGroup));
        }

        public Builder dataConnectionName(@Nullable Output<String> dataConnectionName) {
            $.dataConnectionName = dataConnectionName;
            return this;
        }

        public Builder dataConnectionName(String dataConnectionName) {
            return dataConnectionName(Output.of(dataConnectionName));
        }

        public Builder dataFormat(@Nullable Output<Either<String,IotHubDataFormat>> dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        public Builder dataFormat(Either<String,IotHubDataFormat> dataFormat) {
            return dataFormat(Output.of(dataFormat));
        }

        public Builder dataFormat(String dataFormat) {
            return dataFormat(Either.ofLeft(dataFormat));
        }

        public Builder dataFormat(IotHubDataFormat dataFormat) {
            return dataFormat(Either.ofRight(dataFormat));
        }

        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder eventSystemProperties(@Nullable Output<List<String>> eventSystemProperties) {
            $.eventSystemProperties = eventSystemProperties;
            return this;
        }

        public Builder eventSystemProperties(List<String> eventSystemProperties) {
            return eventSystemProperties(Output.of(eventSystemProperties));
        }

        public Builder eventSystemProperties(String... eventSystemProperties) {
            return eventSystemProperties(List.of(eventSystemProperties));
        }

        public Builder iotHubResourceId(Output<String> iotHubResourceId) {
            $.iotHubResourceId = iotHubResourceId;
            return this;
        }

        public Builder iotHubResourceId(String iotHubResourceId) {
            return iotHubResourceId(Output.of(iotHubResourceId));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder mappingRuleName(@Nullable Output<String> mappingRuleName) {
            $.mappingRuleName = mappingRuleName;
            return this;
        }

        public Builder mappingRuleName(String mappingRuleName) {
            return mappingRuleName(Output.of(mappingRuleName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sharedAccessPolicyName(Output<String> sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            return sharedAccessPolicyName(Output.of(sharedAccessPolicyName));
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public IotHubDataConnectionArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.consumerGroup = Objects.requireNonNull($.consumerGroup, "expected parameter 'consumerGroup' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.iotHubResourceId = Objects.requireNonNull($.iotHubResourceId, "expected parameter 'iotHubResourceId' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sharedAccessPolicyName = Objects.requireNonNull($.sharedAccessPolicyName, "expected parameter 'sharedAccessPolicyName' to be non-null");
            return $;
        }
    }

}
