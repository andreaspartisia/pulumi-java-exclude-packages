// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.AdhocBasedTriggerContextArgs;
import com.pulumi.azurenative.dataprotection.inputs.AzureBackupParamsArgs;
import com.pulumi.azurenative.dataprotection.inputs.DataStoreInfoBaseArgs;
import com.pulumi.azurenative.dataprotection.inputs.ScheduleBasedTriggerContextArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure backup rule
 * 
 */
public final class AzureBackupRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBackupRuleArgs Empty = new AzureBackupRuleArgs();

    /**
     * BackupParameters base
     * 
     */
    @Import(name="backupParameters")
    private @Nullable Output<AzureBackupParamsArgs> backupParameters;

    public Optional<Output<AzureBackupParamsArgs>> backupParameters() {
        return Optional.ofNullable(this.backupParameters);
    }

    /**
     * DataStoreInfo base
     * 
     */
    @Import(name="dataStore", required=true)
    private Output<DataStoreInfoBaseArgs> dataStore;

    public Output<DataStoreInfoBaseArgs> dataStore() {
        return this.dataStore;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Expected value is &#39;AzureBackupRule&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * Trigger context
     * 
     */
    @Import(name="trigger", required=true)
    private Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger;

    public Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger() {
        return this.trigger;
    }

    private AzureBackupRuleArgs() {}

    private AzureBackupRuleArgs(AzureBackupRuleArgs $) {
        this.backupParameters = $.backupParameters;
        this.dataStore = $.dataStore;
        this.name = $.name;
        this.objectType = $.objectType;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBackupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBackupRuleArgs $;

        public Builder() {
            $ = new AzureBackupRuleArgs();
        }

        public Builder(AzureBackupRuleArgs defaults) {
            $ = new AzureBackupRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupParameters(@Nullable Output<AzureBackupParamsArgs> backupParameters) {
            $.backupParameters = backupParameters;
            return this;
        }

        public Builder backupParameters(AzureBackupParamsArgs backupParameters) {
            return backupParameters(Output.of(backupParameters));
        }

        public Builder dataStore(Output<DataStoreInfoBaseArgs> dataStore) {
            $.dataStore = dataStore;
            return this;
        }

        public Builder dataStore(DataStoreInfoBaseArgs dataStore) {
            return dataStore(Output.of(dataStore));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public Builder trigger(Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger) {
            $.trigger = trigger;
            return this;
        }

        public Builder trigger(Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs> trigger) {
            return trigger(Output.of(trigger));
        }

        public Builder trigger(AdhocBasedTriggerContextArgs trigger) {
            return trigger(Either.ofLeft(trigger));
        }

        public Builder trigger(ScheduleBasedTriggerContextArgs trigger) {
            return trigger(Either.ofRight(trigger));
        }

        public AzureBackupRuleArgs build() {
            $.dataStore = Objects.requireNonNull($.dataStore, "expected parameter 'dataStore' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.objectType = Codegen.stringProp("objectType").output().arg($.objectType).require();
            $.trigger = Objects.requireNonNull($.trigger, "expected parameter 'trigger' to be non-null");
            return $;
        }
    }

}
