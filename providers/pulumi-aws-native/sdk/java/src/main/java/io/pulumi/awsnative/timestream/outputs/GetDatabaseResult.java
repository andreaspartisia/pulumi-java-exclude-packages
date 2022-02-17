// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.DatabaseTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatabaseResult {
    private final @Nullable String arn;
    /**
     * The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<DatabaseTag> tags;

    @OutputCustomType.Constructor({"arn","kmsKeyId","tags"})
    private GetDatabaseResult(
        @Nullable String arn,
        @Nullable String kmsKeyId,
        @Nullable List<DatabaseTag> tags) {
        this.arn = arn;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account.
     * 
     */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    public List<DatabaseTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String kmsKeyId;
        private @Nullable List<DatabaseTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setTags(@Nullable List<DatabaseTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDatabaseResult build() {
            return new GetDatabaseResult(arn, kmsKeyId, tags);
        }
    }
}