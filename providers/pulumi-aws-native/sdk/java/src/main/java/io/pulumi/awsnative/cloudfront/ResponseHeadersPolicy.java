// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.ResponseHeadersPolicyArgs;
import io.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CloudFront::ResponseHeadersPolicy
 * 
 */
@ResourceType(type="aws-native:cloudfront:ResponseHeadersPolicy")
public class ResponseHeadersPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="responseHeadersPolicyConfig", type=ResponseHeadersPolicyConfig.class, parameters={})
    private Output<ResponseHeadersPolicyConfig> responseHeadersPolicyConfig;

    public Output<ResponseHeadersPolicyConfig> getResponseHeadersPolicyConfig() {
        return this.responseHeadersPolicyConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponseHeadersPolicy(String name, ResponseHeadersPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:ResponseHeadersPolicy", name, args == null ? ResponseHeadersPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResponseHeadersPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:ResponseHeadersPolicy", name, null, makeResourceOptions(options, id));
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
    public static ResponseHeadersPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResponseHeadersPolicy(name, id, options);
    }
}