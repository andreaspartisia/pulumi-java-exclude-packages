// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationExtractResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationLoadResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationQueryResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationTableCopyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class JobConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobConfigurationResponse Empty = new JobConfigurationResponse();

    /**
     * [Pick one] Copies a table.
     * 
     */
    @Import(name="copy", required=true)
      private final JobConfigurationTableCopyResponse copy;

    public JobConfigurationTableCopyResponse copy() {
        return this.copy;
    }

    /**
     * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
     * 
     */
    @Import(name="dryRun", required=true)
      private final Boolean dryRun;

    public Boolean dryRun() {
        return this.dryRun;
    }

    /**
     * [Pick one] Configures an extract job.
     * 
     */
    @Import(name="extract", required=true)
      private final JobConfigurationExtractResponse extract;

    public JobConfigurationExtractResponse extract() {
        return this.extract;
    }

    /**
     * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @Import(name="jobTimeoutMs", required=true)
      private final String jobTimeoutMs;

    public String jobTimeoutMs() {
        return this.jobTimeoutMs;
    }

    /**
     * The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN.
     * 
     */
    @Import(name="jobType", required=true)
      private final String jobType;

    public String jobType() {
        return this.jobType;
    }

    /**
     * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * [Pick one] Configures a load job.
     * 
     */
    @Import(name="load", required=true)
      private final JobConfigurationLoadResponse load;

    public JobConfigurationLoadResponse load() {
        return this.load;
    }

    /**
     * [Pick one] Configures a query job.
     * 
     */
    @Import(name="query", required=true)
      private final JobConfigurationQueryResponse query;

    public JobConfigurationQueryResponse query() {
        return this.query;
    }

    public JobConfigurationResponse(
        JobConfigurationTableCopyResponse copy,
        Boolean dryRun,
        JobConfigurationExtractResponse extract,
        String jobTimeoutMs,
        String jobType,
        Map<String,String> labels,
        JobConfigurationLoadResponse load,
        JobConfigurationQueryResponse query) {
        this.copy = Objects.requireNonNull(copy, "expected parameter 'copy' to be non-null");
        this.dryRun = Objects.requireNonNull(dryRun, "expected parameter 'dryRun' to be non-null");
        this.extract = Objects.requireNonNull(extract, "expected parameter 'extract' to be non-null");
        this.jobTimeoutMs = Objects.requireNonNull(jobTimeoutMs, "expected parameter 'jobTimeoutMs' to be non-null");
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.load = Objects.requireNonNull(load, "expected parameter 'load' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
    }

    private JobConfigurationResponse() {
        this.copy = null;
        this.dryRun = null;
        this.extract = null;
        this.jobTimeoutMs = null;
        this.jobType = null;
        this.labels = Map.of();
        this.load = null;
        this.query = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigurationTableCopyResponse copy;
        private Boolean dryRun;
        private JobConfigurationExtractResponse extract;
        private String jobTimeoutMs;
        private String jobType;
        private Map<String,String> labels;
        private JobConfigurationLoadResponse load;
        private JobConfigurationQueryResponse query;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.dryRun = defaults.dryRun;
    	      this.extract = defaults.extract;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.jobType = defaults.jobType;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.query = defaults.query;
        }

        public Builder copy(JobConfigurationTableCopyResponse copy) {
            this.copy = Objects.requireNonNull(copy);
            return this;
        }
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = Objects.requireNonNull(dryRun);
            return this;
        }
        public Builder extract(JobConfigurationExtractResponse extract) {
            this.extract = Objects.requireNonNull(extract);
            return this;
        }
        public Builder jobTimeoutMs(String jobTimeoutMs) {
            this.jobTimeoutMs = Objects.requireNonNull(jobTimeoutMs);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder load(JobConfigurationLoadResponse load) {
            this.load = Objects.requireNonNull(load);
            return this;
        }
        public Builder query(JobConfigurationQueryResponse query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }        public JobConfigurationResponse build() {
            return new JobConfigurationResponse(copy, dryRun, extract, jobTimeoutMs, jobType, labels, load, query);
        }
    }
}
