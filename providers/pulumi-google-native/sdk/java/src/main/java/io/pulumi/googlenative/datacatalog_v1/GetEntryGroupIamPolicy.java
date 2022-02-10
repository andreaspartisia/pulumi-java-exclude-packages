// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1.inputs.GetEntryGroupIamPolicyArgs;
import io.pulumi.googlenative.datacatalog_v1.outputs.GetEntryGroupIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntryGroupIamPolicy {
    public static CompletableFuture<GetEntryGroupIamPolicyResult> invokeAsync(GetEntryGroupIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1:getEntryGroupIamPolicy", TypeShape.of(GetEntryGroupIamPolicyResult.class), args == null ? GetEntryGroupIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}