// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.outputs.GetCanonicalUserIdResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.getCanonicalUserId has been deprecated in favor of aws.s3.getCanonicalUserId */
public class GetCanonicalUserId {
    private GetCanonicalUserId() {}
    /**
         * The Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html)
     * for the effective account in which this provider is working.
     * 
     * ## Example Usage
     * 
     *
         * A collection of values returned by getCanonicalUserId.
     * 
     * @Deprecated
         * aws.getCanonicalUserId has been deprecated in favor of aws.s3.getCanonicalUserId
     * 
     */
    @Deprecated /* aws.getCanonicalUserId has been deprecated in favor of aws.s3.getCanonicalUserId */
    public static CompletableFuture<GetCanonicalUserIdResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getCanonicalUserId:getCanonicalUserId", TypeShape.of(GetCanonicalUserIdResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}