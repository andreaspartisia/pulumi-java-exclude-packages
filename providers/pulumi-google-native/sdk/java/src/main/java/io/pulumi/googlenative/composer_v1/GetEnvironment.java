// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.composer_v1.inputs.GetEnvironmentArgs;
import io.pulumi.googlenative.composer_v1.outputs.GetEnvironmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnvironment {
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(GetEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:composer/v1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args == null ? GetEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}