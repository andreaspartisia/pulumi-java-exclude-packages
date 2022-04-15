// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.deploymentmanager_v2.DeploymentArgs;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.DeploymentLabelEntryResponse;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.DeploymentUpdateResponse;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.TargetConfigurationResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a deployment and all of the resources described by the deployment manifest.
 * 
 */
@ResourceType(type="google-native:deploymentmanager/v2:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    /**
     * An optional user-provided description of the deployment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional user-provided description of the deployment.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Provides a fingerprint to use in requests to modify a deployment, such as `update()`, `stop()`, and `cancelPreview()` requests. A fingerprint is a randomly generated value that must be provided with `update()`, `stop()`, and `cancelPreview()` requests to perform optimistic locking. This ensures optimistic concurrency so that only one request happens at a time. The fingerprint is initially generated by Deployment Manager and changes after every request to modify data. To get the latest fingerprint value, perform a `get()` request to a deployment.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Provides a fingerprint to use in requests to modify a deployment, such as `update()`, `stop()`, and `cancelPreview()` requests. A fingerprint is a randomly generated value that must be provided with `update()`, `stop()`, and `cancelPreview()` requests to perform optimistic locking. This ensures optimistic concurrency so that only one request happens at a time. The fingerprint is initially generated by Deployment Manager and changes after every request to modify data. To get the latest fingerprint value, perform a `get()` request to a deployment.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="insertTime", type=String.class, parameters={})
    private Output<String> insertTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> insertTime() {
        return this.insertTime;
    }
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    @Export(name="labels", type=List.class, parameters={DeploymentLabelEntryResponse.class})
    private Output<List<DeploymentLabelEntryResponse>> labels;

    /**
     * @return Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    public Output<List<DeploymentLabelEntryResponse>> labels() {
        return this.labels;
    }
    /**
     * URL of the manifest representing the last manifest that was successfully deployed. If no manifest has been successfully deployed, this field will be absent.
     * 
     */
    @Export(name="manifest", type=String.class, parameters={})
    private Output<String> manifest;

    /**
     * @return URL of the manifest representing the last manifest that was successfully deployed. If no manifest has been successfully deployed, this field will be absent.
     * 
     */
    public Output<String> manifest() {
        return this.manifest;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Operation that most recently ran, or is currently running, on this deployment.
     * 
     */
    @Export(name="operation", type=OperationResponse.class, parameters={})
    private Output<OperationResponse> operation;

    /**
     * @return The Operation that most recently ran, or is currently running, on this deployment.
     * 
     */
    public Output<OperationResponse> operation() {
        return this.operation;
    }
    /**
     * Server defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
     */
    @Export(name="target", type=TargetConfigurationResponse.class, parameters={})
    private Output<TargetConfigurationResponse> target;

    /**
     * @return [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
     */
    public Output<TargetConfigurationResponse> target() {
        return this.target;
    }
    /**
     * If Deployment Manager is currently updating or previewing an update to this deployment, the updated configuration appears here.
     * 
     */
    @Export(name="update", type=DeploymentUpdateResponse.class, parameters={})
    private Output<DeploymentUpdateResponse> update;

    /**
     * @return If Deployment Manager is currently updating or previewing an update to this deployment, the updated configuration appears here.
     * 
     */
    public Output<DeploymentUpdateResponse> update() {
        return this.update;
    }
    /**
     * Update timestamp in RFC3339 text format.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Update timestamp in RFC3339 text format.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, @Nullable DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, @Nullable DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:deploymentmanager/v2:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:deploymentmanager/v2:Deployment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Deployment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
