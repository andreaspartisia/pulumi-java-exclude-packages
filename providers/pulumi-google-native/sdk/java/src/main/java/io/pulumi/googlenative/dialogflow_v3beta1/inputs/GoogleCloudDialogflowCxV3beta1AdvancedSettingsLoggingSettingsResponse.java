// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Define behaviors on logging.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse Empty = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse();

    /**
     * If true, DF Interaction logging is currently enabled.
     * 
     */
    @Import(name="enableInteractionLogging", required=true)
      private final Boolean enableInteractionLogging;

    public Boolean enableInteractionLogging() {
        return this.enableInteractionLogging;
    }

    /**
     * If true, StackDriver logging is currently enabled.
     * 
     */
    @Import(name="enableStackdriverLogging", required=true)
      private final Boolean enableStackdriverLogging;

    public Boolean enableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse(
        Boolean enableInteractionLogging,
        Boolean enableStackdriverLogging) {
        this.enableInteractionLogging = Objects.requireNonNull(enableInteractionLogging, "expected parameter 'enableInteractionLogging' to be non-null");
        this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging, "expected parameter 'enableStackdriverLogging' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse() {
        this.enableInteractionLogging = null;
        this.enableStackdriverLogging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableInteractionLogging;
        private Boolean enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInteractionLogging = defaults.enableInteractionLogging;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder enableInteractionLogging(Boolean enableInteractionLogging) {
            this.enableInteractionLogging = Objects.requireNonNull(enableInteractionLogging);
            return this;
        }
        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse(enableInteractionLogging, enableStackdriverLogging);
        }
    }
}
