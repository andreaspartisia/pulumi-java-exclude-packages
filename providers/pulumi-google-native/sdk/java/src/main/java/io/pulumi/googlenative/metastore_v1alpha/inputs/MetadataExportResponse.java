// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The details of a metadata export operation.
 * 
 */
public final class MetadataExportResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataExportResponse Empty = new MetadataExportResponse();

    /**
     * The type of the database dump.
     * 
     */
    @Import(name="databaseDumpType", required=true)
      private final String databaseDumpType;

    public String databaseDumpType() {
        return this.databaseDumpType;
    }

    /**
     * A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
     */
    @Import(name="destinationGcsUri", required=true)
      private final String destinationGcsUri;

    public String destinationGcsUri() {
        return this.destinationGcsUri;
    }

    /**
     * The time when the export ended.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * The time when the export started.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * The current state of the export.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public MetadataExportResponse(
        String databaseDumpType,
        String destinationGcsUri,
        String endTime,
        String startTime,
        String state) {
        this.databaseDumpType = Objects.requireNonNull(databaseDumpType, "expected parameter 'databaseDumpType' to be non-null");
        this.destinationGcsUri = Objects.requireNonNull(destinationGcsUri, "expected parameter 'destinationGcsUri' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private MetadataExportResponse() {
        this.databaseDumpType = null;
        this.destinationGcsUri = null;
        this.endTime = null;
        this.startTime = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataExportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseDumpType;
        private String destinationGcsUri;
        private String endTime;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataExportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseDumpType = defaults.databaseDumpType;
    	      this.destinationGcsUri = defaults.destinationGcsUri;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder databaseDumpType(String databaseDumpType) {
            this.databaseDumpType = Objects.requireNonNull(databaseDumpType);
            return this;
        }
        public Builder destinationGcsUri(String destinationGcsUri) {
            this.destinationGcsUri = Objects.requireNonNull(destinationGcsUri);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public MetadataExportResponse build() {
            return new MetadataExportResponse(databaseDumpType, destinationGcsUri, endTime, startTime, state);
        }
    }
}
