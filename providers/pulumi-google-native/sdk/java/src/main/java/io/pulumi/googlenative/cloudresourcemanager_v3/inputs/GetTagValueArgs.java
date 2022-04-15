// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagValueArgs Empty = new GetTagValueArgs();

    @Import(name="tagValueId", required=true)
      private final String tagValueId;

    public String tagValueId() {
        return this.tagValueId;
    }

    public GetTagValueArgs(String tagValueId) {
        this.tagValueId = Objects.requireNonNull(tagValueId, "expected parameter 'tagValueId' to be non-null");
    }

    private GetTagValueArgs() {
        this.tagValueId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagValueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagValueId = defaults.tagValueId;
        }

        public Builder tagValueId(String tagValueId) {
            this.tagValueId = Objects.requireNonNull(tagValueId);
            return this;
        }        public GetTagValueArgs build() {
            return new GetTagValueArgs(tagValueId);
        }
    }
}
