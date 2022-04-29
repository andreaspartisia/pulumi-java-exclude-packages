// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionAdminCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAdminCredentialsArgs Empty = new ConnectionAdminCredentialsArgs();

    /**
     * (Updatable) Administrator password
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return (Updatable) Administrator password
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * (Updatable) Administrator username
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return (Updatable) Administrator username
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ConnectionAdminCredentialsArgs() {}

    private ConnectionAdminCredentialsArgs(ConnectionAdminCredentialsArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAdminCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAdminCredentialsArgs $;

        public Builder() {
            $ = new ConnectionAdminCredentialsArgs();
        }

        public Builder(ConnectionAdminCredentialsArgs defaults) {
            $ = new ConnectionAdminCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password (Updatable) Administrator password
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password (Updatable) Administrator password
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username (Updatable) Administrator username
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username (Updatable) Administrator username
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ConnectionAdminCredentialsArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
