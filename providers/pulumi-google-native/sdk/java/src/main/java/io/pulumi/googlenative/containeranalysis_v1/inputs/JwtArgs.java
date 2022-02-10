// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JwtArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtArgs Empty = new JwtArgs();

    @InputImport(name="compactJwt")
    private final @Nullable Input<String> compactJwt;

    public Input<String> getCompactJwt() {
        return this.compactJwt == null ? Input.empty() : this.compactJwt;
    }

    public JwtArgs(@Nullable Input<String> compactJwt) {
        this.compactJwt = compactJwt;
    }

    private JwtArgs() {
        this.compactJwt = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> compactJwt;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compactJwt = defaults.compactJwt;
        }

        public Builder setCompactJwt(@Nullable Input<String> compactJwt) {
            this.compactJwt = compactJwt;
            return this;
        }

        public Builder setCompactJwt(@Nullable String compactJwt) {
            this.compactJwt = Input.ofNullable(compactJwt);
            return this;
        }

        public JwtArgs build() {
            return new JwtArgs(compactJwt);
        }
    }
}