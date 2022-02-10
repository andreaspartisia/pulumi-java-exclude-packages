// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.inputs.GetReportByDepartmentArgs;
import io.pulumi.azurenative.costmanagement.outputs.GetReportByDepartmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReportByDepartment {
    public static CompletableFuture<GetReportByDepartmentResult> invokeAsync(GetReportByDepartmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:costmanagement:getReportByDepartment", TypeShape.of(GetReportByDepartmentResult.class), args == null ? GetReportByDepartmentArgs.Empty : args, Utilities.withVersion(options));
    }
}