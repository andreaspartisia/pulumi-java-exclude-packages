// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.IngressFromIdentityType;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IngressFromArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressFromArgs Empty = new IngressFromArgs();

    @InputImport(name="identities")
    private final @Nullable Input<List<String>> identities;

    public Input<List<String>> getIdentities() {
        return this.identities == null ? Input.empty() : this.identities;
    }

    @InputImport(name="identityType")
    private final @Nullable Input<IngressFromIdentityType> identityType;

    public Input<IngressFromIdentityType> getIdentityType() {
        return this.identityType == null ? Input.empty() : this.identityType;
    }

    @InputImport(name="sources")
    private final @Nullable Input<List<IngressSourceArgs>> sources;

    public Input<List<IngressSourceArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    public IngressFromArgs(
        @Nullable Input<List<String>> identities,
        @Nullable Input<IngressFromIdentityType> identityType,
        @Nullable Input<List<IngressSourceArgs>> sources) {
        this.identities = identities;
        this.identityType = identityType;
        this.sources = sources;
    }

    private IngressFromArgs() {
        this.identities = Input.empty();
        this.identityType = Input.empty();
        this.sources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> identities;
        private @Nullable Input<IngressFromIdentityType> identityType;
        private @Nullable Input<List<IngressSourceArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressFromArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        public Builder setIdentities(@Nullable Input<List<String>> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setIdentities(@Nullable List<String> identities) {
            this.identities = Input.ofNullable(identities);
            return this;
        }

        public Builder setIdentityType(@Nullable Input<IngressFromIdentityType> identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setIdentityType(@Nullable IngressFromIdentityType identityType) {
            this.identityType = Input.ofNullable(identityType);
            return this;
        }

        public Builder setSources(@Nullable Input<List<IngressSourceArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setSources(@Nullable List<IngressSourceArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }

        public IngressFromArgs build() {
            return new IngressFromArgs(identities, identityType, sources);
        }
    }
}