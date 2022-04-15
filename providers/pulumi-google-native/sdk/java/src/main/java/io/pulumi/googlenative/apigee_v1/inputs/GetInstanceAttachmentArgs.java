// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceAttachmentArgs Empty = new GetInstanceAttachmentArgs();

    @Import(name="attachmentId", required=true)
      private final String attachmentId;

    public String attachmentId() {
        return this.attachmentId;
    }

    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    public GetInstanceAttachmentArgs(
        String attachmentId,
        String instanceId,
        String organizationId) {
        this.attachmentId = Objects.requireNonNull(attachmentId, "expected parameter 'attachmentId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetInstanceAttachmentArgs() {
        this.attachmentId = null;
        this.instanceId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachmentId;
        private String instanceId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.instanceId = defaults.instanceId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder attachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GetInstanceAttachmentArgs build() {
            return new GetInstanceAttachmentArgs(attachmentId, instanceId, organizationId);
        }
    }
}
