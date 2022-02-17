// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appintegrations.inputs.GetEventIntegrationArgs;
import io.pulumi.awsnative.appintegrations.outputs.GetEventIntegrationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEventIntegration {
/**
 * Resource Type definition for AWS::AppIntegrations::EventIntegration
 * 
 */
    public static CompletableFuture<GetEventIntegrationResult> invokeAsync(GetEventIntegrationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appintegrations:getEventIntegration", TypeShape.of(GetEventIntegrationResult.class), args == null ? GetEventIntegrationArgs.Empty : args, Utilities.withVersion(options));
    }
}