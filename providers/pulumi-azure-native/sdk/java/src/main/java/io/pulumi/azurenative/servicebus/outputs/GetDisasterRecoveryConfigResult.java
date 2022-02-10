// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDisasterRecoveryConfigResult {
    private final @Nullable String alternateName;
    private final String id;
    private final String name;
    private final @Nullable String partnerNamespace;
    private final Double pendingReplicationOperationsCount;
    private final String provisioningState;
    private final String role;
    private final String type;

    @OutputCustomType.Constructor({"alternateName","id","name","partnerNamespace","pendingReplicationOperationsCount","provisioningState","role","type"})
    private GetDisasterRecoveryConfigResult(
        @Nullable String alternateName,
        String id,
        String name,
        @Nullable String partnerNamespace,
        Double pendingReplicationOperationsCount,
        String provisioningState,
        String role,
        String type) {
        this.alternateName = alternateName;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.partnerNamespace = partnerNamespace;
        this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.role = Objects.requireNonNull(role);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAlternateName() {
        return Optional.ofNullable(this.alternateName);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPartnerNamespace() {
        return Optional.ofNullable(this.partnerNamespace);
    }
    public Double getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getRole() {
        return this.role;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisasterRecoveryConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternateName;
        private String id;
        private String name;
        private @Nullable String partnerNamespace;
        private Double pendingReplicationOperationsCount;
        private String provisioningState;
        private String role;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDisasterRecoveryConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateName = defaults.alternateName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.partnerNamespace = defaults.partnerNamespace;
    	      this.pendingReplicationOperationsCount = defaults.pendingReplicationOperationsCount;
    	      this.provisioningState = defaults.provisioningState;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
        }

        public Builder setAlternateName(@Nullable String alternateName) {
            this.alternateName = alternateName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerNamespace(@Nullable String partnerNamespace) {
            this.partnerNamespace = partnerNamespace;
            return this;
        }

        public Builder setPendingReplicationOperationsCount(Double pendingReplicationOperationsCount) {
            this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDisasterRecoveryConfigResult build() {
            return new GetDisasterRecoveryConfigResult(alternateName, id, name, partnerNamespace, pendingReplicationOperationsCount, provisioningState, role, type);
        }
    }
}