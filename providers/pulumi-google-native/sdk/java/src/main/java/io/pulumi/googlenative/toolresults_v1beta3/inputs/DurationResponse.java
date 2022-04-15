// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 *  A Duration represents a signed, fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like "day" or "month". It is related to Timestamp in that the difference between two Timestamp values is a Duration and it can be added or subtracted from a Timestamp. Range is approximately +-10,000 years.
 * 
 */
public final class DurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DurationResponse Empty = new DurationResponse();

    /**
     * Signed fractions of a second at nanosecond resolution of the span of time. Durations less than one second are represented with a 0 `seconds` field and a positive or negative `nanos` field. For durations of one second or more, a non-zero value for the `nanos` field must be of the same sign as the `seconds` field. Must be from -999,999,999 to +999,999,999 inclusive.
     * 
     */
    @Import(name="nanos", required=true)
      private final Integer nanos;

    public Integer nanos() {
        return this.nanos;
    }

    /**
     * Signed seconds of the span of time. Must be from -315,576,000,000 to +315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    @Import(name="seconds", required=true)
      private final String seconds;

    public String seconds() {
        return this.seconds;
    }

    public DurationResponse(
        Integer nanos,
        String seconds) {
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private DurationResponse() {
        this.nanos = null;
        this.seconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nanos;
        private String seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }
        public Builder seconds(String seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }        public DurationResponse build() {
            return new DurationResponse(nanos, seconds);
        }
    }
}
