// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.aws.kms.outputs.GetKeyMultiRegionConfigurationPrimaryKey;
import io.pulumi.aws.kms.outputs.GetKeyMultiRegionConfigurationReplicaKey;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetKeyMultiRegionConfiguration {
    private final String multiRegionKeyType;
    private final List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys;
    private final List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys;

    @OutputCustomType.Constructor
    private GetKeyMultiRegionConfiguration(
        @OutputCustomType.Parameter("multiRegionKeyType") String multiRegionKeyType,
        @OutputCustomType.Parameter("primaryKeys") List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys,
        @OutputCustomType.Parameter("replicaKeys") List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys) {
        this.multiRegionKeyType = multiRegionKeyType;
        this.primaryKeys = primaryKeys;
        this.replicaKeys = replicaKeys;
    }

    public String getMultiRegionKeyType() {
        return this.multiRegionKeyType;
    }
    public List<GetKeyMultiRegionConfigurationPrimaryKey> getPrimaryKeys() {
        return this.primaryKeys;
    }
    public List<GetKeyMultiRegionConfigurationReplicaKey> getReplicaKeys() {
        return this.replicaKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyMultiRegionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String multiRegionKeyType;
        private List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys;
        private List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyMultiRegionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiRegionKeyType = defaults.multiRegionKeyType;
    	      this.primaryKeys = defaults.primaryKeys;
    	      this.replicaKeys = defaults.replicaKeys;
        }

        public Builder setMultiRegionKeyType(String multiRegionKeyType) {
            this.multiRegionKeyType = Objects.requireNonNull(multiRegionKeyType);
            return this;
        }

        public Builder setPrimaryKeys(List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys) {
            this.primaryKeys = Objects.requireNonNull(primaryKeys);
            return this;
        }

        public Builder setReplicaKeys(List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys) {
            this.replicaKeys = Objects.requireNonNull(replicaKeys);
            return this;
        }
        public GetKeyMultiRegionConfiguration build() {
            return new GetKeyMultiRegionConfiguration(multiRegionKeyType, primaryKeys, replicaKeys);
        }
    }
}