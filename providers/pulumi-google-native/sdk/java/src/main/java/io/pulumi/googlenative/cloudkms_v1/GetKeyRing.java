// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.inputs.GetKeyRingArgs;
import io.pulumi.googlenative.cloudkms_v1.outputs.GetKeyRingResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKeyRing {
    public static CompletableFuture<GetKeyRingResult> invokeAsync(GetKeyRingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRing", TypeShape.of(GetKeyRingResult.class), args == null ? GetKeyRingArgs.Empty : args, Utilities.withVersion(options));
    }
}