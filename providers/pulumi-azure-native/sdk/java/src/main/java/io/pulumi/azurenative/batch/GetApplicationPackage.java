// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.inputs.GetApplicationPackageArgs;
import io.pulumi.azurenative.batch.outputs.GetApplicationPackageResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplicationPackage {
    public static CompletableFuture<GetApplicationPackageResult> invokeAsync(GetApplicationPackageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getApplicationPackage", TypeShape.of(GetApplicationPackageResult.class), args == null ? GetApplicationPackageArgs.Empty : args, Utilities.withVersion(options));
    }
}