// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleTypeMoneyResponse;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudApigeeV1RateRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1RateRangeResponse Empty = new GoogleCloudApigeeV1RateRangeResponse();

    @InputImport(name="end", required=true)
    private final String end;

    public String getEnd() {
        return this.end;
    }

    @InputImport(name="fee", required=true)
    private final GoogleTypeMoneyResponse fee;

    public GoogleTypeMoneyResponse getFee() {
        return this.fee;
    }

    @InputImport(name="start", required=true)
    private final String start;

    public String getStart() {
        return this.start;
    }

    public GoogleCloudApigeeV1RateRangeResponse(
        String end,
        GoogleTypeMoneyResponse fee,
        String start) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.fee = Objects.requireNonNull(fee, "expected parameter 'fee' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private GoogleCloudApigeeV1RateRangeResponse() {
        this.end = null;
        this.fee = null;
        this.start = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1RateRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String end;
        private GoogleTypeMoneyResponse fee;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1RateRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.fee = defaults.fee;
    	      this.start = defaults.start;
        }

        public Builder setEnd(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder setFee(GoogleTypeMoneyResponse fee) {
            this.fee = Objects.requireNonNull(fee);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public GoogleCloudApigeeV1RateRangeResponse build() {
            return new GoogleCloudApigeeV1RateRangeResponse(end, fee, start);
        }
    }
}