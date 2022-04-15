// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagValueIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagValueIamPolicyArgs Empty = new GetTagValueIamPolicyArgs();

    @Import(name="tagValueId", required=true)
      private final String tagValueId;

    public String tagValueId() {
        return this.tagValueId;
    }

    public GetTagValueIamPolicyArgs(String tagValueId) {
        this.tagValueId = Objects.requireNonNull(tagValueId, "expected parameter 'tagValueId' to be non-null");
    }

    private GetTagValueIamPolicyArgs() {
        this.tagValueId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagValueIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagValueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagValueIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagValueId = defaults.tagValueId;
        }

        public Builder tagValueId(String tagValueId) {
            this.tagValueId = Objects.requireNonNull(tagValueId);
            return this;
        }        public GetTagValueIamPolicyArgs build() {
            return new GetTagValueIamPolicyArgs(tagValueId);
        }
    }
}
