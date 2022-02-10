// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.PasswordResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegistryListCredentialsResultResponse {
    private final String location;
    private final @Nullable List<PasswordResponse> passwords;
    private final String username;

    @OutputCustomType.Constructor({"location","passwords","username"})
    private RegistryListCredentialsResultResponse(
        String location,
        @Nullable List<PasswordResponse> passwords,
        String username) {
        this.location = Objects.requireNonNull(location);
        this.passwords = passwords;
        this.username = Objects.requireNonNull(username);
    }

    public String getLocation() {
        return this.location;
    }
    public List<PasswordResponse> getPasswords() {
        return this.passwords == null ? List.of() : this.passwords;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryListCredentialsResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable List<PasswordResponse> passwords;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryListCredentialsResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.passwords = defaults.passwords;
    	      this.username = defaults.username;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setPasswords(@Nullable List<PasswordResponse> passwords) {
            this.passwords = passwords;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public RegistryListCredentialsResultResponse build() {
            return new RegistryListCredentialsResultResponse(location, passwords, username);
        }
    }
}