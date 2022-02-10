// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.ResourceRecordSetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetChangeResult {
    private final List<ResourceRecordSetResponse> additions;
    private final List<ResourceRecordSetResponse> deletions;
    private final Boolean isServing;
    private final String kind;
    private final String startTime;
    private final String status;

    @OutputCustomType.Constructor({"additions","deletions","isServing","kind","startTime","status"})
    private GetChangeResult(
        List<ResourceRecordSetResponse> additions,
        List<ResourceRecordSetResponse> deletions,
        Boolean isServing,
        String kind,
        String startTime,
        String status) {
        this.additions = Objects.requireNonNull(additions);
        this.deletions = Objects.requireNonNull(deletions);
        this.isServing = Objects.requireNonNull(isServing);
        this.kind = Objects.requireNonNull(kind);
        this.startTime = Objects.requireNonNull(startTime);
        this.status = Objects.requireNonNull(status);
    }

    public List<ResourceRecordSetResponse> getAdditions() {
        return this.additions;
    }
    public List<ResourceRecordSetResponse> getDeletions() {
        return this.deletions;
    }
    public Boolean getIsServing() {
        return this.isServing;
    }
    public String getKind() {
        return this.kind;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChangeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourceRecordSetResponse> additions;
        private List<ResourceRecordSetResponse> deletions;
        private Boolean isServing;
        private String kind;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChangeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additions = defaults.additions;
    	      this.deletions = defaults.deletions;
    	      this.isServing = defaults.isServing;
    	      this.kind = defaults.kind;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setAdditions(List<ResourceRecordSetResponse> additions) {
            this.additions = Objects.requireNonNull(additions);
            return this;
        }

        public Builder setDeletions(List<ResourceRecordSetResponse> deletions) {
            this.deletions = Objects.requireNonNull(deletions);
            return this;
        }

        public Builder setIsServing(Boolean isServing) {
            this.isServing = Objects.requireNonNull(isServing);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public GetChangeResult build() {
            return new GetChangeResult(additions, deletions, isServing, kind, startTime, status);
        }
    }
}