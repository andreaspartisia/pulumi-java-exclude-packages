// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackupSelectionConditionResourceType {
    private final String conditionKey;
    private final String conditionType;
    private final String conditionValue;

    @OutputCustomType.Constructor({"conditionKey","conditionType","conditionValue"})
    private BackupSelectionConditionResourceType(
        String conditionKey,
        String conditionType,
        String conditionValue) {
        this.conditionKey = Objects.requireNonNull(conditionKey);
        this.conditionType = Objects.requireNonNull(conditionType);
        this.conditionValue = Objects.requireNonNull(conditionValue);
    }

    public String getConditionKey() {
        return this.conditionKey;
    }
    public String getConditionType() {
        return this.conditionType;
    }
    public String getConditionValue() {
        return this.conditionValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionConditionResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String conditionKey;
        private String conditionType;
        private String conditionValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionConditionResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionKey = defaults.conditionKey;
    	      this.conditionType = defaults.conditionType;
    	      this.conditionValue = defaults.conditionValue;
        }

        public Builder setConditionKey(String conditionKey) {
            this.conditionKey = Objects.requireNonNull(conditionKey);
            return this;
        }

        public Builder setConditionType(String conditionType) {
            this.conditionType = Objects.requireNonNull(conditionType);
            return this;
        }

        public Builder setConditionValue(String conditionValue) {
            this.conditionValue = Objects.requireNonNull(conditionValue);
            return this;
        }

        public BackupSelectionConditionResourceType build() {
            return new BackupSelectionConditionResourceType(conditionKey, conditionType, conditionValue);
        }
    }
}