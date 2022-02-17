// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigDefaultKeySpecGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneDnssecConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneDnssecConfigGetArgs Empty = new ManagedZoneDnssecConfigGetArgs();

    /**
     * Specifies parameters that will be used for generating initial DnsKeys
     * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     * you must also provide one for the other.
     * default_key_specs can only be updated when the state is `off`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultKeySpecs")
    private final @Nullable Input<List<ManagedZoneDnssecConfigDefaultKeySpecGetArgs>> defaultKeySpecs;

    public Input<List<ManagedZoneDnssecConfigDefaultKeySpecGetArgs>> getDefaultKeySpecs() {
        return this.defaultKeySpecs == null ? Input.empty() : this.defaultKeySpecs;
    }

    /**
     * Identifies what kind of resource this is
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Specifies the mechanism used to provide authenticated denial-of-existence responses.
     * non_existence can only be updated when the state is `off`.
     * Possible values are `nsec` and `nsec3`.
     * 
     */
    @InputImport(name="nonExistence")
    private final @Nullable Input<String> nonExistence;

    public Input<String> getNonExistence() {
        return this.nonExistence == null ? Input.empty() : this.nonExistence;
    }

    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in
     * Possible values are `off`, `on`, and `transfer`.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public ManagedZoneDnssecConfigGetArgs(
        @Nullable Input<List<ManagedZoneDnssecConfigDefaultKeySpecGetArgs>> defaultKeySpecs,
        @Nullable Input<String> kind,
        @Nullable Input<String> nonExistence,
        @Nullable Input<String> state) {
        this.defaultKeySpecs = defaultKeySpecs;
        this.kind = kind;
        this.nonExistence = nonExistence;
        this.state = state;
    }

    private ManagedZoneDnssecConfigGetArgs() {
        this.defaultKeySpecs = Input.empty();
        this.kind = Input.empty();
        this.nonExistence = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnssecConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ManagedZoneDnssecConfigDefaultKeySpecGetArgs>> defaultKeySpecs;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> nonExistence;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnssecConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKeySpecs = defaults.defaultKeySpecs;
    	      this.kind = defaults.kind;
    	      this.nonExistence = defaults.nonExistence;
    	      this.state = defaults.state;
        }

        public Builder setDefaultKeySpecs(@Nullable Input<List<ManagedZoneDnssecConfigDefaultKeySpecGetArgs>> defaultKeySpecs) {
            this.defaultKeySpecs = defaultKeySpecs;
            return this;
        }

        public Builder setDefaultKeySpecs(@Nullable List<ManagedZoneDnssecConfigDefaultKeySpecGetArgs> defaultKeySpecs) {
            this.defaultKeySpecs = Input.ofNullable(defaultKeySpecs);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setNonExistence(@Nullable Input<String> nonExistence) {
            this.nonExistence = nonExistence;
            return this;
        }

        public Builder setNonExistence(@Nullable String nonExistence) {
            this.nonExistence = Input.ofNullable(nonExistence);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public ManagedZoneDnssecConfigGetArgs build() {
            return new ManagedZoneDnssecConfigGetArgs(defaultKeySpecs, kind, nonExistence, state);
        }
    }
}