// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MetricAlertAction {
    /**
     * @return The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource
     * 
     */
    private final String actionGroupId;
    /**
     * @return The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    private final @Nullable Map<String,String> webhookProperties;

    @CustomType.Constructor
    private MetricAlertAction(
        @CustomType.Parameter("actionGroupId") String actionGroupId,
        @CustomType.Parameter("webhookProperties") @Nullable Map<String,String> webhookProperties) {
        this.actionGroupId = actionGroupId;
        this.webhookProperties = webhookProperties;
    }

    /**
     * @return The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource
     * 
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }
    /**
     * @return The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    public Map<String,String> webhookProperties() {
        return this.webhookProperties == null ? Map.of() : this.webhookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionGroupId;
        private @Nullable Map<String,String> webhookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webhookProperties = defaults.webhookProperties;
        }

        public Builder actionGroupId(String actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }
        public Builder webhookProperties(@Nullable Map<String,String> webhookProperties) {
            this.webhookProperties = webhookProperties;
            return this;
        }        public MetricAlertAction build() {
            return new MetricAlertAction(actionGroupId, webhookProperties);
        }
    }
}
