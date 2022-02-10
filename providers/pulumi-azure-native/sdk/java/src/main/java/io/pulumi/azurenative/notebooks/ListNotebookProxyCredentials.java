// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notebooks.inputs.ListNotebookProxyCredentialsArgs;
import io.pulumi.azurenative.notebooks.outputs.ListNotebookProxyCredentialsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListNotebookProxyCredentials {
    public static CompletableFuture<ListNotebookProxyCredentialsResult> invokeAsync(ListNotebookProxyCredentialsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notebooks:listNotebookProxyCredentials", TypeShape.of(ListNotebookProxyCredentialsResult.class), args == null ? ListNotebookProxyCredentialsArgs.Empty : args, Utilities.withVersion(options));
    }
}