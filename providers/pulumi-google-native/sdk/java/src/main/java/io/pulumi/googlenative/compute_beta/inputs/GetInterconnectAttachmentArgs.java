// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterconnectAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInterconnectAttachmentArgs Empty = new GetInterconnectAttachmentArgs();

    @Import(name="interconnectAttachment", required=true)
      private final String interconnectAttachment;

    public String interconnectAttachment() {
        return this.interconnectAttachment;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    public GetInterconnectAttachmentArgs(
        String interconnectAttachment,
        @Nullable String project,
        String region) {
        this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment, "expected parameter 'interconnectAttachment' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetInterconnectAttachmentArgs() {
        this.interconnectAttachment = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterconnectAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnectAttachment;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInterconnectAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder interconnectAttachment(String interconnectAttachment) {
            this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetInterconnectAttachmentArgs build() {
            return new GetInterconnectAttachmentArgs(interconnectAttachment, project, region);
        }
    }
}
