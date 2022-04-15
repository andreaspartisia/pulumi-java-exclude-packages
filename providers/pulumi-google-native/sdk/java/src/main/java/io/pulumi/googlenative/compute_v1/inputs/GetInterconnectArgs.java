// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterconnectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInterconnectArgs Empty = new GetInterconnectArgs();

    @Import(name="interconnect", required=true)
      private final String interconnect;

    public String interconnect() {
        return this.interconnect;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetInterconnectArgs(
        String interconnect,
        @Nullable String project) {
        this.interconnect = Objects.requireNonNull(interconnect, "expected parameter 'interconnect' to be non-null");
        this.project = project;
    }

    private GetInterconnectArgs() {
        this.interconnect = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnect;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInterconnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnect = defaults.interconnect;
    	      this.project = defaults.project;
        }

        public Builder interconnect(String interconnect) {
            this.interconnect = Objects.requireNonNull(interconnect);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetInterconnectArgs build() {
            return new GetInterconnectArgs(interconnect, project);
        }
    }
}
