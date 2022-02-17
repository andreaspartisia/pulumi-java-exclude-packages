// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.inputs.GetRobotApplicationVersionArgs;
import io.pulumi.awsnative.robomaker.outputs.GetRobotApplicationVersionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRobotApplicationVersion {
/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
    public static CompletableFuture<GetRobotApplicationVersionResult> invokeAsync(GetRobotApplicationVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getRobotApplicationVersion", TypeShape.of(GetRobotApplicationVersionResult.class), args == null ? GetRobotApplicationVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}