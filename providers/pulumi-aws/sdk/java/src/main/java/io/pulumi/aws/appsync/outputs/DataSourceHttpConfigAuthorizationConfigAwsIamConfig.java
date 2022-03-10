// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceHttpConfigAuthorizationConfigAwsIamConfig {
    /**
     * The signing Amazon Web Services Region for IAM authorization.
     * 
     */
    private final @Nullable String signingRegion;
    /**
     * The signing service name for IAM authorization.
     * 
     */
    private final @Nullable String signingServiceName;

    @OutputCustomType.Constructor
    private DataSourceHttpConfigAuthorizationConfigAwsIamConfig(
        @OutputCustomType.Parameter("signingRegion") @Nullable String signingRegion,
        @OutputCustomType.Parameter("signingServiceName") @Nullable String signingServiceName) {
        this.signingRegion = signingRegion;
        this.signingServiceName = signingServiceName;
    }

    /**
     * The signing Amazon Web Services Region for IAM authorization.
     * 
    */
    public Optional<String> getSigningRegion() {
        return Optional.ofNullable(this.signingRegion);
    }
    /**
     * The signing service name for IAM authorization.
     * 
    */
    public Optional<String> getSigningServiceName() {
        return Optional.ofNullable(this.signingServiceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String signingRegion;
        private @Nullable String signingServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingRegion = defaults.signingRegion;
    	      this.signingServiceName = defaults.signingServiceName;
        }

        public Builder setSigningRegion(@Nullable String signingRegion) {
            this.signingRegion = signingRegion;
            return this;
        }

        public Builder setSigningServiceName(@Nullable String signingServiceName) {
            this.signingServiceName = signingServiceName;
            return this;
        }
        public DataSourceHttpConfigAuthorizationConfigAwsIamConfig build() {
            return new DataSourceHttpConfigAuthorizationConfigAwsIamConfig(signingRegion, signingServiceName);
        }
    }
}