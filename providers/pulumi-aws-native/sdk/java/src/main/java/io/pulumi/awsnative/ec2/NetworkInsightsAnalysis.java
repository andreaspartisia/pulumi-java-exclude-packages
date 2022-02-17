// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.NetworkInsightsAnalysisArgs;
import io.pulumi.awsnative.ec2.enums.NetworkInsightsAnalysisStatus;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAlternatePathHint;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisExplanation;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisPathComponent;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::EC2::NetworkInsightsAnalysis
 * 
 */
@ResourceType(type="aws-native:ec2:NetworkInsightsAnalysis")
public class NetworkInsightsAnalysis extends io.pulumi.resources.CustomResource {
    @OutputExport(name="alternatePathHints", type=List.class, parameters={NetworkInsightsAnalysisAlternatePathHint.class})
    private Output<List<NetworkInsightsAnalysisAlternatePathHint>> alternatePathHints;

    public Output<List<NetworkInsightsAnalysisAlternatePathHint>> getAlternatePathHints() {
        return this.alternatePathHints;
    }
    @OutputExport(name="explanations", type=List.class, parameters={NetworkInsightsAnalysisExplanation.class})
    private Output<List<NetworkInsightsAnalysisExplanation>> explanations;

    public Output<List<NetworkInsightsAnalysisExplanation>> getExplanations() {
        return this.explanations;
    }
    @OutputExport(name="filterInArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> filterInArns;

    public Output</* @Nullable */ List<String>> getFilterInArns() {
        return this.filterInArns;
    }
    @OutputExport(name="forwardPathComponents", type=List.class, parameters={NetworkInsightsAnalysisPathComponent.class})
    private Output<List<NetworkInsightsAnalysisPathComponent>> forwardPathComponents;

    public Output<List<NetworkInsightsAnalysisPathComponent>> getForwardPathComponents() {
        return this.forwardPathComponents;
    }
    @OutputExport(name="networkInsightsAnalysisArn", type=String.class, parameters={})
    private Output<String> networkInsightsAnalysisArn;

    public Output<String> getNetworkInsightsAnalysisArn() {
        return this.networkInsightsAnalysisArn;
    }
    @OutputExport(name="networkInsightsAnalysisId", type=String.class, parameters={})
    private Output<String> networkInsightsAnalysisId;

    public Output<String> getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }
    @OutputExport(name="networkInsightsPathId", type=String.class, parameters={})
    private Output<String> networkInsightsPathId;

    public Output<String> getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }
    @OutputExport(name="networkPathFound", type=Boolean.class, parameters={})
    private Output<Boolean> networkPathFound;

    public Output<Boolean> getNetworkPathFound() {
        return this.networkPathFound;
    }
    @OutputExport(name="returnPathComponents", type=List.class, parameters={NetworkInsightsAnalysisPathComponent.class})
    private Output<List<NetworkInsightsAnalysisPathComponent>> returnPathComponents;

    public Output<List<NetworkInsightsAnalysisPathComponent>> getReturnPathComponents() {
        return this.returnPathComponents;
    }
    @OutputExport(name="startDate", type=String.class, parameters={})
    private Output<String> startDate;

    public Output<String> getStartDate() {
        return this.startDate;
    }
    @OutputExport(name="status", type=NetworkInsightsAnalysisStatus.class, parameters={})
    private Output<NetworkInsightsAnalysisStatus> status;

    public Output<NetworkInsightsAnalysisStatus> getStatus() {
        return this.status;
    }
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    @OutputExport(name="tags", type=List.class, parameters={NetworkInsightsAnalysisTag.class})
    private Output</* @Nullable */ List<NetworkInsightsAnalysisTag>> tags;

    public Output</* @Nullable */ List<NetworkInsightsAnalysisTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInsightsAnalysis(String name, NetworkInsightsAnalysisArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAnalysis", name, args == null ? NetworkInsightsAnalysisArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkInsightsAnalysis(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAnalysis", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkInsightsAnalysis get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInsightsAnalysis(name, id, options);
    }
}