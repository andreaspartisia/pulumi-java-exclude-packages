// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLaunchTemplate {
    private GetLaunchTemplate() {}
    public interface BuilderApplicator {
        public void apply(GetLaunchTemplateArgs.Builder a);
    }
    private static GetLaunchTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLaunchTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides information about a Launch Template.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getLaunchTemplate.
 * 
     *
     * A collection of values returned by getLaunchTemplate.
 * 
     */
    public static CompletableFuture<GetLaunchTemplateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides information about a Launch Template.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getLaunchTemplate.
     * 
     *
         * A collection of values returned by getLaunchTemplate.
     * 
     */
    public static CompletableFuture<GetLaunchTemplateResult> invokeAsync(@Nullable GetLaunchTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getLaunchTemplate:getLaunchTemplate", TypeShape.of(GetLaunchTemplateResult.class), args == null ? GetLaunchTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}