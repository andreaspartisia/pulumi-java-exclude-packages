// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Quota contains the essential parameters needed that can be applied on the resources, methods, API source combination associated with this API product. While Quota is optional, setting it prevents requests from exceeding the provisioned parameters.
 * 
 */
public final class GoogleCloudApigeeV1QuotaArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1QuotaArgs Empty = new GoogleCloudApigeeV1QuotaArgs();

    /**
     * Time interval over which the number of request messages is calculated.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<String> interval;

    public Output<String> interval() {
        return this.interval;
    }

    /**
     * Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
     * 
     */
    @Import(name="limit", required=true)
      private final Output<String> limit;

    public Output<String> limit() {
        return this.limit;
    }

    /**
     * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
     * 
     */
    @Import(name="timeUnit")
      private final @Nullable Output<String> timeUnit;

    public Output<String> timeUnit() {
        return this.timeUnit == null ? Codegen.empty() : this.timeUnit;
    }

    public GoogleCloudApigeeV1QuotaArgs(
        Output<String> interval,
        Output<String> limit,
        @Nullable Output<String> timeUnit) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.timeUnit = timeUnit;
    }

    private GoogleCloudApigeeV1QuotaArgs() {
        this.interval = Codegen.empty();
        this.limit = Codegen.empty();
        this.timeUnit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> interval;
        private Output<String> limit;
        private @Nullable Output<String> timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QuotaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.limit = defaults.limit;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder interval(Output<String> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Output.of(Objects.requireNonNull(interval));
            return this;
        }
        public Builder limit(Output<String> limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public Builder limit(String limit) {
            this.limit = Output.of(Objects.requireNonNull(limit));
            return this;
        }
        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Builder timeUnit(@Nullable String timeUnit) {
            this.timeUnit = Codegen.ofNullable(timeUnit);
            return this;
        }        public GoogleCloudApigeeV1QuotaArgs build() {
            return new GoogleCloudApigeeV1QuotaArgs(interval, limit, timeUnit);
        }
    }
}
