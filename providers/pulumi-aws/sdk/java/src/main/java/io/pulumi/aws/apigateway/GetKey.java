// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.inputs.GetKeyArgs;
import io.pulumi.aws.apigateway.outputs.GetKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKey {
    private GetKey() {}
    public interface BuilderApplicator {
        public void apply(GetKeyArgs.Builder a);
    }
    private static GetKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the name and value of a pre-existing API Key, for
 * example to supply credentials for a dependency microservice.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getKey.
 * 
     *
     * A collection of values returned by getKey.
 * 
     */
    public static CompletableFuture<GetKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the name and value of a pre-existing API Key, for
     * example to supply credentials for a dependency microservice.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getKey.
     * 
     *
         * A collection of values returned by getKey.
     * 
     */
    public static CompletableFuture<GetKeyResult> invokeAsync(GetKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigateway/getKey:getKey", TypeShape.of(GetKeyResult.class), args == null ? GetKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}