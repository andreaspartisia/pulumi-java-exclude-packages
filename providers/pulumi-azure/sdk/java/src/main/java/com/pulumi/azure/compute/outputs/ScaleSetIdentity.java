// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetIdentity {
    /**
     * @return Specifies a list of user managed identity ids to be assigned to the VMSS. Required if `type` is `UserAssigned`.
     * 
     */
    private final @Nullable List<String> identityIds;
    private final @Nullable String principalId;
    /**
     * @return Specifies the identity type to be assigned to the scale set. Allowable values are `SystemAssigned` and `UserAssigned`. For the `SystemAssigned` identity the scale set&#39;s Service Principal ID (SPN) can be retrieved after the scale set has been created. See [documentation](https://docs.microsoft.com/en-us/azure/active-directory/managed-service-identity/overview) for more information.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ScaleSetIdentity(
        @CustomType.Parameter("identityIds") @Nullable List<String> identityIds,
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("type") String type) {
        this.identityIds = identityIds;
        this.principalId = principalId;
        this.type = type;
    }

    /**
     * @return Specifies a list of user managed identity ids to be assigned to the VMSS. Required if `type` is `UserAssigned`.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds == null ? List.of() : this.identityIds;
    }
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return Specifies the identity type to be assigned to the scale set. Allowable values are `SystemAssigned` and `UserAssigned`. For the `SystemAssigned` identity the scale set&#39;s Service Principal ID (SPN) can be retrieved after the scale set has been created. See [documentation](https://docs.microsoft.com/en-us/azure/active-directory/managed-service-identity/overview) for more information.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> identityIds;
        private @Nullable String principalId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSetIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.type = defaults.type;
        }

        public Builder identityIds(@Nullable List<String> identityIds) {
            this.identityIds = identityIds;
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ScaleSetIdentity build() {
            return new ScaleSetIdentity(identityIds, principalId, type);
        }
    }
}
