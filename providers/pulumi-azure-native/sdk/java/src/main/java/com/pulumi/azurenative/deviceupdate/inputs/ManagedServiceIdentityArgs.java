// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.azurenative.deviceupdate.enums.ManagedServiceIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed service identity (system assigned and/or user assigned identities)
 * 
 */
public final class ManagedServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedServiceIdentityArgs Empty = new ManagedServiceIdentityArgs();

    /**
     * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ManagedServiceIdentityType>> type;

    public Output<Either<String,ManagedServiceIdentityType>> type() {
        return this.type;
    }

    /**
     * The set of user assigned identities associated with the resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}. The dictionary values can be empty objects ({}) in requests.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ManagedServiceIdentityArgs() {}

    private ManagedServiceIdentityArgs(ManagedServiceIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedServiceIdentityArgs $;

        public Builder() {
            $ = new ManagedServiceIdentityArgs();
        }

        public Builder(ManagedServiceIdentityArgs defaults) {
            $ = new ManagedServiceIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<Either<String,ManagedServiceIdentityType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ManagedServiceIdentityType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(ManagedServiceIdentityType type) {
            return type(Either.ofRight(type));
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public ManagedServiceIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
