// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogGroupArgs Empty = new LogGroupArgs();

    /**
     * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
     * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
     * permissions for the CMK whenever the encrypted data is requested.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The name of the log group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Specifies the number of days
     * you want to retain log events in the specified log group.  Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, 3653, and 0.
     * If you select 0, the events in the log group are always retained and never expire.
     * 
     */
    @InputImport(name="retentionInDays")
      private final @Nullable Input<Integer> retentionInDays;

    public Input<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Input.empty() : this.retentionInDays;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LogGroupArgs(
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<Integer> retentionInDays,
        @Nullable Input<Map<String,String>> tags) {
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.namePrefix = namePrefix;
        this.retentionInDays = retentionInDays;
        this.tags = tags;
    }

    private LogGroupArgs() {
        this.kmsKeyId = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.retentionInDays = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<Integer> retentionInDays;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LogGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.tags = defaults.tags;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setRetentionInDays(@Nullable Input<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Input.ofNullable(retentionInDays);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LogGroupArgs build() {
            return new LogGroupArgs(kmsKeyId, name, namePrefix, retentionInDays, tags);
        }
    }
}