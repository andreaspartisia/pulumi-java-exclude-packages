// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.enums.AccessPolicyEccAlgo;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Required validation properties for tokens generated with Elliptical Curve algorithm.
 * 
 */
public final class EccTokenKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EccTokenKeyArgs Empty = new EccTokenKeyArgs();

    /**
     * Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     * 
     */
    @Import(name="alg", required=true)
    private Output<Either<String,AccessPolicyEccAlgo>> alg;

    public Output<Either<String,AccessPolicyEccAlgo>> alg() {
        return this.alg;
    }

    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    @Import(name="kid", required=true)
    private Output<String> kid;

    public Output<String> kid() {
        return this.kid;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.EccTokenKey&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * X coordinate.
     * 
     */
    @Import(name="x", required=true)
    private Output<String> x;

    public Output<String> x() {
        return this.x;
    }

    /**
     * Y coordinate.
     * 
     */
    @Import(name="y", required=true)
    private Output<String> y;

    public Output<String> y() {
        return this.y;
    }

    private EccTokenKeyArgs() {}

    private EccTokenKeyArgs(EccTokenKeyArgs $) {
        this.alg = $.alg;
        this.kid = $.kid;
        this.type = $.type;
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EccTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EccTokenKeyArgs $;

        public Builder() {
            $ = new EccTokenKeyArgs();
        }

        public Builder(EccTokenKeyArgs defaults) {
            $ = new EccTokenKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder alg(Output<Either<String,AccessPolicyEccAlgo>> alg) {
            $.alg = alg;
            return this;
        }

        public Builder alg(Either<String,AccessPolicyEccAlgo> alg) {
            return alg(Output.of(alg));
        }

        public Builder alg(String alg) {
            return alg(Either.ofLeft(alg));
        }

        public Builder alg(AccessPolicyEccAlgo alg) {
            return alg(Either.ofRight(alg));
        }

        public Builder kid(Output<String> kid) {
            $.kid = kid;
            return this;
        }

        public Builder kid(String kid) {
            return kid(Output.of(kid));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder x(Output<String> x) {
            $.x = x;
            return this;
        }

        public Builder x(String x) {
            return x(Output.of(x));
        }

        public Builder y(Output<String> y) {
            $.y = y;
            return this;
        }

        public Builder y(String y) {
            return y(Output.of(y));
        }

        public EccTokenKeyArgs build() {
            $.alg = Objects.requireNonNull($.alg, "expected parameter 'alg' to be non-null");
            $.kid = Objects.requireNonNull($.kid, "expected parameter 'kid' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.x = Objects.requireNonNull($.x, "expected parameter 'x' to be non-null");
            $.y = Objects.requireNonNull($.y, "expected parameter 'y' to be non-null");
            return $;
        }
    }

}
