// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmTraces;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.ApmTraces.inputs.GetQueryQuickPicksArgs;
import com.pulumi.oci.ApmTraces.inputs.GetTraceAggregatedSnapshotDataArgs;
import com.pulumi.oci.ApmTraces.inputs.GetTraceArgs;
import com.pulumi.oci.ApmTraces.inputs.GetTraceSnapshotDataArgs;
import com.pulumi.oci.ApmTraces.outputs.GetQueryQuickPicksResult;
import com.pulumi.oci.ApmTraces.outputs.GetTraceAggregatedSnapshotDataResult;
import com.pulumi.oci.ApmTraces.outputs.GetTraceResult;
import com.pulumi.oci.ApmTraces.outputs.GetTraceSnapshotDataResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class ApmTracesFunctions {
    /**
     * This data source provides the list of Query Quick Picks in Oracle Cloud Infrastructure Apm Traces service.
     * 
     * Returns a list of predefined Quick Pick queries intended to assist the user
     * to choose a query to run.  There is no sorting applied on the results.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetQueryQuickPicksResult> getQueryQuickPicks(GetQueryQuickPicksArgs args) {
        return getQueryQuickPicks(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetQueryQuickPicksResult> getQueryQuickPicks(GetQueryQuickPicksArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmTraces/getQueryQuickPicks:getQueryQuickPicks", TypeShape.of(GetQueryQuickPicksResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Trace resource in Oracle Cloud Infrastructure Apm Traces service.
     * 
     * Gets the trace details identified by traceId.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTraceResult> getTrace(GetTraceArgs args) {
        return getTrace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTraceResult> getTrace(GetTraceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmTraces/getTrace:getTrace", TypeShape.of(GetTraceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Trace Aggregated Snapshot Data resource in Oracle Cloud Infrastructure Apm Traces service.
     * 
     * Gets the aggregated snapshot identified by trace ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTraceAggregatedSnapshotDataResult> getTraceAggregatedSnapshotData(GetTraceAggregatedSnapshotDataArgs args) {
        return getTraceAggregatedSnapshotData(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTraceAggregatedSnapshotDataResult> getTraceAggregatedSnapshotData(GetTraceAggregatedSnapshotDataArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmTraces/getTraceAggregatedSnapshotData:getTraceAggregatedSnapshotData", TypeShape.of(GetTraceAggregatedSnapshotDataResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Trace Snapshot Data resource in Oracle Cloud Infrastructure Apm Traces service.
     * 
     * Gets the trace snapshots data identified by trace ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTraceSnapshotDataResult> getTraceSnapshotData(GetTraceSnapshotDataArgs args) {
        return getTraceSnapshotData(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTraceSnapshotDataResult> getTraceSnapshotData(GetTraceSnapshotDataArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmTraces/getTraceSnapshotData:getTraceSnapshotData", TypeShape.of(GetTraceSnapshotDataResult.class), args, Utilities.withVersion(options));
    }
}
