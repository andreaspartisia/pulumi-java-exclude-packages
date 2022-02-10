// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerRegistrationArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerRegistrationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPartnerRegistration {
    public static CompletableFuture<GetPartnerRegistrationResult> invokeAsync(GetPartnerRegistrationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerRegistration", TypeShape.of(GetPartnerRegistrationResult.class), args == null ? GetPartnerRegistrationArgs.Empty : args, Utilities.withVersion(options));
    }
}