// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ActionResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectConfigResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StorageConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Controls what and how to inspect for findings.
 * 
 */
public final class GooglePrivacyDlpV2InspectJobConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectJobConfigResponse Empty = new GooglePrivacyDlpV2InspectJobConfigResponse();

    /**
     * Actions to execute at the completion of the job.
     * 
     */
    @Import(name="actions", required=true)
      private final List<GooglePrivacyDlpV2ActionResponse> actions;

    public List<GooglePrivacyDlpV2ActionResponse> actions() {
        return this.actions;
    }

    /**
     * How and what to scan for.
     * 
     */
    @Import(name="inspectConfig", required=true)
      private final GooglePrivacyDlpV2InspectConfigResponse inspectConfig;

    public GooglePrivacyDlpV2InspectConfigResponse inspectConfig() {
        return this.inspectConfig;
    }

    /**
     * If provided, will be used as the default for all values in InspectConfig. `inspect_config` will be merged into the values persisted as part of the template.
     * 
     */
    @Import(name="inspectTemplateName", required=true)
      private final String inspectTemplateName;

    public String inspectTemplateName() {
        return this.inspectTemplateName;
    }

    /**
     * The data to scan.
     * 
     */
    @Import(name="storageConfig", required=true)
      private final GooglePrivacyDlpV2StorageConfigResponse storageConfig;

    public GooglePrivacyDlpV2StorageConfigResponse storageConfig() {
        return this.storageConfig;
    }

    public GooglePrivacyDlpV2InspectJobConfigResponse(
        List<GooglePrivacyDlpV2ActionResponse> actions,
        GooglePrivacyDlpV2InspectConfigResponse inspectConfig,
        String inspectTemplateName,
        GooglePrivacyDlpV2StorageConfigResponse storageConfig) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.inspectConfig = Objects.requireNonNull(inspectConfig, "expected parameter 'inspectConfig' to be non-null");
        this.inspectTemplateName = Objects.requireNonNull(inspectTemplateName, "expected parameter 'inspectTemplateName' to be non-null");
        this.storageConfig = Objects.requireNonNull(storageConfig, "expected parameter 'storageConfig' to be non-null");
    }

    private GooglePrivacyDlpV2InspectJobConfigResponse() {
        this.actions = List.of();
        this.inspectConfig = null;
        this.inspectTemplateName = null;
        this.storageConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectJobConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2ActionResponse> actions;
        private GooglePrivacyDlpV2InspectConfigResponse inspectConfig;
        private String inspectTemplateName;
        private GooglePrivacyDlpV2StorageConfigResponse storageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectJobConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.inspectTemplateName = defaults.inspectTemplateName;
    	      this.storageConfig = defaults.storageConfig;
        }

        public Builder actions(List<GooglePrivacyDlpV2ActionResponse> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GooglePrivacyDlpV2ActionResponse... actions) {
            return actions(List.of(actions));
        }
        public Builder inspectConfig(GooglePrivacyDlpV2InspectConfigResponse inspectConfig) {
            this.inspectConfig = Objects.requireNonNull(inspectConfig);
            return this;
        }
        public Builder inspectTemplateName(String inspectTemplateName) {
            this.inspectTemplateName = Objects.requireNonNull(inspectTemplateName);
            return this;
        }
        public Builder storageConfig(GooglePrivacyDlpV2StorageConfigResponse storageConfig) {
            this.storageConfig = Objects.requireNonNull(storageConfig);
            return this;
        }        public GooglePrivacyDlpV2InspectJobConfigResponse build() {
            return new GooglePrivacyDlpV2InspectJobConfigResponse(actions, inspectConfig, inspectTemplateName, storageConfig);
        }
    }
}
