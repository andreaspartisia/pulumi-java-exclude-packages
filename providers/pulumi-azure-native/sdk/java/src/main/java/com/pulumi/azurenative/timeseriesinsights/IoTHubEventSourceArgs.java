// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.timeseriesinsights.enums.IngressStartAtType;
import com.pulumi.azurenative.timeseriesinsights.inputs.LocalTimestampArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IoTHubEventSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IoTHubEventSourceArgs Empty = new IoTHubEventSourceArgs();

    /**
     * The name of the iot hub's consumer group that holds the partitions from which events will be read.
     * 
     */
    @Import(name="consumerGroupName", required=true)
      private final Output<String> consumerGroupName;

    public Output<String> consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
      private final Output<String> environmentName;

    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * Name of the event source.
     * 
     */
    @Import(name="eventSourceName")
      private final @Nullable Output<String> eventSourceName;

    public Output<String> eventSourceName() {
        return this.eventSourceName == null ? Codegen.empty() : this.eventSourceName;
    }

    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
     */
    @Import(name="eventSourceResourceId", required=true)
      private final Output<String> eventSourceResourceId;

    public Output<String> eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * The name of the iot hub.
     * 
     */
    @Import(name="iotHubName", required=true)
      private final Output<String> iotHubName;

    public Output<String> iotHubName() {
        return this.iotHubName;
    }

    /**
     * The name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant 'service connect' permissions to the iot hub.
     * 
     */
    @Import(name="keyName", required=true)
      private final Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * The kind of the event source.
     * Expected value is 'Microsoft.IoTHub'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    @Import(name="localTimestamp")
      private final @Nullable Output<LocalTimestampArgs> localTimestamp;

    public Output<LocalTimestampArgs> localTimestamp() {
        return this.localTimestamp == null ? Codegen.empty() : this.localTimestamp;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The value of the Shared Access Policy key that grants the Time Series Insights service read access to the iot hub. This property is not shown in event source responses.
     * 
     */
    @Import(name="sharedAccessKey", required=true)
      private final Output<String> sharedAccessKey;

    public Output<String> sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    @Import(name="time")
      private final @Nullable Output<String> time;

    public Output<String> time() {
        return this.time == null ? Codegen.empty() : this.time;
    }

    /**
     * The event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    @Import(name="timestampPropertyName")
      private final @Nullable Output<String> timestampPropertyName;

    public Output<String> timestampPropertyName() {
        return this.timestampPropertyName == null ? Codegen.empty() : this.timestampPropertyName;
    }

    /**
     * The type of the ingressStartAt, It can be "EarliestAvailable", "EventSourceCreationTime", "CustomEnqueuedTime".
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,IngressStartAtType>> type;

    public Output<Either<String,IngressStartAtType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public IoTHubEventSourceArgs(
        Output<String> consumerGroupName,
        Output<String> environmentName,
        @Nullable Output<String> eventSourceName,
        Output<String> eventSourceResourceId,
        Output<String> iotHubName,
        Output<String> keyName,
        Output<String> kind,
        @Nullable Output<LocalTimestampArgs> localTimestamp,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<String> sharedAccessKey,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> time,
        @Nullable Output<String> timestampPropertyName,
        @Nullable Output<Either<String,IngressStartAtType>> type) {
        this.consumerGroupName = Objects.requireNonNull(consumerGroupName, "expected parameter 'consumerGroupName' to be non-null");
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.eventSourceName = eventSourceName;
        this.eventSourceResourceId = Objects.requireNonNull(eventSourceResourceId, "expected parameter 'eventSourceResourceId' to be non-null");
        this.iotHubName = Objects.requireNonNull(iotHubName, "expected parameter 'iotHubName' to be non-null");
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.localTimestamp = localTimestamp;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedAccessKey = Objects.requireNonNull(sharedAccessKey, "expected parameter 'sharedAccessKey' to be non-null");
        this.tags = tags;
        this.time = time;
        this.timestampPropertyName = timestampPropertyName;
        this.type = type;
    }

    private IoTHubEventSourceArgs() {
        this.consumerGroupName = Codegen.empty();
        this.environmentName = Codegen.empty();
        this.eventSourceName = Codegen.empty();
        this.eventSourceResourceId = Codegen.empty();
        this.iotHubName = Codegen.empty();
        this.keyName = Codegen.empty();
        this.kind = Codegen.empty();
        this.localTimestamp = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sharedAccessKey = Codegen.empty();
        this.tags = Codegen.empty();
        this.time = Codegen.empty();
        this.timestampPropertyName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> consumerGroupName;
        private Output<String> environmentName;
        private @Nullable Output<String> eventSourceName;
        private Output<String> eventSourceResourceId;
        private Output<String> iotHubName;
        private Output<String> keyName;
        private Output<String> kind;
        private @Nullable Output<LocalTimestampArgs> localTimestamp;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<String> sharedAccessKey;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> time;
        private @Nullable Output<String> timestampPropertyName;
        private @Nullable Output<Either<String,IngressStartAtType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubEventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.environmentName = defaults.environmentName;
    	      this.eventSourceName = defaults.eventSourceName;
    	      this.eventSourceResourceId = defaults.eventSourceResourceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.keyName = defaults.keyName;
    	      this.kind = defaults.kind;
    	      this.localTimestamp = defaults.localTimestamp;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedAccessKey = defaults.sharedAccessKey;
    	      this.tags = defaults.tags;
    	      this.time = defaults.time;
    	      this.timestampPropertyName = defaults.timestampPropertyName;
    	      this.type = defaults.type;
        }

        public Builder consumerGroupName(Output<String> consumerGroupName) {
            this.consumerGroupName = Objects.requireNonNull(consumerGroupName);
            return this;
        }
        public Builder consumerGroupName(String consumerGroupName) {
            this.consumerGroupName = Output.of(Objects.requireNonNull(consumerGroupName));
            return this;
        }
        public Builder environmentName(Output<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }
        public Builder environmentName(String environmentName) {
            this.environmentName = Output.of(Objects.requireNonNull(environmentName));
            return this;
        }
        public Builder eventSourceName(@Nullable Output<String> eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }
        public Builder eventSourceName(@Nullable String eventSourceName) {
            this.eventSourceName = Codegen.ofNullable(eventSourceName);
            return this;
        }
        public Builder eventSourceResourceId(Output<String> eventSourceResourceId) {
            this.eventSourceResourceId = Objects.requireNonNull(eventSourceResourceId);
            return this;
        }
        public Builder eventSourceResourceId(String eventSourceResourceId) {
            this.eventSourceResourceId = Output.of(Objects.requireNonNull(eventSourceResourceId));
            return this;
        }
        public Builder iotHubName(Output<String> iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }
        public Builder iotHubName(String iotHubName) {
            this.iotHubName = Output.of(Objects.requireNonNull(iotHubName));
            return this;
        }
        public Builder keyName(Output<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Output.of(Objects.requireNonNull(keyName));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder localTimestamp(@Nullable Output<LocalTimestampArgs> localTimestamp) {
            this.localTimestamp = localTimestamp;
            return this;
        }
        public Builder localTimestamp(@Nullable LocalTimestampArgs localTimestamp) {
            this.localTimestamp = Codegen.ofNullable(localTimestamp);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sharedAccessKey(Output<String> sharedAccessKey) {
            this.sharedAccessKey = Objects.requireNonNull(sharedAccessKey);
            return this;
        }
        public Builder sharedAccessKey(String sharedAccessKey) {
            this.sharedAccessKey = Output.of(Objects.requireNonNull(sharedAccessKey));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder time(@Nullable Output<String> time) {
            this.time = time;
            return this;
        }
        public Builder time(@Nullable String time) {
            this.time = Codegen.ofNullable(time);
            return this;
        }
        public Builder timestampPropertyName(@Nullable Output<String> timestampPropertyName) {
            this.timestampPropertyName = timestampPropertyName;
            return this;
        }
        public Builder timestampPropertyName(@Nullable String timestampPropertyName) {
            this.timestampPropertyName = Codegen.ofNullable(timestampPropertyName);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,IngressStartAtType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,IngressStartAtType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public IoTHubEventSourceArgs build() {
            return new IoTHubEventSourceArgs(consumerGroupName, environmentName, eventSourceName, eventSourceResourceId, iotHubName, keyName, kind, localTimestamp, location, resourceGroupName, sharedAccessKey, tags, time, timestampPropertyName, type);
        }
    }
}
