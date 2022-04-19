// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BasicAuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final BasicAuthenticationResponse Empty = new BasicAuthenticationResponse();

    /**
     * Gets or sets the password, return value will always be empty.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'Basic'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Gets or sets the username.
     * 
     */
    @Import(name="username")
      private final @Nullable String username;

    public Optional<String> username() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public BasicAuthenticationResponse(
        @Nullable String password,
        String type,
        @Nullable String username) {
        this.password = password;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.username = username;
    }

    private BasicAuthenticationResponse() {
        this.password = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String type;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public BasicAuthenticationResponse build() {
            return new BasicAuthenticationResponse(password, type, username);
        }
    }
}
