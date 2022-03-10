// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudfront.inputs.GetDistributionArgs;
import io.pulumi.aws.cloudfront.outputs.GetDistributionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDistribution {
    private GetDistribution() {}
    public interface BuilderApplicator {
        public void apply(GetDistributionArgs.Builder a);
    }
    private static GetDistributionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDistributionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to retrieve information about a CloudFront distribution.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getDistribution.
 * 
     *
     * A collection of values returned by getDistribution.
 * 
     */
    public static CompletableFuture<GetDistributionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to retrieve information about a CloudFront distribution.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getDistribution.
     * 
     *
         * A collection of values returned by getDistribution.
     * 
     */
    public static CompletableFuture<GetDistributionResult> invokeAsync(GetDistributionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getDistribution:getDistribution", TypeShape.of(GetDistributionResult.class), args == null ? GetDistributionArgs.Empty : args, Utilities.withVersion(options));
    }
}