// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBucketLifecycleRuleAction {
    private final String storageClass;
    private final String type;

    @OutputCustomType.Constructor
    private GetBucketLifecycleRuleAction(
        @OutputCustomType.Parameter("storageClass") String storageClass,
        @OutputCustomType.Parameter("type") String type) {
        this.storageClass = storageClass;
        this.type = type;
    }

    public String getStorageClass() {
        return this.storageClass;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketLifecycleRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String storageClass;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketLifecycleRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClass = defaults.storageClass;
    	      this.type = defaults.type;
        }

        public Builder setStorageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBucketLifecycleRuleAction build() {
            return new GetBucketLifecycleRuleAction(storageClass, type);
        }
    }
}
