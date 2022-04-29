// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetJobJobConfigurationDetail {
    /**
     * @return The arguments to pass to the job.
     * 
     */
    private final String commandLineArguments;
    /**
     * @return Environment variables to set for the job.
     * 
     */
    private final Map<String,Object> environmentVariables;
    /**
     * @return The type of job.
     * 
     */
    private final String jobType;
    /**
     * @return A time bound for the execution of the job. Timer starts when the job becomes active.
     * 
     */
    private final String maximumRuntimeInMinutes;

    @CustomType.Constructor
    private GetJobJobConfigurationDetail(
        @CustomType.Parameter("commandLineArguments") String commandLineArguments,
        @CustomType.Parameter("environmentVariables") Map<String,Object> environmentVariables,
        @CustomType.Parameter("jobType") String jobType,
        @CustomType.Parameter("maximumRuntimeInMinutes") String maximumRuntimeInMinutes) {
        this.commandLineArguments = commandLineArguments;
        this.environmentVariables = environmentVariables;
        this.jobType = jobType;
        this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
    }

    /**
     * @return The arguments to pass to the job.
     * 
     */
    public String commandLineArguments() {
        return this.commandLineArguments;
    }
    /**
     * @return Environment variables to set for the job.
     * 
     */
    public Map<String,Object> environmentVariables() {
        return this.environmentVariables;
    }
    /**
     * @return The type of job.
     * 
     */
    public String jobType() {
        return this.jobType;
    }
    /**
     * @return A time bound for the execution of the job. Timer starts when the job becomes active.
     * 
     */
    public String maximumRuntimeInMinutes() {
        return this.maximumRuntimeInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobConfigurationDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commandLineArguments;
        private Map<String,Object> environmentVariables;
        private String jobType;
        private String maximumRuntimeInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobJobConfigurationDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLineArguments = defaults.commandLineArguments;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.jobType = defaults.jobType;
    	      this.maximumRuntimeInMinutes = defaults.maximumRuntimeInMinutes;
        }

        public Builder commandLineArguments(String commandLineArguments) {
            this.commandLineArguments = Objects.requireNonNull(commandLineArguments);
            return this;
        }
        public Builder environmentVariables(Map<String,Object> environmentVariables) {
            this.environmentVariables = Objects.requireNonNull(environmentVariables);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder maximumRuntimeInMinutes(String maximumRuntimeInMinutes) {
            this.maximumRuntimeInMinutes = Objects.requireNonNull(maximumRuntimeInMinutes);
            return this;
        }        public GetJobJobConfigurationDetail build() {
            return new GetJobJobConfigurationDetail(commandLineArguments, environmentVariables, jobType, maximumRuntimeInMinutes);
        }
    }
}
