// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetGlobalReachConnectionArgs;
import io.pulumi.azurenative.avs.outputs.GetGlobalReachConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalReachConnection {
    public static CompletableFuture<GetGlobalReachConnectionResult> invokeAsync(GetGlobalReachConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getGlobalReachConnection", TypeShape.of(GetGlobalReachConnectionResult.class), args == null ? GetGlobalReachConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}