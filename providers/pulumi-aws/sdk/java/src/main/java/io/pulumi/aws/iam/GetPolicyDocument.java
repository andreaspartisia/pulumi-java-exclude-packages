// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
import io.pulumi.aws.iam.outputs.GetPolicyDocumentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPolicyDocument {
    private GetPolicyDocument() {}
    public interface BuilderApplicator {
        public void apply(GetPolicyDocumentArgs.Builder a);
    }
    private static GetPolicyDocumentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPolicyDocumentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `aws.iam.Policy`.
 * 
 * Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getPolicyDocument.
 * 
     *
     * A collection of values returned by getPolicyDocument.
 * 
     */
    public static CompletableFuture<GetPolicyDocumentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `aws.iam.Policy`.
     * 
     * Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getPolicyDocument.
     * 
     *
         * A collection of values returned by getPolicyDocument.
     * 
     */
    public static CompletableFuture<GetPolicyDocumentResult> invokeAsync(@Nullable GetPolicyDocumentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:iam/getPolicyDocument:getPolicyDocument", TypeShape.of(GetPolicyDocumentResult.class), args == null ? GetPolicyDocumentArgs.Empty : args, Utilities.withVersion(options));
    }
}