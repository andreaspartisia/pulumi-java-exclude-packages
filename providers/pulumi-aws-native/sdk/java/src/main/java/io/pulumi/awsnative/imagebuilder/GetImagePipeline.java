// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.inputs.GetImagePipelineArgs;
import io.pulumi.awsnative.imagebuilder.outputs.GetImagePipelineResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImagePipeline {
/**
 * Resource schema for AWS::ImageBuilder::ImagePipeline
 * 
 */
    public static CompletableFuture<GetImagePipelineResult> invokeAsync(GetImagePipelineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getImagePipeline", TypeShape.of(GetImagePipelineResult.class), args == null ? GetImagePipelineArgs.Empty : args, Utilities.withVersion(options));
    }
}