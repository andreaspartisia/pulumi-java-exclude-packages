// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A segment in a structured format.
 * 
 */
public final class SegmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final SegmentResponse Empty = new SegmentResponse();

    /**
     * A mapping from the positional location to the value. The key string uses zero-based indexes separated by dots to identify Fields, components and sub-components. A bracket notation is also used to identify different instances of a repeated field. Regex for key: (\d+)(\[\d+\])?(.\d+)?(.\d+)? Examples of (key, value) pairs: * (0.1, "hemoglobin") denotes that the first component of Field 0 has the value "hemoglobin". * (1.1.2, "CBC") denotes that the second sub-component of the first component of Field 1 has the value "CBC". * (1[0].1, "HbA1c") denotes that the first component of the first Instance of Field 1, which is repeated, has the value "HbA1c".
     * 
     */
    @Import(name="fields", required=true)
      private final Map<String,String> fields;

    public Map<String,String> fields() {
        return this.fields;
    }

    /**
     * A string that indicates the type of segment. For example, EVN or PID.
     * 
     */
    @Import(name="segmentId", required=true)
      private final String segmentId;

    public String segmentId() {
        return this.segmentId;
    }

    /**
     * Set ID for segments that can be in a set. This can be empty if it's missing or isn't applicable.
     * 
     */
    @Import(name="setId", required=true)
      private final String setId;

    public String setId() {
        return this.setId;
    }

    public SegmentResponse(
        Map<String,String> fields,
        String segmentId,
        String setId) {
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.segmentId = Objects.requireNonNull(segmentId, "expected parameter 'segmentId' to be non-null");
        this.setId = Objects.requireNonNull(setId, "expected parameter 'setId' to be non-null");
    }

    private SegmentResponse() {
        this.fields = Map.of();
        this.segmentId = null;
        this.setId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fields;
        private String segmentId;
        private String setId;

        public Builder() {
    	      // Empty
        }

        public Builder(SegmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.segmentId = defaults.segmentId;
    	      this.setId = defaults.setId;
        }

        public Builder fields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder segmentId(String segmentId) {
            this.segmentId = Objects.requireNonNull(segmentId);
            return this;
        }
        public Builder setId(String setId) {
            this.setId = Objects.requireNonNull(setId);
            return this;
        }        public SegmentResponse build() {
            return new SegmentResponse(fields, segmentId, setId);
        }
    }
}
