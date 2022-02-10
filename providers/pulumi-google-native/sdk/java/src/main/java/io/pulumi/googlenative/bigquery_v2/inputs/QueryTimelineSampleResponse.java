// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class QueryTimelineSampleResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryTimelineSampleResponse Empty = new QueryTimelineSampleResponse();

    @InputImport(name="activeUnits", required=true)
    private final String activeUnits;

    public String getActiveUnits() {
        return this.activeUnits;
    }

    @InputImport(name="completedUnits", required=true)
    private final String completedUnits;

    public String getCompletedUnits() {
        return this.completedUnits;
    }

    @InputImport(name="elapsedMs", required=true)
    private final String elapsedMs;

    public String getElapsedMs() {
        return this.elapsedMs;
    }

    @InputImport(name="pendingUnits", required=true)
    private final String pendingUnits;

    public String getPendingUnits() {
        return this.pendingUnits;
    }

    @InputImport(name="totalSlotMs", required=true)
    private final String totalSlotMs;

    public String getTotalSlotMs() {
        return this.totalSlotMs;
    }

    public QueryTimelineSampleResponse(
        String activeUnits,
        String completedUnits,
        String elapsedMs,
        String pendingUnits,
        String totalSlotMs) {
        this.activeUnits = Objects.requireNonNull(activeUnits, "expected parameter 'activeUnits' to be non-null");
        this.completedUnits = Objects.requireNonNull(completedUnits, "expected parameter 'completedUnits' to be non-null");
        this.elapsedMs = Objects.requireNonNull(elapsedMs, "expected parameter 'elapsedMs' to be non-null");
        this.pendingUnits = Objects.requireNonNull(pendingUnits, "expected parameter 'pendingUnits' to be non-null");
        this.totalSlotMs = Objects.requireNonNull(totalSlotMs, "expected parameter 'totalSlotMs' to be non-null");
    }

    private QueryTimelineSampleResponse() {
        this.activeUnits = null;
        this.completedUnits = null;
        this.elapsedMs = null;
        this.pendingUnits = null;
        this.totalSlotMs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryTimelineSampleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activeUnits;
        private String completedUnits;
        private String elapsedMs;
        private String pendingUnits;
        private String totalSlotMs;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryTimelineSampleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeUnits = defaults.activeUnits;
    	      this.completedUnits = defaults.completedUnits;
    	      this.elapsedMs = defaults.elapsedMs;
    	      this.pendingUnits = defaults.pendingUnits;
    	      this.totalSlotMs = defaults.totalSlotMs;
        }

        public Builder setActiveUnits(String activeUnits) {
            this.activeUnits = Objects.requireNonNull(activeUnits);
            return this;
        }

        public Builder setCompletedUnits(String completedUnits) {
            this.completedUnits = Objects.requireNonNull(completedUnits);
            return this;
        }

        public Builder setElapsedMs(String elapsedMs) {
            this.elapsedMs = Objects.requireNonNull(elapsedMs);
            return this;
        }

        public Builder setPendingUnits(String pendingUnits) {
            this.pendingUnits = Objects.requireNonNull(pendingUnits);
            return this;
        }

        public Builder setTotalSlotMs(String totalSlotMs) {
            this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
            return this;
        }

        public QueryTimelineSampleResponse build() {
            return new QueryTimelineSampleResponse(activeUnits, completedUnits, elapsedMs, pendingUnits, totalSlotMs);
        }
    }
}