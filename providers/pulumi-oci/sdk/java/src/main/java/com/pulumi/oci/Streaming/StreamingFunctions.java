// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Streaming;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Streaming.inputs.GetConnectHarnessArgs;
import com.pulumi.oci.Streaming.inputs.GetConnectHarnessesArgs;
import com.pulumi.oci.Streaming.inputs.GetStreamArgs;
import com.pulumi.oci.Streaming.inputs.GetStreamPoolArgs;
import com.pulumi.oci.Streaming.inputs.GetStreamPoolsArgs;
import com.pulumi.oci.Streaming.inputs.GetStreamsArgs;
import com.pulumi.oci.Streaming.outputs.GetConnectHarnessResult;
import com.pulumi.oci.Streaming.outputs.GetConnectHarnessesResult;
import com.pulumi.oci.Streaming.outputs.GetStreamPoolResult;
import com.pulumi.oci.Streaming.outputs.GetStreamPoolsResult;
import com.pulumi.oci.Streaming.outputs.GetStreamResult;
import com.pulumi.oci.Streaming.outputs.GetStreamsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class StreamingFunctions {
    /**
     * This data source provides details about a specific Connect Harness resource in Oracle Cloud Infrastructure Streaming service.
     * 
     * Gets detailed information about a connect harness.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConnectHarnessResult> getConnectHarness(GetConnectHarnessArgs args) {
        return getConnectHarness(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectHarnessResult> getConnectHarness(GetConnectHarnessArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Streaming/getConnectHarness:getConnectHarness", TypeShape.of(GetConnectHarnessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Connect Harnesses in Oracle Cloud Infrastructure Streaming service.
     * 
     * Lists the connectharness.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConnectHarnessesResult> getConnectHarnesses(GetConnectHarnessesArgs args) {
        return getConnectHarnesses(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectHarnessesResult> getConnectHarnesses(GetConnectHarnessesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Streaming/getConnectHarnesses:getConnectHarnesses", TypeShape.of(GetConnectHarnessesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Stream resource in Oracle Cloud Infrastructure Streaming service.
     * 
     * Gets detailed information about a stream, including the number of partitions.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStreamResult> getStream(GetStreamArgs args) {
        return getStream(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamResult> getStream(GetStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Streaming/getStream:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Stream Pool resource in Oracle Cloud Infrastructure Streaming service.
     * 
     * Gets detailed information about the stream pool, such as Kafka settings.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStreamPoolResult> getStreamPool(GetStreamPoolArgs args) {
        return getStreamPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamPoolResult> getStreamPool(GetStreamPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Streaming/getStreamPool:getStreamPool", TypeShape.of(GetStreamPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Stream Pools in Oracle Cloud Infrastructure Streaming service.
     * 
     * List the stream pools for a given compartment ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStreamPoolsResult> getStreamPools(GetStreamPoolsArgs args) {
        return getStreamPools(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamPoolsResult> getStreamPools(GetStreamPoolsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Streaming/getStreamPools:getStreamPools", TypeShape.of(GetStreamPoolsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Streams in Oracle Cloud Infrastructure Streaming service.
     * 
     * Lists the streams in the given compartment id.
     * If the compartment id is specified, it will list streams in the compartment, regardless of their stream pool.
     * If the stream pool id is specified, the action will be scoped to that stream pool.
     * The compartment id and stream pool id cannot be specified at the same time.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStreamsResult> getStreams() {
        return getStreams(GetStreamsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamsResult> getStreams(GetStreamsArgs args) {
        return getStreams(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamsResult> getStreams(GetStreamsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Streaming/getStreams:getStreams", TypeShape.of(GetStreamsResult.class), args, Utilities.withVersion(options));
    }
}
