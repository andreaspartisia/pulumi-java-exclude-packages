// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserEnvironmentArgs;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserEnvironmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalUserEnvironment {
    public static CompletableFuture<GetGlobalUserEnvironmentResult> invokeAsync(GetGlobalUserEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserEnvironment", TypeShape.of(GetGlobalUserEnvironmentResult.class), args == null ? GetGlobalUserEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}