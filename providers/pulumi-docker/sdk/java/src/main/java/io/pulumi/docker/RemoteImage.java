// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.docker.RemoteImageArgs;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.inputs.RemoteImageState;
import io.pulumi.docker.outputs.RemoteImageBuild;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * <!-- Bug: Type and Name are switched -->
 * Pulls a Docker image to a given Docker host from a Docker Registry.
 *  This resource will *not* pull new layers of the image automatically unless used in conjunction with docker.RegistryImage data source to update the `pull_triggers` field.
 * 
 * ## Example Usage
 * ## Schema
 * 
 * ### Required
 * 
 * - **name** (String) The name of the Docker image, including any tags or SHA256 repo digests.
 * 
 * ### Optional
 * 
 * - **build** (Block Set, Max: 1) Configuration to build an image. Please see [docker build command reference](https://docs.docker.com/engine/reference/commandline/build/#options) too. (see below for nested schema)
 * - **force_remove** (Boolean) If true, then the image is removed forcibly when the resource is destroyed.
 * - **id** (String) The ID of this resource.
 * - **keep_locally** (Boolean) If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from the docker local storage on destroy operation.
 * - **pull_trigger** (String, Deprecated) A value which cause an image pull when changed
 * - **pull_triggers** (Set of String) List of values which cause an image pull when changed. This is used to store the image digest from the registry when using the docker_registry_image.
 * 
 * ### Read-Only
 * 
 * - **latest** (String, Deprecated) The ID of the image in the form of `sha256:<hash>` image digest. Do not confuse it with the default `latest` tag.
 * - **output** (String, Deprecated)
 * - **repo_digest** (String) The image sha256 digest in the form of `repo[:tag]@sha256:<hash>`.
 * 
 * <a id="nestedblock--build"></a>
 * ### Nested Schema for `build`
 * 
 * Required:
 * 
 * - **path** (String) Context path
 * 
 * Optional:
 * 
 * - **build_arg** (Map of String) Set build-time variables
 * - **dockerfile** (String) Name of the Dockerfile. Defaults to `Dockerfile`.
 * - **force_remove** (Boolean) Always remove intermediate containers
 * - **label** (Map of String) Set metadata for an image
 * - **no_cache** (Boolean) Do not use cache when building the image
 * - **remove** (Boolean) Remove intermediate containers after a successful build. Defaults to  `true`.
 * - **tag** (List of String) Name and optionally a tag in the 'name:tag' format
 * - **target** (String) Set the target build stage to build
 * 
 */
@ResourceType(type="docker:index/remoteImage:RemoteImage")
public class RemoteImage extends io.pulumi.resources.CustomResource {
    /**
     * Configuration to build an image. Please see [docker build command
     * reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
     * 
     */
    @OutputExport(name="build", type=RemoteImageBuild.class, parameters={})
    private Output</* @Nullable */ RemoteImageBuild> build;

    /**
     * @return Configuration to build an image. Please see [docker build command
     * reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
     * 
     */
    public Output</* @Nullable */ RemoteImageBuild> getBuild() {
        return this.build;
    }
    /**
     * If true, then the image is removed forcibly when the resource is destroyed.
     * 
     */
    @OutputExport(name="forceRemove", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceRemove;

    /**
     * @return If true, then the image is removed forcibly when the resource is destroyed.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceRemove() {
        return this.forceRemove;
    }
    /**
     * If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from
     * the docker local storage on destroy operation.
     * 
     */
    @OutputExport(name="keepLocally", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> keepLocally;

    /**
     * @return If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from
     * the docker local storage on destroy operation.
     * 
     */
    public Output</* @Nullable */ Boolean> getKeepLocally() {
        return this.keepLocally;
    }
    /**
     * The ID of the image in the form of `sha256:<hash>` image digest. Do not confuse it with the default `latest` tag.
     * 
     * @deprecated
     * Use repo_digest instead
     * 
     */
    @Deprecated /* Use repo_digest instead */
    @OutputExport(name="latest", type=String.class, parameters={})
    private Output<String> latest;

    /**
     * @return The ID of the image in the form of `sha256:<hash>` image digest. Do not confuse it with the default `latest` tag.
     * 
     */
    public Output<String> getLatest() {
        return this.latest;
    }
    /**
     * The name of the Docker image, including any tags or SHA256 repo digests.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Docker image, including any tags or SHA256 repo digests.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * @deprecated
     * Is unused and will be removed.
     * 
     */
    @Deprecated /* Is unused and will be removed. */
    @OutputExport(name="output", type=String.class, parameters={})
    private Output<String> output;

    public Output<String> getOutput() {
        return this.output;
    }
    /**
     * A value which cause an image pull when changed
     * 
     * @deprecated
     * Use field pull_triggers instead
     * 
     */
    @Deprecated /* Use field pull_triggers instead */
    @OutputExport(name="pullTrigger", type=String.class, parameters={})
    private Output</* @Nullable */ String> pullTrigger;

    /**
     * @return A value which cause an image pull when changed
     * 
     */
    public Output</* @Nullable */ String> getPullTrigger() {
        return this.pullTrigger;
    }
    /**
     * List of values which cause an image pull when changed. This is used to store the image digest from the registry when
     * using the [docker_registry_image](../data-sources/registry_image.md).
     * 
     */
    @OutputExport(name="pullTriggers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> pullTriggers;

    /**
     * @return List of values which cause an image pull when changed. This is used to store the image digest from the registry when
     * using the [docker_registry_image](../data-sources/registry_image.md).
     * 
     */
    public Output</* @Nullable */ List<String>> getPullTriggers() {
        return this.pullTriggers;
    }
    /**
     * The image sha256 digest in the form of `repo[:tag]@sha256:<hash>`.
     * 
     */
    @OutputExport(name="repoDigest", type=String.class, parameters={})
    private Output<String> repoDigest;

    /**
     * @return The image sha256 digest in the form of `repo[:tag]@sha256:<hash>`.
     * 
     */
    public Output<String> getRepoDigest() {
        return this.repoDigest;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RemoteImage(String name) {
        this(name, RemoteImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RemoteImage(String name, RemoteImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemoteImage(String name, RemoteImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/remoteImage:RemoteImage", name, args == null ? RemoteImageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RemoteImage(String name, Input<String> id, @Nullable RemoteImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/remoteImage:RemoteImage", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RemoteImage get(String name, Input<String> id, @Nullable RemoteImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RemoteImage(name, id, state, options);
    }
}
