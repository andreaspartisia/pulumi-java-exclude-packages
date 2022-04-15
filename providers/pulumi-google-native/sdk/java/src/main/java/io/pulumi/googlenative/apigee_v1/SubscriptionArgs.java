// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * Name of the API product for which the developer is purchasing a subscription.
     * 
     */
    @Import(name="apiproduct")
      private final @Nullable Output<String> apiproduct;

    public Output<String> apiproduct() {
        return this.apiproduct == null ? Codegen.empty() : this.apiproduct;
    }

    @Import(name="developerId", required=true)
      private final Output<String> developerId;

    public Output<String> developerId() {
        return this.developerId;
    }

    /**
     * Time when the API product subscription ends in milliseconds since epoch.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Time when the API product subscription starts in milliseconds since epoch.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public SubscriptionArgs(
        @Nullable Output<String> apiproduct,
        Output<String> developerId,
        @Nullable Output<String> endTime,
        Output<String> organizationId,
        @Nullable Output<String> startTime) {
        this.apiproduct = apiproduct;
        this.developerId = Objects.requireNonNull(developerId, "expected parameter 'developerId' to be non-null");
        this.endTime = endTime;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.startTime = startTime;
    }

    private SubscriptionArgs() {
        this.apiproduct = Codegen.empty();
        this.developerId = Codegen.empty();
        this.endTime = Codegen.empty();
        this.organizationId = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiproduct;
        private Output<String> developerId;
        private @Nullable Output<String> endTime;
        private Output<String> organizationId;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.developerId = defaults.developerId;
    	      this.endTime = defaults.endTime;
    	      this.organizationId = defaults.organizationId;
    	      this.startTime = defaults.startTime;
        }

        public Builder apiproduct(@Nullable Output<String> apiproduct) {
            this.apiproduct = apiproduct;
            return this;
        }
        public Builder apiproduct(@Nullable String apiproduct) {
            this.apiproduct = Codegen.ofNullable(apiproduct);
            return this;
        }
        public Builder developerId(Output<String> developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }
        public Builder developerId(String developerId) {
            this.developerId = Output.of(Objects.requireNonNull(developerId));
            return this;
        }
        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public SubscriptionArgs build() {
            return new SubscriptionArgs(apiproduct, developerId, endTime, organizationId, startTime);
        }
    }
}
