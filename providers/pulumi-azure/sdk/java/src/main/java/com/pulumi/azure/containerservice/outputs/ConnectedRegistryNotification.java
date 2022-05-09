// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectedRegistryNotification {
    /**
     * @return The action of the artifact that wants to be subscribed for the Connected Registry. Possible values are `push`, `delete` and `*` (i.e. any).
     * 
     */
    private final String action;
    /**
     * @return The digest of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    private final @Nullable String digest;
    /**
     * @return The name of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    private final String name;
    /**
     * @return The tag of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    private final @Nullable String tag;

    @CustomType.Constructor
    private ConnectedRegistryNotification(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("digest") @Nullable String digest,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tag") @Nullable String tag) {
        this.action = action;
        this.digest = digest;
        this.name = name;
        this.tag = tag;
    }

    /**
     * @return The action of the artifact that wants to be subscribed for the Connected Registry. Possible values are `push`, `delete` and `*` (i.e. any).
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The digest of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    public Optional<String> digest() {
        return Optional.ofNullable(this.digest);
    }
    /**
     * @return The name of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The tag of the artifact that wants to be subscribed for the Connected Registry.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedRegistryNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String digest;
        private String name;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedRegistryNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
    	      this.tag = defaults.tag;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder digest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }        public ConnectedRegistryNotification build() {
            return new ConnectedRegistryNotification(action, digest, name, tag);
        }
    }
}
