// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceConnectionTrackingPolicy {
    /**
     * Specifies connection persistence when backends are unhealthy.
     * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
     * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
     * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
     * or the Session Affinity is configured for 5-tuple. They do not persist
     * for UDP.
     * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
     * connections on the unhealthy backend are never persisted on the unhealthy
     * backend. They are always diverted to newly selected healthy backends
     * (unless all backends are unhealthy).
     * If set to `ALWAYS_PERSIST`, existing connections always persist on
     * unhealthy backends regardless of protocol and session affinity. It is
     * generally not recommended to use this mode overriding the default.
     * Default value is `DEFAULT_FOR_PROTOCOL`.
     * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
     * 
     */
    private final @Nullable String connectionPersistenceOnUnhealthyBackends;
    /**
     * Specifies how long to keep a Connection Tracking entry while there is
     * no matching traffic (in seconds).
     * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
     * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
     * 
     */
    private final @Nullable Integer idleTimeoutSec;
    /**
     * Specifies the key used for connection tracking. There are two options:
     * `PER_CONNECTION`: The Connection Tracking is performed as per the
     * Connection Key (default Hash Method) for the specific protocol.
     * `PER_SESSION`: The Connection Tracking is performed as per the
     * configured Session Affinity. It matches the configured Session Affinity.
     * Default value is `PER_CONNECTION`.
     * Possible values are `PER_CONNECTION` and `PER_SESSION`.
     * 
     */
    private final @Nullable String trackingMode;

    @OutputCustomType.Constructor
    private RegionBackendServiceConnectionTrackingPolicy(
        @OutputCustomType.Parameter("connectionPersistenceOnUnhealthyBackends") @Nullable String connectionPersistenceOnUnhealthyBackends,
        @OutputCustomType.Parameter("idleTimeoutSec") @Nullable Integer idleTimeoutSec,
        @OutputCustomType.Parameter("trackingMode") @Nullable String trackingMode) {
        this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
        this.idleTimeoutSec = idleTimeoutSec;
        this.trackingMode = trackingMode;
    }

    /**
     * Specifies connection persistence when backends are unhealthy.
     * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
     * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
     * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
     * or the Session Affinity is configured for 5-tuple. They do not persist
     * for UDP.
     * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
     * connections on the unhealthy backend are never persisted on the unhealthy
     * backend. They are always diverted to newly selected healthy backends
     * (unless all backends are unhealthy).
     * If set to `ALWAYS_PERSIST`, existing connections always persist on
     * unhealthy backends regardless of protocol and session affinity. It is
     * generally not recommended to use this mode overriding the default.
     * Default value is `DEFAULT_FOR_PROTOCOL`.
     * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
     * 
    */
    public Optional<String> getConnectionPersistenceOnUnhealthyBackends() {
        return Optional.ofNullable(this.connectionPersistenceOnUnhealthyBackends);
    }
    /**
     * Specifies how long to keep a Connection Tracking entry while there is
     * no matching traffic (in seconds).
     * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
     * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
     * 
    */
    public Optional<Integer> getIdleTimeoutSec() {
        return Optional.ofNullable(this.idleTimeoutSec);
    }
    /**
     * Specifies the key used for connection tracking. There are two options:
     * `PER_CONNECTION`: The Connection Tracking is performed as per the
     * Connection Key (default Hash Method) for the specific protocol.
     * `PER_SESSION`: The Connection Tracking is performed as per the
     * configured Session Affinity. It matches the configured Session Affinity.
     * Default value is `PER_CONNECTION`.
     * Possible values are `PER_CONNECTION` and `PER_SESSION`.
     * 
    */
    public Optional<String> getTrackingMode() {
        return Optional.ofNullable(this.trackingMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConnectionTrackingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectionPersistenceOnUnhealthyBackends;
        private @Nullable Integer idleTimeoutSec;
        private @Nullable String trackingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConnectionTrackingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPersistenceOnUnhealthyBackends = defaults.connectionPersistenceOnUnhealthyBackends;
    	      this.idleTimeoutSec = defaults.idleTimeoutSec;
    	      this.trackingMode = defaults.trackingMode;
        }

        public Builder setConnectionPersistenceOnUnhealthyBackends(@Nullable String connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            return this;
        }

        public Builder setIdleTimeoutSec(@Nullable Integer idleTimeoutSec) {
            this.idleTimeoutSec = idleTimeoutSec;
            return this;
        }

        public Builder setTrackingMode(@Nullable String trackingMode) {
            this.trackingMode = trackingMode;
            return this;
        }
        public RegionBackendServiceConnectionTrackingPolicy build() {
            return new RegionBackendServiceConnectionTrackingPolicy(connectionPersistenceOnUnhealthyBackends, idleTimeoutSec, trackingMode);
        }
    }
}
