// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.AppType;
import com.pulumi.azurenative.apimanagement.enums.Confirmation;
import com.pulumi.azurenative.apimanagement.enums.UserState;
import com.pulumi.azurenative.apimanagement.inputs.UserIdentityContractArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Determines the type of application which send the create user request. Default is legacy portal.
     * 
     */
    @Import(name="appType")
    private @Nullable Output<Either<String,AppType>> appType;

    public Optional<Output<Either<String,AppType>>> appType() {
        return Optional.ofNullable(this.appType);
    }

    /**
     * Determines the type of confirmation e-mail that will be sent to the newly created user.
     * 
     */
    @Import(name="confirmation")
    private @Nullable Output<Either<String,Confirmation>> confirmation;

    public Optional<Output<Either<String,Confirmation>>> confirmation() {
        return Optional.ofNullable(this.confirmation);
    }

    /**
     * Email address. Must not be empty and must be unique within the service instance.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    public Output<String> email() {
        return this.email;
    }

    /**
     * First name.
     * 
     */
    @Import(name="firstName", required=true)
    private Output<String> firstName;

    public Output<String> firstName() {
        return this.firstName;
    }

    /**
     * Collection of user identities.
     * 
     */
    @Import(name="identities")
    private @Nullable Output<List<UserIdentityContractArgs>> identities;

    public Optional<Output<List<UserIdentityContractArgs>>> identities() {
        return Optional.ofNullable(this.identities);
    }

    /**
     * Last name.
     * 
     */
    @Import(name="lastName", required=true)
    private Output<String> lastName;

    public Output<String> lastName() {
        return this.lastName;
    }

    /**
     * Optional note about a user set by the administrator.
     * 
     */
    @Import(name="note")
    private @Nullable Output<String> note;

    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * Send an Email notification to the User.
     * 
     */
    @Import(name="notify")
    private @Nullable Output<Boolean> notify;

    public Optional<Output<Boolean>> notify_() {
        return Optional.ofNullable(this.notify);
    }

    /**
     * User Password. If no value is provided, a default password is generated.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,UserState>> state;

    public Optional<Output<Either<String,UserState>>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.appType = $.appType;
        this.confirmation = $.confirmation;
        this.email = $.email;
        this.firstName = $.firstName;
        this.identities = $.identities;
        this.lastName = $.lastName;
        this.note = $.note;
        this.notify = $.notify;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.state = $.state;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        public Builder appType(@Nullable Output<Either<String,AppType>> appType) {
            $.appType = appType;
            return this;
        }

        public Builder appType(Either<String,AppType> appType) {
            return appType(Output.of(appType));
        }

        public Builder appType(String appType) {
            return appType(Either.ofLeft(appType));
        }

        public Builder appType(AppType appType) {
            return appType(Either.ofRight(appType));
        }

        public Builder confirmation(@Nullable Output<Either<String,Confirmation>> confirmation) {
            $.confirmation = confirmation;
            return this;
        }

        public Builder confirmation(Either<String,Confirmation> confirmation) {
            return confirmation(Output.of(confirmation));
        }

        public Builder confirmation(String confirmation) {
            return confirmation(Either.ofLeft(confirmation));
        }

        public Builder confirmation(Confirmation confirmation) {
            return confirmation(Either.ofRight(confirmation));
        }

        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder firstName(Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        public Builder identities(@Nullable Output<List<UserIdentityContractArgs>> identities) {
            $.identities = identities;
            return this;
        }

        public Builder identities(List<UserIdentityContractArgs> identities) {
            return identities(Output.of(identities));
        }

        public Builder identities(UserIdentityContractArgs... identities) {
            return identities(List.of(identities));
        }

        public Builder lastName(Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        public Builder note(String note) {
            return note(Output.of(note));
        }

        public Builder notify_(@Nullable Output<Boolean> notify) {
            $.notify = notify;
            return this;
        }

        public Builder notify_(Boolean notify) {
            return notify_(Output.of(notify));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder state(@Nullable Output<Either<String,UserState>> state) {
            $.state = state;
            return this;
        }

        public Builder state(Either<String,UserState> state) {
            return state(Output.of(state));
        }

        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        public Builder state(UserState state) {
            return state(Either.ofRight(state));
        }

        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.firstName = Objects.requireNonNull($.firstName, "expected parameter 'firstName' to be non-null");
            $.lastName = Objects.requireNonNull($.lastName, "expected parameter 'lastName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.state = Codegen.stringProp("state").left(UserState.class).output().arg($.state).def("active").getNullable();
            return $;
        }
    }

}
