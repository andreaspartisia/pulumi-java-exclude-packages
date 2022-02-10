// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRegionDiskArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRegionDiskResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionDisk {
    public static CompletableFuture<GetRegionDiskResult> invokeAsync(GetRegionDiskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRegionDisk", TypeShape.of(GetRegionDiskResult.class), args == null ? GetRegionDiskArgs.Empty : args, Utilities.withVersion(options));
    }
}