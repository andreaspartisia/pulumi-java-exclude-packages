// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.QueryStringBehavior;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the cache-key query string action.
 * 
 */
public final class CacheKeyQueryStringActionParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheKeyQueryStringActionParametersArgs Empty = new CacheKeyQueryStringActionParametersArgs();

    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * query parameters to include or exclude (comma separated).
     * 
     */
    @Import(name="queryParameters")
    private @Nullable Output<String> queryParameters;

    public Optional<Output<String>> queryParameters() {
        return Optional.ofNullable(this.queryParameters);
    }

    /**
     * Caching behavior for the requests
     * 
     */
    @Import(name="queryStringBehavior", required=true)
    private Output<Either<String,QueryStringBehavior>> queryStringBehavior;

    public Output<Either<String,QueryStringBehavior>> queryStringBehavior() {
        return this.queryStringBehavior;
    }

    private CacheKeyQueryStringActionParametersArgs() {}

    private CacheKeyQueryStringActionParametersArgs(CacheKeyQueryStringActionParametersArgs $) {
        this.odataType = $.odataType;
        this.queryParameters = $.queryParameters;
        this.queryStringBehavior = $.queryStringBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheKeyQueryStringActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheKeyQueryStringActionParametersArgs $;

        public Builder() {
            $ = new CacheKeyQueryStringActionParametersArgs();
        }

        public Builder(CacheKeyQueryStringActionParametersArgs defaults) {
            $ = new CacheKeyQueryStringActionParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder queryParameters(@Nullable Output<String> queryParameters) {
            $.queryParameters = queryParameters;
            return this;
        }

        public Builder queryParameters(String queryParameters) {
            return queryParameters(Output.of(queryParameters));
        }

        public Builder queryStringBehavior(Output<Either<String,QueryStringBehavior>> queryStringBehavior) {
            $.queryStringBehavior = queryStringBehavior;
            return this;
        }

        public Builder queryStringBehavior(Either<String,QueryStringBehavior> queryStringBehavior) {
            return queryStringBehavior(Output.of(queryStringBehavior));
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            return queryStringBehavior(Either.ofLeft(queryStringBehavior));
        }

        public Builder queryStringBehavior(QueryStringBehavior queryStringBehavior) {
            return queryStringBehavior(Either.ofRight(queryStringBehavior));
        }

        public CacheKeyQueryStringActionParametersArgs build() {
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            $.queryStringBehavior = Objects.requireNonNull($.queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
            return $;
        }
    }

}
