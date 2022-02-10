// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.GetDpsCertificateArgs;
import io.pulumi.azurenative.devices.outputs.GetDpsCertificateResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDpsCertificate {
    public static CompletableFuture<GetDpsCertificateResult> invokeAsync(GetDpsCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getDpsCertificate", TypeShape.of(GetDpsCertificateResult.class), args == null ? GetDpsCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}