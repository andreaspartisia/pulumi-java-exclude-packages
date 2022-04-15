// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.IngressFromIdentityType;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on information about the source of the request. The request must satisfy what is defined in `sources` AND identity related fields in order to match.
 * 
 */
public final class IngressFromArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressFromArgs Empty = new IngressFromArgs();

    /**
     * A list of identities that are allowed access through this ingress policy. Should be in the format of email address. The email address should represent individual user or service account only.
     * 
     */
    @Import(name="identities")
      private final @Nullable Output<List<String>> identities;

    public Output<List<String>> identities() {
        return this.identities == null ? Codegen.empty() : this.identities;
    }

    /**
     * Specifies the type of identities that are allowed access from outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
     * 
     */
    @Import(name="identityType")
      private final @Nullable Output<IngressFromIdentityType> identityType;

    public Output<IngressFromIdentityType> identityType() {
        return this.identityType == null ? Codegen.empty() : this.identityType;
    }

    /**
     * Sources that this IngressPolicy authorizes access from.
     * 
     */
    @Import(name="sources")
      private final @Nullable Output<List<IngressSourceArgs>> sources;

    public Output<List<IngressSourceArgs>> sources() {
        return this.sources == null ? Codegen.empty() : this.sources;
    }

    public IngressFromArgs(
        @Nullable Output<List<String>> identities,
        @Nullable Output<IngressFromIdentityType> identityType,
        @Nullable Output<List<IngressSourceArgs>> sources) {
        this.identities = identities;
        this.identityType = identityType;
        this.sources = sources;
    }

    private IngressFromArgs() {
        this.identities = Codegen.empty();
        this.identityType = Codegen.empty();
        this.sources = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> identities;
        private @Nullable Output<IngressFromIdentityType> identityType;
        private @Nullable Output<List<IngressSourceArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressFromArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        public Builder identities(@Nullable Output<List<String>> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(@Nullable List<String> identities) {
            this.identities = Codegen.ofNullable(identities);
            return this;
        }
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }
        public Builder identityType(@Nullable Output<IngressFromIdentityType> identityType) {
            this.identityType = identityType;
            return this;
        }
        public Builder identityType(@Nullable IngressFromIdentityType identityType) {
            this.identityType = Codegen.ofNullable(identityType);
            return this;
        }
        public Builder sources(@Nullable Output<List<IngressSourceArgs>> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(@Nullable List<IngressSourceArgs> sources) {
            this.sources = Codegen.ofNullable(sources);
            return this;
        }
        public Builder sources(IngressSourceArgs... sources) {
            return sources(List.of(sources));
        }        public IngressFromArgs build() {
            return new IngressFromArgs(identities, identityType, sources);
        }
    }
}
