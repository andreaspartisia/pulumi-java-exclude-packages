// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datastream_v1alpha1.StreamArgs;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.BackfillAllStrategyResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.BackfillNoneStrategyResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.DestinationConfigResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.ErrorResponse;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.SourceConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Use this method to create a stream.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1alpha1:Stream")
public class Stream extends io.pulumi.resources.CustomResource {
    /**
     * Automatically backfill objects included in the stream source configuration. Specific objects can be excluded.
     * 
     */
    @Export(name="backfillAll", type=BackfillAllStrategyResponse.class, parameters={})
    private Output<BackfillAllStrategyResponse> backfillAll;

    /**
     * @return Automatically backfill objects included in the stream source configuration. Specific objects can be excluded.
     * 
     */
    public Output<BackfillAllStrategyResponse> backfillAll() {
        return this.backfillAll;
    }
    /**
     * Do not automatically backfill any objects.
     * 
     */
    @Export(name="backfillNone", type=BackfillNoneStrategyResponse.class, parameters={})
    private Output<BackfillNoneStrategyResponse> backfillNone;

    /**
     * @return Do not automatically backfill any objects.
     * 
     */
    public Output<BackfillNoneStrategyResponse> backfillNone() {
        return this.backfillNone;
    }
    /**
     * The creation time of the stream.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of the stream.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Immutable. A reference to a KMS encryption key. If provided, it will be used to encrypt the data. If left blank, data will be encrypted using an internal Stream-specific encryption key provisioned through KMS.
     * 
     */
    @Export(name="customerManagedEncryptionKey", type=String.class, parameters={})
    private Output<String> customerManagedEncryptionKey;

    /**
     * @return Immutable. A reference to a KMS encryption key. If provided, it will be used to encrypt the data. If left blank, data will be encrypted using an internal Stream-specific encryption key provisioned through KMS.
     * 
     */
    public Output<String> customerManagedEncryptionKey() {
        return this.customerManagedEncryptionKey;
    }
    /**
     * Destination connection profile configuration.
     * 
     */
    @Export(name="destinationConfig", type=DestinationConfigResponse.class, parameters={})
    private Output<DestinationConfigResponse> destinationConfig;

    /**
     * @return Destination connection profile configuration.
     * 
     */
    public Output<DestinationConfigResponse> destinationConfig() {
        return this.destinationConfig;
    }
    /**
     * Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Errors on the Stream.
     * 
     */
    @Export(name="errors", type=List.class, parameters={ErrorResponse.class})
    private Output<List<ErrorResponse>> errors;

    /**
     * @return Errors on the Stream.
     * 
     */
    public Output<List<ErrorResponse>> errors() {
        return this.errors;
    }
    /**
     * Labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The stream's name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The stream's name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Source connection profile configuration.
     * 
     */
    @Export(name="sourceConfig", type=SourceConfigResponse.class, parameters={})
    private Output<SourceConfigResponse> sourceConfig;

    /**
     * @return Source connection profile configuration.
     * 
     */
    public Output<SourceConfigResponse> sourceConfig() {
        return this.sourceConfig;
    }
    /**
     * The state of the stream.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the stream.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The last update time of the stream.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update time of the stream.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stream(String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(String name, StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, StreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stream(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Stream", name, null, makeResourceOptions(options, id));
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
    public static Stream get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, options);
    }
}
