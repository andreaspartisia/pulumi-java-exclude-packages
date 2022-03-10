// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudtrail.inputs.GetServiceAccountArgs;
import io.pulumi.aws.cloudtrail.outputs.GetServiceAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceAccount {
    private GetServiceAccount() {}
    public interface BuilderApplicator {
        public void apply(GetServiceAccountArgs.Builder a);
    }
    private static GetServiceAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
 * in a given region for the purpose of allowing CloudTrail to store trail data in S3.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getServiceAccount.
 * 
     *
     * A collection of values returned by getServiceAccount.
 * 
     */
    public static CompletableFuture<GetServiceAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
     * in a given region for the purpose of allowing CloudTrail to store trail data in S3.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getServiceAccount.
     * 
     *
         * A collection of values returned by getServiceAccount.
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> invokeAsync(@Nullable GetServiceAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudtrail/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args == null ? GetServiceAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}