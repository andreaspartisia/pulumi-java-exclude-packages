// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.inputs.GetDomainNameArgs;
import io.pulumi.awsnative.apigateway.outputs.GetDomainNameResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDomainName {
/**
 * Resource Type definition for AWS::ApiGateway::DomainName.
 * 
 */
    public static CompletableFuture<GetDomainNameResult> invokeAsync(GetDomainNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apigateway:getDomainName", TypeShape.of(GetDomainNameResult.class), args == null ? GetDomainNameArgs.Empty : args, Utilities.withVersion(options));
    }
}