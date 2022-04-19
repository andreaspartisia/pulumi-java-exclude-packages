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
 * Properties related to EventGrid.
 * 
 */
public final class EventGridResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventGridResponse Empty = new EventGridResponse();

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    @Import(name="accessKey1", required=true)
      private final String accessKey1;

    public String accessKey1() {
        return this.accessKey1;
    }

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    @Import(name="accessKey2")
      private final @Nullable String accessKey2;

    public Optional<String> accessKey2() {
        return this.accessKey2 == null ? Optional.empty() : Optional.ofNullable(this.accessKey2);
    }

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> authenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    @Import(name="createdTime", required=true)
      private final String createdTime;

    public String createdTime() {
        return this.createdTime;
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="deadLetterSecret")
      private final @Nullable String deadLetterSecret;

    public Optional<String> deadLetterSecret() {
        return this.deadLetterSecret == null ? Optional.empty() : Optional.ofNullable(this.deadLetterSecret);
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @Import(name="deadLetterUri")
      private final @Nullable String deadLetterUri;

    public Optional<String> deadLetterUri() {
        return this.deadLetterUri == null ? Optional.empty() : Optional.ofNullable(this.deadLetterUri);
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventGrid'.
     * 
     */
    @Import(name="endpointType", required=true)
      private final String endpointType;

    public String endpointType() {
        return this.endpointType;
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

    /**
     * EventGrid Topic Endpoint
     * 
     */
    @Import(name="topicEndpoint", required=true)
      private final String topicEndpoint;

    public String topicEndpoint() {
        return this.topicEndpoint;
    }

    public EventGridResponse(
        String accessKey1,
        @Nullable String accessKey2,
        @Nullable String authenticationType,
        String createdTime,
        @Nullable String deadLetterSecret,
        @Nullable String deadLetterUri,
        String endpointType,
        String provisioningState,
        String topicEndpoint) {
        this.accessKey1 = Objects.requireNonNull(accessKey1, "expected parameter 'accessKey1' to be non-null");
        this.accessKey2 = accessKey2;
        this.authenticationType = authenticationType;
        this.createdTime = Objects.requireNonNull(createdTime, "expected parameter 'createdTime' to be non-null");
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = Codegen.stringProp("endpointType").arg(endpointType).require();
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.topicEndpoint = Objects.requireNonNull(topicEndpoint, "expected parameter 'topicEndpoint' to be non-null");
    }

    private EventGridResponse() {
        this.accessKey1 = null;
        this.accessKey2 = null;
        this.authenticationType = null;
        this.createdTime = null;
        this.deadLetterSecret = null;
        this.deadLetterUri = null;
        this.endpointType = null;
        this.provisioningState = null;
        this.topicEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey1;
        private @Nullable String accessKey2;
        private @Nullable String authenticationType;
        private String createdTime;
        private @Nullable String deadLetterSecret;
        private @Nullable String deadLetterUri;
        private String endpointType;
        private String provisioningState;
        private String topicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey1 = defaults.accessKey1;
    	      this.accessKey2 = defaults.accessKey2;
    	      this.authenticationType = defaults.authenticationType;
    	      this.createdTime = defaults.createdTime;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.topicEndpoint = defaults.topicEndpoint;
        }

        public Builder accessKey1(String accessKey1) {
            this.accessKey1 = Objects.requireNonNull(accessKey1);
            return this;
        }
        public Builder accessKey2(@Nullable String accessKey2) {
            this.accessKey2 = accessKey2;
            return this;
        }
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder deadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }
        public Builder deadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder topicEndpoint(String topicEndpoint) {
            this.topicEndpoint = Objects.requireNonNull(topicEndpoint);
            return this;
        }        public EventGridResponse build() {
            return new EventGridResponse(accessKey1, accessKey2, authenticationType, createdTime, deadLetterSecret, deadLetterUri, endpointType, provisioningState, topicEndpoint);
        }
    }
}
