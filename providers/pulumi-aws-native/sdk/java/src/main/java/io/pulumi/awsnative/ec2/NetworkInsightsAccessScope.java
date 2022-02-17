// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.NetworkInsightsAccessScopeArgs;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeAccessScopePathRequest;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::EC2::NetworkInsightsAccessScope
 * 
 */
@ResourceType(type="aws-native:ec2:NetworkInsightsAccessScope")
public class NetworkInsightsAccessScope extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    @OutputExport(name="excludePaths", type=List.class, parameters={NetworkInsightsAccessScopeAccessScopePathRequest.class})
    private Output</* @Nullable */ List<NetworkInsightsAccessScopeAccessScopePathRequest>> excludePaths;

    public Output</* @Nullable */ List<NetworkInsightsAccessScopeAccessScopePathRequest>> getExcludePaths() {
        return this.excludePaths;
    }
    @OutputExport(name="matchPaths", type=List.class, parameters={NetworkInsightsAccessScopeAccessScopePathRequest.class})
    private Output</* @Nullable */ List<NetworkInsightsAccessScopeAccessScopePathRequest>> matchPaths;

    public Output</* @Nullable */ List<NetworkInsightsAccessScopeAccessScopePathRequest>> getMatchPaths() {
        return this.matchPaths;
    }
    @OutputExport(name="networkInsightsAccessScopeArn", type=String.class, parameters={})
    private Output<String> networkInsightsAccessScopeArn;

    public Output<String> getNetworkInsightsAccessScopeArn() {
        return this.networkInsightsAccessScopeArn;
    }
    @OutputExport(name="networkInsightsAccessScopeId", type=String.class, parameters={})
    private Output<String> networkInsightsAccessScopeId;

    public Output<String> getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }
    @OutputExport(name="tags", type=List.class, parameters={NetworkInsightsAccessScopeTag.class})
    private Output</* @Nullable */ List<NetworkInsightsAccessScopeTag>> tags;

    public Output</* @Nullable */ List<NetworkInsightsAccessScopeTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="updatedDate", type=String.class, parameters={})
    private Output<String> updatedDate;

    public Output<String> getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInsightsAccessScope(String name, @Nullable NetworkInsightsAccessScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAccessScope", name, args == null ? NetworkInsightsAccessScopeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkInsightsAccessScope(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAccessScope", name, null, makeResourceOptions(options, id));
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
    public static NetworkInsightsAccessScope get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInsightsAccessScope(name, id, options);
    }
}