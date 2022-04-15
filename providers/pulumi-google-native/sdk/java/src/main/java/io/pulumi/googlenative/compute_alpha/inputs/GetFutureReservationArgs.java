// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFutureReservationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFutureReservationArgs Empty = new GetFutureReservationArgs();

    @Import(name="futureReservation", required=true)
      private final String futureReservation;

    public String futureReservation() {
        return this.futureReservation;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public GetFutureReservationArgs(
        String futureReservation,
        @Nullable String project,
        String zone) {
        this.futureReservation = Objects.requireNonNull(futureReservation, "expected parameter 'futureReservation' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetFutureReservationArgs() {
        this.futureReservation = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFutureReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String futureReservation;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFutureReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.futureReservation = defaults.futureReservation;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder futureReservation(String futureReservation) {
            this.futureReservation = Objects.requireNonNull(futureReservation);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetFutureReservationArgs build() {
            return new GetFutureReservationArgs(futureReservation, project, zone);
        }
    }
}
