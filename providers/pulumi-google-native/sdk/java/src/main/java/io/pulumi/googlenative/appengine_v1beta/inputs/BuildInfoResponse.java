// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Google Cloud Build information.
 * 
 */
public final class BuildInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildInfoResponse Empty = new BuildInfoResponse();

    /**
     * The Google Cloud Build id. Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * 
     */
    @Import(name="cloudBuildId", required=true)
      private final String cloudBuildId;

    public String cloudBuildId() {
        return this.cloudBuildId;
    }

    public BuildInfoResponse(String cloudBuildId) {
        this.cloudBuildId = Objects.requireNonNull(cloudBuildId, "expected parameter 'cloudBuildId' to be non-null");
    }

    private BuildInfoResponse() {
        this.cloudBuildId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudBuildId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildId = defaults.cloudBuildId;
        }

        public Builder cloudBuildId(String cloudBuildId) {
            this.cloudBuildId = Objects.requireNonNull(cloudBuildId);
            return this;
        }        public BuildInfoResponse build() {
            return new BuildInfoResponse(cloudBuildId);
        }
    }
}
