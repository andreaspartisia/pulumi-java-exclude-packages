// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3.inputs.GetMultiRegionAccessPointArgs;
import io.pulumi.awsnative.s3.outputs.GetMultiRegionAccessPointResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMultiRegionAccessPoint {
/**
 * AWS::S3::MultiRegionAccessPoint is an Amazon S3 resource type that dynamically routes S3 requests to easily satisfy geographic compliance requirements based on customer-defined routing policies.
 * 
 */
    public static CompletableFuture<GetMultiRegionAccessPointResult> invokeAsync(GetMultiRegionAccessPointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:s3:getMultiRegionAccessPoint", TypeShape.of(GetMultiRegionAccessPointResult.class), args == null ? GetMultiRegionAccessPointArgs.Empty : args, Utilities.withVersion(options));
    }
}