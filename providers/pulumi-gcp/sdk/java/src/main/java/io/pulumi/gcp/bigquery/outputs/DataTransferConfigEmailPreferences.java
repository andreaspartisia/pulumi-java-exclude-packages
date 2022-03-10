// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class DataTransferConfigEmailPreferences {
    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
     */
    private final Boolean enableFailureEmail;

    @OutputCustomType.Constructor
    private DataTransferConfigEmailPreferences(@OutputCustomType.Parameter("enableFailureEmail") Boolean enableFailureEmail) {
        this.enableFailureEmail = enableFailureEmail;
    }

    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
    */
    public Boolean getEnableFailureEmail() {
        return this.enableFailureEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigEmailPreferences defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigEmailPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder setEnableFailureEmail(Boolean enableFailureEmail) {
            this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail);
            return this;
        }
        public DataTransferConfigEmailPreferences build() {
            return new DataTransferConfigEmailPreferences(enableFailureEmail);
        }
    }
}
