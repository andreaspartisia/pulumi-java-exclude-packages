// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetadataExportResponse {
    /**
     * The type of the database dump.
     * 
     */
    private final String databaseDumpType;
    /**
     * A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
     */
    private final String destinationGcsUri;
    /**
     * The time when the export ended.
     * 
     */
    private final String endTime;
    /**
     * The time when the export started.
     * 
     */
    private final String startTime;
    /**
     * The current state of the export.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private MetadataExportResponse(
        @CustomType.Parameter("databaseDumpType") String databaseDumpType,
        @CustomType.Parameter("destinationGcsUri") String destinationGcsUri,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state) {
        this.databaseDumpType = databaseDumpType;
        this.destinationGcsUri = destinationGcsUri;
        this.endTime = endTime;
        this.startTime = startTime;
        this.state = state;
    }

    /**
     * The type of the database dump.
     * 
    */
    public String databaseDumpType() {
        return this.databaseDumpType;
    }
    /**
     * A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
    */
    public String destinationGcsUri() {
        return this.destinationGcsUri;
    }
    /**
     * The time when the export ended.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * The time when the export started.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * The current state of the export.
     * 
    */
    public String state() {
        return this.state;
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
