// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataTransferConfigSensitiveParams {
    /**
     * The Secret Access Key of the AWS account transferring data from.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final String secretAccessKey;

    @OutputCustomType.Constructor
    private DataTransferConfigSensitiveParams(@OutputCustomType.Parameter("secretAccessKey") String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * The Secret Access Key of the AWS account transferring data from.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
    */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigSensitiveParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigSensitiveParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder setSecretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }
        public DataTransferConfigSensitiveParams build() {
            return new DataTransferConfigSensitiveParams(secretAccessKey);
        }
    }
}
