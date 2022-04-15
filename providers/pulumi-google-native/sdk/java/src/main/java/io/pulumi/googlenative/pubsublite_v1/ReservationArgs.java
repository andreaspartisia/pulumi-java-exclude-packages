// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="reservationId", required=true)
      private final Output<String> reservationId;

    public Output<String> reservationId() {
        return this.reservationId;
    }

    /**
     * The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
     * 
     */
    @Import(name="throughputCapacity")
      private final @Nullable Output<String> throughputCapacity;

    public Output<String> throughputCapacity() {
        return this.throughputCapacity == null ? Codegen.empty() : this.throughputCapacity;
    }

    public ReservationArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> reservationId,
        @Nullable Output<String> throughputCapacity) {
        this.location = location;
        this.name = name;
        this.project = project;
        this.reservationId = Objects.requireNonNull(reservationId, "expected parameter 'reservationId' to be non-null");
        this.throughputCapacity = throughputCapacity;
    }

    private ReservationArgs() {
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.reservationId = Codegen.empty();
        this.throughputCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> reservationId;
        private @Nullable Output<String> throughputCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservationId = defaults.reservationId;
    	      this.throughputCapacity = defaults.throughputCapacity;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder reservationId(Output<String> reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }
        public Builder reservationId(String reservationId) {
            this.reservationId = Output.of(Objects.requireNonNull(reservationId));
            return this;
        }
        public Builder throughputCapacity(@Nullable Output<String> throughputCapacity) {
            this.throughputCapacity = throughputCapacity;
            return this;
        }
        public Builder throughputCapacity(@Nullable String throughputCapacity) {
            this.throughputCapacity = Codegen.ofNullable(throughputCapacity);
            return this;
        }        public ReservationArgs build() {
            return new ReservationArgs(location, name, project, reservationId, throughputCapacity);
        }
    }
}
