// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.outputs.GetRegionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegion {
    public static CompletableFuture<GetRegionResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:index:getRegion", TypeShape.of(GetRegionResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}