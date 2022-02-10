// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppConnectionStringsArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppConnectionStringsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppConnectionStrings {
    public static CompletableFuture<ListWebAppConnectionStringsResult> invokeAsync(ListWebAppConnectionStringsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppConnectionStrings", TypeShape.of(ListWebAppConnectionStringsResult.class), args == null ? ListWebAppConnectionStringsArgs.Empty : args, Utilities.withVersion(options));
    }
}