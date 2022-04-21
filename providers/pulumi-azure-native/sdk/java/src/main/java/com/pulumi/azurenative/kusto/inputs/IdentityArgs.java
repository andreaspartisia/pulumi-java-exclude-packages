// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.azurenative.kusto.enums.IdentityType;
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
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove all identities.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,IdentityType>> type;

    public Output<Either<String,IdentityType>> type() {
        return this.type;
    }

    /**
     * The list of user identities associated with the Kusto cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private IdentityArgs() {}

    private IdentityArgs(IdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityArgs $;

        public Builder() {
            $ = new IdentityArgs();
        }

        public Builder(IdentityArgs defaults) {
            $ = new IdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<Either<String,IdentityType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,IdentityType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(IdentityType type) {
            return type(Either.ofRight(type));
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public IdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
