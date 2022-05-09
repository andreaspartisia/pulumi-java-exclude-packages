// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlotSiteCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlotSiteCredentialArgs Empty = new SlotSiteCredentialArgs();

    /**
     * The password associated with the username, which can be used to publish to this App Service.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password associated with the username, which can be used to publish to this App Service.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The username which can be used to publish to this App Service
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username which can be used to publish to this App Service
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private SlotSiteCredentialArgs() {}

    private SlotSiteCredentialArgs(SlotSiteCredentialArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlotSiteCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlotSiteCredentialArgs $;

        public Builder() {
            $ = new SlotSiteCredentialArgs();
        }

        public Builder(SlotSiteCredentialArgs defaults) {
            $ = new SlotSiteCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password associated with the username, which can be used to publish to this App Service.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password associated with the username, which can be used to publish to this App Service.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The username which can be used to publish to this App Service
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username which can be used to publish to this App Service
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SlotSiteCredentialArgs build() {
            return $;
        }
    }

}
