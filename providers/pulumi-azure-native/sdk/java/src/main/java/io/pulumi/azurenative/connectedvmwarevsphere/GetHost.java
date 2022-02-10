// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GetHostArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GetHostResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHost {
    public static CompletableFuture<GetHostResult> invokeAsync(GetHostArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getHost", TypeShape.of(GetHostResult.class), args == null ? GetHostArgs.Empty : args, Utilities.withVersion(options));
    }
}