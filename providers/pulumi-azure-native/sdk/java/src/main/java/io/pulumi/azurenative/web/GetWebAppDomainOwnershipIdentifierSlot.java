// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppDomainOwnershipIdentifierSlotArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppDomainOwnershipIdentifierSlotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppDomainOwnershipIdentifierSlot {
    public static CompletableFuture<GetWebAppDomainOwnershipIdentifierSlotResult> invokeAsync(GetWebAppDomainOwnershipIdentifierSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppDomainOwnershipIdentifierSlot", TypeShape.of(GetWebAppDomainOwnershipIdentifierSlotResult.class), args == null ? GetWebAppDomainOwnershipIdentifierSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}