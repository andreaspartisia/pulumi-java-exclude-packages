// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadArgs Empty = new GetWorkloadArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="workloadId", required=true)
      private final String workloadId;

    public String workloadId() {
        return this.workloadId;
    }

    public GetWorkloadArgs(
        String location,
        String organizationId,
        String workloadId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.workloadId = Objects.requireNonNull(workloadId, "expected parameter 'workloadId' to be non-null");
    }

    private GetWorkloadArgs() {
        this.location = null;
        this.organizationId = null;
        this.workloadId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String organizationId;
        private String workloadId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.organizationId = defaults.organizationId;
    	      this.workloadId = defaults.workloadId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder workloadId(String workloadId) {
            this.workloadId = Objects.requireNonNull(workloadId);
            return this;
        }        public GetWorkloadArgs build() {
            return new GetWorkloadArgs(location, organizationId, workloadId);
        }
    }
}
