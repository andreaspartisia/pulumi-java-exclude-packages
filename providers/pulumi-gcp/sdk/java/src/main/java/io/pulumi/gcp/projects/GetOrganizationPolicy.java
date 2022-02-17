// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.inputs.GetOrganizationPolicyArgs;
import io.pulumi.gcp.projects.outputs.GetOrganizationPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationPolicy {
/**
 * Allows management of Organization policies for a Google Project. For more information see
 * [the official
 * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getOrganizationPolicy.
 * 
 *
 * A collection of values returned by getOrganizationPolicy.
 * 
 */
    public static CompletableFuture<GetOrganizationPolicyResult> invokeAsync(GetOrganizationPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:projects/getOrganizationPolicy:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args == null ? GetOrganizationPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}