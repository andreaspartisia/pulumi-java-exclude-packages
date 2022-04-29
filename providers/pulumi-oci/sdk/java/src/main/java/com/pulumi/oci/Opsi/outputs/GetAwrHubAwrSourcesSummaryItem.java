// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAwrHubAwrSourcesSummaryItem {
    /**
     * @return Unique Awr Hub identifier
     * 
     */
    private final String awrHubId;
    /**
     * @return DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     * 
     */
    private final String awrSourceDatabaseId;
    /**
     * @return Number of hours since last AWR snapshots import happened from the Source database.
     * 
     */
    private final Double hoursSinceLastImport;
    /**
     * @return The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * 
     */
    private final Double maxSnapshotIdentifier;
    /**
     * @return The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * 
     */
    private final Double minSnapshotIdentifier;
    /**
     * @return Name for an Awr source database
     * 
     */
    private final String name;
    /**
     * @return Number of AWR snapshots uploaded from the Source database.
     * 
     */
    private final Double snapshotsUploaded;
    /**
     * @return The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * 
     */
    private final String timeFirstSnapshotGenerated;
    /**
     * @return The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * 
     */
    private final String timeLastSnapshotGenerated;

    @CustomType.Constructor
    private GetAwrHubAwrSourcesSummaryItem(
        @CustomType.Parameter("awrHubId") String awrHubId,
        @CustomType.Parameter("awrSourceDatabaseId") String awrSourceDatabaseId,
        @CustomType.Parameter("hoursSinceLastImport") Double hoursSinceLastImport,
        @CustomType.Parameter("maxSnapshotIdentifier") Double maxSnapshotIdentifier,
        @CustomType.Parameter("minSnapshotIdentifier") Double minSnapshotIdentifier,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("snapshotsUploaded") Double snapshotsUploaded,
        @CustomType.Parameter("timeFirstSnapshotGenerated") String timeFirstSnapshotGenerated,
        @CustomType.Parameter("timeLastSnapshotGenerated") String timeLastSnapshotGenerated) {
        this.awrHubId = awrHubId;
        this.awrSourceDatabaseId = awrSourceDatabaseId;
        this.hoursSinceLastImport = hoursSinceLastImport;
        this.maxSnapshotIdentifier = maxSnapshotIdentifier;
        this.minSnapshotIdentifier = minSnapshotIdentifier;
        this.name = name;
        this.snapshotsUploaded = snapshotsUploaded;
        this.timeFirstSnapshotGenerated = timeFirstSnapshotGenerated;
        this.timeLastSnapshotGenerated = timeLastSnapshotGenerated;
    }

    /**
     * @return Unique Awr Hub identifier
     * 
     */
    public String awrHubId() {
        return this.awrHubId;
    }
    /**
     * @return DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     * 
     */
    public String awrSourceDatabaseId() {
        return this.awrSourceDatabaseId;
    }
    /**
     * @return Number of hours since last AWR snapshots import happened from the Source database.
     * 
     */
    public Double hoursSinceLastImport() {
        return this.hoursSinceLastImport;
    }
    /**
     * @return The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * 
     */
    public Double maxSnapshotIdentifier() {
        return this.maxSnapshotIdentifier;
    }
    /**
     * @return The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * 
     */
    public Double minSnapshotIdentifier() {
        return this.minSnapshotIdentifier;
    }
    /**
     * @return Name for an Awr source database
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of AWR snapshots uploaded from the Source database.
     * 
     */
    public Double snapshotsUploaded() {
        return this.snapshotsUploaded;
    }
    /**
     * @return The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * 
     */
    public String timeFirstSnapshotGenerated() {
        return this.timeFirstSnapshotGenerated;
    }
    /**
     * @return The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * 
     */
    public String timeLastSnapshotGenerated() {
        return this.timeLastSnapshotGenerated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwrHubAwrSourcesSummaryItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awrHubId;
        private String awrSourceDatabaseId;
        private Double hoursSinceLastImport;
        private Double maxSnapshotIdentifier;
        private Double minSnapshotIdentifier;
        private String name;
        private Double snapshotsUploaded;
        private String timeFirstSnapshotGenerated;
        private String timeLastSnapshotGenerated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAwrHubAwrSourcesSummaryItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awrHubId = defaults.awrHubId;
    	      this.awrSourceDatabaseId = defaults.awrSourceDatabaseId;
    	      this.hoursSinceLastImport = defaults.hoursSinceLastImport;
    	      this.maxSnapshotIdentifier = defaults.maxSnapshotIdentifier;
    	      this.minSnapshotIdentifier = defaults.minSnapshotIdentifier;
    	      this.name = defaults.name;
    	      this.snapshotsUploaded = defaults.snapshotsUploaded;
    	      this.timeFirstSnapshotGenerated = defaults.timeFirstSnapshotGenerated;
    	      this.timeLastSnapshotGenerated = defaults.timeLastSnapshotGenerated;
        }

        public Builder awrHubId(String awrHubId) {
            this.awrHubId = Objects.requireNonNull(awrHubId);
            return this;
        }
        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = Objects.requireNonNull(awrSourceDatabaseId);
            return this;
        }
        public Builder hoursSinceLastImport(Double hoursSinceLastImport) {
            this.hoursSinceLastImport = Objects.requireNonNull(hoursSinceLastImport);
            return this;
        }
        public Builder maxSnapshotIdentifier(Double maxSnapshotIdentifier) {
            this.maxSnapshotIdentifier = Objects.requireNonNull(maxSnapshotIdentifier);
            return this;
        }
        public Builder minSnapshotIdentifier(Double minSnapshotIdentifier) {
            this.minSnapshotIdentifier = Objects.requireNonNull(minSnapshotIdentifier);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder snapshotsUploaded(Double snapshotsUploaded) {
            this.snapshotsUploaded = Objects.requireNonNull(snapshotsUploaded);
            return this;
        }
        public Builder timeFirstSnapshotGenerated(String timeFirstSnapshotGenerated) {
            this.timeFirstSnapshotGenerated = Objects.requireNonNull(timeFirstSnapshotGenerated);
            return this;
        }
        public Builder timeLastSnapshotGenerated(String timeLastSnapshotGenerated) {
            this.timeLastSnapshotGenerated = Objects.requireNonNull(timeLastSnapshotGenerated);
            return this;
        }        public GetAwrHubAwrSourcesSummaryItem build() {
            return new GetAwrHubAwrSourcesSummaryItem(awrHubId, awrSourceDatabaseId, hoursSinceLastImport, maxSnapshotIdentifier, minSnapshotIdentifier, name, snapshotsUploaded, timeFirstSnapshotGenerated, timeLastSnapshotGenerated);
        }
    }
}
