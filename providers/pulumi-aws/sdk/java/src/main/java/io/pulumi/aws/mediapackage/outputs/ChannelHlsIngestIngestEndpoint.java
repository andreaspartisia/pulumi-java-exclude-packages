// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediapackage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChannelHlsIngestIngestEndpoint {
    /**
     * The password
     * 
     */
    private final @Nullable String password;
    /**
     * The URL
     * 
     */
    private final @Nullable String url;
    /**
     * The username
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor
    private ChannelHlsIngestIngestEndpoint(
        @OutputCustomType.Parameter("password") @Nullable String password,
        @OutputCustomType.Parameter("url") @Nullable String url,
        @OutputCustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.url = url;
        this.username = username;
    }

    /**
     * The password
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The URL
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    /**
     * The username
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelHlsIngestIngestEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelHlsIngestIngestEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ChannelHlsIngestIngestEndpoint build() {
            return new ChannelHlsIngestIngestEndpoint(password, url, username);
        }
    }
}