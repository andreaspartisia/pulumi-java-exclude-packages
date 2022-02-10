// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.deploymentmanager.inputs.GetArtifactSourceArgs;
import io.pulumi.azurenative.deploymentmanager.outputs.GetArtifactSourceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetArtifactSource {
    public static CompletableFuture<GetArtifactSourceResult> invokeAsync(GetArtifactSourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:deploymentmanager:getArtifactSource", TypeShape.of(GetArtifactSourceResult.class), args == null ? GetArtifactSourceArgs.Empty : args, Utilities.withVersion(options));
    }
}