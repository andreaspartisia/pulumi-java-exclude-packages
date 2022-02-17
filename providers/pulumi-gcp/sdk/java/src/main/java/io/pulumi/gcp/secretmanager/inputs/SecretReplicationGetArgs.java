// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretReplicationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretReplicationGetArgs Empty = new SecretReplicationGetArgs();

    /**
     * The Secret will automatically be replicated without any restrictions.
     * 
     */
    @InputImport(name="automatic")
    private final @Nullable Input<Boolean> automatic;

    public Input<Boolean> getAutomatic() {
        return this.automatic == null ? Input.empty() : this.automatic;
    }

    /**
     * The Secret will automatically be replicated without any restrictions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="userManaged")
    private final @Nullable Input<SecretReplicationUserManagedGetArgs> userManaged;

    public Input<SecretReplicationUserManagedGetArgs> getUserManaged() {
        return this.userManaged == null ? Input.empty() : this.userManaged;
    }

    public SecretReplicationGetArgs(
        @Nullable Input<Boolean> automatic,
        @Nullable Input<SecretReplicationUserManagedGetArgs> userManaged) {
        this.automatic = automatic;
        this.userManaged = userManaged;
    }

    private SecretReplicationGetArgs() {
        this.automatic = Input.empty();
        this.userManaged = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> automatic;
        private @Nullable Input<SecretReplicationUserManagedGetArgs> userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder setAutomatic(@Nullable Input<Boolean> automatic) {
            this.automatic = automatic;
            return this;
        }

        public Builder setAutomatic(@Nullable Boolean automatic) {
            this.automatic = Input.ofNullable(automatic);
            return this;
        }

        public Builder setUserManaged(@Nullable Input<SecretReplicationUserManagedGetArgs> userManaged) {
            this.userManaged = userManaged;
            return this;
        }

        public Builder setUserManaged(@Nullable SecretReplicationUserManagedGetArgs userManaged) {
            this.userManaged = Input.ofNullable(userManaged);
            return this;
        }

        public SecretReplicationGetArgs build() {
            return new SecretReplicationGetArgs(automatic, userManaged);
        }
    }
}