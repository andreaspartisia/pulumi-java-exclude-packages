// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticache.inputs.GetReplicationGroupArgs;
import io.pulumi.aws.elasticache.outputs.GetReplicationGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationGroup {
    private GetReplicationGroup() {}
    public interface BuilderApplicator {
        public void apply(GetReplicationGroupArgs.Builder a);
    }
    private static GetReplicationGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetReplicationGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get information about an Elasticache Replication Group.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getReplicationGroup.
 * 
     *
     * A collection of values returned by getReplicationGroup.
 * 
     */
    public static CompletableFuture<GetReplicationGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get information about an Elasticache Replication Group.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getReplicationGroup.
     * 
     *
         * A collection of values returned by getReplicationGroup.
     * 
     */
    public static CompletableFuture<GetReplicationGroupResult> invokeAsync(GetReplicationGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticache/getReplicationGroup:getReplicationGroup", TypeShape.of(GetReplicationGroupResult.class), args == null ? GetReplicationGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}