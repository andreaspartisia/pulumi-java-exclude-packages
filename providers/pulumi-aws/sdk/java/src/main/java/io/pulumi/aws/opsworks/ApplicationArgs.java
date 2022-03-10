// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.opsworks.inputs.ApplicationAppSourceArgs;
import io.pulumi.aws.opsworks.inputs.ApplicationEnvironmentArgs;
import io.pulumi.aws.opsworks.inputs.ApplicationSslConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * SCM configuration of the app as described below.
     * 
     */
    @InputImport(name="appSources")
      private final @Nullable Input<List<ApplicationAppSourceArgs>> appSources;

    public Input<List<ApplicationAppSourceArgs>> getAppSources() {
        return this.appSources == null ? Input.empty() : this.appSources;
    }

    /**
     * Run bundle install when deploying for application of type `rails`.
     * 
     */
    @InputImport(name="autoBundleOnDeploy")
      private final @Nullable Input<String> autoBundleOnDeploy;

    public Input<String> getAutoBundleOnDeploy() {
        return this.autoBundleOnDeploy == null ? Input.empty() : this.autoBundleOnDeploy;
    }

    /**
     * Specify activity and workflow workers for your app using the aws-flow gem.
     * 
     */
    @InputImport(name="awsFlowRubySettings")
      private final @Nullable Input<String> awsFlowRubySettings;

    public Input<String> getAwsFlowRubySettings() {
        return this.awsFlowRubySettings == null ? Input.empty() : this.awsFlowRubySettings;
    }

    /**
     * The data source's ARN.
     * 
     */
    @InputImport(name="dataSourceArn")
      private final @Nullable Input<String> dataSourceArn;

    public Input<String> getDataSourceArn() {
        return this.dataSourceArn == null ? Input.empty() : this.dataSourceArn;
    }

    /**
     * The database name.
     * 
     */
    @InputImport(name="dataSourceDatabaseName")
      private final @Nullable Input<String> dataSourceDatabaseName;

    public Input<String> getDataSourceDatabaseName() {
        return this.dataSourceDatabaseName == null ? Input.empty() : this.dataSourceDatabaseName;
    }

    /**
     * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
     * 
     */
    @InputImport(name="dataSourceType")
      private final @Nullable Input<String> dataSourceType;

    public Input<String> getDataSourceType() {
        return this.dataSourceType == null ? Input.empty() : this.dataSourceType;
    }

    /**
     * A description of the app.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Subfolder for the document root for application of type `rails`.
     * 
     */
    @InputImport(name="documentRoot")
      private final @Nullable Input<String> documentRoot;

    public Input<String> getDocumentRoot() {
        return this.documentRoot == null ? Input.empty() : this.documentRoot;
    }

    /**
     * A list of virtual host alias.
     * 
     */
    @InputImport(name="domains")
      private final @Nullable Input<List<String>> domains;

    public Input<List<String>> getDomains() {
        return this.domains == null ? Input.empty() : this.domains;
    }

    /**
     * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
     * 
     */
    @InputImport(name="enableSsl")
      private final @Nullable Input<Boolean> enableSsl;

    public Input<Boolean> getEnableSsl() {
        return this.enableSsl == null ? Input.empty() : this.enableSsl;
    }

    /**
     * Object to define environment variables.  Object is described below.
     * 
     */
    @InputImport(name="environments")
      private final @Nullable Input<List<ApplicationEnvironmentArgs>> environments;

    public Input<List<ApplicationEnvironmentArgs>> getEnvironments() {
        return this.environments == null ? Input.empty() : this.environments;
    }

    /**
     * A human-readable name for the application.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the Rails environment for application of type `rails`.
     * 
     */
    @InputImport(name="railsEnv")
      private final @Nullable Input<String> railsEnv;

    public Input<String> getRailsEnv() {
        return this.railsEnv == null ? Input.empty() : this.railsEnv;
    }

    /**
     * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
     * 
     */
    @InputImport(name="shortName")
      private final @Nullable Input<String> shortName;

    public Input<String> getShortName() {
        return this.shortName == null ? Input.empty() : this.shortName;
    }

    /**
     * The SSL configuration of the app. Object is described below.
     * 
     */
    @InputImport(name="sslConfigurations")
      private final @Nullable Input<List<ApplicationSslConfigurationArgs>> sslConfigurations;

    public Input<List<ApplicationSslConfigurationArgs>> getSslConfigurations() {
        return this.sslConfigurations == null ? Input.empty() : this.sslConfigurations;
    }

    /**
     * The id of the stack the application will belong to.
     * 
     */
    @InputImport(name="stackId", required=true)
      private final Input<String> stackId;

    public Input<String> getStackId() {
        return this.stackId;
    }

    /**
     * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ApplicationArgs(
        @Nullable Input<List<ApplicationAppSourceArgs>> appSources,
        @Nullable Input<String> autoBundleOnDeploy,
        @Nullable Input<String> awsFlowRubySettings,
        @Nullable Input<String> dataSourceArn,
        @Nullable Input<String> dataSourceDatabaseName,
        @Nullable Input<String> dataSourceType,
        @Nullable Input<String> description,
        @Nullable Input<String> documentRoot,
        @Nullable Input<List<String>> domains,
        @Nullable Input<Boolean> enableSsl,
        @Nullable Input<List<ApplicationEnvironmentArgs>> environments,
        @Nullable Input<String> name,
        @Nullable Input<String> railsEnv,
        @Nullable Input<String> shortName,
        @Nullable Input<List<ApplicationSslConfigurationArgs>> sslConfigurations,
        Input<String> stackId,
        Input<String> type) {
        this.appSources = appSources;
        this.autoBundleOnDeploy = autoBundleOnDeploy;
        this.awsFlowRubySettings = awsFlowRubySettings;
        this.dataSourceArn = dataSourceArn;
        this.dataSourceDatabaseName = dataSourceDatabaseName;
        this.dataSourceType = dataSourceType;
        this.description = description;
        this.documentRoot = documentRoot;
        this.domains = domains;
        this.enableSsl = enableSsl;
        this.environments = environments;
        this.name = name;
        this.railsEnv = railsEnv;
        this.shortName = shortName;
        this.sslConfigurations = sslConfigurations;
        this.stackId = Objects.requireNonNull(stackId, "expected parameter 'stackId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationArgs() {
        this.appSources = Input.empty();
        this.autoBundleOnDeploy = Input.empty();
        this.awsFlowRubySettings = Input.empty();
        this.dataSourceArn = Input.empty();
        this.dataSourceDatabaseName = Input.empty();
        this.dataSourceType = Input.empty();
        this.description = Input.empty();
        this.documentRoot = Input.empty();
        this.domains = Input.empty();
        this.enableSsl = Input.empty();
        this.environments = Input.empty();
        this.name = Input.empty();
        this.railsEnv = Input.empty();
        this.shortName = Input.empty();
        this.sslConfigurations = Input.empty();
        this.stackId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ApplicationAppSourceArgs>> appSources;
        private @Nullable Input<String> autoBundleOnDeploy;
        private @Nullable Input<String> awsFlowRubySettings;
        private @Nullable Input<String> dataSourceArn;
        private @Nullable Input<String> dataSourceDatabaseName;
        private @Nullable Input<String> dataSourceType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> documentRoot;
        private @Nullable Input<List<String>> domains;
        private @Nullable Input<Boolean> enableSsl;
        private @Nullable Input<List<ApplicationEnvironmentArgs>> environments;
        private @Nullable Input<String> name;
        private @Nullable Input<String> railsEnv;
        private @Nullable Input<String> shortName;
        private @Nullable Input<List<ApplicationSslConfigurationArgs>> sslConfigurations;
        private Input<String> stackId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSources = defaults.appSources;
    	      this.autoBundleOnDeploy = defaults.autoBundleOnDeploy;
    	      this.awsFlowRubySettings = defaults.awsFlowRubySettings;
    	      this.dataSourceArn = defaults.dataSourceArn;
    	      this.dataSourceDatabaseName = defaults.dataSourceDatabaseName;
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.description = defaults.description;
    	      this.documentRoot = defaults.documentRoot;
    	      this.domains = defaults.domains;
    	      this.enableSsl = defaults.enableSsl;
    	      this.environments = defaults.environments;
    	      this.name = defaults.name;
    	      this.railsEnv = defaults.railsEnv;
    	      this.shortName = defaults.shortName;
    	      this.sslConfigurations = defaults.sslConfigurations;
    	      this.stackId = defaults.stackId;
    	      this.type = defaults.type;
        }

        public Builder setAppSources(@Nullable Input<List<ApplicationAppSourceArgs>> appSources) {
            this.appSources = appSources;
            return this;
        }

        public Builder setAppSources(@Nullable List<ApplicationAppSourceArgs> appSources) {
            this.appSources = Input.ofNullable(appSources);
            return this;
        }

        public Builder setAutoBundleOnDeploy(@Nullable Input<String> autoBundleOnDeploy) {
            this.autoBundleOnDeploy = autoBundleOnDeploy;
            return this;
        }

        public Builder setAutoBundleOnDeploy(@Nullable String autoBundleOnDeploy) {
            this.autoBundleOnDeploy = Input.ofNullable(autoBundleOnDeploy);
            return this;
        }

        public Builder setAwsFlowRubySettings(@Nullable Input<String> awsFlowRubySettings) {
            this.awsFlowRubySettings = awsFlowRubySettings;
            return this;
        }

        public Builder setAwsFlowRubySettings(@Nullable String awsFlowRubySettings) {
            this.awsFlowRubySettings = Input.ofNullable(awsFlowRubySettings);
            return this;
        }

        public Builder setDataSourceArn(@Nullable Input<String> dataSourceArn) {
            this.dataSourceArn = dataSourceArn;
            return this;
        }

        public Builder setDataSourceArn(@Nullable String dataSourceArn) {
            this.dataSourceArn = Input.ofNullable(dataSourceArn);
            return this;
        }

        public Builder setDataSourceDatabaseName(@Nullable Input<String> dataSourceDatabaseName) {
            this.dataSourceDatabaseName = dataSourceDatabaseName;
            return this;
        }

        public Builder setDataSourceDatabaseName(@Nullable String dataSourceDatabaseName) {
            this.dataSourceDatabaseName = Input.ofNullable(dataSourceDatabaseName);
            return this;
        }

        public Builder setDataSourceType(@Nullable Input<String> dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        public Builder setDataSourceType(@Nullable String dataSourceType) {
            this.dataSourceType = Input.ofNullable(dataSourceType);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDocumentRoot(@Nullable Input<String> documentRoot) {
            this.documentRoot = documentRoot;
            return this;
        }

        public Builder setDocumentRoot(@Nullable String documentRoot) {
            this.documentRoot = Input.ofNullable(documentRoot);
            return this;
        }

        public Builder setDomains(@Nullable Input<List<String>> domains) {
            this.domains = domains;
            return this;
        }

        public Builder setDomains(@Nullable List<String> domains) {
            this.domains = Input.ofNullable(domains);
            return this;
        }

        public Builder setEnableSsl(@Nullable Input<Boolean> enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder setEnableSsl(@Nullable Boolean enableSsl) {
            this.enableSsl = Input.ofNullable(enableSsl);
            return this;
        }

        public Builder setEnvironments(@Nullable Input<List<ApplicationEnvironmentArgs>> environments) {
            this.environments = environments;
            return this;
        }

        public Builder setEnvironments(@Nullable List<ApplicationEnvironmentArgs> environments) {
            this.environments = Input.ofNullable(environments);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRailsEnv(@Nullable Input<String> railsEnv) {
            this.railsEnv = railsEnv;
            return this;
        }

        public Builder setRailsEnv(@Nullable String railsEnv) {
            this.railsEnv = Input.ofNullable(railsEnv);
            return this;
        }

        public Builder setShortName(@Nullable Input<String> shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder setShortName(@Nullable String shortName) {
            this.shortName = Input.ofNullable(shortName);
            return this;
        }

        public Builder setSslConfigurations(@Nullable Input<List<ApplicationSslConfigurationArgs>> sslConfigurations) {
            this.sslConfigurations = sslConfigurations;
            return this;
        }

        public Builder setSslConfigurations(@Nullable List<ApplicationSslConfigurationArgs> sslConfigurations) {
            this.sslConfigurations = Input.ofNullable(sslConfigurations);
            return this;
        }

        public Builder setStackId(Input<String> stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }

        public Builder setStackId(String stackId) {
            this.stackId = Input.of(Objects.requireNonNull(stackId));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ApplicationArgs build() {
            return new ApplicationArgs(appSources, autoBundleOnDeploy, awsFlowRubySettings, dataSourceArn, dataSourceDatabaseName, dataSourceType, description, documentRoot, domains, enableSsl, environments, name, railsEnv, shortName, sslConfigurations, stackId, type);
        }
    }
}