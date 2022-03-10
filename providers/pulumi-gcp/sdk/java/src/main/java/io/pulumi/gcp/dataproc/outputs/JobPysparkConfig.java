// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.JobPysparkConfigLoggingConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobPysparkConfig {
    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final @Nullable List<String> archiveUris;
    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    private final @Nullable List<String> fileUris;
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final @Nullable List<String> jarFileUris;
    private final @Nullable JobPysparkConfigLoggingConfig loggingConfig;
    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    private final String mainPythonFileUri;
    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    private final @Nullable List<String> pythonFileUris;

    @OutputCustomType.Constructor
    private JobPysparkConfig(
        @OutputCustomType.Parameter("archiveUris") @Nullable List<String> archiveUris,
        @OutputCustomType.Parameter("args") @Nullable List<String> args,
        @OutputCustomType.Parameter("fileUris") @Nullable List<String> fileUris,
        @OutputCustomType.Parameter("jarFileUris") @Nullable List<String> jarFileUris,
        @OutputCustomType.Parameter("loggingConfig") @Nullable JobPysparkConfigLoggingConfig loggingConfig,
        @OutputCustomType.Parameter("mainPythonFileUri") String mainPythonFileUri,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("pythonFileUris") @Nullable List<String> pythonFileUris) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainPythonFileUri = mainPythonFileUri;
        this.properties = properties;
        this.pythonFileUris = pythonFileUris;
    }

    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
    */
    public List<String> getArchiveUris() {
        return this.archiveUris == null ? List.of() : this.archiveUris;
    }
    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
    */
    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
    */
    public List<String> getFileUris() {
        return this.fileUris == null ? List.of() : this.fileUris;
    }
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
    */
    public List<String> getJarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    public Optional<JobPysparkConfigLoggingConfig> getLoggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
    */
    public String getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }
    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
    */
    public List<String> getPythonFileUris() {
        return this.pythonFileUris == null ? List.of() : this.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPysparkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> archiveUris;
        private @Nullable List<String> args;
        private @Nullable List<String> fileUris;
        private @Nullable List<String> jarFileUris;
        private @Nullable JobPysparkConfigLoggingConfig loggingConfig;
        private String mainPythonFileUri;
        private @Nullable Map<String,String> properties;
        private @Nullable List<String> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPysparkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder setArchiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder setFileUris(@Nullable List<String> fileUris) {
            this.fileUris = fileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setLoggingConfig(@Nullable JobPysparkConfigLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setMainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setPythonFileUris(@Nullable List<String> pythonFileUris) {
            this.pythonFileUris = pythonFileUris;
            return this;
        }
        public JobPysparkConfig build() {
            return new JobPysparkConfig(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
