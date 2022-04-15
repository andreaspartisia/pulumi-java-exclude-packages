// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a time zone from the [IANA Time Zone Database](https://www.iana.org/time-zones).
 * 
 */
public final class TimeZoneResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimeZoneResponse Empty = new TimeZoneResponse();

    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    public TimeZoneResponse(String version) {
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private TimeZoneResponse() {
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeZoneResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeZoneResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public TimeZoneResponse build() {
            return new TimeZoneResponse(version);
        }
    }
}
