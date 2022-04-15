// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOccurrenceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOccurrenceArgs Empty = new GetOccurrenceArgs();

    @Import(name="occurrenceId", required=true)
      private final String occurrenceId;

    public String occurrenceId() {
        return this.occurrenceId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetOccurrenceArgs(
        String occurrenceId,
        @Nullable String project) {
        this.occurrenceId = Objects.requireNonNull(occurrenceId, "expected parameter 'occurrenceId' to be non-null");
        this.project = project;
    }

    private GetOccurrenceArgs() {
        this.occurrenceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String occurrenceId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.occurrenceId = defaults.occurrenceId;
    	      this.project = defaults.project;
        }

        public Builder occurrenceId(String occurrenceId) {
            this.occurrenceId = Objects.requireNonNull(occurrenceId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetOccurrenceArgs build() {
            return new GetOccurrenceArgs(occurrenceId, project);
        }
    }
}
