// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.azure.sentinel.outputs.AlertRuleScheduledEntityMappingFieldMapping;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AlertRuleScheduledEntityMapping {
    /**
     * @return The type of the entity. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
     * 
     */
    private final String entityType;
    /**
     * @return A list of `field_mapping` blocks as defined below.
     * 
     */
    private final List<AlertRuleScheduledEntityMappingFieldMapping> fieldMappings;

    @CustomType.Constructor
    private AlertRuleScheduledEntityMapping(
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("fieldMappings") List<AlertRuleScheduledEntityMappingFieldMapping> fieldMappings) {
        this.entityType = entityType;
        this.fieldMappings = fieldMappings;
    }

    /**
     * @return The type of the entity. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return A list of `field_mapping` blocks as defined below.
     * 
     */
    public List<AlertRuleScheduledEntityMappingFieldMapping> fieldMappings() {
        return this.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleScheduledEntityMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityType;
        private List<AlertRuleScheduledEntityMappingFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleScheduledEntityMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder fieldMappings(List<AlertRuleScheduledEntityMappingFieldMapping> fieldMappings) {
            this.fieldMappings = Objects.requireNonNull(fieldMappings);
            return this;
        }
        public Builder fieldMappings(AlertRuleScheduledEntityMappingFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }        public AlertRuleScheduledEntityMapping build() {
            return new AlertRuleScheduledEntityMapping(entityType, fieldMappings);
        }
    }
}
