// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure data lake store write settings.
 * 
 */
public final class AzureDataLakeStoreWriteSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeStoreWriteSettingsArgs Empty = new AzureDataLakeStoreWriteSettingsArgs();

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @Import(name="copyBehavior")
      private final @Nullable Output<Object> copyBehavior;

    public Output<Object> copyBehavior() {
        return this.copyBehavior == null ? Codegen.empty() : this.copyBehavior;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="expiryDateTime")
      private final @Nullable Output<Object> expiryDateTime;

    public Output<Object> expiryDateTime() {
        return this.expiryDateTime == null ? Codegen.empty() : this.expiryDateTime;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * The write setting type.
     * Expected value is 'AzureDataLakeStoreWriteSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureDataLakeStoreWriteSettingsArgs(
        @Nullable Output<Object> copyBehavior,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> expiryDateTime,
        @Nullable Output<Object> maxConcurrentConnections,
        Output<String> type) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.expiryDateTime = expiryDateTime;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private AzureDataLakeStoreWriteSettingsArgs() {
        this.copyBehavior = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.expiryDateTime = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> copyBehavior;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> expiryDateTime;
        private @Nullable Output<Object> maxConcurrentConnections;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.expiryDateTime = defaults.expiryDateTime;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
        }

        public Builder copyBehavior(@Nullable Output<Object> copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }
        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = Codegen.ofNullable(copyBehavior);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder expiryDateTime(@Nullable Output<Object> expiryDateTime) {
            this.expiryDateTime = expiryDateTime;
            return this;
        }
        public Builder expiryDateTime(@Nullable Object expiryDateTime) {
            this.expiryDateTime = Codegen.ofNullable(expiryDateTime);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureDataLakeStoreWriteSettingsArgs build() {
            return new AzureDataLakeStoreWriteSettingsArgs(copyBehavior, disableMetricsCollection, expiryDateTime, maxConcurrentConnections, type);
        }
    }
}
