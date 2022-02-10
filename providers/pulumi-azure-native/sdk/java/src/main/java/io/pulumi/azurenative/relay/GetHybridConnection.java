// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.relay.inputs.GetHybridConnectionArgs;
import io.pulumi.azurenative.relay.outputs.GetHybridConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHybridConnection {
    public static CompletableFuture<GetHybridConnectionResult> invokeAsync(GetHybridConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:relay:getHybridConnection", TypeShape.of(GetHybridConnectionResult.class), args == null ? GetHybridConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}