// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2PartitionIdResponse {
    private final String namespaceId;
    private final String project;

    @OutputCustomType.Constructor({"namespaceId","project"})
    private GooglePrivacyDlpV2PartitionIdResponse(
        String namespaceId,
        String project) {
        this.namespaceId = Objects.requireNonNull(namespaceId);
        this.project = Objects.requireNonNull(project);
    }

    public String getNamespaceId() {
        return this.namespaceId;
    }
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PartitionIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespaceId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PartitionIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.project = defaults.project;
        }

        public Builder setNamespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public GooglePrivacyDlpV2PartitionIdResponse build() {
            return new GooglePrivacyDlpV2PartitionIdResponse(namespaceId, project);
        }
    }
}