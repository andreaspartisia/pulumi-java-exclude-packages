// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRegionUrlMapArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRegionUrlMapResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionUrlMap {
    public static CompletableFuture<GetRegionUrlMapResult> invokeAsync(GetRegionUrlMapArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRegionUrlMap", TypeShape.of(GetRegionUrlMapResult.class), args == null ? GetRegionUrlMapArgs.Empty : args, Utilities.withVersion(options));
    }
}