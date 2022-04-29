// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Audit.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEventsAuditEventDataStateChange {
    /**
     * @return Provides the current state of fields that may have changed during an operation. To determine how the current operation changed a resource, compare the information in this attribute to  `previous`.
     * 
     */
    private final Map<String,Object> current;
    /**
     * @return Provides the previous state of fields that may have changed during an operation. To determine how the current operation changed a resource, compare the information in this attribute to  `current`.
     * 
     */
    private final Map<String,Object> previous;

    @CustomType.Constructor
    private GetEventsAuditEventDataStateChange(
        @CustomType.Parameter("current") Map<String,Object> current,
        @CustomType.Parameter("previous") Map<String,Object> previous) {
        this.current = current;
        this.previous = previous;
    }

    /**
     * @return Provides the current state of fields that may have changed during an operation. To determine how the current operation changed a resource, compare the information in this attribute to  `previous`.
     * 
     */
    public Map<String,Object> current() {
        return this.current;
    }
    /**
     * @return Provides the previous state of fields that may have changed during an operation. To determine how the current operation changed a resource, compare the information in this attribute to  `current`.
     * 
     */
    public Map<String,Object> previous() {
        return this.previous;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventsAuditEventDataStateChange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> current;
        private Map<String,Object> previous;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventsAuditEventDataStateChange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.previous = defaults.previous;
        }

        public Builder current(Map<String,Object> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }
        public Builder previous(Map<String,Object> previous) {
            this.previous = Objects.requireNonNull(previous);
            return this;
        }        public GetEventsAuditEventDataStateChange build() {
            return new GetEventsAuditEventDataStateChange(current, previous);
        }
    }
}
