// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gameservices_v1.inputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Write a Cloud Audit log
 * 
 */
public final class CloudAuditOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudAuditOptionsResponse Empty = new CloudAuditOptionsResponse();

    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
     */
    @Import(name="authorizationLoggingOptions", required=true)
      private final AuthorizationLoggingOptionsResponse authorizationLoggingOptions;

    public AuthorizationLoggingOptionsResponse authorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }

    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    @Import(name="logName", required=true)
      private final String logName;

    public String logName() {
        return this.logName;
    }

    public CloudAuditOptionsResponse(
        AuthorizationLoggingOptionsResponse authorizationLoggingOptions,
        String logName) {
        this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions, "expected parameter 'authorizationLoggingOptions' to be non-null");
        this.logName = Objects.requireNonNull(logName, "expected parameter 'logName' to be non-null");
    }

    private CloudAuditOptionsResponse() {
        this.authorizationLoggingOptions = null;
        this.logName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudAuditOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsResponse authorizationLoggingOptions;
        private String logName;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudAuditOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions);
            return this;
        }
        public Builder logName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }        public CloudAuditOptionsResponse build() {
            return new CloudAuditOptionsResponse(authorizationLoggingOptions, logName);
        }
    }
}
