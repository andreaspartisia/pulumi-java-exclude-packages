// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetadataAuthorResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataAuthorResponse Empty = new MetadataAuthorResponse();

    @InputImport(name="email")
    private final @Nullable String email;

    public Optional<String> getEmail() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    @InputImport(name="link")
    private final @Nullable String link;

    public Optional<String> getLink() {
        return this.link == null ? Optional.empty() : Optional.ofNullable(this.link);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public MetadataAuthorResponse(
        @Nullable String email,
        @Nullable String link,
        @Nullable String name) {
        this.email = email;
        this.link = link;
        this.name = name;
    }

    private MetadataAuthorResponse() {
        this.email = null;
        this.link = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataAuthorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String link;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataAuthorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.link = defaults.link;
    	      this.name = defaults.name;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = link;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public MetadataAuthorResponse build() {
            return new MetadataAuthorResponse(email, link, name);
        }
    }
}